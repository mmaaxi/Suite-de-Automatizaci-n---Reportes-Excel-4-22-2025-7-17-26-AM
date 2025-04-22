Feature: Nueva columna 'Monto acumulado Folio Reserva 5401'

  Scenario: Verificar exportación y columna nueva
    Given el usuario está en la página de reportes
    When exporta el archivo Excel
    Then el documento se exporta correctamente

    When busca la columna 'Monto (reserva)'
    Then confirma que a su derecha aparece la columna 'Monto acumulado Folio Reserva 5401'

    When selecciona una fila de muestra
    And revisa la fórmula del monto acumulado
    Then la fórmula computa el acumulado esperado correctamente