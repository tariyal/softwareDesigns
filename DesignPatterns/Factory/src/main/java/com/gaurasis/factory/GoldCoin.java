package com.gaurasis.factory;

public class GoldCoin implements Coin{
    static final String DESCRIPTION = "This is a Gold coin.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
