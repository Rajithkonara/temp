package com.singtel.one;

import com.singtel.b.one.Fish;
import com.singtel.b.two.Clownfish;
import com.singtel.b.two.Shark;
import com.singtel.d.Butterfly;
import com.singtel.d.Catterpillar;
import com.singtel.d.Metamorphosis;
import com.singtel.four.AnimalSounds;
import com.singtel.four.Parrot;

public class Solution {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        Parrot parrot = new Parrot();
        parrot.getParrotSound(AnimalSounds.CAT);
        parrot.getParrotSound(AnimalSounds.Dog);
        parrot.getParrotSound(AnimalSounds.ROOSTER);

        Fish shark = new Shark();
        System.out.println(shark.getColor());
        System.out.println(shark.getSize());
        System.out.println(shark.isPredator());

        System.out.println("=======================");

        Fish clownFish = new Clownfish();
        System.out.println(clownFish.getSize());
        System.out.println(clownFish.getColor());
        System.out.println(clownFish.isMakeJokes());

        System.out.println("=======================");

        Catterpillar catterpillar = new Catterpillar();
        catterpillar.walk();

        Butterfly newB = new Metamorphosis().transform(catterpillar);
        System.out.println("transformed butterfly");
        newB.fly();
    }

}
