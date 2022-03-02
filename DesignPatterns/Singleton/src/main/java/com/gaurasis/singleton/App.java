package com.gaurasis.singleton;

public class App {

    public static void main(String[] args) {
        ThreadSafeLazyTower tower = ThreadSafeLazyTower.getInstance();
        tower.description();


    }
}
