package com.haibaraai.factory.methodfactory;

import com.haibaraai.factory.ICourse;

/**
 * 工厂方法测试类
 */
public class MethodFactoryTest {
    public static void main(String[] args) {
        IMethodCourseFactory iMethodCourseFactory = new PythonMethodCourseFactory();
        ICourse creste = iMethodCourseFactory.create();
        creste.record();

    }
}
