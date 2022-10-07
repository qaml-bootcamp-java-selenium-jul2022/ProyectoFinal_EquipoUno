package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AutomationPracticeDetailPage extends BasePage{
    public AutomationPracticeDetailPage(WebDriver webDriver) {
        super(webDriver);
    }

    //SR1015
    @FindBy(how = How.CSS,using = "img#bigpic")
    private WebElement detailBigImg;

    @FindBy(how =How.CSS,using = "ul#thumbs_list_frame>li")
    private List<WebElement> detailSliderList;

    @FindBy(how =How.CSS,using = "span#view_full_size>span.span_link.no-print")
    private WebElement detailViewBtn;

    @FindBy(how =How.CSS,using = "div.pb-center-column.col-xs-12.col-sm-4>h1")
    private WebElement detailProdNameTitle;

    @FindBy(how =How.CSS,using = "div.pb-center-column.col-xs-12.col-sm-4>p#product_reference>label")
    private WebElement detailModelProdLabel;

    @FindBy(how =How.CSS,using = "div.pb-center-column.col-xs-12.col-sm-4>p#product_reference>span")
    private WebElement detailModelProdValue;

    @FindBy(how =How.CSS,using = "div.pb-center-column.col-xs-12.col-sm-4>p#product_condition>label")
    private WebElement detailConditionProdLabel;

    @FindBy(how =How.CSS,using = "div.pb-center-column.col-xs-12.col-sm-4>p#product_condition>span")
    private WebElement detailConditionProdValue;

    @FindBy(how =How.CSS,using = "div#short_description_content>p")
    private WebElement detailDescriptionProdContent;

    @FindBy(how =How.XPATH,using = "//div[@class='pb-center-column col-xs-12 col-sm-4']//button[contains(@class,'btn-twitter')]")
    private WebElement detailTwitterBtn;

    @FindBy(how =How.XPATH,using = "//div[@class='pb-center-column col-xs-12 col-sm-4']//button[contains(@class,'btn-facebook')]")
    private WebElement detailFacebookBtn;

    @FindBy(how =How.XPATH,using = "//div[@class='pb-center-column col-xs-12 col-sm-4']//button[contains(@class,'btn-google-plus')]")
    private WebElement detailGooglePlusBtn;

    @FindBy(how =How.XPATH,using = "//div[@class='pb-center-column col-xs-12 col-sm-4']//button[contains(@class,'btn-pinterest')]")
    private WebElement detailPinterestBtn;

    @FindBy(how =How.XPATH,using = "//ul[@id='usefull_link_block']/li/a[@href='#send_friend_form']")
    private WebElement detailLetterBtn;

    @FindBy(how =How.XPATH,using = "//ul[@id='usefull_link_block']/li/a[@href='javascript:print();']")
    private WebElement detailPrinterBtn;

    @FindBy(how =How.XPATH,using = "//form[@id='buy_block']//span[@id='our_price_display']")
    private WebElement detailFinalProdPriceValue;

    @FindBy(how =How.XPATH,using = "//form[@id='buy_block']//span[@id='reduction_percent_display']")
    private WebElement detailProdDiscPriceValue;

    @FindBy(how =How.XPATH,using = "//form[@id='buy_block']//span[@id='old_price_display']")
    private WebElement detailOldProdPriceValue;

    @FindBy(how =How.XPATH,using = "//form[@id='buy_block']//p[@id='quantity_wanted_p']/label")
    private WebElement detailQuantityLabel;

    @FindBy(how =How.XPATH,using = "//form[@id='buy_block']//input[@id='quantity_wanted']")
    private WebElement detailQuantityInput;

    @FindBy(how =How.XPATH,using = "//form[@id='buy_block']//p[@id='quantity_wanted_p']/a[contains(@class,'button-minus')]")
    private WebElement detailMinusBtn;

    @FindBy(how =How.XPATH,using = "//form[@id='buy_block']//p[@id='quantity_wanted_p']/a[contains(@class,'button-plus')]")
    private WebElement detailPlusBtn;

    @FindBy(how =How.XPATH,using = "//form[@id='buy_block']//div[@id='attributes']/fieldset/label[contains(text(),'Size')]")
    private WebElement detailSizeLabel;

    @FindBy(how =How.XPATH,using = "//form[@id='buy_block']//div[@class='selector']/span")
    private WebElement detailSelectorSize;

    @FindBy(how =How.XPATH,using = "//form[@id='buy_block']//div[@id='attributes']/fieldset/label[contains(text(),'Color')]")
    private WebElement detailColorLabel;

    @FindBy(how =How.XPATH,using = "//form[@id='buy_block']//ul[@id='color_to_pick_list']/li")
    private List<WebElement> detailColorList;

    @FindBy(how =How.XPATH,using = "//form[@id='buy_block']//p[@id='add_to_cart']/button/span")
    private WebElement detailAddToCartBtn;

    @FindBy(how =How.XPATH,using = "//form[@id='buy_block']//a[@id='wishlist_button']")
    private WebElement detailWishListBtn;

    @FindBy(how =How.CSS,using = "div#product_payment_logos>div>img")
    private WebElement detailImgPaymentMethods;

    public WebElement getDetailBigImg(){
        return detailBigImg;
    }
    public List<WebElement> getDetailSliderList(){
        return detailSliderList;
    }
    public WebElement getDetailProdNameTitle(){
        return detailProdNameTitle;
    }
    public WebElement getDetailModelProdLabel(){
        return detailModelProdLabel;
    }
    public WebElement getLDetailModelProdValue(){
        return detailModelProdValue;
    }
    public WebElement getDetailConditionProdLabel(){
        return detailConditionProdLabel;
    }
    public WebElement getDetailConditionProdValue(){
        return detailConditionProdValue;
    }
    public WebElement getDetailDescriptionProdContent(){
        return detailDescriptionProdContent;
    }
    public WebElement getDetailTwitterBtn(){
        return detailTwitterBtn;
    }
    public WebElement getDetailFacebookBtn(){
        return detailFacebookBtn;
    }
    public WebElement getDetailGooglePlusBtn(){
        return detailGooglePlusBtn;
    }
    public WebElement getDetailPinterestBtn(){
        return detailPinterestBtn;
    }
    public WebElement getDetailLetterBtn(){
        return detailLetterBtn;
    }
    public WebElement getDetailPrinterBtn(){
        return detailPrinterBtn;
    }
    public WebElement getDetailFinalProdPriceValue(){
        return detailFinalProdPriceValue;
    }
    public WebElement getDetailProdDiscPriceValue(){
        return detailProdDiscPriceValue;
    }
    public WebElement getDetailOldProdPriceValue(){
        return detailOldProdPriceValue;
    }
    public WebElement getDetailQuantityLabel(){
        return detailQuantityLabel;
    }
    public WebElement getDetailQuantityInput(){
        return detailQuantityInput;
    }
    public WebElement getDetailMinusBtn(){
        return detailMinusBtn;
    }
    public WebElement getDetailPlusBtn(){
        return detailPlusBtn;
    }
    public WebElement getDetailSizeLabel(){
        return detailSizeLabel;
    }
    public WebElement getDetailSelectorSize(){
        return detailSelectorSize;
    }
    public WebElement getDetailColorLabel(){
        return detailColorLabel;
    }
    public List<WebElement> getDetailColorList(){
        return detailColorList;
    }
    public WebElement getDetailAddToCartBtn(){
        return detailAddToCartBtn;
    }
    public WebElement getDetailWishListBtn(){
        return detailWishListBtn;
    }
    public WebElement getDetailImgPaymentMethods(){
        return detailImgPaymentMethods;
    }
}
