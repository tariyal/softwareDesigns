package com.gaurasis.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProjectileStrategy implements SlayingStrategy {
    @Override
    public void execute() {
        LOGGER.info("Use magical crossbow to shoot the dragon's head");
    }
}
