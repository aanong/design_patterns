package com.haibaraai.template.course;

public class NetworkCourseTest {
    public static void main(String[] args) {
        NetworkCourse bigDataCourse = new BigDataCourse(false);
        bigDataCourse.createCourse();
        JavaCourse javaCourse = new JavaCourse(true);
        javaCourse.createCourse();
    }
}
