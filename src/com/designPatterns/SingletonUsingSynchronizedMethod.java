package com.designPatterns;

public class SingletonUsingSynchronizedMethod {

    private static SingletonUsingSynchronizedMethod instance;

    private SingletonUsingSynchronizedMethod(){

    }

    public static synchronized SingletonUsingSynchronizedMethod getInstance(){
        if(instance == null){
            return new SingletonUsingSynchronizedMethod();
        }
        return instance;
    }
}
