package com.gaurasis.overserver;

public enum WeatherType {

    SUNNY("Sunny"),
    COLD("Cold"),
    RAINY("Rainy"),
    WINDY("Windy");

    private final String desc;
    WeatherType(String desc){
        this.desc = desc;
    }
    public String getDesc(){
        return desc;
    }
    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
