package co.com.globant.opencart.test.questions;

import co.com.globant.opencart.test.interactions.Wait;
import co.com.globant.opencart.test.utils.ReadFiles;
import co.com.globant.opencart.test.utils.Splits;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.globant.opencart.test.userinterfaces.CartPage.LBL_PRICE_PRODUCT;
import static co.com.globant.opencart.test.userinterfaces.CartPage.LBL_TOTAL_VALUE;
import static co.com.globant.opencart.test.userinterfaces.HomePage.LBL_SHOPPING_CART;

@AllArgsConstructor
public class ViewProducts implements Question<Boolean> {

    public static ViewProducts inTheCart() {
        return new ViewProducts();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String[] listProducts = Splits.textPerComma(ReadFiles.readProducts(actor.recall("PRODUCTS")));
        Double totalValue = 0.0;

        actor.attemptsTo(
                Scroll.to(LBL_SHOPPING_CART),
                Click.on(LBL_SHOPPING_CART),
                Wait.seconds(),
                Scroll.to(LBL_PRICE_PRODUCT.of(listProducts[0]))
        );

        for (int countProducts = 0; countProducts < listProducts.length; countProducts++) {
            totalValue += Double.valueOf(LBL_PRICE_PRODUCT.of(listProducts[countProducts]).resolveFor(actor).getText().replace("$", ""));
        }

        actor.attemptsTo(Ensure.that(LBL_TOTAL_VALUE.resolveFor(actor).getText()).contains(Double.toString(totalValue)));
        return true;
    }
}
