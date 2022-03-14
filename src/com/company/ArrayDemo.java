package com.company;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array1 = {3, 4, 5};
        int[] array2 = {7, 1, 3};
        System.out.println(array1[0] + array2[0]);
        System.out.println(array1[1] + array2[1]);
        System.out.println(array1[2] + array2[2]);
        System.out.println(array1[0] * array2[0]);
        System.out.println(array1[1] * array2[1]);
        System.out.println(array1[2] * array2[2]);

        array1[0] = 3;
        array1[1] = 4;
        array1[2] = 5;

        for (int z = 0; z < array1.length -1; z++) {
            System.out.print(array1[z] * array2[z]);
            System.out.print(",");

            System.out.println(array1[z] + array2[z]);

            System.out.print(",");

        }

        int[][] tabelle = new int[4][3];

        for (int zeile = 0; zeile < tabelle.length; ++zeile) {

            for (int spalte = 0; spalte < tabelle[zeile].length; ++spalte) {
                tabelle[zeile][spalte] = 42;

            }
            System.out.println(Arrays.toString(tabelle[zeile]));


        }
        System.out.println(Arrays.toString(tabelle));
        System.out.println(Arrays.toString(tabelle[0]));



    }
}
