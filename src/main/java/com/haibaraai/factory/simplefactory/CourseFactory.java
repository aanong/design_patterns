package com.haibaraai.factory.simplefactory;


import com.haibaraai.factory.ICourse;

/**
 * 简单工厂
 */
public class CourseFactory {
    public static ICourse create(Class clazz)  {
        if(clazz==null){
            return null;
        }
        try {
            ICourse iCourse = (ICourse) clazz.newInstance();
            return iCourse;
        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
