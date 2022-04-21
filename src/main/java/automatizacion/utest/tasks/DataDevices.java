package automatizacion.utest.tasks;

import automatizacion.utest.model.PageUtestDatos;
import automatizacion.utest.userinterface.UtestDevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class DataDevices implements Task {

    private List<PageUtestDatos> data;

    public DataDevices(List<PageUtestDatos> data) {
        this.data = data;
    }


    public static DataDevices thePage(List<PageUtestDatos> data) {

        return Tasks.instrumented(DataDevices.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestDevicesPage.GLOBAL_PHONE),
                Enter.theValue(data.get(0).getStrPhone()).into(UtestDevicesPage.SELECT_PHONE)
                        .thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(UtestDevicesPage.GLOBAL_MODEL),
                Enter.theValue(data.get(0).getStrModel()).into(UtestDevicesPage.SELECT_MODEL)
                        .thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(UtestDevicesPage.GLOBAL_SO),
                Enter.theValue(data.get(0).getStrOperatingSystem()).into(UtestDevicesPage.OPERATING_SYSTEM)
                        .thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(UtestDevicesPage.BUTTON_LAST_STEP)
        );
    }
}
