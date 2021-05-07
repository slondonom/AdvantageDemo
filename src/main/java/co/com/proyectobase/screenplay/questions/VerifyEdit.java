package co.com.proyectobase.screenplay.questions;

import static co.com.proyectobase.screenplay.userinterface.PageFinalVerifyEditAccountDetails.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerifyEdit implements Question<Boolean> {

    private List <String> mensaje;

    public VerifyEdit(List <String> mensaje) {
        this.mensaje = mensaje;
    }

    public static VerifyEdit userLoggedIn(List<String> mensaje) {
        return new VerifyEdit(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajeEsperado = Text.of(SAVE).viewedBy(actor).asString();
        return mensaje.get(0).equals(mensajeEsperado);
    }
}
