package Steps;

import Pages.AutomationPracticePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPracticeModalStep extends BaseSteps{
    public AutomationPracticeModalStep(WebDriver webDriver) {
        super(webDriver);
    }
    AutomationPracticePage automationPracticePage = PageFactory.initElements(myWebDriver, AutomationPracticePage.class);

    public void clickAddToCartBtn(){
        automationPracticePage.getAddButton().click();
    }
    public void clickMoretBtn(){
        automationPracticePage.getMoreButton().click();
    }
    public Boolean layerIconOKIsDisplayed(){
        boolean layerIconOK = automationPracticePage.getLayerIconOK().isDisplayed();
        return layerIconOK;
    }
    public Boolean layerCartImgIsDisplayed(){
        boolean layerCartImg = automationPracticePage.getLayerCartImg().isDisplayed();
        return layerCartImg;
    }
    public Boolean layerTitleHeadIsDisplayed(){
        boolean layerTitleHead = automationPracticePage.getLayerTitleHead().isDisplayed();
        return layerTitleHead;
    }
    public Boolean layerProductTitleIsDisplayed(){
        boolean layerProductTitle = automationPracticePage.getLayerProductTitle().isDisplayed();
        return layerProductTitle;
    }
    public Boolean layerProductAtributeIsDisplayed(){
        boolean layerProductAtribute = automationPracticePage.getLayerProductAtribute().isDisplayed();
        return layerProductAtribute;
    }
    public Boolean layerQuantityTitleIsDisplayed(){
        boolean layerQuantityTitle = automationPracticePage.getLayerQuantityTitle().isDisplayed();
        return layerQuantityTitle;
    }
    public Boolean layerTotalTitleIsDisplayed(){
        boolean layerTotalTitle = automationPracticePage.getLayerTotalTitle().isDisplayed();
        return layerTotalTitle;
    }
    public Boolean layerProductQuantityValueIsDisplayed(){
        boolean layerProductQuantityValue = automationPracticePage.getLayerProductQuantityValue().isDisplayed();
        return layerProductQuantityValue;
    }
    public Boolean layerProductPriceValueIsDisplayed(){
        boolean layerProductPriceValue = automationPracticePage.getLayerProductPriceValue().isDisplayed();
        return layerProductPriceValue;
    }
    public Boolean layerTitleHeadResumeIsDisplayed(){
        boolean layerTitleHeadResume = automationPracticePage.getLayerTitleHeadResume().isDisplayed();
        return layerTitleHeadResume;
    }
    public Boolean layerTotalProductsTitleIsDisplayed(){
        boolean layerTotalProductsTitle = automationPracticePage.getLayerTotalProductsTitle().isDisplayed();
        return layerTotalProductsTitle;
    }
    public Boolean layerTotalProductsValueIsDisplayed(){
        boolean layerTotalProductsValue = automationPracticePage.getLayerTotalProductsValue().isDisplayed();
        return layerTotalProductsValue;
    }
    public Boolean layerTotalShippingTitleIsDisplayed(){
        boolean layerTotalShippingTitle = automationPracticePage.getLayerTotalShippingTitle().isDisplayed();
        return layerTotalShippingTitle;
    }
    public Boolean layerTotalShippingValueIsDisplayed(){
        boolean layerTotalShippingValue = automationPracticePage.getLayerTotalShippingValue().isDisplayed();
        return layerTotalShippingValue;
    }
    public Boolean layerContinueShoppingButtonIsDisplayed(){
        boolean layerContinueShoppingButton = automationPracticePage.getLayerContinueShoppingButton().isDisplayed();
        return layerContinueShoppingButton;
    }
    public Boolean layerProceedToCheckoutButtonIsDisplayed(){
        boolean layerProceedToCheckoutButton = automationPracticePage.getLayerProceedToCheckoutButton().isDisplayed();
        return layerProceedToCheckoutButton;
    }
    public Boolean layerCloseWindowButtonIsDisplayed(){
        boolean layerCloseWindowButton = automationPracticePage.getLayerCloseWindowButton().isDisplayed();
        return layerCloseWindowButton;
    }
    public void clickLayerCloseWindowBtn(){
        automationPracticePage.getLayerCloseWindowButton().click();
    }

    public void handleModalContainer(){
        WebDriverWait wait = new WebDriverWait(myWebDriver, 5);
        wait.until(ExpectedConditions.visibilityOf(automationPracticePage.getlayerModuleContainer()));
    }

}
