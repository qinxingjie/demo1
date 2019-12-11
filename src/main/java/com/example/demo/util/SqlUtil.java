package com.example.demo.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author qinxingjie
 * @date 2019/12/10 16:26
 */
public class SqlUtil {
    public static String getCurrentDate(){
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss"));
    }

    public static void main(String[] args){
        System.out.println(getCurrentDate());
    }
}
