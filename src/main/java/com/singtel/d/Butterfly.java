package com.singtel.d;

public class Butterfly extends Insect implements FlyBehaviour {

    private Catterpillar catterpillar;

    public Butterfly(Catterpillar catterpillar) {
        this.catterpillar = catterpillar;
    }

    public Butterfly() {}

    public void fly() {
        System.out.println("I am flying");
    }
}
