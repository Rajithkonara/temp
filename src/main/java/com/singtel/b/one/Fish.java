package com.singtel.b.one;

import com.singtel.one.Animal;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Fish extends Animal implements SwimBehaviour {

    private String color;
    private String size;
    private boolean makeJokes;
    private boolean predator;

    public void canSwim() {
        System.out.println("I can swim");
    }

}
