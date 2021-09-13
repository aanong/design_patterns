package com.haibaraai.factory.abstractfactory;

import com.haibaraai.factory.ICourse;
import com.haibaraai.factory.INote;
import com.haibaraai.factory.IVideo;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory iCourseFactory = new JavaCourseFactory();
        ICourse course = iCourseFactory.createCourse();
        INote note = iCourseFactory.createNote();
        IVideo video = iCourseFactory.createVideo();
        course.record();
        note.record();
        video.record();
    }
}
