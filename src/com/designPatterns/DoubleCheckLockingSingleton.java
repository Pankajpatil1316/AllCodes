package com.designPatterns;

public class DoubleCheckLockingSingleton {

    private static DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton(){

    }

    private static DoubleCheckLockingSingleton getInstance(){
        if(instance==null){
            synchronized (DoubleCheckLockingSingleton.class){
                if(instance==null){
                    return new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}
