package com.gaurasis.strategy;

import lombok.extern.slf4j.Slf4j;
import lombok.var;

@Slf4j
public class App {
    private static final String RED_DRAGON_EMERGES = "Red dragon emerges.";
    private static final String GREEN_DRAGON_SPOTTED = "Green dragon spotted ahead!";
    private static final String BLACK_DRAGON_LANDS = "Black dragon lands before you.";

    public static void main(String[] args) {


        LOGGER.info("Green dragon spotted ahead!");
        var dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();
        LOGGER.info("Red dragon emerges.");
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();
        LOGGER.info("Black dragon lands before you.");
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();
    }
}
