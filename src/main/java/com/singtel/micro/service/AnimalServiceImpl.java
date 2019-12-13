package com.singtel.micro.service;

import com.singtel.FishFactory;
import com.singtel.b.one.Fish;
import com.singtel.b.three.Dolphin;
import com.singtel.b.two.Clownfish;
import com.singtel.b.two.Shark;
import com.singtel.d.Butterfly;
import com.singtel.e.Crow;
import com.singtel.four.Parrot;
import com.singtel.micro.BirdFactory;
import com.singtel.one.Animal;
import com.singtel.one.Bird;
import com.singtel.one.Chicken;
import com.singtel.one.Duck;
import com.singtel.two.Rooster;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Override
    public Animal[] fetchBirds() {

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

        for (Animal animal : animals) {
            if (animal instanceof Bird) {
                return animals;
            }
        }
        return null;
    }

    @Override
    public Fish fetchFishByName(String name) {

    Fish fish = FishFactory.getFish(name);

    return fish;

    }

    @Override
    public Bird getBirdByName(String name) {
        Bird bird = BirdFactory.getBird(name);
        return bird;
    }

}
