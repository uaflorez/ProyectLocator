package automatizacion.utest.stepdefinitions;

import automatizacion.utest.model.PageUtestDatos;
import automatizacion.utest.questions.UtestResponse;
import automatizacion.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
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
    public void heRegisterCanNavegationInPlatform(List<PageUtestDatos> data) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.thePage(data),
                Location.thePage(data),
                DataDevices.thePage(data),
                LastStep.thePage(data)
        );

    }

    @Then("^can see your activity$")
    public void canSeeYourActivity(List<PageUtestDatos> data) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(UtestResponse.theData(data)));

    }
}
