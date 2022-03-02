package com.gaurasis.singleton;

public class Tower {

    private Tower(){};

    private static final Tower INSTANCE = new Tower();

    public static Tower getINSTANCE() {
        return INSTANCE;
    }
}
