package com.company;

public class Potrosac extends Thread{
    private Proizvod proizvod;
    private  int redniBroj;

    public Potrosac(Proizvod proizvod, int redniBroj) {
        this.proizvod = proizvod;
        this.redniBroj = redniBroj;
    }

    public Potrosac() {
    }
    public void  run(){
        int uzetaVrednost =0;
        for (int i=0; i<10;i++){
            uzetaVrednost = proizvod.get();
        }
    }
}
