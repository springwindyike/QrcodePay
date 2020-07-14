package com.jiewen.qrcodepay.util;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import com.jiewen.qrcodepay.MyApplication;

import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by user on 2019/8/6.
 */

public class LogUtil {

    @SuppressWarnings("unused")
    private static char LOG_TYPE = 'v'; // 输入日志类型，w代表只输出告警信息等，v代表输出所有信息
    private static Boolean LOG_SWITCH = true; // 日志文件总开关
    private static Boolean LOG_WRITE_TO_FILE = true; // 日志写入文件开关

    private static int SDCARD_LOG_FILE_SAVE_DAYS = 7; // sd卡中日志文件的最多保存天数

    private static String LOGFILENAME = ".txt"; // 本类输出的日志文件名称
    //    private static String LOG_PATH_SDCARD_DIR = Environment.getDataDirectory()+"/log/";
    public static String LOG_PATH_SDCARD_DIR = Environment.getExternalStorageDirectory()
            .getAbsolutePath()+"/log/";
    // 日志文件在sdcard中的路径
    @SuppressLint({ "SdCardPath", "SimpleDateFormat" })
    private static SimpleDateFormat LogSdf = new SimpleDateFormat(
            "yyyy-MM-dd HH:mm:ss"); // 日志的输出格式

    private static SimpleDateFormat LogDir = new SimpleDateFormat(
            "yyyy-MM-dd"); // 文件名格式

    /**
     * 打开日志文件并写入日志
     *
     * @return
     * **/
    public static void writeLogToFile(String message) {
        Date nowtime = new Date();
        String needWriteFiel = LogDir.format(nowtime);
        String needWriteMessage = message;

        File logdir = new File(LOG_PATH_SDCARD_DIR);// 如果没有log文件夹则新建该文件夹
        if (!logdir.exists()) {
            logdir.mkdirs();
        }
        File file = new File(LOG_PATH_SDCARD_DIR, needWriteFiel + LOGFILENAME);
        Log.i("ldy","日志文件名="+(LOG_PATH_SDCARD_DIR + needWriteFiel + LOGFILENAME));
        try {
            FileWriter filerWriter = new FileWriter(file, true);// 后面这个参数代表是不是要接上文件中原来的数据，不进行覆盖
            BufferedWriter bufWriter = new BufferedWriter(filerWriter);
            bufWriter.write(needWriteMessage);
            bufWriter.newLine();
            bufWriter.close();
            filerWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //读取文件夹下所有文件
    public static ArrayList getPathFilesName() {
        File path = new File(LOG_PATH_SDCARD_DIR);// 获得路径
        // File path = new File("/mnt/sdcard/");
        File[] files = path.listFiles();// 读取文件
        ArrayList<String> filesName = new ArrayList<>();
        if (null != files){
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName();
                String file = null;
                if (fileName.endsWith(".txt")) {
                    file = fileName.substring(0,
                            fileName.lastIndexOf(".")).toString();
                    filesName.add(file);
                }
//                if (file != null) {
//                    //file就是我想要获得的以.txt结尾的文件的文件名了
//                }
            }
        }
        return filesName;
    }

    /**
     * 删除制定的日志文件
     * */
    public static void delFile() {
//        String needDelFiel = LogDir.format(getDateBefore());
        ArrayList<String> fileNames = getFilesName();
        for(int i=0;i<fileNames.size();i++){
            Log.i("ldy","删除的文件名="+fileNames.get(i));
            File file = new File(LOG_PATH_SDCARD_DIR, fileNames.get(i) + LOGFILENAME);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /**
     * 得到现在时间前的几天日期，用来得到需要删除的日志文件名
     * */
    private static Date getDateBefore() {
        Date nowtime = new Date();
        Calendar now = Calendar.getInstance();
        now.setTime(nowtime);
        String dayStr = MyApplication.getInstance().getUserSetting(MyApplication.deleteLogTag);
        if (StringUtils.isEmpty(dayStr)){
            now.set(Calendar.DATE, now.get(Calendar.DATE)
                    - SDCARD_LOG_FILE_SAVE_DAYS);
        }else{
            now.set(Calendar.DATE, now.get(Calendar.DATE)
                    - Integer.parseInt(dayStr));
        }
        return now.getTime();
    }

    //读取文件夹下指定文件
    private static ArrayList getFilesName() {
        File path = new File(LOG_PATH_SDCARD_DIR);// 获得路径
        // File path = new File("/mnt/sdcard/");
        File[] files = path.listFiles();// 读取文件
        ArrayList<String> filesName = new ArrayList<>();
        if (null != files){
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName();
                String file = null;
                if (fileName.endsWith(".txt")) {
                    file = fileName.substring(0,
                            fileName.lastIndexOf(".")).toString();//2019-02-12
                    if (getDateBefore().getTime() > DateUtil.String2Date(file,"yyyy-MM-dd").getTime()){
                        filesName.add(file);
                    }
                }
//                if (file != null) {
//                    //file就是我想要获得的以.txt结尾的文件的文件名了
//                }
            }
        }
        return filesName;
    }

    //打印bundle，按照json输出
    public static void printBundle(String tag, Bundle bundle){
        try{
            if (null != bundle){
                JSONObject jsonObject = new JSONObject();
                for (String key:bundle.keySet()){
                    jsonObject.put(key, String.valueOf(bundle.get(key)));
                }
                String str = "交易返回数据: "+ tag + ":" + jsonObject.toString() +"\n";
                LogUtil.writeLogToFile(str);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
