package co.com.globant.opencart.test.tasks;

import co.com.globant.opencart.test.interactions.Wait;
import co.com.globant.opencart.test.models.Person;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import static co.com.globant.opencart.test.userinterfaces.CartPage.BTN_CHECKOUT;
import static co.com.globant.opencart.test.userinterfaces.CheckoutPage.*;

@AllArgsConstructor
public class FillCheckout implements Task {

    private Person person;

    public static FillCheckout guestCheckout(Person person){
        return Tasks.instrumented(FillCheckout.class, person);
    }

    @Step("{0} fills the form and check the order.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CHECKOUT),
                Click.on(RD_GUEST),
                Click.on(BTN_CONTINUE),
                Wait.seconds(),
                Enter.theValue(person.getFirstName()).into(INPUT_FISRTNAME),
                Enter.theValue(person.getLastName()).into(INPUT_LASTTNAME),
                Enter.theValue(person.getEmail()).into(INPUT_EMAIL),
                Enter.theValue(person.getTelephone()).into(INPUT_TELEPHONE),
                Enter.theValue(person.getCompany()).into(INPUT_COMPANY),
                Enter.theValue(person.getAddres1()).into(INPUT_ADDRES1),
                Enter.theValue(person.getAddres2()).into(INPUT_ADDRES2),
                Enter.theValue(person.getCity()).into(INPUT_CITY),
                Enter.theValue(person.getPostCode()).into(INPUT_POSTCODE),
                SelectFromOptions.byVisibleText(person.getCountry()).from(OPT_COUNTRIES),
                SelectFromOptions.byVisibleText(person.getState()).from(OPT_STATE),
                Click.on(BTN_CONTINUE2), Wait.seconds(),
                Click.on(BTN_CONTINUE3), Wait.seconds(), Click.on(CHECK_TANDC),
                Click.on(BTN_PAYMEN_METHOD), Wait.seconds(),
                Click.on(BTN_CONFIRM)
        );
    }
}
