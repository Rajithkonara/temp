package com.singtel;

import com.singtel.b.one.Fish;
import com.singtel.b.two.Clownfish;
import com.singtel.b.two.Shark;

public class FishFactory {

    public static Fish getFish(String name) {

        if (name.equalsIgnoreCase("Shark")) {
            return new Shark();
        } else if (name.equalsIgnoreCase("ClownFish")) {
            return new Clownfish();
        } else {
            return null;
        }
    }
}
