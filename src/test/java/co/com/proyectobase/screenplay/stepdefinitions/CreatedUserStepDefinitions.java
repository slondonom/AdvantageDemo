package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.questions.Verify;
import co.com.proyectobase.screenplay.tasks.Create;
import co.com.proyectobase.screenplay.tasks.Open;
import co.com.proyectobase.screenplay.tasks.See;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreatedUserStepDefinitions {


    @Given("^The (.*) get in the webpage$")
    public void theUserGetInTheWebpage(String sebas) {
        theActorCalled(sebas).wasAbleTo(Open.thePageAdvantage());
    }

    @When("^create new account$")
    public void createNewAccount(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(Create.accountFillForm(datos));

    }

    @Then("^verify (.*)$")
    public void verifyAccount(String datos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verify.userLoggedIn(datos)));
    }


}
