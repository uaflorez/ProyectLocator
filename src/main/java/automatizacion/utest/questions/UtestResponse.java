package automatizacion.utest.questions;

import automatizacion.utest.model.PageUtestDatos;
import automatizacion.utest.userinterface.UtestLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class UtestResponse implements Question<Boolean> {

    private List<PageUtestDatos> data;

    public UtestResponse(List<PageUtestDatos> data) {
        this.data = data;
    }


    public static UtestResponse theData(List<PageUtestDatos> data) {
        return new UtestResponse(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String Button_last = Text.of(UtestLastStepPage.BUTTON_COMPLETE).viewedBy(actor).asString();
        return data.get(0).getStrFinalText().equals(Button_last);
    }

}
