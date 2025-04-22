Feature: Visualización de la columna 'IVA 0%'

  Scenario: Exportar archivo y verificar columna 'IVA 0%'
    Given el usuario exporta el archivo Excel
    When identifica la columna 'IVA 0%' en la posición documentada
    Then la columna 'IVA 0%' se muestra en la ubicación correcta
    And revisa con datos de prueba que el valor ingresado corresponde a la tasa 0% de IVA
    Then cada fila muestra el monto aplicable a la tasa 0%