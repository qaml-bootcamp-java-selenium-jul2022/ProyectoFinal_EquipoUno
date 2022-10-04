import Steps.AutomationPracticeStep;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationPracticeTest extends BaseTest{

    AutomationPracticeStep automationPracticeStep=new AutomationPracticeStep(myWebDriver);

    @BeforeTest
    public void abrirUrl(){
        automationPracticeStep.abrirURL("http://automationpractice.com/index.php");
    }

    @Test (description = "Requirement SR1010", priority = 1, alwaysRun=true)
    public void requerimientoSR1010(){
        automationPracticeStep.clickPopularBtn();
        Assert.assertEquals(automationPracticeStep.elementsPopularlistIsDisplayed(),7);
    }

    @Test (description = "Requirement SR1012", priority = 2, alwaysRun=true)
    public void requerimientoSR1012(){
        automationPracticeStep.clickBestSellerBtn();
        Assert.assertEquals(automationPracticeStep.elementsBestSellersIsDisplayed(),7);
    }

    @AfterTest
    public void cerrarNavegador(){
        automationPracticeStep.cerrarNavegador();
    }
}
