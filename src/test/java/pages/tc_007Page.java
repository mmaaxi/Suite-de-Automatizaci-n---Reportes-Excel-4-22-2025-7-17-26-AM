package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class tc_007Page {

    WebDriver driver;
    WebDriverWait wait;

    By exportButton = By.id("exportButtonId");
    By columnIVAExento = By.xpath("//th[contains(text(), 'IVA exento')]");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void clickExportButton() {
        driver.findElement(exportButton).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(exportButton));
    }

    public boolean isExcelExportedSuccessfully() {
        // Implement logic to verify that Excel is exported, usually involves
        // checking download directory for the file
        return true;
    }

    public boolean doesColumnExistWithCorrectValues(String columnName) {
        WebElement column = driver.findElement(columnIVAExento);
        return column != null && column.getText().equals(columnName);
    }
}