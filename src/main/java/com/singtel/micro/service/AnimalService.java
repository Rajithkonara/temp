package com.singtel.micro.service;

import com.singtel.b.one.Fish;
import com.singtel.one.Animal;
import com.singtel.one.Bird;

public interface AnimalService {

    Animal[] fetchBirds();

    Fish fetchFishByName(String name);

    Bird getBirdByName(String name);

}
