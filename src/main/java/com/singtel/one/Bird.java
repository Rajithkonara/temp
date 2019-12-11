package com.singtel.one;

import com.singtel.d.FlyBehaviour;
import com.singtel.d.SingBehaviour;

public class Bird extends Animal implements FlyBehaviour, WalkBehaviour, SingBehaviour {

   public void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I am singing");
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
