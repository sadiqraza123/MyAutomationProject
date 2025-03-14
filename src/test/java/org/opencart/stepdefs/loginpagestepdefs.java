//package org.opencart.stepdefs;
//
//import io.cucumber.java.en.*;
//import org.opencart.pages.LoginPage;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.sql.Driver;
//import java.time.Duration;
//
//
//public class loginpagestepdefs {
//
//    WebDriver driver = new ChromeDriver();
//    LoginPage loginPage = new LoginPage(driver);
//
//    @Given("I am on the open cart login page")
//    public void i_am_on_the_open_cart_login_page() throws InterruptedException {
//
//        System.out.println("I am on the open cart login page");
//        driver.manage().window().maximize();
//        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//
//
//         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//         WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Account']")));
//           element.click();
//
//         WebElement element1= driver.findElement(By.xpath("//ul//li//a[text()='Login']"));
//        element1.click();
//
//    }
//    @Given("I have entered valid {} and {}")
//    public void iHaveEnteredValidAnd(String username, String password) throws InterruptedException {
//
//        System.out.println("I have entered valid username and password");
//
//
//        loginPage.enterUserName(username);
//        loginPage.enterPassword(password);
//
////        WebElement element=  driver.findElement(By.id("input-email"));
////        element.sendKeys(username);
////
////        Thread.sleep(3000);
////
////        WebElement element1=  driver.findElement(By.id("input-password"));
////        element1.click();
////        element1.sendKeys(password);
//
//
//    }
//
//
//    @When("I click on the login button")
//    public void i_click_on_the_login_button() {
//
//        System.out.println("I click on the login button");
//        loginPage.loginButton();
////        WebElement element = driver.findElement(By.xpath("//input[@type='submit']"));
////        element.click();
//    }
//
//    @Then("I should be logged in successfully")
//    public void i_should_be_logged_in_successfully() {
//
//        System.out.println("I should be logged in successfully");
//
//    }
//
//
//}
