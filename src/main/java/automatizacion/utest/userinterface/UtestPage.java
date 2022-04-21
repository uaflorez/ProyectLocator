package automatizacion.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class UtestPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button for entry")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
