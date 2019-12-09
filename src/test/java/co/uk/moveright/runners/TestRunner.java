package co.uk.moveright.runners;

import cucumber.api.Plugin;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/uk/moveright/features/CustomerCanSearchForPropertyForSale.feature"}
            , plugin={"pretty","json:target/report.json",
        "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
glue = {"co/uk/moveright/StepDefinitions"},

)
public class TestRunner {

}