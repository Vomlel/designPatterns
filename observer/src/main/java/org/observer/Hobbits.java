package org.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hobbits implements WeatherObserver {

    private static final Logger logger = LoggerFactory.getLogger(Hobbits.class);

    @Override
    public void update(WeatherType currentWeather) {
        logger.info("The hobbits are facing {} weather now", currentWeather.getDescription());
    }
}
