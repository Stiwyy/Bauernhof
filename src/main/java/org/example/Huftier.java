package org.example;

public abstract class Huftier extends Tier {
    private int bodySize;

    protected Huftier(String name, int age, int bodySize) {
        super(name, age);
        this.bodySize = bodySize;
    }

    public int getBodySize() {
        return bodySize;
    }

    public void setBodySize(int bodySize) {
        this.bodySize = bodySize;
    }
}
