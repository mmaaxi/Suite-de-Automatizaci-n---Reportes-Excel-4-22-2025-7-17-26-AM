package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {
    WebDriver driver;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToClaimModule() {
        // Código para navegar a la sección Canned Reports del módulo Claim
    }

    public void exportExcelReport() {
        // Código para exportar el documento Excel
        WebElement exportButton = driver.findElement(By.id("exportBtn"));
        exportButton.click();
    }

    public boolean isExcelExportedSuccessfully() {
        // Verificación de la exportación correcta
        return true; // Ejemplo de retorno
    }

    public void selectSampleRow() {
        // Código para seleccionar una fila específica en el Excel exportado
    }

    public boolean isColumnCFormattedCorrectly() {
        // Verificación de formato correcto en la columna C usando CONCATENATE
        return true; // Ejemplo de retorno
    }
}