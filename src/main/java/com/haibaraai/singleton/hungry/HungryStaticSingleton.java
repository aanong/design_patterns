package com.haibaraai.singleton.hungry;

public class HungryStaticSingleton {
    private static final HungryStaticSingleton hngryStaticSingleton ;
    static {
        hngryStaticSingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return hngryStaticSingleton;
    }
}
