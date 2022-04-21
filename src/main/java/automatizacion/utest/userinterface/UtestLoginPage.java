package automatizacion.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLoginPage extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target.the("Input for name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Input for last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Input for email")
            .located(By.id("email"));
    public static final Target MONTH_BIRTH = Target.the("Select month")
            .located(By.id("birthMonth"));
    public static final Target DAY_BIRTH = Target.the("Select day")
            .located(By.id("birthDay"));
    public static final Target YEAR_BIRTH = Target.the("Select year")
            .located(By.id("birthYear"));
    public static final Target BUTTON_LOCATION = Target.the("Button next")
            .located(By.xpath("//a[@class='btn btn-blue']//span[contains(text(),'Next: Location')]"));
}
