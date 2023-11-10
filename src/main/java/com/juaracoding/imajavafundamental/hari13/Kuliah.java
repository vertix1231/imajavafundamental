package com.juaracoding.imajavafundamental.hari13;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 11/8/2023 8:06 PM
@Last Modified 11/8/2023 8:06 PM
Version 1.0
*/

public class Kuliah {

    private Long id;
    private String mataPelajaran;
    private String pengajar;


    public Kuliah() {
    }

    public Kuliah(Long id, String mataPelajaran, String pengajar) {
        this.id = id;
        this.mataPelajaran = mataPelajaran;
        this.pengajar = pengajar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    public String getPengajar() {
        return pengajar;
    }

    public void setPengajar(String pengajar) {
        this.pengajar = pengajar;
    }
}

