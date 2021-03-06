package co.uk.moveright.StepDefinations;

import co.uk.moveright.pages.BasePage;
import co.uk.moveright.pages.HomePage;
import co.uk.moveright.pages.ProductDetailsPage;
import co.uk.moveright.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class ForSaleSearch extends BasePage {
    HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver,SearchResultPage.class);
    ProductDetailsPage productDetailsPage = PageFactory.initElements(driver,ProductDetailsPage);


    @Given("I navigate to rightmove homepage")
    public void i_navigate_to_rightmove_homepage() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.navigate().to("https://www.rightmove.co.uk/");
    }

    @When("I enter a{string}in search text box")
    public void i_enter_a_in_search_text_box(String search) {
        homePage.enterLocation(search);

    }

    @When("I click on for sale button")
    public void i_click_on_for_sale_button() {


    }

    @When("I select{string} from search radius")
    public void i_select_from_search_radius(String string) {

    }

    @When("I select{string} with{string} from price range")
    public void i_select_with_from_price_range(String string, String string2) {


    }

    @When("I select {string} with{string} from No. of bed")
    public void i_select_with_from_No_of_bed(String bed) {
        homePage.selectMinNoOfBedrooms(bed);

    }


    @When("I select {string} from property type")
    public void i_select_from_property_type(String ptype)
        {
homePage.selectPropertyType(ptype);
    }

    @When("I select{string}from Anytime")
    public void i_select_from_Anytime(String TimeAdded) {
        homePage.selectAddedToSite(TimeAdded);

    }

    @When("I click For sale button")
    public void i_click_For_sale_button() {
    }

    @Then("a list of property on sale in{string} are displayed")
    public void a_list_of_property_on_sale_in_are_displayed(String string) {

    }

    @Then("I save property of my choice")
    public void i_save_property_of_my_choice() {

    }

    @When("I click on For sale button")
    public void i_click_on_For_sale_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("an error message is displayed")
    public void an_error_message_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
