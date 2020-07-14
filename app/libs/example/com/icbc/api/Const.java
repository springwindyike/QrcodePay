package com.icbc.api;

public class Const {

    /**
     * http://udsp.sdc.cs.icbc/icbc/usp/cms/gggl/detail.shtml?noticeId=1228
     * APIGW（行外网关）
     * 1909 A http://122.64.61.111:8081/api
     * 1911 B http://122.64.61.194:8081/api
     * 1910 C http://122.64.61.115:8081/api
     * 1912 D http://122.64.109.110:8081/api
     * 1908 F http://122.64.61.85:8081/api
     */
    public static String URL_PREFIX = "http://" +
            "122.64." +
            "109.110" +
            ":8081/api";

    public static String WORK_DATE = "2025-12-31";

    /**
     * PMD检查换行
     * 1000000000000000
     * 3913
     */
    public static  String APP_ID = "1000000000000" +
            "4094655";
}
