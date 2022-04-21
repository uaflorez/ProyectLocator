package automatizacion.utest.stepdefinitions;

import automatizacion.utest.model.PageUtestDatos;
import automatizacion.utest.tasks.DataDevices;
import automatizacion.utest.tasks.Location;
import automatizacion.utest.tasks.Login;
import automatizacion.utest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class PageUtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than santiago need register in platform utest$")
    public void thanSantiagoNeedRegisterInPlatformUtest() {
        OnStage.theActorCalled("Santiago").wasAbleTo(OpenUp.thePage());
    }

    @When("^he register can navegation in platform$")
    public void heRegisterCanNavegationInPlatform(List<PageUtestDatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.thePage(datos),
                Location.thePage(datos),
                DataDevices.thePage(datos)
        );

    }

    @Then("^can see your activity$")
    public void canSeeYourActivity() {

    }
}
