package com.wk.demo;

/**
 * 测试文件
 *
 * @author lijie
 * @create 2017-21-11:16
 */

public class Hello extends Parent implements DemoInte{
    private String bb;


    public String get(String aa) {
        return null;
    }

    public String set(String bb) {
        return null;
    }

    public static String hello(){
        System.out.println("aa值=" + 123 + "," + "当前类=Hello.hello()");
        return "123";
    }




}
