package com.designPatterns;

import java.util.Objects;

class Data{
    private int n;

    private String s;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public int hashCode() {
        return Objects.hash(n, s);
    }

    public Data(int n, String s) {
        this.n = n;
        this.s = s;
    }
}
public class HashCodeOverride {

    public static void main(String[] args) {
        Data d = new Data(10, "Pankaj");
        Data d1 = new Data(10, "Pankaj");
        System.out.println(d.hashCode());
        System.out.println(d1.hashCode());


    }
}
