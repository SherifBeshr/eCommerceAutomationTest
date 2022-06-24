package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="username")
    WebElement usernamePF;

    public WebElement genderMalePOM(){return driver.findElement(By.id("gender-male"));}
    public WebElement genderFemalePOM(){return driver.findElement(By.id("gender-female"));}

    private WebElement firsNamePOM(){
        return driver.findElement(By.id("FirstName"));
    }
    private WebElement lastNamePOM(){
        return driver.findElement(By.id("LastName"));
    }
    private WebElement emailPOM(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement registerButtonPOM(){
        return driver.findElement(By.id("register-button"));
    }

    private WebElement passwordPOM(){
        return driver.findElement(By.id("Password"));
    }
    private WebElement confirmPasswordPOM(){
        return driver.findElement(By.id("ConfirmPassword"));
    }

    private WebElement disableNews(){
        return driver.findElement(By.id("Newsletter"));
    }

    public void RegisterInfo(String FirstName, String LastName, String email, String password){
        firsNamePOM().sendKeys(FirstName);
        lastNamePOM().sendKeys(LastName);
        emailPOM().sendKeys(email);
        passwordPOM().sendKeys(password);
        confirmPasswordPOM().sendKeys(password);
        disableNews().click();
    }
}
