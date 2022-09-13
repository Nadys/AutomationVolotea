package com.speedup.qa.stepdefinitions;

import com.speedup.qa.tasks.OpenBrowser;
import com.speedup.qa.tasks.Passenger;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class passengerStepDefinitions {
    @Managed
    private WebDriver myBrowser;
    @Before
    public void setUpOnStage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Nadia Bustos");
    }
    @Given("^enter the volotea page$")
    public void enterTheVoloteaPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^the user click the plus button to select more passenger '(\\d+)', '(\\d+)', '(\\d+)'$")
    public void theUserClickThePlusButtonToSelectMorePassenger() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Passenger.passenger());
    }

    @Then("^validate that the number of passenger is selected$")
    public void validateThatTheNumberOfPassengerIsSelected() {

    }

}
