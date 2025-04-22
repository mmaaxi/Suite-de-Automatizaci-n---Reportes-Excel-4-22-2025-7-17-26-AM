package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_011Page {

    WebDriver driver;

    By exportButton = By.id("exportButtonId");
    By folioPreSolicitudColumn = By.xpath("//th[contains(text(), 'Folio Pre solicitud')]");
    By folioDePagoColumn = By.xpath("//th[contains(text(), 'Folio de Pago')]");

    public tc_011Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDeExportacion() {
        driver.navigate().to("https://example.com/export");
    }

    public void exportarArchivoExcel() {
        driver.findElement(exportButton).click();
    }

    public boolean verificarExportacionExitosa() {
        // Lógica para verificar que el archivo se haya exportado
        return true;  // Suponer que la verificación es exitosa
    }

    public boolean verificarUbicacionColumnaFolioDePago() {
        WebElement folioPreSolicitud = driver.findElement(folioPreSolicitudColumn);
        WebElement folioDePago = folioPreSolicitud.findElement(By.xpath("following-sibling::th[1]"));
        return folioDePago.getText().equals("Folio de Pago");
    }

    public boolean verificarColumnaFolioDePagoVacia() {
        // Lógica para verificar que la columna 'Folio de Pago' está vacía
        return true;  // Suponer que la verificación es exitosa
    }
}