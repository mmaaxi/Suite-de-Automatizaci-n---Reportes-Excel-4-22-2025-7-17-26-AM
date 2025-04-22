package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_012Page;

public class tc_012Steps {

    tc_012Page page = new tc_012Page();

    @Given("estoy en la página de exportación de reportes")
    public void estoyEnLaPaginaDeExportacion() {
        page.navigateToExportPage();
    }

    @When("exporto el documento Excel")
    public void exportoElDocumentoExcel() {
        page.exportExcelDocument();
    }

    @Then("el documento se exporta correctamente")
    public void elDocumentoSeExportaCorrectamente() {
        Assert.assertTrue(page.isDocumentExported());
    }

    @Given("el documento Excel ha sido exportado")
    public void elDocumentoExcelHaSidoExportado() {
        Assert.assertTrue(page.isDocumentExported());
    }

    @Given("abro el documento exportado")
    public void abroElDocumentoExportado() {
        page.openExportedDocument();
    }

    @Then("verifico que la columna 'Status Pago Código' aparece junto a 'Fecha de Pago'")
    public void verificoColumnaStatusPagoCodigo() {
        Assert.assertTrue(page.isStatusPagoCodigoColumnInCorrectPosition());
    }

    @Given("la columna 'Status Pago Código' está presente")
    public void laColumnaStatusPagoCodigoEstaPresente() {
        Assert.assertTrue(page.isStatusPagoCodigoColumnPresent());
    }

    @Then("verifico que la columna 'Status Pago Código' aparece sin valores")
    public void verificoColumnaStatusPagoCodigoSinValores() {
        Assert.assertTrue(page.isStatusPagoCodigoColumnEmpty());
    }
}