package com.Wissen;

public class ThreadEample {

    void display(){
        System.out.println(Thread.currentThread().getName() + "started");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }

        System.out.println(Thread.currentThread().getName() + "ended");
    }
    public static void main(String[] args) {
            ThreadEample te = new ThreadEample();

            Thread t1 = new Thread(()->te.display());
            t1.start();
    }
}
