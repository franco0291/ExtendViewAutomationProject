package Resources;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {

    public WebDriver driver;

    public base(WebDriver driver)
    {
        this.driver = driver;
    }

    public void initializeDriver() throws IOException
    {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Carlos Franco\\IdeaProjects\\automationPractice\\src\\main\\ExtendView\\Resources\\data.properties");

        prop.load(fis);
        String browserName = prop.getProperty("browser");
        System.out.println(browserName);
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

        if (browserName.equals("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if (browserName.equals("firefox"))
        {
            driver = new FirefoxDriver();
        }







    }
}