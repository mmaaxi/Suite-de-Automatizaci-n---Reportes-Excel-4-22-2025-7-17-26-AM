package steps;

import io.cucumber.java.en.*;
import static org.junit.Assert.assertTrue;
import pages.tc_014Page;

public class tc_014Steps {
    tc_014Page page = new tc_014Page();

    @Given("El documento Excel está preparado para exportación")
    public void prepararDocumentoExcel() {
        page.prepararDocumento();
    }

    @When("Exportar el documento Excel")
    public void exportarDocumento() {
        page.exportarExcel();
    }

    @Then("El documento se exporta correctamente")
    public void verificarExportacion() {
        assertTrue(page.verificarExportacionExitosa());
    }

    @When("Revisar la fórmula en la columna 'IVA Acumulado'")
    public void revisarFormulaIVA() {
        page.revisarFormulaIVA();
    }

    @Then("La fórmula calcula el acumulado correctamente excluyendo el IVA retenido")
    public void verificarFormulaIVA() {
        assertTrue(page.verificarFormulaIVA());
    }

    @When("Utilizar una fila de ejemplo con valores de prueba")
    public void utilizarFilaEjemplo() {
        page.utilizarFilaEjemplo();
    }

    @And("Calcular manualmente el resultado")
    public void calcularResultadoManual() {
        page.calcularResultadoManual();
    }

    @Then("El valor calculado manualmente coincide con el resultado mostrado por la fórmula")
    public void verificarValorCalculado() {
        assertTrue(page.verificarValorCalculadoManual());
    }
}