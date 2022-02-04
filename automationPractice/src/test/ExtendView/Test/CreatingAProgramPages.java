package Test;

import PageObjects.*;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreatingAProgramPages extends BaseTest {


    @Test //Testing that we can create a program on Catagories, and assert that the program matches the name with the one the user created
    @Parameters({"username","password"})
    public void CreateAProgramTest(String username, String password)
    {
        HomePageObjects l = new HomePageObjects(driver);
        l.openPage();
        l.clickLoginButton();
        LoginPageObjects Login = new LoginPageObjects(driver);
        Login.FillLoginFields(username, password);
        Login.clickLoginButton();
        l.clickonCatalogButton();
        CatalogPageObjects category = new CatalogPageObjects(driver);
        category.ClickOnMyworkoutButton();
        MyWorkoutsPageObjects Work = new MyWorkoutsPageObjects(driver);
        Work.clickOnCreateNewProgram();
        CreatingProgramsStep1to3Objects steps = new CreatingProgramsStep1to3Objects(driver);
        steps.ClickOnProgramNameField();
        steps.settextonProgramNameField("Test Program new 2");
        steps.ClickOnNextButton();
        steps.ClickOnAddExercisesButton();
        steps.ClickFilterButton();
        steps.setTextForFilter("534");
        steps.ClickOnApplyFilter();
        steps.clickShoulderFlexion();
        steps.ClickOnDoneButton();
        steps.ClickOnFinalNext();
        steps.ClickOnApplySettings();
        steps.ClickOnCreateButton();
        MyWorkoutsPageObjects workout = new MyWorkoutsPageObjects(driver);
        category.ClickOnMyworkoutButton();
        Assert.assertEquals(workout.getProgramText(), "Test Program new 2");

    }

    @Test
    @Parameters({"username","password"})
    public void TestNumberofExercises(String username, String password)
    {
        HomePageObjects l = new HomePageObjects(driver);
        l.openPage();
        l.clickLoginButton();
        LoginPageObjects Login = new LoginPageObjects(driver);
        Login.FillLoginFields(username, password);
        Login.clickLoginButton();
        l.clickonCatalogButton();
        CatalogPageObjects category = new CatalogPageObjects(driver);
        category.ClickOnMyworkoutButton();
        MyWorkoutsPageObjects Work = new MyWorkoutsPageObjects(driver);
        Work.clickOnCreateNewProgram();
        CreatingProgramsStep1to3Objects steps = new CreatingProgramsStep1to3Objects(driver);
        steps.ClickOnProgramNameField();
        steps.settextonProgramNameField("Test Program new 2");
        steps.ClickOnNextButton();
        System.out.println("test1");
        steps.ClickOnAddExercisesButton();
        steps.ClickFilterButton();
        steps.setTextForFilter("26");
        steps.ClickOnApplyFilter();
        System.out.println("test");
        steps.clickonAllExercisesIndex();
        int exerciseCount=Integer.valueOf(steps.exerciseCount.getText());
        Assert.assertEquals(exerciseCount,steps.exerciseIndex.size());
    }


}
