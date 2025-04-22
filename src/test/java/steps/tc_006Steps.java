package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("el usuario exporta el archivo Excel")
    public void elUsuarioExportaElArchivoExcel() {
        page.exportExcel();
    }

    @When("identifica la columna 'IVA 0%' en la posición documentada")
    public void identificaLaColumnaIVA0EnLaPosicionDocumentada() {
        boolean isCorrectPosition = page.isColumnInCorrectPosition();
        Assert.assertTrue("La columna 'IVA 0%' no está en la posición correcta", isCorrectPosition);
    }

    @Then("la columna 'IVA 0%' se muestra en la ubicación correcta")
    public void laColumnaIVA0SeMuestraEnLaUbicacionCorrecta() {
        Assert.assertTrue("La columna 'IVA 0%' no se muestra en la ubicación correcta", page.isColumnVisible());
    }

    @Then("cada fila muestra el monto aplicable a la tasa 0%")
    public void cadaFilaMuestraElMontoAplicableALaTasa0() {
        Assert.assertTrue("Hay filas que no muestran el monto aplicable a la tasa 0%", page.isCorrectValueDisplayed());
    }
}