package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Proizvod proizvod = new Proizvod();
        Proizvodjac p1 = new Proizvodjac(proizvod,1);
        Potrosac c1 = new Potrosac(proizvod,1);
        p1.start();
        c1.start();
    }
}
