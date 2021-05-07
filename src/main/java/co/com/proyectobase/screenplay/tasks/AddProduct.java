package co.com.proyectobase.screenplay.tasks;

import cucumber.api.java.bs.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.proyectobase.screenplay.userinterface.PageProductShoppingCartUser.*;

import java.util.List;

public class AddProduct implements Task {


    public static AddProduct shoppingCart() {
        return Tasks.instrumented(AddProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SPEAKERS),
                Click.on(BOSE),
                Click.on(ADDCART),
                Click.on(SHOPPINGCART));

    }
}
