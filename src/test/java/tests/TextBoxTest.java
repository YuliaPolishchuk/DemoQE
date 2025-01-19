package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

    public class TextBoxTest extends BaseTest {

        @Test
        public void checkTestTextBoxWithWellField() {
            SoftAssert softAssert = new SoftAssert();
            textBox.open();
            textBox.fillFields("yulia", "nikolaevajulija.97@gmail.com", "Moskow", "Moskow");
            textBox.clickSubmitButton();
            softAssert.assertEquals(textBox.getOutputName(), "Name:yulia", "null");
            softAssert.assertEquals(textBox.getOutputEmail(),"Email:nikolaevajulija.97@gmail.com", "");
            softAssert.assertEquals(textBox.getOutputCurrentAddress(), "", ""); //ничего не находит, если здесь оставить аналогичный ОР, то выдаёт ошибку
            softAssert.assertEquals(textBox.getOutputPermanentAddress(),"", ""); //ничего не находит, если здесь оставить аналогичный ОР, то выдаёт ошибку
            softAssert.assertAll();
        }

        @Test
        public void checkTestTextBoxWithNullNameField() {
            SoftAssert softAssert = new SoftAssert();
            textBox.open();
            textBox.fillFields("", "nikolaevajulija.97@gmail.com", "Moskow", "Moskow");
            textBox.clickSubmitButton();
            softAssert.assertEquals(textBox.getOutputEmail(),"Email:nikolaevajulija.97@gmail.com", "");
            softAssert.assertEquals(textBox.getOutputCurrentAddress(), "", ""); //аналогично 1 тесту
            softAssert.assertEquals(textBox.getOutputPermanentAddress(),"", ""); //аналогично 1 тесту
            softAssert.assertAll();
        }
    }
