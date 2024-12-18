package org.example;

public class Pferd extends Huftier {

    public Pferd(String name, int age, int bodySize) {
        super(name, age, bodySize);
    }

    @Override
    public void speak() {

    }

    @Override
    public int move() {
        return 0;
    }
}
