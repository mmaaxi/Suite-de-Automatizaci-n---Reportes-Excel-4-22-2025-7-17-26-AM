Feature: Renombrado de columna 'Status de Pago'

  Scenario: Validar el renombrado de la columna 'Status de Pago' al exportar el Excel
    Given el usuario está en la pantalla de exportación de Excel
    When el usuario exporta el Excel
    Then el Excel se exporta sin errores
    And la columna que originalmente era 'Status de Pago' es identificada correctamente
    And el encabezado de la columna muestra 'Descripción Status Pago'