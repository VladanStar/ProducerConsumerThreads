package com.company;

public class Proizvod {
    private int sadrzaj;
    private boolean dostupan;

    public synchronized int get(){
        if(!dostupan){
            try{
                wait();
            }
            catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Uzima se vrednost " + sadrzaj);
        dostupan = false;
        notifyAll();

        return sadrzaj;
    }
    public  synchronized void put(int value){
        if(dostupan){
            try{
                wait();
            }
            catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Stavlja se vrednost " + value);
        sadrzaj = value;
        dostupan = true;
        notifyAll();
    }
}
