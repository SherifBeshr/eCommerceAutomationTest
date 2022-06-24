package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement loginPagePOM(){return driver.findElement(By.className("ico-login"));}
    public WebElement usernamePOM(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement passwordPOM(){
        return driver.findElement(By.name("Password"));
    }

    public WebElement loginButtonPOM(){return driver.findElement(By.cssSelector("button[class='button-1 login-button']"));}

    public void loginInfo(String username, String pass){
        usernamePOM().sendKeys(username);
        passwordPOM().sendKeys(pass);
    }
}
