package automatizacion.utest.tasks;

import automatizacion.utest.model.PageUtestDatos;
import automatizacion.utest.userinterface.UtestLocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;


public class Location implements Task {

    private List<PageUtestDatos> data;

    public Location(List<PageUtestDatos> data) {
        this.data = data;
    }

    public static Location thePage(List<PageUtestDatos> data) {

        return Tasks.instrumented(Location.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrCity()).into(UtestLocationPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UtestLocationPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(UtestLocationPage.INPUT_CITY),
                Enter.theValue(data.get(0).getStrPostalCode()).into(UtestLocationPage.POSTAL_CODE),
                Click.on(UtestLocationPage.GLOBAL_COUNTRY),
                Enter.theValue(data.get(0).getStrCountry()).into(UtestLocationPage.SELECT_COUNTRY).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(UtestLocationPage.BUTTON_SECOND)
        );
    }
}
