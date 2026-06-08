package com.tutoring.common.utils;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import java.time.LocalDateTime;

public class DateUtilities {

    public static String now(){

        //return LocalDateTime.now().toString();
      // return Instant.now().toString();
       return LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
