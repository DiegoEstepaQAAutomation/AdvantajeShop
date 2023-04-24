package advantageShopping.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/userCreateAccount.feature",
        glue = {"advantageShopping.stepsdefinitions", "advantageShopping.utils.hooks"},
        tags = "@register",
        snippets = SnippetType.CAMELCASE)

public class UserCreateAccountRunner {
}
