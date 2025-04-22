package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @When("el usuario exporta el documento Excel")
    public void elUsuarioExportaElDocumentoExcel() {
        page.exportExcel();
    }

    @Then("el Excel se exporta sin errores")
    public void elExcelSeExportaSinErrores() {
        page.verifyExcelExported();
    }

    @Then("para un registro de pago, el usuario revisa la fórmula en la celda 'Monto Acumulado Folio OPC (2121)'")
    public void paraUnRegistroDePagoElUsuarioRevisaLaFormula() {
        page.verifyFormulaInExcel();
    }

    @Then("la fórmula es similar a '=Z4+AD5+AE5+AH5+AC5+AB5+AM5' y realiza la suma correcta mostrando el acumulado esperado")
    public void laFormulaEsCorrecta() {
        page.verifyFormulaCorrectnessAndSum();
    }
}