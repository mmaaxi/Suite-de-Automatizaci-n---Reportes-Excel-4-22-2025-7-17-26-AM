package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @Given("el usuario ha exportado el documento Excel")
    public void elUsuarioHaExportadoElDocumentoExcel() {
        Assert.assertTrue(page.isExcelExportedSuccessfully());
    }

    @When("el usuario revisa la columna 'estado' del documento")
    public void elUsuarioRevisaLaColumnaEstadoDelDocumento() {
        page.checkEstadoColumnValues();
    }

    @Then("el documento es exportado correctamente")
    public void elDocumentoEsExportadoCorrectamente() {
        Assert.assertTrue(page.verifyExcelExport());
    }

    @Then("los valores de la columna 'estado' son conformes a la especificación de la 'Descripción de Campos'")
    public void losValoresDeLaColumnaEstadoSonConformesALaEspecificación() {
        Assert.assertTrue(page.validateEstadoColumnFormat());
    }
}