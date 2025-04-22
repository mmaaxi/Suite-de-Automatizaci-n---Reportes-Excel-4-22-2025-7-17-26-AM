Feature: Verificar columna 'Folio Pre solicitud' al exportar Excel

  Scenario: Verificar columna 'Folio Pre solicitud' en Excel exportado
    Given el documento Excel es exportado
    When reviso la columna 'Folio Pre solicitud'
    Then la columna debería estar a la derecha de la columna 'Ramo'
    And la columna debería estar vacía