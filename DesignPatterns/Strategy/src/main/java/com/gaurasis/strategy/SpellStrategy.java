package com.gaurasis.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SpellStrategy implements SlayingStrategy{

    @Override
    public void execute() {
        LOGGER.info("Throw magical spells at dragon's head");
    }
}
