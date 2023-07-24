package co.com.globant.opencart.test.stepdefinitions;

import co.com.globant.opencart.test.exceptions.ExceptionError;
import co.com.globant.opencart.test.questions.ViewProducts;
import co.com.globant.opencart.test.tasks.AddsProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AddListProductStepDefinition {

    @Given("searches the {string} of product and add to the cart")
    public void addsProductToTheCart(String products) {
        theActorInTheSpotlight().attemptsTo(
                AddsProduct.toTheCart(products)
        );
    }

    @Then("should will see the products with the value in the cart")
    public void shouldWillSeeTheProductsInTheCart() {
        theActorInTheSpotlight().should(seeThat(ViewProducts.inTheCart()).orComplainWith(ExceptionError.class));
    }
}
