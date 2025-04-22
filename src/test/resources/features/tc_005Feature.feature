Feature: Cambio de nombre de columna 'Monto Acumulado Folio OPC'

  Scenario: Verificar exportación y cabecera de columna
    Given El usuario exporta el Excel
    When El usuario verifica la cabecera de la columna en la posición Z
    Then La cabecera de la columna se muestra como 'Monto Acumulado Folio OPC (2121)'