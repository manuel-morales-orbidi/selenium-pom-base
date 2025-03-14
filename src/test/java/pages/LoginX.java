package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginX extends BasePage{
    public LoginX(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(id="username")
    private WebElement userName;

    @FindBy(xpath = "//button[contains(text(),'Iniciar sesión con Google')]")
    private WebElement sessionGoogleButton;

    @FindBy(xpath = "//button[contains(text(),'Iniciar sesión con Apple')]")
    private WebElement sessionAppleButton;

    @FindBy(xpath = "//button[contains(text(),'Siguiente')]")
    private WebElement nextButton;

    @FindBy(xpath = "//button[contains(text(),'¿Olvidaste tu contraseña?')]")
    private WebElement olvideContraseñaButton;

    @FindBy(xpath = "//span[contains(text(),'Regístrate')]")
    private WebElement registrateButton;


    public WebElement getUserName() {
        return userName;
    }

    public WebElement getSessionGoogleButton() {
        return sessionGoogleButton;
    }

    public WebElement getSessionAppleButton() {
        return sessionAppleButton;
    }

    public WebElement getNextButton() {
        return nextButton;
    }

    public WebElement getOlvideContraseñaButton() {
        return olvideContraseñaButton;
    }

    public WebElement getRegistrateButton() {
        return registrateButton;
    }

    public void setUserName(WebElement userName) {
        this.userName = userName;
    }

    public void setSessionGoogleButton(WebElement sessionGoogleButton) {
        this.sessionGoogleButton = sessionGoogleButton;
    }

    public void setSessionAppleButton(WebElement sessionAppleButton) {
        this.sessionAppleButton = sessionAppleButton;
    }

    public void setNextButton(WebElement nextButton) {
        this.nextButton = nextButton;
    }

    public void setOlvideContraseñaButton(WebElement olvideContraseñaButton) {
        this.olvideContraseñaButton = olvideContraseñaButton;
    }

    public void setRegistrateButton(WebElement registrateButton) {
        this.registrateButton = registrateButton;
    }








}