package co.com.globant.opencart.test.utils;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

import static net.serenitybdd.core.environment.EnvironmentSpecificConfiguration.from;

public class Constans {

    private static final EnvironmentVariables CONF = SystemEnvironmentVariables.createEnvironmentVariables();
    public static final String DEFAULT_BROWSER = from(CONF).getProperty("config.browser.default");
    public static final String URL_OPEN_CART = "http://opencart.abstracta.us/index.php?route=common/home";
}
