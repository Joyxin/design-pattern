package com.example.designpattern.single;


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Crack {

    public static void main(String[] args) {

        //通过构造破解
        Singleton1 a = null;
        try {
            Constructor constructor = Singleton1.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            a = (Singleton1) constructor.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        //反序列化机制破解单例模式（枚举除外）
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        //将s1写入本地某个路径
        try {
            FileOutputStream fos = new FileOutputStream("本地某个路径下文件");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            //从本地某个路径读取写入的对象
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("和上面的本地参数路径相同"));
            Singleton1 s3= (Singleton1) ois.readObject();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);//s3是一个新对象
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
