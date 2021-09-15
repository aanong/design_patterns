package com.haibaraai.singleton.lazy;


import com.haibaraai.singleton.register.ContainerSingleton;

/**
 * Created by Tom.
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {


        try {
            long start = System.currentTimeMillis();
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {
                    Object obj = ContainerSingleton.getBean("com.haibaraai.singleton.lazy.Pojo");;
                    System.out.println(System.currentTimeMillis() + ": " + obj);
                }
            }, 100,16);
            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - start) + " ms.");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
