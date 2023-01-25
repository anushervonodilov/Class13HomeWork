package com.class13HomeWork;

public class Task6 {
    public static void main(String[] args) {

        // How would you swap 2 strings without a temporary variable?

        String str1 = "Hello";
        String str2 = "Bye";

        System.out.println("Before: " + str1);
        System.out.println("Before: " + str2);

        str1 = str1 + str2;

        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After: " + str1);
        System.out.println("After: " + str2);



    }
}
