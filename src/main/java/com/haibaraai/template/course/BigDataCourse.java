package com.haibaraai.template.course;

public class BigDataCourse extends NetworkCourse {

    private boolean needHomeWork;

    public BigDataCourse(boolean needHomeWork) {
        this.needHomeWork = needHomeWork;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查大数据作业");
    }

    @Override
    public boolean needHomeWork() {
        return needHomeWork;
    }
}
