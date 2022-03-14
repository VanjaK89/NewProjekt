package com.company;

import org.w3c.dom.ls.LSOutput;

public class RecursionUebung {
    public static void main(String[] args) {
        countDown(99);
        countDown(20, 5);

    }

    private static void countDown(int i) {
    }


    public static void countDown( int val, int stop){
        System.out.println(val);
        if (val > 0 && val > stop){
            countDown(val - 1, stop);
        }
        System.out.println("Ende");
    }


}

