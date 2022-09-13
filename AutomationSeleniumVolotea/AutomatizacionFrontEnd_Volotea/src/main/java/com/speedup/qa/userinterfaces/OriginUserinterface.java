package com.speedup.qa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class OriginUserinterface {
    public static final Target COOKIES_ACCEPT = Target
            .the("Acepta Cookies")
            .located(By.id("onetrust-accept-btn-handler"));

    public static final Target ENTER_ORIGIN = Target
            .the("Select Origin")
            .located(By.id("input-text_sf-origin"));

    public static final Target CLIC_COUNTRY = Target
            .the("Select a country")
            .located(By.xpath("(//div[@class='v7-card__box']//ul[@class='v7-card__data'])[1]"));

    public static final Target CLIC_CITY = Target
            .the("Select a ciudad")
            .located(By.xpath("(//div[@class='v7-card__box']//ul[@class='v7-card__data'])[3]"));

    public static final Target CLIC_DATE_GO = Target
            .the("Select a fecha de Ida")
            .located(By.xpath("(//span[@class='v7-cal__number ng-star-inserted'])[22]"));

    public static final Target CLIC_DATE_BACK = Target
            .the("Select a fecha de Vuelta")
            .located(By.xpath("//*[@id=\"vol-month-8\"]/div/sf-calendar-day[32]"));

    public static final Target CLIC_SEEKER = Target
            .the("Select el boton buscar")
            .located(By.xpath("//*[@id=\"search-btn\"]/a/span[1]"));
}
