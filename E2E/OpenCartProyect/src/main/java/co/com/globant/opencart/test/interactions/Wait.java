package co.com.globant.opencart.test.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

@AllArgsConstructor
public class Wait implements Interaction {

    public static Wait seconds(){
        return Tasks.instrumented(Wait.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos((long) 1000));
    }
}
