package com.example.designpattern.single;

import java.io.ObjectStreamException;

/**
 * 饿汉模式
 */
public class Singleton2 {

    private static final Singleton2 singleton2 = new Singleton2();

    private Singleton2() {
        //在构造器中加个逻辑判断,多次调用抛出异常
        if(singleton2 != null){
            throw new RuntimeException();
        }
    }

    public static Singleton2 getInstance() {
        return singleton2;
    }

    //反序列化定义该方法，则不需要创建新对象
    private Object readResolve() throws ObjectStreamException {
        return singleton2;
    }

}

