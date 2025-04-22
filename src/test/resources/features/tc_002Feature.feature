Feature: Inserción de la columna 'Estado Código'

  Scenario: Exportar documento Excel y verificar la posición de la columna 'Estado Código'
    Given estoy en la página de descarga de documentos
    When exporto el documento Excel
    Then el documento es exportado sin errores
    And verifico que la columna 'Estado Código' aparece después de la columna 'i'