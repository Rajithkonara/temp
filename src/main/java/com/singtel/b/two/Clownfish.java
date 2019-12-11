package com.singtel.b.two;

import com.singtel.b.one.Fish;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Clownfish extends Fish {

    private String color = "Orange";
    private String size = "Small";
    private boolean makeJokes = true;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void setMakeJokes(boolean makeJokes) {
        this.makeJokes = makeJokes;
    }
}

