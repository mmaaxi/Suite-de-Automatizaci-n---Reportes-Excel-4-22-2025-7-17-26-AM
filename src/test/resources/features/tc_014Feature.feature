Feature: Actualización de la fórmula de la columna 'IVA Acumulado'

Scenario: Verificar actualización de fórmula 'IVA Acumulado'
  Given El documento Excel está preparado para exportación
  When Exportar el documento Excel
  Then El documento se exporta correctamente

  When Revisar la fórmula en la columna 'IVA Acumulado'
  Then La fórmula calcula el acumulado correctamente excluyendo el IVA retenido

  When Utilizar una fila de ejemplo con valores de prueba
  And Calcular manualmente el resultado
  Then El valor calculado manualmente coincide con el resultado mostrado por la fórmula