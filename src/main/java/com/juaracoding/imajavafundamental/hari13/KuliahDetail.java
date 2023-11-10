package com.juaracoding.imajavafundamental.hari13;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 11/8/2023 8:03 PM
@Last Modified 11/8/2023 8:03 PM
Version 1.0
*/

import java.util.ArrayList;
import java.util.List;

public class KuliahDetail {

    /*
        POJO
        BEAN
        SETTER GETTER
        MODEL
     */
    public static void main(String[] args) {
        int [] intArr = new int[4];
        intArr[0] = 0;
        intArr[1] = 1;
        intArr[2] = 2;
        intArr[3] = 3;

        Kuliah [] kuliahArr = new Kuliah[100];
        kuliahArr[0] = new Kuliah();
        kuliahArr[0].setId(2L);
        kuliahArr[0].setPengajar("Joe");
        kuliahArr[0].setMataPelajaran("Fisika");

        kuliahArr[1] = new Kuliah();
        kuliahArr[1].setId(3L);
        kuliahArr[1].setPengajar("Allysa");
        kuliahArr[1].setMataPelajaran("Matematika");

        System.out.println("kuliahArr[0] "+kuliahArr[0]);//776ec8df
        System.out.println("kuliahArr[1] "+kuliahArr[1]);//4eec7777

        System.out.println("ID"+"\t"+"PENGAJAR"+"\t"+"MATA PELAJARAN");
//        for(int i=0 ; i<kuliahArr.length;i++)
//        {
//            System.out.print(kuliahArr[i].getId()+"\t");
//            System.out.print(kuliahArr[i].getPengajar()+"\t\t\t");
//            System.out.print(kuliahArr[i].getMataPelajaran()+"\t");
//            System.out.println();
//        }
//        System.out.println("====================================================");
////        Kuliah [] kuliahArr2 = new Kuliah[2];
////        Kuliah [] kuliahArr2 = new Kuliah[2];
//        kuliahArr[0] = new Kuliah(10L,"Irsyad","Bahasa Inggris");
//        kuliahArr[1] = new Kuliah(11L,"Regi","Matematika Diskrit");
//
//        for(int i=0 ; i<kuliahArr.length;i++)
//        {
//            System.out.print(kuliahArr[i].getId()+"\t");
//            System.out.print(kuliahArr[i].getPengajar()+"\t\t\t");
//            System.out.print(kuliahArr[i].getMataPelajaran()+"\t");
//            System.out.println();
//        }
//
//        System.out.println("====================================================");
//        for(int i=0 ; i<kuliahArr.length;i++)
//        {
//            System.out.print(kuliahArr[i].getId()+"\t");
//            System.out.print(kuliahArr[i].getPengajar()+"\t\t\t");
//            System.out.print(kuliahArr[i].getMataPelajaran()+"\t");
//            System.out.println();
//        }

        String str = new String("w");
        System.out.println("Nilai Str -> "+str);
        ArrayList<Kuliah> arrList = new ArrayList<>();
        Kuliah kuliahObj = new Kuliah();//3b07d329
        kuliahObj.setId(1L);
        kuliahObj.setPengajar("Paul");
        kuliahObj.setMataPelajaran("Bahasa Indonesia");
        arrList.add(new Kuliah(1L,"Paul","Bahasa Indonesia"));

        kuliahObj = new Kuliah();//41629346
        kuliahObj.setId(2L);
        kuliahObj.setPengajar("Aziz");
        kuliahObj.setMataPelajaran("Bahasa Melayu");
        arrList.add(kuliahObj);

        kuliahObj = new Kuliah();//41629346
        kuliahObj.setId(3L);
        kuliahObj.setPengajar("Virdha");
        kuliahObj.setMataPelajaran("Bahasa Jepang");
        arrList.add(kuliahObj);//1 MB

//        ArrayList<Kuliah> arrList2 = arrList;//2MB
        ArrayList<Kuliah> arrList2 = new ArrayList<>();//2MB
        kuliahObj = new Kuliah();//3b07d329
        kuliahObj.setId(1L);
        kuliahObj.setPengajar("Paul");
        kuliahObj.setMataPelajaran("Bahasa Indonesia");
        arrList2.add(new Kuliah(1L,"Paul","Bahasa Indonesia"));

        kuliahObj = new Kuliah();//41629346
        kuliahObj.setId(2L);
        kuliahObj.setPengajar("Aziz");
        kuliahObj.setMataPelajaran("Bahasa Melayu");
        arrList2.add(kuliahObj);

        kuliahObj = new Kuliah();//41629346
        kuliahObj.setId(3L);
        kuliahObj.setPengajar("Virdha");
        kuliahObj.setMataPelajaran("Bahasa Jepang");
        arrList2.add(kuliahObj);//1 MB
//        arrList2.clear();
//        System.out.println("arrList get(0) -> "+arrList.get(0));
        System.out.println("arrList  -> "+arrList);
        System.out.println("arrList2 -> "+arrList2);
//        for (int i=0;i<arrList.size();i++)
//        {
//            System.out.println(arrList.get(i));
//        }

//        System.out.println("arrList2 get(0) -> "+arrList2.get(0));
//        for (int i=0;i<arrList2.size();i++)
//        {
//            System.out.println(arrList2.get(i));
//        }

    }

    public List<Kuliah> getList(){
        List<Kuliah> ls = new ArrayList<>();
        ls.add(new Kuliah());
        ls.add(new Kuliah());
        ls.add(new Kuliah());
        return ls;
    }
}
