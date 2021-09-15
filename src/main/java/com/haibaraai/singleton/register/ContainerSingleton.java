package com.haibaraai.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className){

        try {
            if(!ioc.containsKey(className)){
                synchronized (ioc){
                    if(!ioc.containsKey(className)) {
                        Class<?> clazz = Class.forName(className);
                        Object o = clazz.newInstance();
                        ioc.put(className, o);
                        return o;
                    }
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return ioc.get(className);
    }
}
