package com.haibaraai.singleton.lazy;

import java.io.Serializable;

/**
 * 静态内部类
 */
public class LazyInnerClassSingleton   implements Serializable {

    private LazyInnerClassSingleton(){
        if(LazyHolder.lazy!=null){
            throw  new RuntimeException("不允许创建多个实例");

        }

    }

    public final static LazyInnerClassSingleton getInstance(){
        return LazyHolder.lazy;
    }

    private static class LazyHolder{
        private  static final LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }

    private  Object readResolve(){
        return  LazyHolder.lazy;
    }

}
