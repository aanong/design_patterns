package com.haibaraai.singleton.register;

/**
 * 枚举单例
 */
public enum  EnumSingleton  {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){

        return INSTANCE;
    }

}
