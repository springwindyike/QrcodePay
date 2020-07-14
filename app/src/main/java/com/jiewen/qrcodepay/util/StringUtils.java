/*
 */
package com.jiewen.qrcodepay.util;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static android.content.ContentValues.TAG;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 */
public class StringUtils
{
    /**
     * 私有化构造器
     */
    private StringUtils()
    {
    }
    
    /**
     * 处理null的情况
     * 
     * @param s string
     * @return 处理后的string
     * @see [类、类#方法、类#成员]
     */
    public static String dealNull(String s)
    {
        return null == s ? "" : s;
    }
    
    /**
     * 是否为空,null/""都被当做空，只要有一个为空就返回true
     * 
     * @param sArr string
     * @return isNull?
     * @see [类、类#方法、类#成员]
     */
    public static boolean isEmpty(String... sArr)
    {
        if (sArr == null)
        {
            return true;
        }
        
        for (String str : sArr)
        {
            if (null == str || str.trim().length() == 0)
            {
                return true;
            }
        }
        return false;
        
    }
    
    /**
     * trim掉源字符串两头的不可见字符
     * <p>
     * 如果没有匹配到，返回源字符串
     * <p>
     * 
     * @param source 源字符串
     * @return 源字符串左右两侧的不可见字符被去掉
     * @see [类、类#方法、类#成员]
     */
    public static String trimNonVisibleCharator(String source)
    {
        if (null == source)
        {
            return "";
        }
        
        Pattern p = Pattern.compile("\\s*(\\S*)\\s*");
        Matcher m = p.matcher(source);
        if (m.matches())
        {
            return m.group(1);
        }
        else
        {
            return source;
        }
    }
    
    /**
     * 在一层上进行排序 我们对a{b{},c{d{},e{}}} 这样的按照parent来分组。
     * <p>
     * 上面的字符串等价于如下的树
     * <p>
     * a b c d e
     * <p>
     * 该函数会将其解析成如下数组
     * <p>
     * [a], [b, c], [d, e]
     * <p>
     * 
     * @param source String
     * @return List<List<String>>
     * @see [类、类#方法、类#成员]
     */
    public static List<List<String>> parseToSibling(String source)
    {
        Stack<String> stack = new Stack<String>();
        // 遍历时的层元素栈，存放各层元素list，而每层的元素list又都包含n个元素。
        List<List<String>> elements = new LinkedList<List<String>>();
        
        // 待分析字符串的字符数组
        char sourceChareArray[] = source.toCharArray();
        
        // 遍历字符串时的标记点，起始和结束位置。
        int begin = 0;
        int end = 0;
        
        // 遍历字符串，即是将字符串转化为栈内元素的过程
        for (; end < sourceChareArray.length; end++)
        {
            if (sourceChareArray[end] == '{')
            {
                String a = new String(sourceChareArray, begin, end - begin);
                if (a.length() != 0)
                {
                    stack.add(a);
                }
                stack.add("{");
                
                // begin先预置到“{”后一个元素
                begin = end + 1;
            }
            else if (sourceChareArray[end] == '}')
            {
                // 存放一组元素
                List<String> flatElementList = new LinkedList<String>();
                
                // pop form stack until got a element "{"
                String element = stack.pop();
                while (!"{".equals(element))
                {
                    flatElementList.add(element);
                    if (!stack.isEmpty())
                    {
                        element = stack.pop();
                    }
                }
                
                // if is not empty, add this list
                if (!flatElementList.isEmpty())
                {
                    // 由于flatElementList是从栈里pop出来的，因此这里需要对这个list进行倒叙
                    Collections.reverse(flatElementList);
                    
                    elements.add(flatElementList);
                }
                
                // begin先预置到“}”后一个元素
                begin = end + 1;
            }
            else if (sourceChareArray[end] == ',')
            {
                // begin先预置到“,”后一个元素
                begin = end + 1;
            }
            else
            {
            }
        }
        
        return elements;
    }
    
    /**
     * <一句话功能简述> <功能详细描述>
     * 
     * @param source 要被解析的字符串，形如 a=1101&a=1201&b=2321&b=1237
     * @return key为areaId，value为按顺序排列的id，如上面的字符串会被解析为如下形式Map
     *         <p>
     *         {b=[2321, 1237], a=[1101, 1201]}
     *         <p>
     */
    public static Map<String, List<String>> parseByAreaIds(String source)
    {
        Map<String, List<String>> results = new HashMap<String, List<String>>();
        String strs[] = source.split("\\|");
        for (String str : strs)
        {
            // 获得一个形如{"a[]", 1207}的数组，第一个元素为key，第二个元素为value
            String[] keyAndValue = str.split("=");
            
            // 把key的中括号截断掉
            
            List<String> values = results.get(keyAndValue[0]);
            
            if (values == null)
            {
                values = new LinkedList<String>();
                values.add(keyAndValue[1]);
                
                results.put(keyAndValue[0], values);
            }
            else
            {
                values.add(keyAndValue[1]);
            }
        }
        return results;
    }
    
    /**
     * 将字符串中的sql查询关键字[%_\']进行转义 ['aa%''\%_] 转义后为 [''aa\%''''\\\%\_]
     * 
     * @param value 输入字符串
     * @return 转义后的字符串
     */
    public static String sqlEscape(String value)
    {
        if (value == null || value.length() == 0)
        {
            return value;
        }
        StringBuffer buffer = new StringBuffer();
        for (char c : value.toCharArray())
        {
            if (c == '\\' || c == '%' || c == '_' || c == '\uFF05')
            {
                buffer.append('\\');
            }
            else if (c == '\'')
            {
                buffer.append('\'');
            }
            buffer.append(c);
        }
        return buffer.toString();
    }
    
    /**
     * <一句话功能简述> 加密方法 <功能详细描述> 从ESG移植
     * 
     * @param strSrc 要加密的字符串
     * @param type 加密类型
     * @return [参数说明] String
     * @see [类、类#方法、类#成员]
     */
    public static String encrypt(String strSrc, String type)
    {
        MessageDigest messDt = null;
        String strDes = null;
        
        byte[] strString = strSrc.getBytes();
        try
        {
            if (null == type || "".equals(type))
            {
                type = "SHA-256";
            }
            messDt = MessageDigest.getInstance(type);
            messDt.update(strString);
            strDes = bytes2Hex(messDt.digest()); // to HexString
        }
        catch (NoSuchAlgorithmException e)
        {
            return null;
        }
        return strDes;
    }
    
    /**
     * bytes2Hex <功能详细描述>
     * 
     * @param bts byte[]
     * @return String
     * @see [类、类#方法、类#成员]
     */
    public static String bytes2Hex(byte[] bts)
    {
        StringBuffer des = new StringBuffer();
        String tmp = null;
        for (int i = 0; i < bts.length; i++)
        {
            tmp = Integer.toHexString(bts[i] & 0xFF);
            if (tmp.length() == 1)
            {
                des.append(0);
            }
            des.append(tmp);
        }
        return des.toString();
    }
    
    /**
     * sha256Encrypt <功能详细描述>
     * 
     * @param source String
     * @return String
     * @see [类、类#方法、类#成员]
     */
    public static String sha256Encrypt(String source)
    {
        byte[] digested = digest(source, "SHA-256");
        return encodeWithBASE64(digested);
    }
    
    /**
     * 根据指定算法对字符串进行摘要
     * 
     * @param strSrc 源字符串
     * @param encName 算法名
     * @return 摘要
     */
    private static byte[] digest(String strSrc, String encName)
    {
        MessageDigest md = null;
        
        byte[] bt = strSrc.getBytes();
        try
        {
            md = MessageDigest.getInstance(encName);
        }
        catch (NoSuchAlgorithmException e)
        {
            return null;
        }
        
        md.update(bt);
        return md.digest();
    }
    
    /**
     * 将指定字节数组以BASE64编码
     * 
     * @param source 字节数组
     * @return String
     */
    public static String encodeWithBASE64(byte[] source)
    {
        if (source == null)
        {
            return null;
        }
        return Base64.encodeToString(source, Base64.DEFAULT).trim();
    }

    /**
     * 获取字符串中的json字符串
     *
     * @param source 源数据
     *               <?xml version="1.0" encoding="utf-8"?><string xmlns="http://tempuri.org/">
     *             {"result":51,"message":"不存在相应检索内容的销售发票回款状态列表"}</string>
     *
     * @return String
     */
    public static String getJson(String source){
        int startIndex = source.indexOf('{');
        System.out.println(startIndex);
        int endIndex = source.lastIndexOf('<');
        System.out.println(endIndex);
        if (startIndex < 0) {
            return "";
        }
        if (endIndex < 0) {
            return "";
        }
        return source.substring(startIndex,endIndex);
    }

    /***
     *
     * @param str
     * @param ch
     * @return
     */
    public static String trim(String str, char ch){
        if (str == null)
            return "";
        int begin;
        for (begin = 0; begin < str.length() && str.charAt(begin) == ch; begin++)
            ;
        int end;
        for (end = str.length(); end > 0 && str.charAt(end - 1) == ch; end--)
            ;
        return begin >= end ? "" : str.substring(begin, end);
    }

    /***
     *
     * @param str
     * @param ch
     * @return
     */
    public static String trimLeft(String str, char ch){
        if (str == null)
            return "";
        int end = str.length();
        int begin;
        for (begin = 0; begin < end && str.charAt(begin) == ch; begin++)
            ;
        return begin >= end ? "" : str.substring(begin, end);
    }

    /***
     *
     * @param str
     * @param ch
     * @return
     */
    public static String trimRight(String str, char ch){
        if (str == null)
            return "";
        int begin = 0;
        int end;
        for (end = str.length(); end > 0 && str.charAt(end - 1) == ch; end--)
            ;
        return begin >= end ? "" : str.substring(begin, end);
    }

    /***
     * 左填充字符串
     * @param desc 原数据
     * @param ch 填充字符
     * @param len 填充后长度
     * @return String
     */
    public static String fillStr(String desc, char ch, int len){
        if (len > desc.length()) {
            int s = len - desc.length();
            for (int i = 0; i < s; i++) {
                desc = ch + desc;
            }
        }
        return desc;
    }

    /***
     * 去掉小数点后没用的0，如果小数点后都是 0 则连小数点一起去掉
     * @param desc 原数据
     * @return String
     */
    public static String deleteDot(String desc){
        if(desc.indexOf(".") > 0){
            //正则表达
            desc = desc.replaceAll("0+?$", "");//去掉后面无用的零
            desc = desc.replaceAll("[.]$", "");//如小数点后面全是零则去掉小数点
        }
        return desc;
    }

    //截取double类型的两位小数
    public static String delTwoDot(double d){
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(d);
    }

    //获得uuid(应该是唯一的)
    public static String getUUID(){
        return java.util.UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }

    //展示数据，如果是null则展示""
    public static String nullToStr(String obj){
        if (null == obj){
            return "";
        }
        return obj;
    }

    public static String getMEID(){
        try {
            Class clazz = Class.forName("android.os.SystemProperties");
            Method method = clazz.getMethod("get", String.class, String.class);

            String meid = (String) method.invoke(null, "ril.cdma.meid", "");
            if(!TextUtils.isEmpty(meid)){
                Log.d(TAG,"getMEID meid: "+ meid);
                return meid;
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | ClassNotFoundException e) {
            e.printStackTrace();
            Log.w(TAG,"getMEID error : "+ e.getMessage());
        }
        return "";
    }
}
