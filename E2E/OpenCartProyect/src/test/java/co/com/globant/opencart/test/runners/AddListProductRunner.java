package co.com.globant.opencart.test.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/add_list_product.feature",
        glue = "co.com.globant.opencart.test.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AddListProductRunner {
}
