package stepdefinition;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpagestepdefs {

    WebDriver driver = new ChromeDriver();
    org.opencart.pages_pf.Loginpage loginpage_pf = new org.opencart.pages_pf.Loginpage(driver);

    @Given("I am on the open cart login page")
    public void i_am_on_the_open_cart_login_page() throws InterruptedException {

        System.out.println("I am on the open cart login page");
        driver.manage().window().maximize();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        loginpage_pf.myAccount();
        loginpage_pf.clickOnLoginBtn();

    }
    @Given("I have entered valid {} and {}")
    public void iHaveEnteredValidAnd(String username, String password) throws InterruptedException {

        System.out.println("I have entered valid username and password using pf");

        loginpage_pf.enterUserName(username);
        loginpage_pf.enterPassword(password);
    }


    @When("I click on the login button")
    public void i_click_on_the_login_button() {

        System.out.println("I click on the login button using pf");
        loginpage_pf.loginButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {

        System.out.println("I should be logged in successfully using pf");

        loginpage_pf.myAccount();

        driver.quit();


    }
}
