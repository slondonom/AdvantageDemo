package co.com.proyectobase.screenplay.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageFinalVerifyShoppingCartUser {

    public static final Target PRODUCT = Target.the("").located(By.xpath("//tbody//tr[@class='ng-scope'][1]//td[2]//label[contains(@class,'product')]"));

}
