package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoPage extends BasePage{
    public DemoPage(WebDriver driver) {
        super(driver);
    }

    By searchBox = By.id("APjFqb");

    public void searchBox(String string){
        driver.findElement(searchBox).sendKeys(string);
    }

    /*@FindBy(id = "APjFqb")
    private WebElement pasoUno;

    public DemoPage(WebDriver driver) {
        super(driver);
    }

    public void pasoUno(String string){
        pasoUno.sendKeys(string);
    }*/

}
