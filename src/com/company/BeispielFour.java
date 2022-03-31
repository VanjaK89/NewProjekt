package com.company;

public class BeispielFour {
    public static void main(String[] args) {
        rideTheBus(1, 20);
        rideTheBus(6, 0);

        int station = 0;
        int minuten;
        switch (station) {

            case 1:
                minuten = 20;
                break;

            case 2:
                minuten = 16;
                break;

            case 3:
                minuten = 15;
                break;
            case 4:
                minuten = 10;
                break;
            case 5:
                minuten = 3;
                break;
            default:
                minuten = 0;
                System.out.println("Bitte gleich aussteigen!");
                break;
        }
        System.out.println("Bei station " + station + " sind noch " + minuten + " minuten." );

        }

         public static void rideTheBus(int station, int minuten){

        if (station <= 5 && minuten > 0) {
            System.out.println("Bei station " + station + " sind noch " + minuten + " minuten." );
        }
        else
        {System.out.println("Gleich aussteigen!!!");}
    }




}
