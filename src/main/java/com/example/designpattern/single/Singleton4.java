package com.example.designpattern.single;

/**
 * 懒汉模式 效率比较高不会在刚开始的初始化对象 占据资源。
 */
public class Singleton4 {

    private Singleton4() {
    }

    private static class Holder {
        private static Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return Holder.instance;
    }
}
