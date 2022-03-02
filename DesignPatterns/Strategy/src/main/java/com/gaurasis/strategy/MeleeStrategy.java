package com.gaurasis.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MeleeStrategy implements SlayingStrategy{
    @Override
    public void execute() {
      LOGGER.info("Use Sword to sever the dragon's head");
    }
}
