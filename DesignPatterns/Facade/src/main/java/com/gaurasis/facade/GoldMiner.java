package com.gaurasis.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoldMiner extends Worker{
    @Override
    public void work() {
        LOGGER.info("{} mines gold from tunnels." , name());

    }

    @Override
    public String name() {
        return "Gold miner";
    }
}
