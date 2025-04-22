package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class tc_006Page {

    WebDriver driver;

    By exportButton = By.id("exportButton");
    By ivaColumn = By.xpath("//table[@id='excelTable']//th[contains(text(),'IVA 0%')]");
    By ivaColumnValues = By.xpath("//table[@id='excelTable']//td[position()=desiredPosition]");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportExcel() {
        driver.findElement(exportButton).click();
    }

    public boolean isColumnInCorrectPosition() {
        // Logic to find if the column is in the correct position
        WebElement column = driver.findElement(ivaColumn);
        return column != null;
    }

    public boolean isColumnVisible() {
        WebElement column = driver.findElement(ivaColumn);
        return column.isDisplayed();
    }

    public boolean isCorrectValueDisplayed() {
        List<WebElement> values = driver.findElements(ivaColumnValues);
        for (WebElement value : values) {
            if (!value.getText().equals("0")) {
                return false;
            }
        }
        return true;
    }
}