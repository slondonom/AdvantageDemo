package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.proyectobase.screenplay.userinterface.PageFinalVerifyShoppingCartUser.*;

public class VerifyShoppingCart implements Question<Boolean> {

    private List <String> mensaje;

    public VerifyShoppingCart(List <String> mensaje) {
        this.mensaje = mensaje;
    }

    public static VerifyShoppingCart productSpeaker(List<String> mensaje) {
        return new VerifyShoppingCart(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajeEsperado = Text.of(PRODUCT).viewedBy(actor).asString();
        return mensaje.get(0).equals(mensajeEsperado);
    }
}
