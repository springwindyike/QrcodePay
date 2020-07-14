package com.jiewen.qrcodepay.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by user on 2018/8/13.
 */

public class DateUtil {
    /***
     * 描述：获取当前系统时间
     * 格式：yyyyMMddHHmmss
     * 返回：String时间
     */
    public static String getCurrentSysTime(String format){
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        Date curDate =  new Date(System.currentTimeMillis());
        return formatter.format(curDate);
    }

    /***
     * 描述：获取当前时间戳
     * 返回：long
     */
    public static long getTimestamp(){
        return new Date().getTime();
    }

    /***
     * 描述：获取时间差，以小时为单位
     * 参数：time1-时间1、time2-时间2、returnType-1代表返回天数差，2代表小时差，3代表分钟差
     * 返回：int时间差, 返回-1失败
     */
    public static long timeDifference(String time1, String time2, int returnType){
        long diff, days, hours, minutes;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date1 = dateFormat.parse(time1);
            Date date2 = dateFormat.parse(time2);
            diff = date1.getTime() - date2.getTime();//这样得到的差值是微秒级别
            days = diff / (1000 * 60 * 60 * 24);
            hours = (diff-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);
            minutes = (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60))/(1000* 60);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        if (returnType == 1)
            return days;
        else if (returnType == 2)
            return hours;
        else if (returnType == 3)
            return minutes;
        else
            return -1;
    }

    /**
     * 获取前n天日期、后n天日期
     *
     * @param distanceDay 前几天 如获取前7天日期则传-7即可；如果后7天则传7
     * @return
     */
    public static Date getOldDate(int distanceDay, String format) {
        SimpleDateFormat dft = new SimpleDateFormat(format);
        Date beginDate = new Date();
        Calendar date = Calendar.getInstance();
        date.setTime(beginDate);
        date.set(Calendar.DATE, date.get(Calendar.DATE) + distanceDay);
        Date endDate = null;
        try {
            endDate = dft.parse(dft.format(date.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return endDate;
    }
    /***
     * 描述：将Data转化为string
     * 参数：参数1-Data数据，参数2-时间格式
     * 返回：转化后的String
     */
    public static String Data2String(Date date, String strTimeStyle){
        String strData = "";
        if (null == date){
            return "未得到日期";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(strTimeStyle);
        strData = sdf.format(date);
        return  strData;
    }

    /***
     * 描述：转化时间格式
     * strTime:20180101154510
     * 返回：转化后的String
     */
    public static String Time2Time(String strTimeIn){
        String strTimeOut = "";//2018-01-01 15:45:10"
        strTimeOut = strTimeIn.substring(0,4) + "-" + strTimeIn.substring(4,6) + "-" + strTimeIn.substring(6,8)
                + " " + strTimeIn.substring(8,10) + ":" + strTimeIn.substring(10,12) + ":" + strTimeIn.substring(12,14);
        return strTimeOut;
    }

    /***
     * 描述：String 转化成 Date
     * 返回：Date
     */
    public static Date String2Date(String strDate, String strDateType){
        Date date = null;
        DateFormat format = new SimpleDateFormat(strDateType);
        try {
            date = format.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    //获取系统的年份
    public static String getSysYear() {
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        return year;
    }

}
