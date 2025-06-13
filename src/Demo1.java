import java.util.Scanner;

public class Demo1 {

    public  static void display(){
        synchronized(Demo1.class) {
            System.out.println(Thread.currentThread().getName() + " Started");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }

            System.out.println(Thread.currentThread().getName() + " Ended");
        }
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        Demo1 d1 = new Demo1();
        Thread t1 = new Thread(()->d.display());
        Thread t2 = new Thread(()->d1.display());
        t1.start();
        t1.start();
        t2.start();
    }
}
