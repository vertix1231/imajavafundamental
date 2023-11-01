package com.juaracoding.imajavafundamental.testharian.Praktikum1;

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("(Input) Masukkan Kata: ");
        String input = scanner.nextLine();
        String inputlowe =input.toLowerCase();
        String inputupp =input.toUpperCase();
        int jumlahKarakter = hitungKarakter(input);
        System.out.println("(Output) Hasil: " + jumlahKarakter);
    }

    public static int hitungKarakter(String input) {

        int sumascii=0;
        for (int i =0;i<input.length();i++){

            int charascii = input.charAt(i);
            if(!(charascii>=97&&charascii<=122)){
                System.out.println(charascii+" "+ input.charAt(i));
                sumascii +=charascii;
            }
        }


        return sumascii;
    }
}
