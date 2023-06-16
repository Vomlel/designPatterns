package org.observer;

import lombok.extern.slf4j.Slf4j;
import org.observer.generic.GenHobbits;
import org.observer.generic.GenOrcs;
import org.observer.generic.GenWeather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        var weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

        // Generic observer inspired by Java Generics and Collections by Naftalin & Wadler
        logger.info("--Running generic version--");
        var genericWeather = new GenWeather();
        genericWeather.addObserver(new GenOrcs());
        genericWeather.addObserver(new GenHobbits());

        genericWeather.timePasses();
        genericWeather.timePasses();
        genericWeather.timePasses();
        genericWeather.timePasses();
    }
}