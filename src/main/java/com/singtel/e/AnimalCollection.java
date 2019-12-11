package com.singtel.e;

import com.singtel.b.one.Fish;
import com.singtel.b.one.SwimBehaviour;
import com.singtel.b.two.Clownfish;
import com.singtel.b.two.Shark;
import com.singtel.d.Butterfly;
import com.singtel.d.FlyBehaviour;
import com.singtel.d.SingBehaviour;
import com.singtel.four.Parrot;
import com.singtel.one.*;
import com.singtel.two.Rooster;
import com.singtel.b.three.Dolphin;


public class AnimalCollection {

    public static void count(Animal[] animals) {

        int flyCount = 0;
        int walkCount = 0;
        int singCount = 0;
        int swimCount = 0;

        for (Animal animal : animals) {
            if (animal instanceof FlyBehaviour) {
                flyCount += 1;
            }
            if (animal instanceof WalkBehaviour) {
                walkCount += 1;
            }
            if (animal instanceof SingBehaviour) {
                singCount += 1;
            }
            if (animal instanceof SwimBehaviour) {
                swimCount += 1;
            }
        }

        System.out.println(flyCount);
        System.out.println(walkCount);
        System.out.println(singCount);
        System.out.println(swimCount);
    }

    public static void main(String[] args) {

        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Butterfly(),
                new Crow()
        };

        count(animals);

    }

}
