package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterfaces.OriginUserinterface.*;


public class Origin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(COOKIES_ACCEPT));
        actor.attemptsTo(Click.on(ENTER_ORIGIN));
        actor.attemptsTo(Click.on(CLIC_COUNTRY));
        actor.attemptsTo(Click.on(CLIC_CITY));
        actor.attemptsTo(Click.on(CLIC_DATE_GO));
        actor.attemptsTo(Click.on(CLIC_DATE_BACK));
        actor.attemptsTo(Click.on(CLIC_SEEKER));

    }
    public static Origin origin (){
        return Tasks.instrumented(Origin.class);
    }
}
