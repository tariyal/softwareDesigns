package com.gaurasis.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CartWorker  extends Worker{
    @Override
    public void work() {
        LOGGER.info("{} moves gold chunks out of mine. " , name());

    }

    @Override
    public String name() {
        return "cart worker";
    }
}
