package com.gaurasis.cor;

public class App {

    public static void main(String[] args) {
        OrcKing king = new OrcKing();
        king.makeRequest(new Request(Request.RequestType.COLLECT_TAX,"Collect Taxes"));

        king.makeRequest(new Request(Request.RequestType.TORTURE_PRISONERS,"torture the priosners"));
    }
}
