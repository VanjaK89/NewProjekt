package com.company;

public class GrossBuchstaben {
    public static void main(String[] args) {
        String buchstaben = "Wörter starten mit Grossbuchstaben";
        char[] charArray = buchstaben.toCharArray();
        boolean foundSpace = true;


        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])){
                if(foundSpace){
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else{
                foundSpace = true;
            }
        }
            buchstaben = String.valueOf(charArray);
        System.out.println(buchstaben);
    }

}
