package com.szq.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

/*
快捷键的使用
 */
public class HelloWorld {
    private static final int INITIAL_SIZE = 10;
    private static int num;

    public static void main(String[] args) {
        //region Description
        ArrayList list = getList();

//        method1();

        System.out.println(list);
    }

    public static ArrayList getList() {
        System.out.println("helloWorld");
        System.out.println("helloWorld");

        ArrayList list = new ArrayList();
        //endregion

       /* ArrayList list1 = null;


        synchronized ()*/
        Date date = new Date();

        list.add(0, 123);
        return list;
    }

    public static void method1() {
        num = 10;

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
