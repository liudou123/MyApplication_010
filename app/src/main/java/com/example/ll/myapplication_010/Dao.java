package com.example.ll.myapplication_010;

public class Dao {
    private static Dao dao;
    private Dao(){

    }
    public static synchronized Dao getDao(){
      if(dao==null){
         dao=new Dao();
      }
        return dao;
    }
    public Bean get(){

        return null;
    }

}
