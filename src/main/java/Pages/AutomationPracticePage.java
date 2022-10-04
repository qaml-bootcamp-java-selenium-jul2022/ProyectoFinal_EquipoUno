package Pages;

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
}
