package automatizacion.utest.tasks;

import automatizacion.utest.userinterface.UtestCountryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class DataCountry implements Task {

    public static DataCountry thirdPart() {
        return Tasks.instrumented(DataCountry.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("11 Home").from(UtestCountryPage.SELECT_VERSION),
                SelectFromOptions.byVisibleText("Samsung").from(UtestCountryPage.SELECT_PHONE),
                SelectFromOptions.byVisibleText("Galaxy S3 I9300").from(UtestCountryPage.PHONE_MODEL),
                SelectFromOptions.byVisibleText("Android 5.1").from(UtestCountryPage.OPERATING_SYSTEM)
        );
    }
}
