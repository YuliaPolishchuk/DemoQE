package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox {

    WebDriver driver;

    By fullNameField = By.xpath("//*[@id='userName']");
    By emailField = By.xpath("//*[@id='userEmail']");
    By currentAddressField = By.xpath("//*[@id='currentAddress']");
    By permanentAddressField = By.xpath("//*[@id='permanentAddress']");
    By submitButton = By.xpath("//*[@id='submit']");
    By outputName  = By.xpath("//*[@id='name']");
    By outputEmail = By.xpath("//*[@id='email']");
    By outputCurrentAddress = By.xpath("//*[@id='currentAddress']");
    By outputPermanentAddress = By.xpath("//*[@id='permanentAddress']");

    public TextBox(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/text-box");
    }

    public void fillFields (String fullName, String email, String currentAddress, String permanentAddress) {
        driver.findElement(fullNameField).sendKeys(fullName);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(currentAddressField).sendKeys(currentAddress);
        driver.findElement(permanentAddressField).sendKeys(permanentAddress);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public String getOutputName() {
        return driver.findElement(outputName).getText();
    }

    public String getOutputEmail() {
        return driver.findElement(outputEmail).getText();
    }

    public String getOutputCurrentAddress() {
        return driver.findElement(outputCurrentAddress).getText();
    }

    public String getOutputPermanentAddress() {
        return driver.findElement(outputPermanentAddress).getText();
    }
}