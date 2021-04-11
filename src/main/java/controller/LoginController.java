package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginController {

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a") WebElement signInButton;
    @FindBy(id ="email") WebElement inputEmail;
    @FindBy(id ="passwd") WebElement inputPass;

    public LoginController(WebDriver driver){
        PageFactory.initElements(driver,this);


    }

     public void signInButtonDisplay(){
         signInButton.isDisplayed();
     }
    public void signInButtonClick(){
        signInButton.click();
    }
    public void signInButtonEnable(){
        signInButton.isEnabled();
    }

    public void validLoginInput(){
        signInButton.click();
        inputEmail.sendKeys("test@gamil.com");
        inputPass.sendKeys("Admin123");

    }


}
