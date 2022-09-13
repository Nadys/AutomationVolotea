package com.speedup.qa.stepdefinitions;

import com.speedup.qa.tasks.OpenBrowser;
import com.speedup.qa.tasks.Origin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class OriginStepDefinitions {

    @Given("^The user in the search section$")
    public void theUserInTheSearchSection() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }
    @When("^The user selects the country of origin$")
    public void theUserSelectsTheCountryOfOrigin() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Origin.origin());
    }


    @Then("^it will show available country$")
    public void itWillShowAvailableCountry() {

    }

}
