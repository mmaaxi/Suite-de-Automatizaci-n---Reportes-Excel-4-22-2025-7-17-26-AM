Feature: Actualización de la columna 'estado' en el documento Excel

  Scenario: Verificar la actualización de campos en la columna 'estado'
    Given el usuario ha exportado el documento Excel
    When el usuario revisa la columna 'estado' del documento
    Then el documento es exportado correctamente
    And los valores de la columna 'estado' son conformes a la especificación de la 'Descripción de Campos'