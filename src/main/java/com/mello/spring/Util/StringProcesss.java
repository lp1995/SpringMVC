package com.mello.spring.Util;

/**
 * Created by lenovo on 2017/6/29.
 */
public class StringProcesss {
    public static boolean isNull(String theString){
        if(theString == null || theString.equals("null") || theString.equals("") || theString.equals("undefined")){
            return true;
        }
        else{
            return false;
        }
    }

    public static void testOutput(){
        System.out.println("************************************************");
        System.out.println("************************************************");
        System.out.println("************************************************");
        System.out.println("************************************************");
        System.out.println("************************************************");
        System.out.println("************************************************");
    }

    public static void testOutput(String result){
        System.out.println("************************************************");
        System.out.println("************************************************");
        System.out.println("************************************************");
        System.out.println(result);
        System.out.println("************************************************");
        System.out.println("************************************************");
        System.out.println("************************************************");
    }
}
