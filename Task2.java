package com.class13HomeWork;

public class Task2 {
    public static void main(String[] args) {

        // Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String str = "sijdbfOVDNUVBIS652065571";

        int strReplaceAll = str.replaceAll("[^A-za-z0-9]", "").length();
        System.out.println(strReplaceAll);




    }
}
