package com.haibaraai.singleton.lazy;

//简单懒汉式单例
public class LazySimpleSingleton {
    private volatile static LazySimpleSingleton lazySimpleSingleton ;

    private LazySimpleSingleton(){}

    private synchronized static LazySimpleSingleton getInstance(){
        lazySimpleSingleton = new LazySimpleSingleton();
        return lazySimpleSingleton;
    }

}
