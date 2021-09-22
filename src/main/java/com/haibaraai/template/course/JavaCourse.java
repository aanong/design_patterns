package com.haibaraai.template.course;

public class JavaCourse extends NetworkCourse {

    private boolean needHomeWork;

    public JavaCourse(boolean needHomeWork) {
        this.needHomeWork = needHomeWork;
    }

    @Override
    public boolean needHomeWork() {
        return needHomeWork;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查java课程");
    }
}
