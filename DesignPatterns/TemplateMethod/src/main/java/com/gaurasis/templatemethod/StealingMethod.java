package com.gaurasis.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class StealingMethod {

    public abstract String pickTarget();
    public abstract void confuseTarget(String target);
    public abstract void stealTheItem(String target);

    public void steal(){
        String target = pickTarget();
        LOGGER.info("The target has been chosen as {}.",target);
        confuseTarget(target);
        stealTheItem(target);
    }
}
