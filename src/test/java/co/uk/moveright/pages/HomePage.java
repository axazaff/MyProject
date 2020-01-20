package co.uk.moveright.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (id = "search-input-location")
    private WebElement searchField;
    @FindBy (id ="minPrice")
    private WebElement minPrice;
    @FindBy (name = "maxPrice")
    private WebElement MaxPrice;
    @FindBy (id = "displayPropertyType")
    private WebElement propertyType;
    @FindBy (id = "minBedrooms")
    private WebElement MinNoOfBedrooms;
    @FindBy (id = "maxBedrooms")
    private WebElement MaxNoOfBedrooms;
    @FindBy (id = "maxDaysSinceAdded")
    private WebElement AddToSite;
    @FindBy(css = ".button.touchsearch-button.touchsearch-primarybutton")
    private WebElement submitButton;


    public void enterLocation(String location)
    {
        searchField.clear();
        searchField.sendKeys(location);
    }
    public void selectMinimumPrice(String miniPrice)
    {
        SelectByText(minPrice,miniPrice);
    }
    public void selectMaximumPrice(String maxiPrice)
    {
        SelectByText(MaxPrice,maxiPrice);
    }
    public void selectPropertyType(String pType)
    {
        SelectByText(propertyType,pType);

    }
    public void selectMinNoOfBedrooms(String bedRoom)
    {
        SelectByText(MinNoOfBedrooms,bedRoom);
    }
    public void selectMaxNoOfBedrooms(String bedRoom)
    {
        SelectByText(MaxNoOfBedrooms,bedRoom);
    }
    public void selectAddedToSite(String addedtime)
{
    SelectByText(AddToSite,addedtime);
}
public SearchResultPage clickOnSubmitButton()
{
 submitButton.click();
 return new SearchResultPage(driver);
}

}
