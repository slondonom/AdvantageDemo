package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.userinterface.PageFinalVerifyCreatedUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verify implements Question<Boolean> {

    private String data ;

    public Verify(String data) {
        this.data = data;
    }

    public static Verify userLoggedIn(String data) {
        return new Verify(data);
    }



    @Override
    public Boolean answeredBy(Actor actor) {

        String mensajeEsperado = Text.of(PageFinalVerifyCreatedUser.USER).viewedBy(actor).asString();
        return data.equals(mensajeEsperado);
    }
}
