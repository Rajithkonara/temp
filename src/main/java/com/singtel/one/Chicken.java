package com.singtel.one;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Chicken extends Bird implements SoundBehaviour {

    private String name = "Chicken";

    @Override
    public void makeSound() {
        System.out.println("Cluck, cluck");
    }
}
