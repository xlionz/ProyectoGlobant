package co.com.globant.opencart.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target LBL_PRICE_PRODUCT = Target.the("Label of price per prodcut.")
            .locatedBy("(//a[text()= '{0}']/ancestor::td[@class = 'text-left']" +
                    "/following-sibling::td[contains(text(), '$')])[2]");
    public static final Target LBL_TOTAL_VALUE = Target.the("Label of total value about products.")
            .locatedBy("//strong[text() = 'Total:']/ancestor::td/following-sibling::td");
    public static final Target BTN_CHECKOUT = Target.the("Button to steps of checkout.")
            .locatedBy("//a[text() = 'Checkout']");
}
