package com.example.designpattern.single;

/**
 * 非线程安全创建 懒汉模式
 */
public class Singleton1 {

    private Singleton1() {};

    private static Singleton1 singleton1;

    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }


}
