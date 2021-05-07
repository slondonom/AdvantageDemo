package co.com.proyectobase.screenplay.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageFinalVerifyEditAccountDetails {

    public static final Target SAVE = Target.the("").located(By.xpath("//div[@class='cube']//a[@id='hrefUserIcon']//ancestor::div[@class='borderBox']//div[@class='middle']//div[@class='floatRigth']//following-sibling::label[1]"));

}
