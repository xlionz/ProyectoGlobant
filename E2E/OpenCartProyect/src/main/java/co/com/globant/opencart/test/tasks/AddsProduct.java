package co.com.globant.opencart.test.tasks;

import co.com.globant.opencart.test.utils.ReadFiles;
import co.com.globant.opencart.test.utils.Splits;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static co.com.globant.opencart.test.userinterfaces.HomePage.*;

@AllArgsConstructor
public class AddsProduct implements Task {

    private String products;

    public static AddsProduct toTheCart(String products){
        return Tasks.instrumented(AddsProduct.class, products);
    }

    @Step("{0} adds products to the cart.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] listProducts = Splits.textPerComma(ReadFiles.readProducts(products));
        actor.remember("PRODUCTS", products);
        for (int countProducts = 0; countProducts < listProducts.length; countProducts++){
            actor.attemptsTo(
                    Enter.theValue(listProducts[countProducts]).into(INPUT_SEARCH),
                    Click.on(BTN_SEARCH),
                    Click.on(ADD_CART_CARD.of(listProducts[countProducts]))
            );
        }
    }
}
