package co.com.globant.opencart.test.questions;

import co.com.globant.opencart.test.interactions.Wait;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

import static co.com.globant.opencart.test.userinterfaces.CheckoutPage.H1_ORDERPLACED;

@AllArgsConstructor
public class YourOrder implements Question<Boolean> {

    private String msg;

    public static YourOrder HasBeendPlaced(String msg){
        return new YourOrder(msg);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Wait.seconds());
        actor.attemptsTo(
                Ensure.that(H1_ORDERPLACED.resolveFor(actor).getText()).contains(msg)
        );

        return true;
    }
}
