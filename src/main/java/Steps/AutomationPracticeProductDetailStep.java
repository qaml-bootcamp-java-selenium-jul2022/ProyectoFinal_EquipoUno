package Steps;

import Pages.AutomationPracticeDetailPage;
import Pages.AutomationPracticePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticeProductDetailStep extends BaseSteps{
    public AutomationPracticeProductDetailStep(WebDriver webDriver) {
        super(webDriver);
    }
    AutomationPracticeDetailPage automationPracticeDetailPage = PageFactory.initElements(myWebDriver, AutomationPracticeDetailPage.class);
    Actions action = new Actions(myWebDriver);

    public Boolean detailBigImgIsDisplayed(){
        boolean detailBigImg = automationPracticeDetailPage.getDetailBigImg().isDisplayed();
        return detailBigImg;
    }
    public int detailSliderListIsDisplayed(){
        int detailSliderList = automationPracticeDetailPage.getDetailSliderList().size();
        return detailSliderList;
    }
    public Boolean detailProdNameTitleIsDisplayed(){
        boolean detailProdNameTitle = automationPracticeDetailPage.getDetailProdNameTitle().isDisplayed();
        return detailProdNameTitle;
    }
    public Boolean detailModelProdLabelIsDisplayed(){
        boolean detailModelProdLabel = automationPracticeDetailPage.getDetailModelProdLabel().isDisplayed();
        return detailModelProdLabel;
    }
    public Boolean detailModelProdValueIsDisplayed(){
        boolean detailModelProdValue = automationPracticeDetailPage.getLDetailModelProdValue().isDisplayed();
        return detailModelProdValue;
    }
    public Boolean detailConditionProdLabelIsDisplayed(){
        boolean detailConditionProdLabel = automationPracticeDetailPage.getDetailConditionProdLabel().isDisplayed();
        return detailConditionProdLabel;
    }
    public Boolean detailConditionProdValueIsDisplayed(){
        boolean detailConditionProdValue = automationPracticeDetailPage.getDetailConditionProdValue().isDisplayed();
        return detailConditionProdValue;
    }
    public Boolean detailDescriptionProdContentIsDisplayed(){
        boolean detailDescriptionProdContent = automationPracticeDetailPage.getDetailDescriptionProdContent().isDisplayed();
        return detailDescriptionProdContent;
    }
    public Boolean detailTwitterBtnIsDisplayed(){
        boolean detailTwitterBtn = automationPracticeDetailPage.getDetailTwitterBtn().isDisplayed();
        return detailTwitterBtn;
    }
    public Boolean detailFacebookBtnIsDisplayed(){
        boolean detailFacebookBtn = automationPracticeDetailPage.getDetailFacebookBtn().isDisplayed();
        return detailFacebookBtn;
    }
    public Boolean detailGooglePlusBtnIsDisplayed(){
        boolean detailGooglePlusBtn = automationPracticeDetailPage.getDetailGooglePlusBtn().isDisplayed();
        return detailGooglePlusBtn;
    }
    public Boolean detailPinterestBtnIsDisplayed(){
        boolean detailPinterestBtn = automationPracticeDetailPage.getDetailPinterestBtn().isDisplayed();
        return detailPinterestBtn;
    }
    public Boolean getDetailLetterBtnIsDisplayed(){
        boolean getDetailLetterBtn = automationPracticeDetailPage.getDetailLetterBtn().isDisplayed();
        return getDetailLetterBtn;
    }
    public Boolean detailPrinterBtnIsDisplayed(){
        boolean detailPrinterBtn = automationPracticeDetailPage.getDetailPrinterBtn().isDisplayed();
        return detailPrinterBtn;
    }
    public Boolean detailFinalProdPriceValueIsDisplayed(){
        boolean detailFinalProdPriceValue = automationPracticeDetailPage.getDetailFinalProdPriceValue().isDisplayed();
        return detailFinalProdPriceValue;
    }
    public Boolean getDetailProdDiscPriceValueIsDisplayed(){
        boolean detailProdDiscPriceValue = automationPracticeDetailPage.getDetailProdDiscPriceValue().isDisplayed();
        return detailProdDiscPriceValue;
    }
    public Boolean detailOldProdPriceValueIsDisplayed(){
        boolean detailOldProdPriceValue = automationPracticeDetailPage.getDetailOldProdPriceValue().isDisplayed();
        return detailOldProdPriceValue;
    }
    public Boolean detailQuantityLabelIsDisplayed(){
        boolean detailQuantityLabel = automationPracticeDetailPage.getDetailQuantityLabel().isDisplayed();
        return detailQuantityLabel;
    }
    public Boolean detailQuantityInputIsDisplayed(){
        boolean detailQuantityInput = automationPracticeDetailPage.getDetailQuantityInput().isDisplayed();
        return detailQuantityInput;
    }
    public Boolean detailMinusBtnIsDisplayed(){
        boolean detailMinusBtn = automationPracticeDetailPage.getDetailMinusBtn().isDisplayed();
        return detailMinusBtn;
    }
    public Boolean detailPlusBtnIsDisplayed(){
        boolean detailPlusBtn = automationPracticeDetailPage.getDetailPlusBtn().isDisplayed();
        return detailPlusBtn;
    }
    public Boolean detailSizeLabelIsDisplayed(){
        boolean detailSizeLabel = automationPracticeDetailPage.getDetailSizeLabel().isDisplayed();
        return detailSizeLabel;
    }
    public Boolean detailSelectorSizeIsDisplayed(){
        boolean detailSelectorSize = automationPracticeDetailPage.getDetailSelectorSize().isDisplayed();
        return detailSelectorSize;
    }
    public Boolean detailColorLabelIsDisplayed(){
        boolean detailColorLabel = automationPracticeDetailPage.getDetailColorLabel().isDisplayed();
        return detailColorLabel;
    }
    public int detailColorListIsDisplayed(){
        int detailSizeLabel = automationPracticeDetailPage.getDetailColorList().size();
        return detailSizeLabel;
    }
    public Boolean detailAddToCartBtnIsDisplayed(){
        boolean detailAddToCartBtn = automationPracticeDetailPage.getDetailAddToCartBtn().isDisplayed();
        return detailAddToCartBtn;
    }
    public Boolean detailWishListBtnIsDisplayed(){
        boolean detailWishListBtn = automationPracticeDetailPage.getDetailWishListBtn().isDisplayed();
        return detailWishListBtn;
    }
    public Boolean detailImgPaymentMethods(){
        boolean detailImgPaymentMethods = automationPracticeDetailPage.getDetailImgPaymentMethods().isDisplayed();
        return detailImgPaymentMethods;
    }
}
