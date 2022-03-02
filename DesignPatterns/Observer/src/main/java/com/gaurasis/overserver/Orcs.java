package com.gaurasis.overserver;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Orcs implements WeatherObserver {
    @Override
    public void update(WeatherType obs) {
        LOGGER.info("Orcs are facing " + obs.getDesc() + " weather now");
    }
}
