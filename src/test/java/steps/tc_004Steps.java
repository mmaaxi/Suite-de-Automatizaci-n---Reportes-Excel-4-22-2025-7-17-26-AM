package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_004Page;

public class tc_004Steps {
    WebDriver driver;
    tc_004Page page;

    public tc_004Steps() {
        // Aquí se podría inicializar el driver de Selenium
    }

    @Given("el usuario está en la página de reportes")
    public void el_usuario_esta_en_la_pagina_de_reportes() {
        page = new tc_004Page(driver);
        page.navigateToReportPage();
    }

    @When("exporta el archivo Excel")
    public void exporta_el_archivo_Excel() {
        page.exportExcelFile();
    }

    @Then("el documento se exporta correctamente")
    public void el_documento_se_exporta_correctamente() {
        page.verifyExcelExport();
    }

    @When("busca la columna 'Monto (reserva)'")
    public void busca_la_columna_monto_reserva() {
        page.findMontoReservaColumn();
    }

    @Then("confirma que a su derecha aparece la columna 'Monto acumulado Folio Reserva 5401'")
    public void confirma_que_a_su_derecha_aparece_la_columna_monto_acumulado() {
        page.verifyMontoAcumuladoFolioReservaColumn();
    }

    @When("selecciona una fila de muestra")
    public void selecciona_una_fila_de_muestra() {
        page.selectSampleRow();
    }

    @When("revisa la fórmula del monto acumulado")
    public void revisa_la_formula_del_monto_acumulado() {
        page.checkAccumulatedAmountFormula();
    }

    @Then("la fórmula computa el acumulado esperado correctamente")
    public void la_formula_computa_el_acumulado_esperado_correctamente() {
        page.verifyAccumulatedAmountComputation();
    }
}