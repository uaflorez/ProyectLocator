package automatizacion.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLocationPage extends PageObject {
    public static final Target INPUT_CITY = Target.the("Enter the city")
            .located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("Enter the postal code or zip ")
            .located(By.id("zip"));
    public static final Target GLOBAL_COUNTRY = Target.the("Contein global of countries")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target SELECT_COUNTRY = Target.the("Select your Country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_SECOND = Target.the("Button next devices")
            .located(By.xpath("//div[@class='pull-right next-step']/a/span[contains(text(),'Next: Devices')]"));

}
