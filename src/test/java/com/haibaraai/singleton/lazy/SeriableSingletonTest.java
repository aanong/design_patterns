package com.haibaraai.singleton.lazy;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriableSingletonTest {
    public static void main(String[] args) {
        LazyInnerClassSingleton s0 = LazyInnerClassSingleton.getInstance();
        LazyInnerClassSingleton S1 =null;

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("LazyInnerClassSingleton.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s0);
            objectOutputStream.flush();
            objectOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream("LazyInnerClassSingleton.obj");

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            S1 = (LazyInnerClassSingleton)objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(S1==s0);


        }catch (Exception e){
            e.printStackTrace();
        }




    }
}
