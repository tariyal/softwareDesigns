package com.gaurasis.overserver;

import lombok.extern.slf4j.Slf4j;
import lombok.var;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Weather {

    List<WeatherObserver> observers;
    WeatherType currentWeather;

    public Weather(){
        observers  = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver obs){
        observers.add(obs);
    }
    public void removeObserver(WeatherObserver obs){
        observers.remove(obs);
    }

    public void timePasses() {
        var enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        LOGGER.info("The weather changed to {}.", currentWeather);
        notifyObservers();
    }
    private void notifyObservers(){
        observers.forEach(obs -> obs.update(currentWeather));
    }
}
