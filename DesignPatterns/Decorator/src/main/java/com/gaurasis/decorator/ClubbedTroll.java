package com.gaurasis.decorator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ClubbedTroll implements Troll {
    private final Troll decorated;
    public void attack() {
        decorated.attack();
        LOGGER.info("The troll swings at you with a club!");

    }

    public int getAttackPower() {
        return decorated.getAttackPower() + 10;

    }

    public void fleeBattle() {
         decorated.fleeBattle();
    }
}
