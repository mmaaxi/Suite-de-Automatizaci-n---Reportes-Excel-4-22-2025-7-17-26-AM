Feature: Verificación de la nueva columna 'Status Pago Código'

  Scenario: Nuevas pruebas de exportación de Excel
    Given estoy en la página de exportación de reportes
    When exporto el documento Excel
    Then el documento se exporta correctamente

  Scenario: Verificación de la columna 'Status Pago Código'
    Given el documento Excel ha sido exportado
    And abro el documento exportado
    Then verifico que la columna 'Status Pago Código' aparece junto a 'Fecha de Pago'

  Scenario: Corroborar que la columna 'Status Pago Código' esté vacía
    Given la columna 'Status Pago Código' está presente
    Then verifico que la columna 'Status Pago Código' aparece sin valores