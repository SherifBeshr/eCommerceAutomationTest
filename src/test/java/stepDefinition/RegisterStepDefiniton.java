package stepDefinition;

import Pages.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class RegisterStepDefiniton {
    WebDriver driver = null;

    RegisterPage registerPage;

    @Given("user opens browser")
    public void  user_open_browser() throws InterruptedException{
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe" ;
        System.setProperty("webdriver.chrome.driver", chromePath );

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        registerPage = new RegisterPage(driver);
    }

    @And("user navigates to ecommerce website")
    public void user_navigates() throws InterruptedException{
        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(200);
    }

    @When ("user opens register page")
    public void openResiterPage() throws InterruptedException {
        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(200);
    }

    @And ("user select gender {string}")
    public void genderSelect(String gender) throws InterruptedException {
        if(gender.equals("male")) {
            registerPage.genderMalePOM().click();
        } else if (gender.equals("female")) {
            registerPage.genderFemalePOM().click();
        }
        Thread.sleep(200);
    }

    @And("user enter firstname {string} and lastname {string} and email {string} and password {string}" )
    public void valid_data(String firstname, String lastname, String email, String passowrd) throws InterruptedException {
        registerPage.RegisterInfo(firstname,lastname,email,passowrd);
        Thread.sleep(200);
    }

    @Then ("press register button")
    public void pressRegister(){
        registerPage.registerButtonPOM().click();
    }


    @After
    public void close_browser() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }
}
