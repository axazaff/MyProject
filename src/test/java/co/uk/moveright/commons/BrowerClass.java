package co.uk.moveright.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowerClass extends DriverClass  {
    private WebDriver initChrome()
    {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
    private WebDriver initHeadless()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--dissable-gpu","--headless");
        return new ChromeDriver(options);
    }
    private WebDriver initFirefox()
    {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
    private WebDriver initInternetExplorer()
    {
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }
    public void launchbrowser(String brower){
        switch (brower){
            case "Chrome":
            driver = initChrome();
            break;
            case "headless":
            driver =initHeadless();
            break;
            case "IE":
            case "InternetExplorer":
            case "ie":
                driver=initInternetExplorer();
                break;
            case "Firefox":
                driver = initFirefox();
                break;
            default:
                driver = initChrome();

        }
        driver.manage().window().maximize();
    }
public void closeBrower()
{
    driver.manage().deleteAllCookies();
    driver.quit();
}

}
