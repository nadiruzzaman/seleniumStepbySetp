package searchTest;

import base.ScriptBase;
import controller.Search;
import org.testng.annotations.Test;

public class validProductSearch extends ScriptBase {

   Search search;


   @Test
    public void verifySearchByDress(){
       search=new Search(driver);
       search.searchProduct(driver,"Dress");

   }

   @Test
   public void verifySearchByHat(){
      search=new Search(driver);
      search.searchProduct(driver,"Hat");

   }

}
