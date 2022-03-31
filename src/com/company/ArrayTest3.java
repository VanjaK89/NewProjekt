package com.company;

public class ArrayTest3 {
    public static void main(String[] args) {
        String[] smartphoneName = {"Samsung A51", "iPhone 13", "Huawei 15", "Nokia 3210", "Xiaomi 7T"};
        int[][] smartphoneVerkaufszahlen = {{2100, 3100, 4100, 1100},
                                                {200, 300, 400, 100},
                                            {2010, 3010, 4010, 1010},
                                            {2001, 3001, 4001, 1001},
                                           {2011, 3011, 4011, 1011}};
        String sName = erfolgleichsteSmartphoneQuartal(smartphoneVerkaufszahlen, smartphoneName,4);
        System.out.println("----------");
        sName = erfolgleichsteSmartphoneQuartal(smartphoneVerkaufszahlen, smartphoneName,4);
        System.out.println(sName);
        System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufszahlen, 1));
        System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufszahlen, 3));
        System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufszahlen, 4));


        for (int sNr = 0; sNr < smartphoneName.length; ++sNr) {
            System.out.println(smartphoneName[sNr]);

        }
        //for each loop
        for (String smartphone : smartphoneName) {
            System.out.println(smartphone);
        }
        //einmal methode aufrufen, ich bekomme elemente aus meinen array, nur sachen ausgeben möchten.
        //wenn ich was ändern möchte wenn ich zu felder gehen möchte dann nehme ich die obere for schleife


        for (int sIndex = 0; sIndex < smartphoneVerkaufszahlen.length; ++sIndex) {
            System.out.println(smartphoneName[sIndex] + ": ");

            for (int qIndex = 0; qIndex < smartphoneVerkaufszahlen[sIndex].length; ++qIndex) {

                System.out.print(smartphoneVerkaufszahlen[sIndex][qIndex] + " ");
            }
            System.out.println();
        }
    }



    public static int verkaufteAnzahlJahr(int[][] zahlen, int welchesSmartphone) {

        if (welchesSmartphone < 0 || welchesSmartphone >= zahlen.length) {
            return -1;
        }
        int summe = 0;
        for (int q = 0; q < zahlen[welchesSmartphone].length; ++q) {
            summe += zahlen[welchesSmartphone][q];

        }
        return summe;
   }

    public static String erfolgleichsteSmartphoneQuartal(int[][] zahlen, String[] namen, int quartalNr) {
        if (quartalNr < 1 || quartalNr > 4) {
            return "";
        }
        //zahlen[][]quartalNr - 1
        //erste Zahl ist die grösste zahl
        // zugleich gehen wir davon aus, das es immer zumindest eine Zahl im array gibt

        int IndexGr = 0;
        int zahlGr = zahlen[0][quartalNr - 1];
        for (int z = 1; z < zahlen.length; z++) {
            if (zahlen[z][quartalNr - 1] > zahlGr) {
                zahlGr = zahlen[z][quartalNr - 1];
                IndexGr = z;

            }
        }
        return namen[IndexGr];

    }
}



