package com.heyue.util;


public class ProduceNumUtil {
    public static String getCode(String prefix){
        return  prefix+System.currentTimeMillis();
    }
}
