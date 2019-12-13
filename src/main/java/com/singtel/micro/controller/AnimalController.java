package com.singtel.micro.controller;

import com.singtel.b.one.Fish;
import com.singtel.micro.service.AnimalService;
import com.singtel.one.Animal;
import com.singtel.one.Bird;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/animal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping(value = "/fish")
    public Fish fetchFishByName(@RequestParam String name) {
        return animalService.fetchFishByName(name);
    }

    @GetMapping(value = "/bird")
    public Bird fetchBirdByName(@RequestParam String name) {
        return animalService.getBirdByName(name);
    }
//
//    @GetMapping(value = "/bird")
//    public Animal[] getBirds() {
//        return  animalService.fetchBirds();
//    }


}
