package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ButtonsTest extends BaseTest {

    @Test
    public void checkTestClickButtons() {
        SoftAssert softAssert = new SoftAssert();
        buttons.openButtons();
        buttons.doubleClickBtn();
        softAssert.assertEquals(
                buttons.getDoubleClickMessage(),
                "You have done a double click",
                "");
        buttons.rightClickBtn();
        softAssert.assertEquals(
                buttons.getRightClickMessage(),
                "You have done a right click",
                "null");
        buttons.clickMe();
        softAssert.assertEquals(
                buttons.getDynamicClickMessage(),
                "You have done a dynamic click",
                "");
        softAssert.assertAll();
    }
}
