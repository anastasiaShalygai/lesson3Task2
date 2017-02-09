package com.nastya_shalygai.java.lesson3.task2.demo;

import com.nastya_shalygai.java.lesson3.task2.myEnum.MyEnumClothes;

public class Demo {

    public static void main(String[] args) {
        MyEnumClothes cloth = MyEnumClothes.JEANS;
        System.out.println(cloth.ordinal());
        System.out.println(cloth.name());

        System.out.println("\n" + cloth.getSizeMore46());
        System.out.println(cloth.getColour() + "\n");

        for (MyEnumClothes clothes : MyEnumClothes.values()) {
            System.out.println(clothes);
        }
    }
}
