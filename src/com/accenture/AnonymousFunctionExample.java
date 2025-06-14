package com.accenture;
interface A{
    void print(int a, int b);
}
public class AnonymousFunctionExample {

    public static void main(String[] args) {
        A a = (x, y)->System.out.println("Addition is " + (x+y));
        a.print(5,8);
    }
}
