package steps;

import io.cucumber.java.en.*;
import pages.tc_005Page;
import static org.junit.Assert.*;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("El usuario exporta el Excel")
    public void elUsuarioExportaElExcel() {
        page.exportarExcel();
    }

    @When("El usuario verifica la cabecera de la columna en la posición Z")
    public void elUsuarioVerificaLaCabeceraDeLaColumnaEnLaPosiciónZ() {
        page.verificarCabeceraColumnaZ();
    }

    @Then("La cabecera de la columna se muestra como 'Monto Acumulado Folio OPC \\(2121\\)'")
    public void laCabeceraDeLaColumnaSeMuestraComoMontoAcumuladoFolioOPC() {
        String textoEsperado = "Monto Acumulado Folio OPC (2121)";
        String textoReal = page.obtenerTextoCabeceraColumnaZ();
        assertEquals(textoEsperado, textoReal);
    }
}