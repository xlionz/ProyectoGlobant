package co.com.globant.opencart.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

    public static final Target RD_GUEST = Target.the("Radio button to guest.")
            .locatedBy("//input[@value= 'guest']");
    public static final Target BTN_CONTINUE = Target.the("Button to contie.")
            .locatedBy("//input[@value= 'Continue']");
    public static final Target INPUT_FISRTNAME = Target.the("Input of first name.")
            .locatedBy("id:input-payment-firstname");
    public static final Target INPUT_LASTTNAME = Target.the("Input of last name.")
            .locatedBy("id:input-payment-lastname");
    public static final Target INPUT_EMAIL = Target.the("Input of email.")
            .locatedBy("id:input-payment-email");
    public static final Target INPUT_TELEPHONE = Target.the("Input of telephone.")
            .locatedBy("id:input-payment-telephone");
    public static final Target INPUT_COMPANY = Target.the("Input of company.")
            .locatedBy("id:input-payment-company");
    public static final Target INPUT_ADDRES1 = Target.the("Input of address1.")
            .locatedBy("id:input-payment-address-1");
    public static final Target INPUT_ADDRES2 = Target.the("Input of addres2.")
            .locatedBy("id:input-payment-address-2");
    public static final Target INPUT_CITY = Target.the("Input of city.")
            .locatedBy("id:input-payment-city");
    public static final Target INPUT_POSTCODE = Target.the("Input of post code.")
            .locatedBy("id:input-payment-postcode");
    public static final Target OPT_COUNTRIES = Target.the("Options of contries.")
            .locatedBy("id:input-payment-country");
    public static final Target OPT_STATE = Target.the("Options os states.")
            .locatedBy("id:input-payment-zone");
    public static final Target BTN_CONTINUE2 = Target.the("Button to continue to delivery details.")
            .locatedBy("(//input[@value= 'Continue'])[2]");
    public static final Target TXT_COMMENT = Target.the("Text area of comments.")
            .locatedBy("//textarea[@name= 'comment']");
    public static final Target BTN_CONTINUE3 = Target.the("Button to continue to confirm order.")
            .locatedBy("id:button-shipping-method");
    public static final Target CHECK_TANDC = Target.the("Check button to confirm terms and conditions.")
            .locatedBy("//input[@name = 'agree']");
    public static final Target BTN_PAYMEN_METHOD = Target.the("Butto to continue to paymen method.")
            .locatedBy("id:button-payment-method");
    public static final Target BTN_CONFIRM = Target.the("Button to cofirm order.")
            .locatedBy("id:button-confirm");
    public static final Target H1_ORDERPLACED = Target.the("H1 of order has been placed!")
            .locatedBy("//h1[text() = 'Your order has been placed!']");
}
