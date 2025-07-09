package com.designPatterns;

public class LazySingleDesignPattern {

    private static LazySingleDesignPattern instance;

    private LazySingleDesignPattern(){

    }

    public static LazySingleDesignPattern getInstance(){
        if(instance==null){
            return new LazySingleDesignPattern();
        }
        return  instance;
    }

}
