package com.company;

public class Proizvodjac extends  Thread{
    private Proizvod proizvod;
    private int redniBroj;

    public Proizvodjac(Proizvod proizvod, int redniBroj) {
        this.proizvod = proizvod;
        this.redniBroj = redniBroj;
    }

    public Proizvodjac() {
    }
    public void run(){
        for (int i =0; i<10; i++){
            proizvod.put(i);
            try{
                sleep((long) (Math.random()*100));
            }
            catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

}
