package overviewPage;

import base.ScriptBase;
import controller.LoginController;
import controller.OverviewPageController;
import org.testng.annotations.Test;

public class OverViewPageDisplayTest extends ScriptBase {
    OverviewPageController overviewPageController;

    @Test
    public void verifySpecialsTextDisplayedInOverviewPage(){
        overviewPageController=new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"Specials");

    }
    @Test
    public void verifyNewProductsTextDisplayedInOverviewPage(){
        overviewPageController=new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"New products");

    }
    @Test
    public void verifyBestSellersTextDisplayedInOverviewPage(){
        overviewPageController=new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"Best sellers");

    }
    @Test
    public void verifyMyPersonalInfoTextDisplayedInOverviewPage(){
        overviewPageController=new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"ZamanName");

    }

    @Test
    public void verifyTopsButtonDisplayedUnderWomenCat() throws InterruptedException {
        overviewPageController=new OverviewPageController(driver);
      overviewPageController.womenCatalog(driver);

    }


}
