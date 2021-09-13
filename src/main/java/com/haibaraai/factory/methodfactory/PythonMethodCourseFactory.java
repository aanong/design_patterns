package com.haibaraai.factory.methodfactory;

import com.haibaraai.factory.ICourse;
import com.haibaraai.factory.PythonCourse;

public class PythonMethodCourseFactory implements IMethodCourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
