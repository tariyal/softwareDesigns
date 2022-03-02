package com.gaurasis.factory;

public class CoinFactory {
    public static Coin getCoin(String type) {
        if(type.equalsIgnoreCase(CoinType.Copper)){
            return new CopperCoin();
        }else if(type.equalsIgnoreCase(CoinType.GOLD)){
             return new GoldCoin();
        }
        return null;
    }
}
