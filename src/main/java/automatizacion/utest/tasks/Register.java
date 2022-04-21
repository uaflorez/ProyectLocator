package automatizacion.utest.tasks;

import automatizacion.utest.userinterface.UtestLoginPage;
import automatizacion.utest.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class Register implements Task {

    public static Register secondPart() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Cali Valle del Cauca, Colombia").into(UtestRegisterPage.INPUT_CITY),
                Enter.theValue("760044").into(UtestRegisterPage.POSTAL_CODE),
                SelectFromOptions.byVisibleText("Colombia").from(UtestRegisterPage.SELECT_COUNTRY),
                Click.on(UtestLoginPage.BUTTON_NEXT)
        );
    }
}
