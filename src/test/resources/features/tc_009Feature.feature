Feature: Actualización de fórmula en 'Monto Acumulado Folio OPC (2121)'

  Scenario: Validar fórmula en el Excel exportado
    Given el usuario ha iniciado sesión en la aplicación
    When el usuario exporta el documento Excel
    Then el Excel se exporta sin errores

    And para un registro de pago, el usuario revisa la fórmula en la celda 'Monto Acumulado Folio OPC (2121)'
    Then la fórmula es similar a '=Z4+AD5+AE5+AH5+AC5+AB5+AM5' y realiza la suma correcta mostrando el acumulado esperado