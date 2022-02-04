package PageObjects;

import Resources.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CatalogPageObjects extends base {
    @FindBy(xpath="//b[text()='My Workouts']")
    WebElement MyworkoutButton;



    WebDriverWait wait = new WebDriverWait(driver,20);

    public CatalogPageObjects(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void ClickOnMyworkoutButton()
    {

        wait.until(ExpectedConditions.visibilityOf(MyworkoutButton));
        MyworkoutButton.click();
        }

}
