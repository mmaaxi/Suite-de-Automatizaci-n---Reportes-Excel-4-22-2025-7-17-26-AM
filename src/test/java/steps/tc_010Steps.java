package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page page = new tc_010Page();

    @Given("^el documento Excel es exportado$")
    public void elDocumentoExcelEsExportado() {
        page.exportarExcel();
    }

    @When("^reviso la columna 'Folio Pre solicitud'$")
    public void revisoLaColumnaFolioPreSolicitud() {
        page.verificarColumnaFolioPreSolicitud();
    }

    @Then("^la columna debería estar a la derecha de la columna 'Ramo'$")
    public void laColumnaDeberíaEstarADerechaDeRamo() {
        assert page.columnaEstaEnPosicionCorrecta();
    }

    @Then("^la columna debería estar vacía$")
    public void laColumnaDeberíaEstarVacía() {
        assert page.columnaEstaVacia();
    }
}