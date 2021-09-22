package com.haibaraai.template.course;

/**
 * 课程
 */
public abstract class NetworkCourse {
    protected final void createCourse(){
        //1.发布预习资料
        this.postPreResourse();

        //2、制作PPT课件
        this.createPPT();

        //3、在线直播
        this.liveVideo();

        //4、提交课件、课堂笔记
        this.postNote();

        //5、提交源码
        this.postSource();

        //6、布置作业，有些课是没有作业，有些课是有作业的
        //如果有作业的话，检查作业，如果没作业，完成了
        if(needHomeWork()){
            checkHomework();
        }
    }

    protected abstract void checkHomework();

    public  boolean needHomeWork(){
        return false;
    }

    public final void postSource(){
        System.out.println("提交源码");
    }

    public final void postNote(){
        System.out.println("提交笔记");
    };

    public final   void liveVideo(){
        System.out.println("直播");
    };

    public final   void createPPT(){
        System.out.println("制作PPT");
    };

    protected  final void postPreResourse(){
        System.out.println("发布预习资料");
    };

}
