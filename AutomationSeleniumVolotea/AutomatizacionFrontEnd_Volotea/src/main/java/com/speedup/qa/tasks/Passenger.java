package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterfaces.passengerUserinterface.COOKIES_ACCEPT;


public class Passenger implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(COOKIES_ACCEPT));
    }

    public static Passenger passenger(){
        return Tasks.instrumented(Passenger.class);
    }
}
