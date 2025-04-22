package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {
    WebDriver driver;

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToReportPage() {
        // Implementación para navegar a la página de reportes
    }

    public void exportExcelFile() {
        // Implementación para exportar el archivo Excel
    }

    public void verifyExcelExport() {
        // Implementación para verificar exportación exitosa del excel
    }

    public void findMontoReservaColumn() {
        // Implementación para localizar la columna 'Monto (reserva)'
    }

    public void verifyMontoAcumuladoFolioReservaColumn() {
        // Implementación para verificar ubicación de 'Monto acumulado Folio Reserva 5401'
    }

    public void selectSampleRow() {
        // Implementación para seleccionar una fila de muestra
    }

    public void checkAccumulatedAmountFormula() {
        // Implementación para revisar la fórmula de acumulación
    }

    public void verifyAccumulatedAmountComputation() {
        // Implementación para verificar que la fórmula computa el acumulado correctamente
    }
}