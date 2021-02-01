package com.sihabeer.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    /**
     * 获取服务器当前时间yyyy-MM-dd hh:mm:ss.SSS
     * @return
     */
    public static String getDateTime(){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }
}
