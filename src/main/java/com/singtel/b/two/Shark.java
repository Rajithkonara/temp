package com.singtel.b.two;

import com.singtel.b.one.Fish;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Shark extends Fish {

    private String color = "Grey";
    private String size = "Large";
    private boolean predator = true;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void setPredator(boolean predator) {
        this.predator = predator;
    }

}
