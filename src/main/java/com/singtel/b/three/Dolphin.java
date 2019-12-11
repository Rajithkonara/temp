package com.singtel.b.three;

import com.singtel.b.one.SwimBehaviour;
import com.singtel.one.Animal;

public class Dolphin extends Animal implements SwimBehaviour {

    public void canSwim() {
        System.out.println("I can swim");
    }
}
