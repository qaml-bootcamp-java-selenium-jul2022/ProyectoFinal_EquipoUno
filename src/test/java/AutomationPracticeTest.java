import Steps.AutomationPracticeModalStep;
import Steps.AutomationPracticeProductDetailStep;
import Steps.AutomationPracticeStep;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationPracticeTest extends BaseTest{
    AutomationPracticeStep automationPracticeStep=new AutomationPracticeStep(myWebDriver);
    AutomationPracticeModalStep automationPracticeModalStep = new AutomationPracticeModalStep(myWebDriver);
    AutomationPracticeProductDetailStep automationPracticeProductDetailStep = new AutomationPracticeProductDetailStep(myWebDriver);

    @BeforeTest
    public void abrirUrl(){
        automationPracticeStep.abrirURL("http://automationpractice.com/index.php");
        myWebDriver.manage().window().maximize();
    }

    @Test (description = "Requirement SR1010 Clicking on Popular Design and verify result options", priority = 2, alwaysRun=true)
    public void requerimientoSR1010(){
        automationPracticeStep.clickPopularBtn();
        Assert.assertEquals(automationPracticeStep.elementsPopularlistIsDisplayed(),7);
    }

    @Test (description = "Requirement SR1012 Clicking on BestSellers Design and verify result options", priority = 1, alwaysRun=true)
    public void requerimientoSR1012(){
        automationPracticeStep.clickBestSellerBtn();
        Assert.assertEquals(automationPracticeStep.elementsBestSellersIsDisplayed(),7);
    }

    @Test (description = "Requirement SR1013 Hovering over an item AddtoCart and More button", priority = 3, alwaysRun=true)
    public void requerimientoSR1013(){
        automationPracticeStep.hoverToElement();
        Assert.assertEquals(automationPracticeStep.botonAddCartIsDisplayed(), true);
        Assert.assertEquals(automationPracticeStep.botonMoreIsDisplayed(), true);
    }

    @Test (description = "Requirement SR1014 Clicking AddToCart button a modal with information elements", priority = 4, alwaysRun=true)
    public void requerimientoSR1014(){
        automationPracticeStep.hoverToElement();
        automationPracticeModalStep.clickAddToCartBtn();
        automationPracticeModalStep.handleModalContainer();
        Assert.assertEquals(automationPracticeModalStep.layerIconOKIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerCartImgIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerTitleHeadIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerProductTitleIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerProductAtributeIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerQuantityTitleIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerTotalTitleIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerProductQuantityValueIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerProductPriceValueIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerTitleHeadResumeIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerTotalProductsTitleIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerTotalProductsValueIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerTotalShippingTitleIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerTotalShippingValueIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerContinueShoppingButtonIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerProceedToCheckoutButtonIsDisplayed(), true);
        Assert.assertEquals(automationPracticeModalStep.layerCloseWindowButtonIsDisplayed(), true);
        automationPracticeModalStep.clickLayerCloseWindowBtn();
    }

    @Test (description = "Requirement SR1015 Clicking More button and redirected to product page details", priority = 5, alwaysRun=true)
    public void requerimientoSR1015() {
        automationPracticeStep.hoverToElement();
        automationPracticeStep.clickMoreBtn();
        Assert.assertEquals(automationPracticeProductDetailStep.detailBigImgIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailSliderListIsDisplayed(), 4);
        Assert.assertEquals(automationPracticeProductDetailStep.detailProdNameTitleIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailModelProdLabelIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailModelProdValueIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailConditionProdLabelIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailConditionProdValueIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailDescriptionProdContentIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailTwitterBtnIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailFacebookBtnIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailGooglePlusBtnIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailPinterestBtnIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.getDetailLetterBtnIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailPrinterBtnIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailFinalProdPriceValueIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.getDetailProdDiscPriceValueIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailOldProdPriceValueIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailQuantityLabelIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailQuantityInputIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailMinusBtnIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailPlusBtnIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailSizeLabelIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailSelectorSizeIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailColorLabelIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailColorListIsDisplayed(), 2);
        Assert.assertEquals(automationPracticeProductDetailStep.detailAddToCartBtnIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailWishListBtnIsDisplayed(), true);
        Assert.assertEquals(automationPracticeProductDetailStep.detailImgPaymentMethods(),true);
    }
    @AfterTest
    public void cerrarNavegador(){
        automationPracticeStep.cerrarNavegador();
    }
}
