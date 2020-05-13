package Testrunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {".//features/addnewcustomer.feature"},
glue= "stepdefinetion",
dryRun = false,
monochrome = true,
plugin= {"pretty" ,"html:reports"}
)

public class runner {

}
