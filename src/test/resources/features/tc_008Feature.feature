Feature: Visualización de la columna 'IVA retenido'

  Scenario: Exportar Excel y verificar columna 'IVA retenido'
    Given el usuario está en la página de reportes
    When el usuario exporta el archivo Excel
    Then el archivo Excel es exportado apropiadamente
    And la columna 'IVA retenido' está presente en el archivo
    And la columna muestra los montos retenidos de la operación según la documentación