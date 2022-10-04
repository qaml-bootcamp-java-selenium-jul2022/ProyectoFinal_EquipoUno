package Steps;

import Pages.AutomationPracticePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AutomationPracticeStep extends BaseSteps {

    public AutomationPracticeStep(WebDriver webDriver) {
        super(webDriver);
    }

    AutomationPracticePage automationPracticePage = PageFactory.initElements(myWebDriver, AutomationPracticePage.class);

    public void clickPopularBtn() {
        automationPracticePage.getPopularBtn().click();
    }

    public int elementsPopularlistIsDisplayed() {
        int cantidadProductos = automationPracticePage.getPopularList().size();
        return cantidadProductos;
    }

    public void clickBestSellerBtn(){
        automationPracticePage.getBestSellersBtn().click();
    }

    public int elementsBestSellersIsDisplayed(){
        int cantidadBestSellers=automationPracticePage.getBestSellersList().size();
        return cantidadBestSellers;
    }
}

