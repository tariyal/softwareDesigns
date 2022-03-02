package com.gaurasis.builder;

public class App {

    public static void main(String[] args) {
        Hero hero = new Hero.Builder()
                .withHairColor("Black")
                .withName("Thor")
                .withProfession("King")
                .withWeapon("Hammer")
                .build();
        System.out.println(hero.toString());
    }
}
