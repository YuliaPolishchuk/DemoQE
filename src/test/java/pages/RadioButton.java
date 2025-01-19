package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton {

    WebDriver driver;

    By buttonYes = By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[2]/label");
    By buttonImpressive = By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/label");
    By messageYes = By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/p");
    By messageImpressive = By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/p");


    public RadioButton(WebDriver driver) {
        this.driver = driver;
    }

    public void openRadioButton() {
        driver.get("https://demoqa.com/radio-button");
    }

    public void clickButtonYes() {
        driver.findElement(buttonYes).click();
    }

    public String getMessageYes() {
        return driver.findElement(messageYes).getText();
    }

    public void clickButtonImpressive() {
        driver.findElement(buttonImpressive).click();
    }

    public String getMessageImpressive() {
        return driver.findElement(messageImpressive).getText();
    }
}
