package net.onlinenotepad.runners;

import cucumber.api.CucumberOptions;

import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/my-devco-feature.feature",
        glue = "net.onlinenotepad.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@Escenario2"
)
public class notepad_runner {
}
