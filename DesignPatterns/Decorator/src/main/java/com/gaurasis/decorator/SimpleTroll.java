package com.gaurasis.decorator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleTroll implements Troll {

    public void attack() {
        LOGGER.info("Troll tries to grab you");

    }

    public int getAttackPower() {
        return 10;
    }

    public void fleeBattle() {
        LOGGER.info("Troll flees the battle");

    }
}
