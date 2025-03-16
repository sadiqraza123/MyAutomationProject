package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver = new ChromeDriver();
    base.WebDriverFactory factory = new base.WebDriverFactory();

    @Before
    public void setUp(){

      //  factory.initDriver(WebDriver driver);


    }

    @After
    public void tearDown(){

        driver.quit();

    }

}
