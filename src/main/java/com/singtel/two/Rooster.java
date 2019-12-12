package com.singtel.two;

import com.singtel.bonus.LanguageUtils;
import com.singtel.one.Chicken;
import com.singtel.one.SoundBehaviour;

public class Rooster extends Chicken implements SoundBehaviour {

    public void makeSound() {
        System.out.println("Cock-a-doodle-doo");
    }

    public void makeNativeSound(String language) {
        System.out.println(LanguageUtils.translate(language));
    }


}
