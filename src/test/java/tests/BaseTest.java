package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    Buttons buttons;
    CheckBox checkBox;
//    RadioButton radioButton;
    TextBox textBox;
//    WebTables webTables;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.setCapability("pageLoadStrategy", "eager");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        buttons = new Buttons(driver);
        checkBox = new CheckBox(driver);
//        radioButton = new RadioButton(driver);
        textBox = new TextBox(driver);
//        webTables = new WebTables(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}