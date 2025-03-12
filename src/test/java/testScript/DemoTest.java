package testScript;

import baseClass.BaseClass;
import pages.FacebookPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DemoTest extends BaseClass {
    @Test
    public void demoTestUno()throws Exception{
    }

    @Test
    public void demoTestDos()throws Exception{
        FacebookPage page = new FacebookPage(driver);

        page.verifyLoginButton();
    }
}
