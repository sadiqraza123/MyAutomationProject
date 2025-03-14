package org.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver;

    //1. locator
    // methods

    By input_email = By.id("input-email");
    By input_pass = By.id("input-password");
    By loginBtn = By.xpath("//input[@type='submit']");

    public LoginPage(WebDriver driver){

        this.driver=driver;

    }


    public void enterUserName(String username){
        driver.findElement(input_email).sendKeys(username);

    }

    public void enterPassword(String password){
        driver.findElement(input_pass).sendKeys(password);

    }

    public void loginButton(){

        driver.findElement(loginBtn).click();
    }

}
