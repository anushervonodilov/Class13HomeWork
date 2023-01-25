package com.class13HomeWork;

import com.sun.security.jgss.GSSUtil;

public class Task5 {
    public static void main(String[] args) {

        // How would you check if String is palindrome or not? aba => true
        // Abbc => false

        String str = "olo";

        StringBuilder stringBuilder = new StringBuilder(str);
        String reversed = stringBuilder.reverse().toString();


        if (str.equals(reversed)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }

    }
}
