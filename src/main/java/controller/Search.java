package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {


    @FindBy(id = "search_query_top")
    WebElement searchInputBox;
    @FindBy(name = "submit_search")
    WebElement submitSearch;
    @FindBy(xpath = "//h1/span[contains(text(),'Dress')]")
    WebElement searchText;


    public Search(WebDriver driver){
        PageFactory.initElements(driver,this);


    }
    public void searchDisplay(WebDriver driver,String searchValue){
        driver.findElement(By.xpath("//h1/span[contains(text(),'"+searchValue+"')]")).isDisplayed();


    }


    public void searchProduct(WebDriver driver,String searchProductName){
        searchInputBox.clear();
        searchInputBox.sendKeys(searchProductName);
        submitSearch.click();
        searchDisplay(driver,searchProductName);
        System.out.println(searchProductName);

    }



}
