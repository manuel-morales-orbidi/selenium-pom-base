package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FacebookPage extends BasePage {
@FindBy(id = "email")
private WebElement email;

@FindBy (xpath = "//*[@id='pass']")
private WebElement password;

@FindBy (id= "loginbutton")
private WebElement loginButton;

public FacebookPage (WebDriver driver){
    super(driver);
}

public void setEmail (String stringEmail)
{
email.sendKeys(stringEmail);
}

public void setPassword(String stringPassword)
{
password.sendKeys(stringPassword);
}

public void clickLoginButton ()
{
loginButton.click();
}

public void verifyLoginButton(){
        String loginButtonText = loginButton.getText();
        Assert.assertEquals(loginButtonText, "Iniciar sesión");
    }

public void doLogin(String stringEmail,String stringPassword){
       setEmail(stringEmail);
       setPassword(stringPassword);
       clickLoginButton();
    }


}
