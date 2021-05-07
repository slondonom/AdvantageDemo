package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.model.DataUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.proyectobase.screenplay.userinterface.PageCreatedUser.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Create implements Task {

    private List<String>  data;

    public Create(List<String>  data) {
        this.data=data;
    }

    public static Create accountFillForm(List<String>  data) {
        return Tasks.instrumented(Create.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(USER_ICON, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(USER_ICON ),
                WaitUntil.the(NAME, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(NEW_ACCOUNT),
                WaitUntil.the(USER_NAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(data.get(0)).into(USER_NAME),
                Enter.theValue(data.get(1)).into(EMAIL),
                Enter.theValue(data.get(2)).into(PASSWORD_REGISTER),
                Enter.theValue(data.get(2)).into(CONFIRM_PASSWORD),
                Enter.theValue(data.get(3)).into(FIRST_NAME),
                Enter.theValue(data.get(4)).into(LAST_NAME),
                Enter.theValue(data.get(5)).into(PHONE_NUMBER),
                SelectFromOptions.byVisibleText((data.get(6))).from(COUNTRY),
                Enter.theValue(data.get(7)).into(CITY),
                Enter.theValue(data.get(8)).into(ADDRESS),
                Enter.theValue(data.get(9)).into(STATE),
                Enter.theValue(data.get(10)).into(POSTAL),
                Click.on(AGREE),
                Click.on(REGISTER),
                Click.on(MENU_USER),
                Click.on(MYACCOUNT)

                );
    }
}
