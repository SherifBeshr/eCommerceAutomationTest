package Browser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import stepDefinition.LoginStepDefiniton;
import stepDefinition.RegisterStepDefiniton;

import java.util.HashMap;
import java.util.Map;

public class OpenBrowser {
//    WebDriver driver = null;
//    LoginStepDefiniton loginStepDefiniton;
//    @Given("user opens browser")
//    public void  user_open_browser() throws InterruptedException{
//        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe" ;
//        System.setProperty("webdriver.chrome.driver", chromePath );
//
//        Map<String, Object> prefs = new HashMap<String, Object>();
//        prefs.put("profile.default_content_setting_values.notifications", 2);
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("prefs", prefs);
//
//        driver = new ChromeDriver(options);
//        loginStepDefiniton = new LoginStepDefiniton(driver);
//    }
//
//    @And("user navigates to ecommerce website")
//    public void user_navigates() throws InterruptedException{
//        driver.navigate().to("https://demo.nopcommerce.com/");
//        Thread.sleep(400);
//    }
}
