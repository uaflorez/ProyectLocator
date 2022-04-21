package automatizacion.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLastStepPage extends PageObject {
    public static final Target CREATE_PASSWORD = Target.the("Create your uTest password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm your password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAY_INFORMED = Target.the(" STAY INFORMED")
            .located(By.xpath("//div[@class='ui-view']/div/form/div[4]/label"));
    public static final Target CHECK_UTEST_TERMS = Target.the("uTest Terms")
            .located(By.xpath("//div[@class='ui-view']/div/form/div[5]/label"));
    public static final Target CHECK_POLICY = Target.the("Privacy & Security Policy")
            .located(By.xpath(" //div[@class='ui-view']/div/form/div[6]/label/span"));
    public static final Target BUTTON_COMPLETE = Target.the("Button complete")
            .located(By.id("laddaBtn"));
    public static final Target BUTTON_BACK = Target.the("to reply question of automation")
            .located(By.xpath("//div[@class='ui-view']/div/div/a"));

}
