package PageObjects;

import Resources.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPageObjects extends base {
    @FindBy(name="username")
    WebElement MemberIDField;

    @FindBy(name="password")
    WebElement PasswordField;

    @FindBy(id="login-button")
    WebElement LoginButton;

    public String Username;
    public String Password;

    WebDriverWait wait = new WebDriverWait(driver,30);

   public LoginPageObjects(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton()
    {
        wait.until(ExpectedConditions.visibilityOf(LoginButton));
        LoginButton.click();
    }


    public void FillLoginFields(String username, String Password)
    {
        this.Username = username;
        MemberIDField.sendKeys(username);
        this.Password = Password;
        PasswordField.sendKeys(Password);
    }


}
