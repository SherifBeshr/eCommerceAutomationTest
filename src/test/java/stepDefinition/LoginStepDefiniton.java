package stepDefinition;

import Pages.LoginPage;
import Pages.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class LoginStepDefiniton {
    WebDriver driver = null;

    LoginPage loginPage;


    @Given("user opens browser")
    public void  user_open_browser() throws InterruptedException{
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe" ;
        System.setProperty("webdriver.chrome.driver", chromePath );

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        loginPage = new LoginPage(driver);
    }

    @And("user navigates to ecommerce website")
    public void user_navigates() throws InterruptedException{
        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(400);
    }

    @When ("user opens login page")
    public void openLoginPage() throws InterruptedException {
        loginPage.loginPagePOM().click();
        Thread.sleep(200);
    }

    @And("user enter email {string} and password {string}" )
    public void login_data(String email, String password) throws InterruptedException {
        loginPage.loginInfo(email,password);
        Thread.sleep(200);
    }

    @Then ("press login button")
    public void pressRegister(){
        loginPage.loginButtonPOM().click();
    }

    @After
    public void close_browser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
