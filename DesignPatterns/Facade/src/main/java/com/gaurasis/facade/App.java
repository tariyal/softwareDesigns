package com.gaurasis.facade;

public class App {
    public static void main(String[] args) {
        MineWorkerFacade facade = new MineWorkerFacade();
        facade.startNewDay();
        facade.doWork();
        facade.endDay();
    }
}
