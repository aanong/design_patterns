package com.haibaraai.singleton.lazy;

import com.haibaraai.singleton.register.EnumSingleton;

public class EnumSingletonTest {
    public static void main(String[] args) {

        EnumSingleton instance = EnumSingleton.getInstance();

        instance.setData(new Object());
        System.out.println(instance.getData());

        EnumSingleton instance1 = EnumSingleton.getInstance();

        instance1.setData(new Object());

        System.out.println(instance.getData());


        System.out.println(instance1.getData());

        System.out.println(instance.getData()==instance1.getData());


    }
}
