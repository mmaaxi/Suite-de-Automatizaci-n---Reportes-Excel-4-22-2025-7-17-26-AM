Feature: Exportar archivo Excel y verificar columna 'Folio de Pago'

  Scenario: Nueva columna 'Folio de Pago'
    Given El usuario está en la página de exportación de Excel
    When El usuario exporta el archivo Excel
    Then El documento es exportado sin inconvenientes
    And La columna 'Folio de Pago' se agrega inmediatamente a la derecha de 'Folio Pre solicitud'
    And La columna 'Folio de Pago' existe y aparece vacía