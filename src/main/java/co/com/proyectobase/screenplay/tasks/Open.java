package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.PaginaInicialWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Open implements Task {

    private PaginaInicialWeb paginaInicialWeb;

    public static Open thePageAdvantage() {
        return Tasks.instrumented(Open.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Open.browserOn(paginaInicialWeb));
    }
}
