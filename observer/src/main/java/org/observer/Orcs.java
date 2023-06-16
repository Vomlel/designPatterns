package org.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Orcs implements WeatherObserver {

    private static final Logger logger = LoggerFactory.getLogger(Orcs.class);

    @Override
    public void update(WeatherType currentWeather) {
        logger.info("The orcs are facing " + currentWeather.getDescription() + " weather now");
    }
}
