package com.Problems;

class BankAccount{
    int balance=1000;
    void creditBalance(int amount){
        balance+=amount;
    }
    void debitBalance(int amount){
        balance-=amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
public class DeadLock {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();

        Thread t1 = new Thread(()->{
            synchronized (b1){
                System.out.println("t1 locked account 1");
                synchronized (b2){
                    System.out.println(" t1 locked account 2");
                    b1.debitBalance(1000);
                    b2.creditBalance(1000);
                    System.out.println(b1.toString() +" " +b2.toString());
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (b2){
                System.out.println("t2 locked account 2");
                synchronized (b1){
                    System.out.println("t2 locked account 1");
                    b2.debitBalance(100);
                    b1.creditBalance(100);
                    System.out.println(b1.toString() +" " +b2.toString());

                }
            }
        });

        t1.start();
        t2.start();
    }

}
