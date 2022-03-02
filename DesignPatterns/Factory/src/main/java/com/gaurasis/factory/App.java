package com.gaurasis.factory;

public class App {
    public static void main(String[] args) {
        Coin goldCoin = CoinFactory.getCoin(CoinType.GOLD);
        Coin copperCoin = CoinFactory.getCoin(CoinType.Copper);
        System.out.println(goldCoin.getDescription());
        System.out.println(copperCoin.getDescription());

    }
}
