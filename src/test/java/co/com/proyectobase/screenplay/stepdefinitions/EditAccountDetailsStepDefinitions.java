package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.questions.Verify;
import co.com.proyectobase.screenplay.questions.VerifyEdit;
import co.com.proyectobase.screenplay.tasks.Edit;
import co.com.proyectobase.screenplay.tasks.LoggedIn;
import co.com.proyectobase.screenplay.tasks.See;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditAccountDetailsStepDefinitions {



    @When("^edit account details$")
    public void editAccountDetails(List <String> data)  {
        theActorInTheSpotlight().attemptsTo(Edit.information(data));
    }

    @Then("^account details verify that$")
    public void accountDetailsVerifyThat(List <String> datos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyEdit.userLoggedIn(datos)));
    }

}
