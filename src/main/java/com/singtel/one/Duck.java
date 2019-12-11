package com.singtel.one;

public class Duck extends Bird implements SoundBehaviour {

    public void swim() {
        System.out.println("I can swim");
    }

    @Override
    public void makeSound() {
        System.out.println("Quack, quack");
    }
}
