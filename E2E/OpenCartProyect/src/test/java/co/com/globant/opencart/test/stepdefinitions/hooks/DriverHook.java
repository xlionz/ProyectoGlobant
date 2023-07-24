package co.com.globant.opencart.test.stepdefinitions.hooks;

import co.com.globant.opencart.test.utils.WebDriverFactory;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.globant.opencart.test.utils.Constans.URL_OPEN_CART;


public class DriverHook {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(WebDriverFactory.goToWeb())));
        OnStage.theActorCalled("Automation").wasAbleTo(Open.url(URL_OPEN_CART));
    }
}
