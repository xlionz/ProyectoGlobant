package co.com.globant.opencart.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target INPUT_SEARCH = Target.the("Input to search a product.")
            .locatedBy("//input[@name = 'search']");
    public static final Target BTN_SEARCH = Target.the("Button to search a product.")
            .locatedBy("//i[@class = 'fa fa-search']");
    public static final Target ADD_CART_CARD = Target.the("Card of add a product to the cart.")
            .locatedBy("//a[text() = '{0}']/ancestor::div[@class = 'caption']/following-sibling" +
                    "::div/descendant::span[text() = 'Add to Cart']");
    public static final Target LBL_SHOPPING_CART = Target.the("Href to view cart.")
            .locatedBy("//span[text()= 'Shopping Cart']");
}
