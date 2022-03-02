package com.gaurasis.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubtleMethod extends StealingMethod {
    @Override
    public String pickTarget() {
        return "Shop Keeper";
    }

    @Override
    public void confuseTarget(String target) {
        LOGGER.info("Confuse the {} with sob story and hug him",target);
    }

    @Override
    public void stealTheItem(String target) {
        LOGGER.info("While in close contact grab the {}'s wallet.",target);
    }
}
