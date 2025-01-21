package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

    WebDriver driver;

    By doubleClickBtn = By.xpath("//*[@id='doubleClickBtn']");
    By rightClickBtn = By.xpath("//*[@id='rightClickBtn']");
    By clickMe = By.xpath("//*[@id='ZaKV4']");
    By doubleClickMessage = By.xpath("//*[@id='doubleClickMessage']");
    By rightClickMessage = By.xpath("//*[@id='rightClickMessage']");
    By dynamicClickMessage = By.xpath("//*[@id='dynamicClickMessage']");

    public Buttons(WebDriver driver) {
        this.driver = driver;
    }

    public void openButtons() {
        driver.get("https://demoqa.com/buttons");
    }

    public WebElement findBy(By element) {
        return driver.findElement(element);
    }

    public void doubleClickBtn() {
        new Actions(driver)
                .doubleClick(findBy(doubleClickBtn))
                .perform();
    }

    public String getDoubleClickMessage() {
        return driver.findElement(doubleClickMessage).getText();
    }

    public void rightClickBtn() {
        new Actions(driver)
                .contextClick(findBy(rightClickBtn))
                .perform();
    }

    public String getRightClickMessage() {
        return driver.findElement(rightClickMessage).getText();
    }

    public void clickMe() {
        findBy(clickMe).click();
    }

    public String getDynamicClickMessage() {
        return driver.findElement(dynamicClickMessage).getText();
    }
}