package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @When("the user exports the Excel file")
    public void the_user_exports_the_excel_file() {
        page.clickExportButton();
    }

    @Then("the Excel file should be exported successfully")
    public void the_excel_file_should_be_exported_successfully() {
        Assert.assertTrue(page.isExcelExportedSuccessfully());
    }

    @Then("the column 'IVA exento' should exist and display the correct values")
    public void the_column_iva_exento_should_exist_and_display_the_correct_values() {
        Assert.assertTrue(page.doesColumnExistWithCorrectValues("IVA exento"));
    }
}