package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class My {
    @Test
    public void firefoxBrowser() throws InterruptedException {
        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        for(int i=0; i<1000; i++){

            //System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.youtube.com/watch?v=A5pwRVsywYk");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            Thread.sleep(5000);
            WebElement element=driver.findElement(By.cssSelector(".ytp-large-play-button"));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
            //driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'No thanks')]")).click();
            //Thread.sleep(8000);
            //driver.findElement(By.xpath("//span[contains(text(),'I agree')]")).click();
            //driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Skip trial')]")).click();
            Thread.sleep(80000);
            driver.manage().deleteAllCookies();
            driver.quit();
            System.out.println(i);
            //List<String> myList=new ArrayList<String>();
        }

    }


}
