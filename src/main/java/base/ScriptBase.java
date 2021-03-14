package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScriptBase {
    public WebDriver driver;

    public void init() {
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        //driver.quit();

    }

}




