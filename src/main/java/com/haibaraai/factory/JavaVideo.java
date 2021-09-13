package com.haibaraai.factory;

public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("java录播视频");
    }
}
