package org.opencart.pages_pf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Loginpage {

    //1. locators
    //2. methods

    WebDriver driver;

    @FindBy(id = "input-email")
    WebElement input_email;

    @FindBy(id = "input-password")
    WebElement input_password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitButton;

    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myaccount;

    @FindBy(xpath = "//ul//li//a[text()='Login']")
    WebElement loginBtn;

    public Loginpage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void enterUserName(String username){
        input_email.sendKeys(username);

    }

    public void enterPassword(String password){
        input_password.sendKeys(password);

    }

    public void loginButton(){
        submitButton.click();
    }

    public void myAccount(){

        driver.navigate().refresh();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(myaccount));
        element.click();

        //verify logout text displayed on the list

    }

    public void clickOnLoginBtn(){

        loginBtn.click();
    }

}
