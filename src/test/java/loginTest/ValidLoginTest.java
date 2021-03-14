package loginTest;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ValidLoginTest extends ScriptBase {


    @Test
    public void openBrowserWithChrome(){
        init();

    }

    @Test
    public void verifySignInButtonDisplayed() throws InterruptedException {

    driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.id("search_query_top")).sendKeys("Badol Vai");
        driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("Ripon vai");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='search_query_top']")).clear();

        WebElement element=driver.findElement(By.xpath("//*[@id='contact-link']/a"));
        element.isDisplayed();
        System.out.println(element.getText());


    }
}
