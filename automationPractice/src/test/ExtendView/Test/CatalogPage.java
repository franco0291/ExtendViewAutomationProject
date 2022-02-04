package Test;

import PageObjects.CatalogPageObjects;
import PageObjects.HomePageObjects;
import PageObjects.LoginPageObjects;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CatalogPage extends BaseTest
{

    @Test
    @Parameters({"username","password"})
    public void CheckWorkoutsButton(String username, String password)
    {
        HomePageObjects l = new HomePageObjects(driver);
        l.openPage();
        l.clickLoginButton();
        LoginPageObjects Login = new LoginPageObjects(driver);
        Login.FillLoginFields(username,password);
        Login.clickLoginButton();
        l.clickonCatalogButton();
        CatalogPageObjects category = new CatalogPageObjects(driver);
        category.ClickOnMyworkoutButton();
    }


}
