package co.com.globant.opencart.test.stepdefinitions;

import co.com.globant.opencart.test.exceptions.ExceptionError;
import co.com.globant.opencart.test.questions.YourOrder;
import co.com.globant.opencart.test.tasks.FillCheckout;
import co.com.globant.opencart.test.utils.ReadFiles;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GuestCheckoutStepDefinition {

    @When("{string} fills the steps of checkout")
    public void fillsTheStepsOfCheckout(String person) {
        theActorInTheSpotlight().attemptsTo(
                FillCheckout.guestCheckout(ReadFiles.readPerson(person))
        );
    }

    @Then("should will see a msg like {string}")
    public void shouldWillSeeAMsgLike(String msg) {
        theActorInTheSpotlight().should(seeThat(YourOrder.HasBeendPlaced(msg)).orComplainWith(ExceptionError.class));
    }
}
