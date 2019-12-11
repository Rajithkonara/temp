package com.singtel.two;

import com.singtel.one.Chicken;
import com.singtel.one.SoundBehaviour;

public class Rooster extends Chicken implements SoundBehaviour {

    public void makeSound() {
        System.out.println("Cock-a-doodle-doo");
    }



}
