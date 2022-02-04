package Test;

import PageObjects.HomePageObjects;
import PageObjects.LoginPageObjects;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class loginPage {

    public WebDriver driver;


    @Test
    public void LoginTest() throws InterruptedException
    {
        HomePageObjects home = new HomePageObjects(driver);
        home.openPage();
        home.clickLoginButton();
        LoginPageObjects login = new LoginPageObjects(driver);
        Thread.sleep(4000);
        login.FillLoginFields("megaonyx91@gmail.com","Stars89!");
        login.clickLoginButton();
    }
}

