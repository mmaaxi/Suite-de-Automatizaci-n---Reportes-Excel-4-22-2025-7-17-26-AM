package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_013Page;

public class tc_013Steps {

    tc_013Page page = new tc_013Page();

    @Given("el usuario está en la pantalla de exportación de Excel")
    public void elUsuarioEstaEnLaPantallaDeExportacionDeExcel() {
        page.navigateToExportScreen();
    }

    @When("el usuario exporta el Excel")
    public void elUsuarioExportaElExcel() {
        page.exportExcel();
        Assert.assertTrue("El Excel no se exportó correctamente.", page.isExcelExported());
    }

    @Then("el Excel se exporta sin errores")
    public void elExcelSeExportaSinErrores() {
        // Verificación ya realizada en el paso when
    }

    @Then("la columna que originalmente era 'Status de Pago' es identificada correctamente")
    public void laColumnaQueOriginalmenteEraStatusDePagoEsIdentificadaCorrectamente() {
        Assert.assertTrue("La columna 'Status de Pago' no se encuentra en el Excel exportado.",
                page.isColumnStatusDePagoPresent());
    }

    @Then("el encabezado de la columna muestra 'Descripción Status Pago'")
    public void elEncabezadoDeLaColumnaMuestraDescripcionStatusPago() {
        Assert.assertTrue("El encabezado de la columna no muestra 'Descripción Status Pago'.",
                page.isColumnHeaderRenamedCorrectly());
    }
}