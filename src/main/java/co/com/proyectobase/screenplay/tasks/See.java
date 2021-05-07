package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.proyectobase.screenplay.userinterface.PageCreatedUser.MENU_USER;
import static co.com.proyectobase.screenplay.userinterface.PageCreatedUser.MYACCOUNT;

public class See implements Task {

    public static See information() {
        return Tasks.instrumented(See.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MENU_USER),
                Click.on(MYACCOUNT));
    }
}
