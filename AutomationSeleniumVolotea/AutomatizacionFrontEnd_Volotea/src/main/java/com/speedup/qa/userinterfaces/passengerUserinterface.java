package com.speedup.qa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class passengerUserinterface {

    public static final Target COOKIES_ACCEPT = Target
            .the("Acepta Cookies")
            .located(By.id("onetrust-accept-btn-handler"));

}

