package com.gaurasis.cor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class RequestHandler {
    private final RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request req){
        if(next != null){
            next.handleRequest(req);
        }
    }

    protected void printHandling(Request req){
        LOGGER.info("{} handling request \"{}\"",this,req);
    }
    @Override
    public  abstract String toString();
}
