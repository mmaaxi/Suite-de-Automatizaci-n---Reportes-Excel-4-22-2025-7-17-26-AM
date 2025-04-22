package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_011Page;

public class tc_011Steps {

    tc_011Page page = new tc_011Page();

    @Given("El usuario está en la página de exportación de Excel")
    public void el_usuario_está_en_la_página_de_exportación_de_Excel() {
        page.navegarAPaginaDeExportacion();
    }

    @When("El usuario exporta el archivo Excel")
    public void el_usuario_exporta_el_archivo_Excel() {
        page.exportarArchivoExcel();
    }

    @Then("El documento es exportado sin inconvenientes")
    public void el_documento_es_exportado_sin_inconvenientes() {
        Assert.assertTrue(page.verificarExportacionExitosa());
    }

    @And("La columna 'Folio de Pago' se agrega inmediatamente a la derecha de 'Folio Pre solicitud'")
    public void la_columna_folio_de_pago_se_agrega_a_la_derecha_de_folio_pre_solicitud() {
        Assert.assertTrue(page.verificarUbicacionColumnaFolioDePago());
    }

    @And("La columna 'Folio de Pago' existe y aparece vacía")
    public void la_columna_folio_de_pago_existe_y_aparece_vacía() {
        Assert.assertTrue(page.verificarColumnaFolioDePagoVacia());
    }
}