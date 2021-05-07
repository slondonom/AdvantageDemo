package co.com.proyectobase.screenplay.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageProductShoppingCartUser {

    public static final Target SPEAKERS = Target.the("").located(By.id("speakersImg"));
    public static final Target BOSE = Target.the("").located(By.xpath("//a[text()='Bose Soundlink Bluetooth Speaker III']"));
    public static final Target ADDCART = Target.the("").located(By.name("save_to_cart"));
    public static final Target SHOPPINGCART = Target.the("").located(By.id("shoppingCartLink"));


}
