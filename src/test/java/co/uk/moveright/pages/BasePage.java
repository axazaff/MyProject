package co.uk.moveright.pages;

import co.uk.moveright.commons.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverClass {
    public String BASE_URL = "https://www.rightmove.co.uk/";
    private Select select;

    public void launchURL() {
        driver.navigate().to(BASE_URL);
    }
    public void SelectByText(WebElement element, String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void SelectByValue(WebElement element,String value)
    {
        select = new Select(element);
        select.selectByValue(value);
    }
    public void SelectByIndex(WebElement element,int index)
    {
        select = new Select(element);
        select.selectByIndex(index);
    }


}