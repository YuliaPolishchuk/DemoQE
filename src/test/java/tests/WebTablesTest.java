package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebTablesTest extends BaseTest {

    @Test
    public void checkTestWebTables() {
        SoftAssert softAssert = new SoftAssert();
        webTables.openWebTables();
        webTables.clickAddButton();
        webTables.fillFields("Yulia", "Polishchuk", "nikolaevajulija.97@gmail.com", "27", "500000", "FT");
        webTables.clickSubmitButton();
        softAssert.assertEquals(webTables.getGridCellFirstName(), "Yulia", "");
//        webTables.clickEditButton(); //не находит кнопку
//        softAssert.assertEquals(webTables.getRegistrationForm(), "Registration Form", "");
//        webTables.clickClose();
//        webTables.clickDeleteButton();// не находит кнопку
        softAssert.assertAll();
    }
}
