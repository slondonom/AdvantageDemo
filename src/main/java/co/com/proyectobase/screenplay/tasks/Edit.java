package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import static co.com.proyectobase.screenplay.userinterface.PageEditAccountDetailsUser.*;

import java.util.List;

public class Edit implements Task {

    private List<String>  data;

    public Edit(List<String>  data) {
        this.data=data;
    }

    public static Edit information(List<String> data) {
        return Tasks.instrumented(Edit.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(EDIT),
                Enter.theValue(data.get(0)).into(FIRST_NAME),
                Enter.theValue(data.get(1)).into(LAST_NAME),
                Enter.theValue(data.get(2)).into(PHONE_NUMBER),
                SelectFromOptions.byVisibleText((data.get(3))).from(COUNTRY),
                Enter.theValue(data.get(4)).into(CITY),
                Enter.theValue(data.get(5)).into(ADDRESS),
                Enter.theValue(data.get(6)).into(STATE),
                Enter.theValue(data.get(7)).into(POSTAL),
                Click.on(SAVE)
                );

    }
}
