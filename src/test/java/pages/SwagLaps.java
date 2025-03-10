package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SwagLaps extends BasePage{

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(xpath = "//input[@data-test='password']")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public SwagLaps(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String string) {
        userName.sendKeys(string);
    }

    public void setPassword(String string) {
        password.sendKeys(string);
    }
    public void clickLoginButton(){
        loginButton.click();
    }

    public void verifyLoginButton(){
        String loginButtonText = loginButton.getText();
        Assert.assertEquals(loginButtonText, "Epic sadface: Username and password do not match any user in this service");
    }

}
