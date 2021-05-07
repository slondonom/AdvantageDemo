package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.questions.Verify;
import co.com.proyectobase.screenplay.tasks.Create;
import co.com.proyectobase.screenplay.tasks.LoggedIn;
import co.com.proyectobase.screenplay.tasks.Open;
import co.com.proyectobase.screenplay.tasks.See;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SignInUserStepDefinitions {


    @When("^sing in$")
    public void singIn(List<String> datos)  {
        theActorInTheSpotlight().attemptsTo(LoggedIn.user(datos));
    }
    @When("^see my account$")
    public void seeMyaccount()  {
        theActorInTheSpotlight().attemptsTo(See.information());
    }

}
