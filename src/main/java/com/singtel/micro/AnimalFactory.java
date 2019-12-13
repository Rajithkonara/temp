package com.singtel.micro;

import com.singtel.b.one.Fish;
import com.singtel.one.Animal;
import com.singtel.one.Bird;

public class AnimalFactory {

    public static Animal getAnimal(String animal) {
        if (animal.equalsIgnoreCase("Fish")) {
            return new Fish();
        }else if (animal.equalsIgnoreCase("Bird")) {
            return new Bird();
        }else {
            return null;
        }
    }

}
