package com.gaurasis.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TunnelDigger extends Worker{
    @Override
    public void work() {
        LOGGER.info("{} creates a tunnel." , name());

    }

    @Override
    public String name() {
        return "Tunnel digger";
    }
}
