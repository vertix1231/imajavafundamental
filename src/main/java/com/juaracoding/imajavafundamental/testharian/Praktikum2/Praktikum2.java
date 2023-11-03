package com.juaracoding.imajavafundamental.testharian.Praktikum2;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 11/3/2023 1:56 PM
@Last Modified 11/3/2023 1:56 PM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        System.out.println("Output : Rata-rata:  "+hitungRataAngka());
    }
    public static double hitungRataAngka(){
        Scanner sc = new Scanner(System.in);
        int count=0;
        double sum = 0;
        while (sc.hasNextDouble()){
            double angka = sc.nextDouble();
            sum+=angka;
            count++;
        }
        double result = sum/count;
        return result;
    }
}
