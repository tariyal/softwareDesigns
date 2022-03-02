package com.gaurasis.overserver.Generic;

import com.gaurasis.overserver.WeatherType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GOrcs implements Race {
    @Override
    public void update(GWeather subject, WeatherType weatherType) {
        LOGGER.info(" Generic orcs are facing "+ weatherType.getDesc() + " weather now");

    }
}
