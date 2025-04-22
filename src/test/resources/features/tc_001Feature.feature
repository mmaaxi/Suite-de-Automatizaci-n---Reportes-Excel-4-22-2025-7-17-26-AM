Feature: Verificación del reporte Claim Accounting Report

  Scenario: Orden de la llave en la columna C
    Given El usuario está en la sección 'Canned Reports' del módulo 'Claim'
    When El usuario exporta el documento Excel del 'Claim Accounting Report'
    Then El documento Excel es exportado correctamente
    When El usuario selecciona una fila de muestra y revisa la columna C
    Then La columna C muestra la concatenación correcta usando la fórmula =CONCATENATE(D2, '_', H2, '_', U2, '_', O2, '_', E2)