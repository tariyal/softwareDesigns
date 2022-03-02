package com.gaurasis.cor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrcOfficer extends RequestHandler {
    public OrcOfficer(RequestHandler handler){
        super(handler);
    }

    @Override
    public String toString() {
        return "Orc officer";
    }

    @Override
    public void handleRequest(Request req) {
        if(req.getRequestType().equals(Request.RequestType.TORTURE_PRISONERS)){
            printHandling(req);
            req.markHandled();
        }else {
            super.handleRequest(req);
        }
    }
}
