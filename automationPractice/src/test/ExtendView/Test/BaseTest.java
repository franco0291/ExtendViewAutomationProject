package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {
        protected WebDriver driver;

        @BeforeTest
        public void setup()
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Carlos Franco\\IdeaProjects\\chromedriver.exe");
            driver = new ChromeDriver();
          //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        @AfterTest
        public void TearDown()
        {
            driver.quit();
        }

    }



