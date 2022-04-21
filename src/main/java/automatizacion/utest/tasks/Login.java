package automatizacion.utest.tasks;

import automatizacion.utest.model.PageUtestDatos;
import automatizacion.utest.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class Login implements Task {
    private List<PageUtestDatos> datos;

    public Login(List<PageUtestDatos> datos) {
        this.datos = datos;
    }

    public static Login thePage(List<PageUtestDatos> datos) {
        return Tasks.instrumented(Login.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.get(0).getStrNameUser()).into(UtestLoginPage.INPUT_FIRST_NAME),
                Enter.theValue(datos.get(0).getStrLastName()).into(UtestLoginPage.INPUT_LAST_NAME),
                Enter.theValue(datos.get(0).getStrEmail()).into(UtestLoginPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(datos.get(0).getStrBirthMonth()).from(UtestLoginPage.MONTH_BIRTH),
                SelectFromOptions.byVisibleText(datos.get(0).getStrBirthDay()).from(UtestLoginPage.DAY_BIRTH),
                SelectFromOptions.byVisibleText(datos.get(0).getStrBirthYear()).from(UtestLoginPage.YEAR_BIRTH),
                Click.on(UtestLoginPage.BUTTON_LOCATION)
        );
    }
}
