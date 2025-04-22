package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class tc_008Page {

    WebDriver driver;

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    private By exportExcelButton = By.id("exportExcelBtn");
    private By reportPageIdentifier = By.id("reportPage");

    public void navigateToReportPage() {
        // Implement navigation logic to the report page
    }

    public void clickExportExcelButton() {
        driver.findElement(exportExcelButton).click();
        // Add wait or check for export completion
    }

    public boolean isExcelExported() {
        // Implement logic to check if the Excel is exported successfully
        return true; // Replace with actual implementation
    }

    public boolean isIVARetenidoColumnPresent() {
        // Implement logic to verify if the 'IVA retenido' column is present in the Excel
        return true; // Replace with actual implementation
    }

    public boolean verifyIVARetenidoValues() {
        // Implement logic to verify the values in the 'IVA retenido' column match expected values
        return true; // Replace with actual implementation
    }
}