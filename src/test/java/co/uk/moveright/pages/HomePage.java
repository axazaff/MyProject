package co.uk.moveright.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    @FindBy (id = "search-input-location")
    private WebElement searchField;
    private WebElement minPrice;
    private WebElement maxPrice;
    private WebElement propertyType;
    private WebElement NoOfBedrooms;
    private WebElement AddToSite;


    public void enterLocation(String location)
    {
        searchField.clear();
        searchField.sendKeys(location);
    }
    public void selectMinimumPrice(String miniPrice)
    {
        SelectByText(minPrice,miniPrice);
    }
    public void selectMaximumPrice(String maxPrice)
    {
        SelectByText(maxPrice,maxPrice);
    }
    public void selectPropertyType(String propertyType)
    {
        SelectByValue(propertyType,propertyType);

    }
    public void selectNoOfBedrooms(String NoOfBedrooms)
    {
        SelectByValue(NoOfBedrooms,NoOfBedrooms);
    }
public void selectAddedToSite(String AddedToSite)
{
    SelectByValue(AddedToSite,AddedToSite);
}
}
