package com.singtel.d;

import com.singtel.one.WalkBehaviour;

public class Catterpillar extends Insect implements WalkBehaviour {

    @Override
    public void walk() {
        System.out.println("I am crawl");
    }
}
