package com.haibaraai.singleton.lazy;

/**
 * 双重检查单例
 */
public class DoubleChackSingleton {
    private volatile static DoubleChackSingleton doubleChackSingleton;

    private DoubleChackSingleton(){}

    public static DoubleChackSingleton getInstance(){
        if(doubleChackSingleton!=null){
            synchronized(DoubleChackSingleton.class){
                if(doubleChackSingleton!=null){
                   doubleChackSingleton = new DoubleChackSingleton();
                }

            }
        }
        return doubleChackSingleton;

    }
}
