package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RadioButtonTest extends BaseTest {

    @Test
    public void checkTestRadioButton() {
        SoftAssert softAssert = new SoftAssert();
        radioButton.openRadioButton();
        radioButton.clickButtonYes();
        softAssert.assertEquals(radioButton.getMessageYes(), "You have selected Yes", "");
        radioButton.clickButtonImpressive();
        softAssert.assertEquals(radioButton.getMessageImpressive(), "You have selected Impressive", "");
        softAssert.assertAll();
    }
}
