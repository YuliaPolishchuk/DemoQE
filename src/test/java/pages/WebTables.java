package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTables {

    WebDriver driver;

    By addButton = By.xpath("//*[@id='addNewRecordButton']");
    By firstNameField = By.xpath("//*[@id='firstName']");
    By lastNameField = By.xpath("//*[@id='lastName']");
    By userEmailField = By.xpath("//*[@id='userEmail']");
    By ageField = By.xpath("//*[@id='age']");
    By salaryField = By.xpath("//*[@id='salary']");
    By departmentField = By.xpath("//*[@id='department']");
    By submitButton = By.xpath("//*[@id='submit']");
    By gridCellFirstName = By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]");
    By editButton = By.cssSelector("#edit-record-4 > svg");
    By registrationForm = By.xpath("/html/body/div[4]/div/div/div[1]");
    By close = By.xpath("/html/body/div[4]/div/div/div[1]/button/span[1]");
    By deleteButton = By.xpath("//*[@id='delete-record-4']");


    public WebTables(WebDriver driver) {
        this.driver = driver;
    }

    public void openWebTables() {
        driver.get("https://demoqa.com/webtables");
    }

    public void clickAddButton() {
        driver.findElement(addButton).click();
    }

    public void fillFields(String firstName, String lastName, String userEmail, String age, String salary, String department) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(userEmailField).sendKeys(userEmail);
        driver.findElement(ageField).sendKeys(age);
        driver.findElement(salaryField).sendKeys(salary);
        driver.findElement(departmentField).sendKeys(department);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public String getGridCellFirstName() {
        return driver.findElement(gridCellFirstName).getText();
    }

    public void clickEditButton() {
        driver.findElement(editButton).click();
    }

    public String getRegistrationForm() {
        return driver.findElement(registrationForm).getText();
    }

    public void clickClose() {
        driver.findElement(close).click();
    }

    public void clickDeleteButton() {
        driver.findElement(deleteButton).click();
    }
}