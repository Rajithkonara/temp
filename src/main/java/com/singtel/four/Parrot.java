package com.singtel.four;

import com.singtel.one.Bird;

public class Parrot extends Bird {

    public void getParrotSound(AnimalSounds animalSounds) {
        System.out.println(animalSounds.getSound());
    }
}
