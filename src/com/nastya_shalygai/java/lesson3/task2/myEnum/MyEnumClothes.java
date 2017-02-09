package com.nastya_shalygai.java.lesson3.task2.myEnum;

/**
 * Created by Anastasiya on 09.02.2017.
 */
public enum MyEnumClothes {
    DRESS("pink", 42),
    JACKET("brown", 48),
    JEANS("blue", 50),
    BLOUSE("red", 44);

    private String colour;
    private int size;

    MyEnumClothes(String colour, int size) {
        this.colour = colour;
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public boolean getSizeMore46() {
        if (size > 46) return true;
        else return false;
    }
}
