package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.proyectobase.screenplay.userinterface.PageCreatedUser.*;
import static co.com.proyectobase.screenplay.userinterface.PageSingInUser.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoggedIn implements Task {

    private List<String> datos;


    public LoggedIn(List<String> datos) {
        this.datos = datos;
    }

    public static LoggedIn user(List<String> datos) {
        return Tasks.instrumented(LoggedIn.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(USER_ICON, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(USER_ICON ),
                WaitUntil.the(NAME, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(datos.get(0)).into(NAME),
                Enter.theValue(datos.get(1)).into(PASSWORD),
                Click.on(SIGNIN));

    }
}
