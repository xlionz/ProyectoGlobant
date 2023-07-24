package co.com.globant.opencart.test.utils;

import co.com.globant.opencart.test.models.Person;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReadFiles {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReadFiles.class);
    private static final EnvironmentVariables CONF = SystemEnvironmentVariables.createEnvironmentVariables();
    private static final String CONFIG_PRODUCTS = "products.";
    public static final String CONFIG_PERSONS = "persons.";

    public static String readProducts(String products) {
        LOGGER.info("Susscesfull");
        return CONF.getProperty(CONFIG_PRODUCTS + products + ".products");
    }

    public static Person readPerson(String person) {
        return new Person(
                CONF.getProperty(CONFIG_PERSONS + person + ".firstname"),
                CONF.getProperty(CONFIG_PERSONS + person + ".lastname"),
                CONF.getProperty(CONFIG_PERSONS + person + ".email"),
                CONF.getProperty(CONFIG_PERSONS + person + ".telephone"),
                CONF.getProperty(CONFIG_PERSONS + person + ".compnay"),
                CONF.getProperty(CONFIG_PERSONS + person + ".address1"),
                CONF.getProperty(CONFIG_PERSONS + person + ".address2"),
                CONF.getProperty(CONFIG_PERSONS + person + ".city"),
                CONF.getProperty(CONFIG_PERSONS + person + ".postcode"),
                CONF.getProperty(CONFIG_PERSONS + person + ".country"),
                CONF.getProperty(CONFIG_PERSONS + person + ".state"),
                CONF.getProperty(CONFIG_PERSONS + person + ".comments")
        );
    }
}
