package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.questions.VerifyEdit;
import co.com.proyectobase.screenplay.questions.VerifyShoppingCart;
import co.com.proyectobase.screenplay.tasks.AddProduct;
import co.com.proyectobase.screenplay.tasks.Edit;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductShoppingCartStepDefinitions {



    @When("^add product of speaker of shopping cart$")
    public void addProductOfSpeakerOfShoppingCart()  {
        theActorInTheSpotlight().attemptsTo(AddProduct.shoppingCart());
    }

    @Then("^check out product$")
    public void checkOutProduct(List <String> datos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyShoppingCart.productSpeaker(datos)));
    }

}
