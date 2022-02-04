package PageObjects;

import Resources.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;


public class HomePageObjects extends base {
@FindBy(xpath="/html/body/nav/a[3]")
WebElement GetloginPage;

@FindBy(xpath="//button[text()='How It Works']")
WebElement HowitWorksButton;

@FindBy(id="exercise-catalog-nav-link")
WebElement getCatalogButton;

@FindBy(xpath="//a[text()='Workouts']")
WebElement getWorkoutsbutton;

@FindBy(xpath="//h2[text()='Workouts To Choose From']")
WebElement getWorkouttext;

@FindBy(id="language-select")
WebElement getLanguageList;

    WebDriverWait wait = new WebDriverWait(driver,30);

     public HomePageObjects(WebDriver driver)
     {

          super(driver);
          PageFactory.initElements(driver, this);
     }

     public void openPage()
     {
          driver.get("https://extendview-staging.herokuapp.com/");
     }




     public void clickonCatalogButton()
        {
          wait.until(ExpectedConditions.visibilityOf(getCatalogButton));
          getCatalogButton.click();
     }

     public void clickLoginButton()

     {
          wait.until(ExpectedConditions.visibilityOf(GetloginPage));
          GetloginPage.click();
     }

     public void clickHowitworksButton()
        {
             wait.until(ExpectedConditions.visibilityOf(HowitWorksButton));
             HowitWorksButton.click();
        }


}


