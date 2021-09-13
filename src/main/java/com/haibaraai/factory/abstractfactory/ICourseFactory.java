package com.haibaraai.factory.abstractfactory;

import com.haibaraai.factory.ICourse;
import com.haibaraai.factory.IForum;
import com.haibaraai.factory.INote;
import com.haibaraai.factory.IVideo;

//抽象工厂
public abstract class ICourseFactory {

    public abstract ICourse createCourse();

    public abstract INote createNote();

    public abstract IVideo createVideo();

    public abstract   IForum createForum();
}
