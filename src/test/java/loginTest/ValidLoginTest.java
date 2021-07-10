package loginTest;

import base.ScriptBase;
import controller.LoginController;
import org.apache.tools.ant.taskdefs.optional.depend.Depend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ValidLoginTest extends ScriptBase {


    LoginController loginController;



    @Test
    public void verifySignInButtonDisplayed(){
        loginController=new LoginController(driver);
        loginController.signInButtonDisplay();

    }

    @Test
    public void verifyValidLogIn(){
        loginController=new LoginController(driver);
        loginController.signInButtonDisplay();
        loginController.signInButtonEnable();
        loginController.validLoginInput();

    }

    @Test
    public void verifySignInButtonClickable() throws InterruptedException {
        loginController=new LoginController(driver);
        loginController.signInButtonClick();

    }
    @Test ()
    public void verifySignInButtonEnable(){
        loginController=new LoginController(driver);
        loginController.signInButtonEnable();

    }



}


