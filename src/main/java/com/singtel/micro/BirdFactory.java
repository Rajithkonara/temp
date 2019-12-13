package com.singtel.micro;

import com.singtel.one.Bird;
import com.singtel.one.Chicken;

public class BirdFactory {

    public static Bird getBird(String name) {

        if (name.equalsIgnoreCase("Chicken")) {
            return new Chicken();
        } else {
            return null;
        }

    }

}

