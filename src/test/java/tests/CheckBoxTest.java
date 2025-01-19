package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkTestCheckBox() {
        SoftAssert softAssert = new SoftAssert();
        checkBox.openCheckBox();
        checkBox.clickCheckBoxHome();
        softAssert.assertEquals(checkBox.getDisplayResult(), "You have selected :\n" + "home\n" + "desktop\n"
                        + "notes\n" + "commands\n" + "documents\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n"
                        + "office\n" + "public\n" + "private\n" + "classified\n" + "general\n" + "downloads\n" + "wordFile\n"
                        + "excelFile",
                "null");
        checkBox.clickViewBox();
        softAssert.assertEquals(checkBox.getDesktop(), "Desktop", "");
        softAssert.assertEquals(checkBox.getDocuments(), "Documents", "");
        softAssert.assertEquals(checkBox.getDownloads(), "Downloads", "");
        softAssert.assertAll();
    }
}