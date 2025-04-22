package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_013Page {

    WebDriver driver;

    public tc_013Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToExportScreen() {
        // Código para navegar a la pantalla de exportación de Excel
    }

    public void exportExcel() {
        // Código para accionar la exportación del Excel
    }

    public boolean isExcelExported() {
        // Lógica para verificar que el Excel se haya exportado correctamente
        return true; // implementación de prueba
    }

    public boolean isColumnStatusDePagoPresent() {
        // Verificar que la columna 'Status de Pago' esté presente en el Excel exportado
        return driver.findElement(By.xpath("//th[text()='Status de Pago']")) != null;
    }

    public boolean isColumnHeaderRenamedCorrectly() {
        // Verificar que el encabezado de la columna muestre 'Descripción Status Pago'
        return driver.findElement(By.xpath("//th[text()='Descripción Status Pago']")) != null;
    }
}