package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import pages.tc_002Page;

public class tc_002Steps {
    private tc_002Page page;

    @Given("estoy en la página de descarga de documentos")
    public void estoy_en_la_página_de_descarga_de_documentos() {
        page = new tc_002Page();
        page.navigateToDownloadPage();
    }

    @When("exporto el documento Excel")
    public void exporto_el_documento_Excel() {
        boolean exportSuccess = page.exportExcelDocument();
        assertTrue("El documento no se exportó correctamente", exportSuccess);
    }

    @Then("el documento es exportado sin errores")
    public void el_documento_es_exportado_sin_errores() {
        assertTrue("El documento tiene errores de exportación", page.isDocumentExportedCorrectly());
    }

    @Then("verifico que la columna 'Estado Código' aparece después de la columna 'i'")
    public void verifico_que_la_columna_Estado_Código_aparece_despues_de_la_columna_i() {
        assertTrue("La estructura del documento está desalineada", page.isEstadoCodigoColumnInCorrectPosition());
    }
}