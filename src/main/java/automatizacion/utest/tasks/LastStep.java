package automatizacion.utest.tasks;

import automatizacion.utest.model.PageUtestDatos;
import automatizacion.utest.userinterface.UtestLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class LastStep implements Task {
    private List<PageUtestDatos> data;

    public LastStep(List<PageUtestDatos> data) {
        this.data = data;
    }

    public static LastStep thePage(List<PageUtestDatos> data) {
        return Tasks.instrumented(LastStep.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrPassword()).into(UtestLastStepPage.CREATE_PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(UtestLastStepPage.CONFIRM_PASSWORD),
                Click.on(UtestLastStepPage.CHECK_STAY_INFORMED),
                Click.on(UtestLastStepPage.CHECK_UTEST_TERMS),
                Click.on(UtestLastStepPage.CHECK_POLICY),
                Click.on(UtestLastStepPage.BUTTON_COMPLETE)
        );
    }
}
