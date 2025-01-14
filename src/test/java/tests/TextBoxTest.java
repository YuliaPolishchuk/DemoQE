package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

    public class TextBoxTest extends BaseTest {

        @Test
        public void checkTestTextBoxWithWellField() {
            SoftAssert softAssert = new SoftAssert();
            textBox.open();
            textBox.fillFields("yulia", "nikolaevajulija.97@gmail.com", "Moskow", "Moskow");
            textBox.clicksubmitButton();
            softAssert.assertEquals(textBox.getOutputName(), "Name:yulia", "null");
            softAssert.assertEquals(textBox.getOutputEmail(),"Email:nikolaevajulija.97@gmail.com", "");
            softAssert.assertEquals(textBox.getOutputCurrentAddress(), "Current Address :Moskow", "");
            softAssert.assertEquals(textBox.getOutputPermanentAddress(),"Permananet Address :Moskow", "");
            softAssert.assertAll();
        }

        @Test
        public void checkTestTextBoxWithNullNameField() {
            SoftAssert softAssert = new SoftAssert();
            textBox.open();
            textBox.fillFields("", "nikolaevajulija.97@gmail.com", "Moskow", "Moskow");
            textBox.clicksubmitButton();
            softAssert.assertEquals(textBox.getOutputEmail(),"Email:nikolaevajulija.97@gmail.com", "");
            softAssert.assertEquals(textBox.getOutputCurrentAddress(), "Current Address :Moskow", "");
            softAssert.assertEquals(textBox.getOutputPermanentAddress(),"Permananet Address :Moskow", "");
            softAssert.assertAll();
        }
    }
