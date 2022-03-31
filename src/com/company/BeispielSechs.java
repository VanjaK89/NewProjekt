package com.company;

public class BeispielSechs {
    public static void main(String[] args) {
        int number = 0;

        while (number < 100){
            if (number % 3 == 0) {
                System.out.println(number + " teilbar");
            }
                else
                {
                    System.out.println(number + " nicht teilbar");
            }
                number++;
        }
    }
}
