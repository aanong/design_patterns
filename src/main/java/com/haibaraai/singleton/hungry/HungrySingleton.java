package com.haibaraai.singleton.hungry;

public class HungrySingleton {

    private  static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    private static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
