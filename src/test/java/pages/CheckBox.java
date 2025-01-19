package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {

    WebDriver driver;

    By checkBoxHome = By.xpath("//*[@id='tree-node']/ol/li/span/label/span[3]");
    By displayResult = By.cssSelector("#result");
    By viewBox = By.cssSelector("#tree-node > ol > li > span > button > svg");
    By Desktop = By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/span/label/span[3]");
    By Documents = By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/span/label/span[3]");
    By Downloads = By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/span/label/span[3]");

    public CheckBox(WebDriver driver) {
        this.driver = driver;
    }

    public void openCheckBox() {
        driver.get("https://demoqa.com/checkbox");
    }

    public void clickCheckBoxHome() {
        driver.findElement(checkBoxHome).click();
    }

    public String getDisplayResult() {
        return driver.findElement(displayResult).getText();
    }

    public void clickViewBox() {
        driver.findElement(viewBox).click();
    }

    public String getDesktop() {
        return driver.findElement(Desktop).getText();
    }

    public String getDocuments() {
        return driver.findElement(Documents).getText();
    }

    public String getDownloads() {
        return driver.findElement(Downloads).getText();
    }
}

