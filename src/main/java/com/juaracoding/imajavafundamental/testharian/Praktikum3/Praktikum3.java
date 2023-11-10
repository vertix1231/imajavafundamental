package com.juaracoding.imajavafundamental.testharian.Praktikum3;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 11/10/2023 1:17 PM
@Last Modified 11/10/2023 1:17 PM
Version 1.0
*/

import java.util.Random;

public class Praktikum3 {
    public static void main(String[] args) {
        int randomLength = getRandomNumber(12, 25);
        String generatedString = generateDynamicString(randomLength);
        System.out.println("Output: " + generatedString);
    }

    private static String generateDynamicString(int length) {
        StringBuilder result = new StringBuilder();

        // karakter 1-7
        for (int i = 0; i < 7; i++) {
            if (i % 2 == 0) {
                result.append(getRandomVowel());
            } else {
                result.append(getRandomConsonant());
            }
        }

        // character random 7-nRandom
        for (int i = 7; i < length; i++) {
            if (getRandomBoolean()) {
                result.append(getRandomVowel());
            } else {
                result.append(getRandomConsonant());
            }
        }

        // karakter pertama uppercase
        result.setCharAt(0, Character.toUpperCase(result.charAt(0)));

        return result.toString();
    }

    private static char getRandomVowel() {
        String vowels = "aeiou";
        return vowels.charAt(getRandomNumber(0, 4));
    }

    private static char getRandomConsonant() {
        String consonants = "bcdfghjklmnpqrstvwxyz";
        return consonants.charAt(getRandomNumber(0, 20));
    }

    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

}
