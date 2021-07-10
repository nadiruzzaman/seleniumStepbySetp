package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Calendar;

public class OverviewPageController {


    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    WebElement signInButton;

    @FindBy(xpath = "//li[1]/a[@title='Tops']")
    WebElement topsButton;

    @FindBy(xpath = "//a[@title='Women']")
    WebElement WomenButton;

    public OverviewPageController(WebDriver driver){
        PageFactory.initElements(driver,this);


    }

    public void overviewPageInfo(WebDriver driver,String info){
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar +"Test");
        WebElement element=driver.findElement(By.xpath("//a[contains(text(),'"+info+"')]"));
        element.isDisplayed();
    }


    public void womenCatalog(WebDriver driver) throws InterruptedException {
        mouseHoover(driver,WomenButton);
        WomenButton.click();

        Thread.sleep(2000);
        topsButton.isDisplayed();

    }


    public void mouseHoover(WebDriver driver,WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

    }

}
