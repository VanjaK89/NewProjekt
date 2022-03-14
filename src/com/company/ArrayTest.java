package com.company;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        String[] quartale = {"Frühlig", "Sommer", "Herbst", "Winter"};

        String qu1 = quartale[0];
        System.out.println(Arrays.toString(quartale));
        System.out.println(qu1);
        quartale[0] = "Frueling";

        System.out.println(Arrays.toString(quartale));
        System.out.println(qu1);


    }
}
