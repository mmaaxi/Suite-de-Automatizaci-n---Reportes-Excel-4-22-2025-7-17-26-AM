package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import pages.tc_008Page;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("el usuario está en la página de reportes")
    public void el_usuario_esta_en_la_pagina_de_reportes() {
        page.navigateToReportPage();
    }

    @When("el usuario exporta el archivo Excel")
    public void el_usuario_exporta_el_archivo_excel() {
        page.clickExportExcelButton();
    }

    @Then("el archivo Excel es exportado apropiadamente")
    public void el_archivo_excel_es_exportado_apropiadamente() {
        assertTrue(page.isExcelExported());
    }

    @Then("la columna 'IVA retenido' está presente en el archivo")
    public void la_columna_iva_retenido_esta_presente_en_el_archivo() {
        assertTrue(page.isIVARetenidoColumnPresent());
    }

    @Then("la columna muestra los montos retenidos de la operación según la documentación")
    public void la_columna_muestra_montos_retenidos_operacion_según_documentacion() {
        assertTrue(page.verifyIVARetenidoValues());
    }
}