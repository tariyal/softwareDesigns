package com.gaurasis.overserver;

import com.gaurasis.overserver.Generic.GHobbit;
import com.gaurasis.overserver.Generic.GOrcs;
import com.gaurasis.overserver.Generic.GWeather;

public class App {
    public static void main(String[] args) {
//        Weather weather = new Weather();
//        weather.addObserver(new Hobbit());
//        weather.addObserver(new Orcs());
//        weather.timePasses();
//        weather.timePasses();
//        weather.timePasses();


        GWeather gWeather  = new GWeather();
        gWeather.addObserver(new GHobbit());
        gWeather.addObserver(new GOrcs());
        gWeather.timePasses();
        gWeather.timePasses();
    }
}
