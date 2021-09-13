package com.haibaraai.factory.methodfactory;

import com.haibaraai.factory.ICourse;
import com.haibaraai.factory.JavaCourse;

public class JavaCourseFactory implements IMethodCourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
