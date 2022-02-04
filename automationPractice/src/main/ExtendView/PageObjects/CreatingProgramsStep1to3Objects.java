package PageObjects;

import Resources.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class CreatingProgramsStep1to3Objects extends base {
    int i;
    @FindBy(id = "program-name")
    WebElement Step1ProgramNameField;

    @FindBy(id = "program_flow_info_next")
    WebElement Step1NextButton;

    @FindBy(xpath = "//button[text()='Add More Exercises']")
    WebElement Step2AddMoreExercisesButton;

    @FindBy(css = "button[class='btn btn-info']")
    WebElement Step2FilterButton;

    @FindBy(id = "search-term-exercises")
    WebElement Step2FilterSearch;

    @FindBy(css = "#exercises-sidenav > div.col-12.mb-4 > button.btn.btn-lg.btn-primary.btn-block")
    WebElement Step2ApplyFilterButton;

    @FindBy(id = "exercise-534-flag")
    WebElement Step2ShoulderFlexion;

    @FindBy(xpath = "//button[text()='Done']")
    WebElement Step2DoneButton;

    @FindBy(id = "program_flow_cart_next")
    WebElement Step2FinalNextButton;

    @FindBy(id = "program-flow-apply-settings-button")
    WebElement Step3ApplySettingsButton;

    @FindBy(id = "program_flow_settings_next")
    WebElement Step3CreateButton;

    @FindBy(css = ".loading-overlay")
    WebElement loadingOverlay;

    @FindBy(xpath = "//div[@class='search-col p-0 col-lg-4'][1]")
    WebElement ExerciseSearchindex;

    @FindBy(xpath = "//h6/span[@class='program-exercise-counter']")
    public WebElement exerciseCount;

    @FindBy(xpath = "//div[@class='search-col p-0 col-lg-4']/div/div/div/div[2]/div/div[1]")
    public List<WebElement> exerciseIndex;


    WebDriverWait wait = new WebDriverWait(driver, 30);


    public CreatingProgramsStep1to3Objects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void setTextForFilter(String filterText) {
        wait.until(ExpectedConditions.visibilityOf(Step2FilterSearch));
        Step2FilterSearch.click();
        Step2FilterSearch.sendKeys(filterText);
    }


    public void ClickOnProgramNameField() {
        wait.until(ExpectedConditions.visibilityOf(Step1ProgramNameField));
        Step1ProgramNameField.click();
    }

    public void settextonProgramNameField(String programField) {
        wait.until(ExpectedConditions.visibilityOf(Step1ProgramNameField));
        Step1ProgramNameField.sendKeys(programField);
    }


    public void ClickOnNextButton() {
        wait.until(ExpectedConditions.visibilityOf(Step1NextButton));
        Step1NextButton.click();
    }

    public void ClickOnAddExercisesButton() {
        wait.until(ExpectedConditions.visibilityOf(Step2AddMoreExercisesButton));
        Step2AddMoreExercisesButton.click();

    }

    public void ClickFilterButton() {
        wait.until(ExpectedConditions.visibilityOf(Step2FilterButton));
        Step2FilterButton.click();

    }

    public void ClickFilterSearch() {
        wait.until(ExpectedConditions.visibilityOf(Step2FilterSearch));
        Step2FilterSearch.click();
    }

    public void clickShoulderFlexion() {
        wait.until(ExpectedConditions.visibilityOf(Step2ShoulderFlexion));
        Step2ShoulderFlexion.click();

    }

    public void ClickOnDoneButton() {
        wait.until(ExpectedConditions.visibilityOf(Step2DoneButton));
        Step2DoneButton.click();
    }

    public void ClickOnFinalNext() {
        wait.until(ExpectedConditions.visibilityOf(Step2FinalNextButton));
        Step2FinalNextButton.click();
    }

    public void ClickOnApplySettings() {
        wait.until(ExpectedConditions.visibilityOf(Step3ApplySettingsButton));
        Step3ApplySettingsButton.click();
    }

    public void ClickOnApplyFilter() {
        wait.until(ExpectedConditions.visibilityOf(Step2ApplyFilterButton));
        Step2ApplyFilterButton.click();
    }

    public void ClickOnCreateButton() {
        try {
            wait.until(ExpectedConditions.invisibilityOf(loadingOverlay));
        } catch (Exception e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.visibilityOf(Step3CreateButton));
        Step3CreateButton.click();
    }


    public void clickonAllExercisesIndex()
    {
          for (int i = 0; i < exerciseIndex.size(); i++)
            {
               exerciseIndex.get(i).click();
            }
    }

}
