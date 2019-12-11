package com.singtel.one;

public class Chicken extends Bird implements SoundBehaviour {

    @Override
    public void makeSound() {
        System.out.println("Cluck, cluck");
    }
}
