import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class BaseTest {


    public WebDriver myWebDriver=getMyDriver();
    String propertiesFileNameLocalConfig="drivers.properties";

    public WebDriver getMyDriver (){
        String chromeDriver=getProperty(propertiesFileNameLocalConfig,"CHROME_DRIVER_PATH");
        File rutaAChromeDriver = new File(chromeDriver);
        DesiredCapabilities capacidadesDeseadas = new DesiredCapabilities();

        System.setProperty("webdriver.chrome.driver", String.valueOf(rutaAChromeDriver));
        //Aplica para Chrome WebDriver
        ChromeOptions opcionesDeChrome = new ChromeOptions();
        opcionesDeChrome.addArguments("--incognito");
        opcionesDeChrome.merge(capacidadesDeseadas);

        myWebDriver = new ChromeDriver(opcionesDeChrome);

        return  myWebDriver;
    }

    public String getProperty(String propertiesFile, String key) {
        Properties properties = new Properties();
        InputStream inputStream = null;
        String propertyValue = null;

        try{
            inputStream = new FileInputStream("drivers.properties");
            properties.load(inputStream);
            propertyValue = properties.getProperty(key);
            inputStream.close();
        }  catch (Exception e) {
            e.printStackTrace();
            inputStream.close();
        } finally {
            return propertyValue;
        }

    }
}