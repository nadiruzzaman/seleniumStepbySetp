package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ScriptBase {
    public static  WebDriver driver;
    //public static WebDriver driver1;

    @Parameters("browser")
    @BeforeTest
    public void init(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println(Thread.currentThread().getId());
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("http://automationpractice.com/index.php");
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        } else if (browser.equalsIgnoreCase("chromeHeadless")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--headless");
            driver=new ChromeDriver(options);

        }else if (browser.equalsIgnoreCase("firefoxHeadless")){
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options=new FirefoxOptions();
            options.addArguments("--headless");
            driver=new FirefoxDriver(options);

        }else if (browser.equalsIgnoreCase("htmlDriver")){
             driver=new HtmlUnitDriver();

        }
        driver.get("http://automationpractice.com/index.php");
    }
    @AfterTest
    public void endTest(){

        //driver.quit();
    }


}




