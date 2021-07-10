package testng_listener;

import base.ScriptBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Listener extends ScriptBase implements ITestListener {


    public void onTestStart(ITestResult result) {

        System.out.println("Test Start :");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Success");
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat format= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        String methodName=result.getName();
        if(result.getStatus()==ITestResult.SUCCESS){
            File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            try{
                String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/success_screenshots";
                File destFile=new File((String)reportDirectory+"/"+methodName+"_"+format.format(calendar.getTime())+".png");
                FileUtils.copyFile(scrFile,destFile);
                Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <image src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");

            }catch(Exception e){
                e.printStackTrace();

            }
        }

    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test Fail");
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat format= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        String methodName=result.getName();
        if(result.getStatus()==ITestResult.FAILURE){
            File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            try{
              String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/failure_screenshots";
              File destFile=new File((String)reportDirectory+"/"+methodName+"_"+format.format(calendar.getTime())+".png");
              FileUtils.copyFile(scrFile,destFile);
              Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <image src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");

            }catch(Exception e){
                e.printStackTrace();

            }
        }
    }

    public void onStart(ITestContext context) {
        System.out.println(" my browser start");

    }

    public void onFinish(ITestContext context) {
        System.out.println("My tests finish");

    }
    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }
    public void onTestFailedWithTimeout(ITestResult result) {

    }

}
