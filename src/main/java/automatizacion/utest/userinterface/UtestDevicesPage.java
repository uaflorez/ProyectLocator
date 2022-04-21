package automatizacion.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDevicesPage extends PageObject {

    public static final Target GLOBAL_PHONE = Target.the("Global phone")
            .located(By.xpath("//div[@id='mobile-device']/div[1]/div[2]/div"));

    public static final Target SELECT_PHONE = Target.the("Your device brand")
            .located(By.xpath("//div[@id='mobile-device']/div[1]/div[2]/div/input"));

    public static final Target GLOBAL_MODEL = Target.the("Global Model ")
            .located(By.xpath("//div[@id='mobile-device']/div[2]/div[2]/div"));
    public static final Target SELECT_MODEL = Target.the("Your device model")
            .located(By.xpath("//div[@id='mobile-device']/div[2]/div[2]/div/input"));


    public static final Target GLOBAL_SO = Target.the("Global operating system")
            .located(By.xpath("//div[@id='mobile-device']/div[3]/div[2]/div"));
    public static final Target OPERATING_SYSTEM = Target.the("Operating system")
            .located(By.xpath("//div[@id='mobile-device']/div[3]/div[2]/div/input"));

    public static final Target BUTTON_LAST_STEP = Target.the("Button last next step")
            .located(By.xpath("//div[@class='pull-right next-step']/a/span[contains(text(),'Next: Last Step')]"));
}
