package com.haibaraai.factory.abstractfactory;

import com.haibaraai.factory.*;

public class JavaCourseFactory extends ICourseFactory {

    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }

    @Override
    public IForum createForum() {
        return null;
    }
}
