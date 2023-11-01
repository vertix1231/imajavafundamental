package com.juaracoding.imajavafundamental.testharian.Praktikum1;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 11/1/2023 6:45 PM
@Last Modified 11/1/2023 6:45 PM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("(Input) Masukkan Kata: ");
        String input = scanner.nextLine();
        int jumlahKarakter = hitungKarakter(input);
        System.out.println("(Output) Hasil: " + jumlahKarakter);
    }

    public static int hitungKarakter(String input) {

        int sumAscii=0;
        for (int i =0;i<input.length();i++){

            int charAscii = input.charAt(i);
            if(!(charAscii>=97&&charAscii<=122)){
                sumAscii +=charAscii;
            }
        }


        return sumAscii;
    }
}
