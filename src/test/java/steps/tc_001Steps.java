package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {
    tc_001Page page = new tc_001Page();

    @Given("El usuario está en la sección 'Canned Reports' del módulo 'Claim'")
    public void elUsuarioEstaEnLaSeccionCannedReports() {
        page.navigateToClaimModule();
    }

    @When("El usuario exporta el documento Excel del 'Claim Accounting Report'")
    public void elUsuarioExportaElDocumento() {
        page.exportExcelReport();
    }

    @Then("El documento Excel es exportado correctamente")
    public void elDocumentoExcelEsExportadoCorrectamente() {
        Assert.assertTrue(page.isExcelExportedSuccessfully());
    }

    @When("El usuario selecciona una fila de muestra y revisa la columna C")
    public void elUsuarioSeleccionaUnaFila() {
        page.selectSampleRow();
    }

    @Then("La columna C muestra la concatenación correcta usando la fórmula =CONCATENATE(D2, '_', H2, '_', U2, '_', O2, '_', E2)")
    public void laColumnaCMuestraLaConcatenacionCorrecta() {
        Assert.assertTrue(page.isColumnCFormattedCorrectly());
    }
}