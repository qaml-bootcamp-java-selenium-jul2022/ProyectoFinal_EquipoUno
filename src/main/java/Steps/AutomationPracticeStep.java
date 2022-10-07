package Steps;

import Pages.AutomationPracticePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AutomationPracticeStep extends BaseSteps {

    public AutomationPracticeStep(WebDriver webDriver) {
        super(webDriver);
    }

    AutomationPracticePage automationPracticePage = PageFactory.initElements(myWebDriver, AutomationPracticePage.class);
    Actions action = new Actions(myWebDriver);

    public void clickPopularBtn() {
        automationPracticePage.getPopularBtn().click();
    }
    public void clickMoreBtn() {
        automationPracticePage.getMoreButton().click();
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
    public void hoverToElement(){
        action.moveToElement(automationPracticePage.getElementItem()).perform();
    }

    public Boolean botonAddCartIsDisplayed(){
        boolean botonAddCart = automationPracticePage.getAddButton().isDisplayed();
        return botonAddCart;
    }

    public Boolean botonMoreIsDisplayed(){
        boolean moreBoton = automationPracticePage.getMoreButton().isDisplayed();
        return moreBoton;
    }
}

