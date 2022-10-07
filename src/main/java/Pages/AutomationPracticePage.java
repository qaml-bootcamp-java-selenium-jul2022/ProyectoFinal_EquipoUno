package Pages;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AutomationPracticePage extends BasePage{

    public AutomationPracticePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how =How.XPATH,using = "//a[@class='homefeatured']")
    private WebElement popularBtn;

    @FindBy(how =How.XPATH,using = "//ul[@id='homefeatured']/li")
    private List<WebElement> popularList;

    @FindBy(how=How.XPATH,using = "//a[@class='blockbestsellers']")
    private WebElement bestSellersBtn;

    @FindBy(how =How.XPATH,using = "//ul[@id='blockbestsellers']//li")
    private List<WebElement> bestSellersList;

    @FindBy(how =How.XPATH,using = "//ul[@id='homefeatured']//img[@title='Printed Chiffon Dress']")
    private WebElement popularItem;

    @FindBy(how =How.XPATH,using = "//ul[@id='homefeatured']//a[@data-id-product = '7']/span")
    private WebElement popularBtnAddToCart;

    @FindBy(how =How.XPATH,using = "//ul[@id='homefeatured']/descendant::a[contains(@href,'product=7')]/span[contains(text(),'More')]")
    private WebElement popularBtnMore;

    //SR1014
    @FindBy(how =How.XPATH,using = "//div[@id='layer_cart']/descendant::h2[1]/i")
    private WebElement layerIconOK;

    @FindBy(how =How.XPATH,using = "//div[@id='layer_cart']/descendant::img")
    private WebElement layerCartImg;

    @FindBy(how =How.XPATH,using = "//div[@id='layer_cart']/descendant::h2[1]")
    private WebElement layerTitleHead;

    @FindBy(how =How.XPATH,using = "//span[@id='layer_cart_product_title']")
    private WebElement layerProductTitle;

    @FindBy(how =How.XPATH,using = "//span[@id='layer_cart_product_attributes']")
    private WebElement layerProductAtribute;

    @FindBy(how =How.XPATH,using = "//div[@id='layer_cart']/descendant::div/strong[text()='Quantity']")
    private WebElement layerQuantityTitle;

    @FindBy(how =How.XPATH,using = "//div[@id='layer_cart']/descendant::div/strong[text()='Total']")
    private WebElement layerTotalTitle;

    @FindBy(how =How.XPATH,using = "//span[@id='layer_cart_product_quantity']")
    private WebElement layerProductQuantityValue;

    @FindBy(how =How.XPATH,using = "//span[@id='layer_cart_product_price']")
    private WebElement layerProductPriceValue;

    @FindBy(how =How.XPATH,using = "//span[@class='ajax_cart_product_txt ']")
    private WebElement layerTitleHeadResume;

    @FindBy(how =How.XPATH,using = "//div[@id='layer_cart']/descendant::div/strong[contains(text(),'Total products')]")
    private WebElement layerTotalProductsTitle;

    @FindBy(how =How.XPATH,using = "//div[@id='layer_cart']/descendant::div/span[@class='ajax_block_products_total']")
    private WebElement layerTotalProductsValue;

    @FindBy(how =How.XPATH,using = "//div[@id='layer_cart']/descendant::div/strong[contains(text(),'Total shipping')]")
    private WebElement layerTotalShippingTitle;

    @FindBy(how =How.XPATH,using = "//div[@id='layer_cart']/descendant::div/span[@class='ajax_cart_shipping_cost']")
    private WebElement layerTotalShippingValue;

    @FindBy(how =How.XPATH,using = "//div[@class='button-container']/span[@title='Continue shopping']/span")
    private WebElement layerContinueShoppingButton;

    @FindBy(how =How.XPATH,using = "//div[@class='button-container']/a[@title='Proceed to checkout']/span")
    private WebElement layerProceedToCheckoutButton;

    @FindBy(how =How.XPATH,using = "//div[@id='layer_cart']//div[@class='layer_cart_product col-xs-12 col-md-6']/span[@title='Close window']")
    private WebElement layerCloseWindowButton;

    @FindBy(how =How.CSS,using = "div#layer_cart")
    private WebElement layerModuleContainer;



    public WebElement getPopularBtn(){
        return popularBtn;
    }

    public List<WebElement> getPopularList(){
        return popularList;
    }

    public WebElement getBestSellersBtn(){
        return bestSellersBtn;
    }

    public List<WebElement> getBestSellersList(){
        return bestSellersList;
    }

    //SR1013
    public WebElement getElementItem(){
        return popularItem;
    }

    public WebElement getAddButton(){
        return popularBtnAddToCart;
    }

    public WebElement getMoreButton(){
        return popularBtnMore;
    }

    //SR1014
    public WebElement getlayerModuleContainer(){
        return layerModuleContainer;
    }
    public WebElement getLayerIconOK(){
        return layerIconOK;
    }
    public WebElement getLayerCartImg(){
        return layerCartImg;
    }
    public WebElement getLayerTitleHead(){
        return layerTitleHead;
    }
    public WebElement getLayerProductTitle(){
        return layerProductTitle;
    }
    public WebElement getLayerProductAtribute(){
        return layerProductAtribute;
    }
    public WebElement getLayerQuantityTitle(){
        return layerQuantityTitle;
    }
    public WebElement getLayerTotalTitle(){
        return layerTotalTitle;
    }
    public WebElement getLayerProductQuantityValue(){
        return layerProductQuantityValue;
    }
    public WebElement getLayerProductPriceValue(){
        return layerProductPriceValue;
    }
    public WebElement getLayerTitleHeadResume(){
        return layerTitleHeadResume;
    }
    public WebElement getLayerTotalProductsTitle(){
        return layerTotalProductsTitle;
    }
    public WebElement getLayerTotalProductsValue(){
        return layerTotalProductsValue;
    }
    public WebElement getLayerTotalShippingTitle(){
        return layerTotalShippingTitle;
    }
    public WebElement getLayerTotalShippingValue(){
        return layerTotalShippingValue;
    }
    public WebElement getLayerContinueShoppingButton(){
        return layerContinueShoppingButton;
    }
    public WebElement getLayerProceedToCheckoutButton(){
        return layerProceedToCheckoutButton;
    }
    public WebElement getLayerCloseWindowButton(){
        return layerCloseWindowButton;
    }

}
