package co.com.proyectobase.screenplay.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageSingInUser {

    public static final Target PASSWORD = Target.the("").located(By.name("password"));
    public static final Target SIGNIN = Target.the("").located(By.id("sign_in_btnundefined"));

}
