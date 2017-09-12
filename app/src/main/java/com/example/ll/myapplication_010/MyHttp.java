package com.example.ll.myapplication_010;

public class MyHttp {
    private static  MyHttp http;
    private MyHttp(){

    }
    public static synchronized MyHttp getHttp(){
        if(http==null){
            http=new MyHttp();
        }
        return http;
    }
    public void get(){

    }
}
