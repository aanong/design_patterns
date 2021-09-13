package com.haibaraai.factory.simplefactory;

import com.haibaraai.factory.ICourse;
import com.haibaraai.factory.JavaCourse;

public class SimpleFactoryTest {
    public static void main(String[] args)  {

        ICourse iCourse = CourseFactory.create(JavaCourse.class);
        iCourse.record();
    }
}
