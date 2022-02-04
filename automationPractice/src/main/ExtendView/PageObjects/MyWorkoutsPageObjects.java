package PageObjects;

import Resources.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyWorkoutsPageObjects extends base {
    @FindBy(xpath = "//b[text()='Test Program 4']")
    WebElement programText;

    @FindBy(xpath = "//*[@id='create-new-program-button']")
    WebElement CreateNewProgramButton;

    @FindBy(css=".loading-overlay")
    WebElement loadingOverlay;

    WebDriverWait wait = new WebDriverWait(driver,30);

    public MyWorkoutsPageObjects(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public String getProgramText()
    {
       wait.until(ExpectedConditions.visibilityOf(programText));
       return programText.getText();
    }

    public void clickOnCreateNewProgram()
    {

        try{wait.until(ExpectedConditions.invisibilityOf(loadingOverlay));}
        catch (Exception e)
        {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(CreateNewProgramButton));
        CreateNewProgramButton.click();
    }
}
