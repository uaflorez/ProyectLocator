package automatizacion.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage extends PageObject {
    public static final Target INPUT_CITY = Target.the("Enter the city")
            .located(By.className("pac-container pac-logo"));
    public static final Target POSTAL_CODE = Target.the("Enter the postal code or zip ")
            .located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("Select your Country")
            .located(By.id("ui-select-choices-19"));


}
