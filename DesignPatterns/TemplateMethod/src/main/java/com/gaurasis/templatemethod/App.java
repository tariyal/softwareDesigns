package com.gaurasis.templatemethod;

public class App {
    public static void main(String[] args) {
        Thief thief = new Thief(new SubtleMethod());
        thief.steal();
    }
}
