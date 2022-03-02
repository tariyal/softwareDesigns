package com.gaurasis.cor;

public class OrcKing {
    RequestHandler chain;

    public OrcKing(){
        buildChain();
    }
    public void buildChain(){
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request req){
        chain.handleRequest(req);
    }
    public String toString() {
        return "Orc king";
    }


}
