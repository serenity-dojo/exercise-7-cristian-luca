package com.serenitydojo;

public abstract class Pet { //an abstract class means a class that cannot be created by itself
    private String name;

    public String getName() {
        return name;
    }

    public Pet(String name) {
        this.name = name;
    }


    public String play() {
        return "plays with something";
    }
}
