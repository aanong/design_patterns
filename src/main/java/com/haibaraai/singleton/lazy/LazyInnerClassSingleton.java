package com.haibaraai.singleton.lazy;

/**
 * 静态内部类
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){}

    private final static LazyInnerClassSingleton getInstance(){
        return LazyHolder.lazy;
    }

    private static class LazyHolder{
        private  static final LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }

}
