package com.gaurasis.cor;

public class OrcSoldier  extends RequestHandler{

    public OrcSoldier(RequestHandler handler){
        super(handler);
    }

    @Override
    public String toString() {
        return "Orc Soldier";
    }

    @Override
    public void handleRequest(Request req) {
        if(req.getRequestType().equals(Request.RequestType.COLLECT_TAX)){
            printHandling(req);
            req.markHandled();
        }else {
            super.handleRequest(req);
        }
    }
}
