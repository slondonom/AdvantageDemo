package co.com.proyectobase.screenplay.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageEditAccountDetailsUser {

    public static final Target EDIT = Target.the("").located(By.xpath("//h3[contains(text(),'Account details')]//a[text()='Edit']"));

    public static final Target FIRST_NAME = Target.the("").located(By.name("first_nameAccountDetails"));
    public static final Target LAST_NAME = Target.the("").located(By.name("last_nameAccountDetails"));
    public static final Target PHONE_NUMBER = Target.the("").located(By.name("phone_numberAccountDetails"));

    public static final Target COUNTRY = Target.the("").located(By.name("countryListboxAccountDetails"));
    public static final Target CITY = Target.the("").located(By.name("cityAccountDetails"));
    public static final Target ADDRESS = Target.the("").located(By.name("addressAccountDetails"));
    public static final Target STATE = Target.the("").located(By.name("state_/_province_/_regionAccountDetails"));
    public static final Target POSTAL = Target.the("").located(By.name("postal_codeAccountDetails"));

    public static final Target SAVE = Target.the("").located(By.id("save_btnundefined"));



}
