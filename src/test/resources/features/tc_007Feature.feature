Feature: Visualización de la columna 'IVA exento'

  Background:
    Given the user is on the export page

  Scenario: Exportar el archivo y verificar la columna 'IVA exento'
    When the user exports the Excel file
    Then the Excel file should be exported successfully
    And the column 'IVA exento' should exist and display the correct values