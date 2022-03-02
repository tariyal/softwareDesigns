package com.gaurasis.strategy;

public class DragonSlayer {
    private SlayingStrategy strategy;

    public DragonSlayer(SlayingStrategy strategy){
        this.strategy = strategy;
    }
    public void changeStrategy(SlayingStrategy strategy){
        this.strategy = strategy;
    }

    public void goToBattle(){
        strategy.execute();
    }
}
