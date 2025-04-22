package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {

    WebDriver driver;

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportarExcel() {
        // Implementación del método para exportar el Excel
        // driver.findElement(By.id("exportButton")).click();
    }

    public void verificarCabeceraColumnaZ() {
        // Implementación necesaria si se requiere verificar algo antes de obtener el texto
    }

    public String obtenerTextoCabeceraColumnaZ() {
        WebElement cabeceraColumnaZ = driver.findElement(By.xpath("//table/thead/tr/th[position()=26]"));
        return cabeceraColumnaZ.getText();
    }
}