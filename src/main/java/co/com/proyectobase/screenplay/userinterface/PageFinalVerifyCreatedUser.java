package co.com.proyectobase.screenplay.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageFinalVerifyCreatedUser {

    public static final Target USER = Target.the("").located(By.xpath("//h3[text()='MY ACCOUNT']"));

}
