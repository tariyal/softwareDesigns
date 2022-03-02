package com.gaurasis.templatemethod;

public class Thief {

    private StealingMethod method;

    public Thief(StealingMethod method){
        this.method = method;
    }

    public void changeMethod(StealingMethod method){
        this.method = method;
    }

    public void steal(){
        method.steal();
    }
}
