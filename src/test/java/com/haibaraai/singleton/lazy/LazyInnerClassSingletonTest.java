package com.haibaraai.singleton.lazy;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {

        try {
            //反射方式破坏
            Class<?> clazz = LazyInnerClassSingleton.class;

            Constructor c = clazz.getDeclaredConstructor();
            //设置访问权限
            c.setAccessible(true);

            Object o = c.newInstance();


        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
