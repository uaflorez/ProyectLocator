package automatizacion.utest.tasks;

import automatizacion.utest.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Login implements Task {

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestLoginPage.LOGIN_BUTTON),
                Enter.theValue("Pedro").into(UtestLoginPage.INPUT_FIRST_NAME),
                Enter.theValue("Suarez").into(UtestLoginPage.INPUT_LAST_NAME),
                Enter.theValue("pruebas1qatest@yopmail.com").into(UtestLoginPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("August").from(UtestLoginPage.MONTH_BIRTH),
                SelectFromOptions.byVisibleText("5").from(UtestLoginPage.DAY_BIRTH),
                SelectFromOptions.byVisibleText("2000").from(UtestLoginPage.YEAR_BIRTH),
                Click.on(UtestLoginPage.BUTTON_NEXT)
        );
    }
}
