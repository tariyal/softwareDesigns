package com.gaurasis.singleton;

public class OnDemandTower {
    private OnDemandTower(){};


    public OnDemandTower getInstance(){
        return Helper.Instance;
    }

    //Lazy loaded singleton Instance
    private static class Helper{
        private static final OnDemandTower Instance = new OnDemandTower();
    }
}
