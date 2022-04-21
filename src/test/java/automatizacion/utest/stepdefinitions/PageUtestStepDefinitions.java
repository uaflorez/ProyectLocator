package automatizacion.utest.stepdefinitions;

import automatizacion.utest.tasks.DataCountry;
import automatizacion.utest.tasks.Login;
import automatizacion.utest.tasks.OpenUp;
import automatizacion.utest.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PageUtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than santiago need register in platform utest$")
    public void thanSantiagoNeedRegisterInPlatformUtest() {
        OnStage.theActorCalled("Santiago").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^he register can navegation in platform$")
    public void heRegisterCanNavegationInPlatform() {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.secondPart());
        OnStage.theActorInTheSpotlight().attemptsTo(DataCountry.thirdPart());
    }

    @Then("^can see your activity$")
    public void canSeeYourActivity() {

    }
}
