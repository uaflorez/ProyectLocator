package automatizacion.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestCountryPage extends PageObject {
    public static final Target SELECT_VERSION = Target.the("Select version your the operating system")
            .located(By.id("ui-select-choices-21"));
    public static final Target SELECT_PHONE = Target.the("Your Mobile Device:")
            .located(By.id("ui-select-choices-23"));
    public static final Target PHONE_MODEL = Target.the("phone model")
            .located(By.id("ui-select-choices-24"));
    public static final Target OPERATING_SYSTEM = Target.the("Operating system")
            .located(By.id("ui-select-choices-25"));
}
