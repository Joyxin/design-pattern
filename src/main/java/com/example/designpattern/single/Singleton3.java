package com.example.designpattern.single;

/**
 * 线程安全 懒汉模式  双检锁/双重校验锁（DCL，即 double-checked locking）
 */
public class Singleton3 {

    private Singleton3() {};

    private volatile static Singleton3 singleton3;

    public static Singleton3 getInstance() {
        if (singleton3 == null) {
            synchronized (Singleton3.class) {
                if (singleton3==null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
