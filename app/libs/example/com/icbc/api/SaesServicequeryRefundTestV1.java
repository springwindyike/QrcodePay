package com.icbc.api;

import com.icbc.api.internal.util.internal.util.fastjson.JSONArray;
import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.SaesServicequeryRefundRequestV1;
import com.icbc.api.response.SaesServicequeryRefundResponseV1;

/**
 * @Author:kfzx-gaoby
 * @Description:测试类，并笔支付退款查询API接口调用
 * @Date:2019/6/6 15:27
 * @Modified By
 */

public class SaesServicequeryRefundTestV1 {
    public static void main(String[] args) {
        String apipGateWayUrl = "xxxx";
        String MY_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCTBL1u89Ka0tsMNEqbYPbJjxTn8Xkr8tIHwJZ9odHWkcfTmnOU877cYl+UhdhkfcFEKuvEhX2isPGdaIrqzkm9RBh+K1PQwyViGAhkFiUXDNcp/MdPzGyEjhwd+adKwR3CJfZZoWhZITT0O7fq71ufcSLvCrc6jzOPIDzxLheVall79ZHgVOCDjpTI8JUsj/0kAmHzhRIJ3lUGWyv4mTipwyAT9lzmvXhMcMnzStJ7Jzn1le7VXAd3ERvEz/PKEaXtPJ3kd1Grt0Q2EAns6ozvUg7spEjSBL7K8G77nwuOGWvVqfYQ2o36f5UTczpDaq47zrFVq6tFOIh21LBiYEThAgMBAAECggEAMKeb7bFBnL11gtd3bW6snc39dDllCZdlzOz+oPtBz8oVIMF3yO7V1me0DBozoCZCJMYzmqk3B/WZMKfdeZHls35qwK6kIW3D3G/prv3pLnSwbJPcfls/+qpxQbZSmBnLOGqJ2eXh+8VSmhV9a4Hlh6HQlt2r//ROcuqPYJ4JbgfvW/XIOCzakodAFeGLR2MXa5w+M7/Wc4Ipy1R5Cn10ZElJdAq8Hn8maAzQnQMNfkElZwX+7P8kyv/ueeeTeR+4HHhP5Xd0XLAJ4WVgw/jvzpRyBFdy+Kalvc0G0utIR8+9yUXlQ9yojJFVTzVukq+RHgPQg9PFLtYW9BKMkXgbsQKBgQDhCskBxEgr6DsdjoqpVYHSq8IyTD46+ton1lR6yE6cfuabPqdqVhV1rcANPNI7sCHjdQJUOABJiOIXn5v3soTx2C3dnWVUAck33e5t0fXwlpN5d2lEok6ZYhk1n29S/fDv5FLP860hYIxWD1Hggcd/AqhTPqXAVDgIpAThi9id/QKBgQCnPjrOqsj7Sq0+3b9LF8ScSquxK5QaAJ712SnBT/EbjQJK0QiNHRl/03jFMIUwXHDVd6wYo0JYCBJFDZuZyVndPONz2rlx9Y9nP112RZedo4/lIdXV4ZQl8nsUrSS3zn2dHA9d/kcLTgV+0WQr1CSrCDnxXOgXRGNyu1dNJN8ltQKBgAcygRs9W9GLq9hWJrkjsvM56wwQxCy+uRttD2ad4WW/6UAt0Mzl0+nflLTXrSGbkHnl1B09bUTsy85VnHdfjkDt2QmtbwAwzm6q+mUoweTf6/eGiidXyYu+R3AfmT/eP0Zs1vkvoenfXJ2j/8peXDMDsr520nZEO0aLeFx+TH9BAoGBAIgEp6Vv5zfhe1d2197F/OS0IkFc1P305VPEBB6x2sFyhJu+uHq0YQnCPyX5GUnE1Qv4YaJEHXAlWF6K+7MuvISfwcl26X4Snkf1lBjd7rqJzT0osJZb+baHKK0fSI6pRSZjLOhgJv29veBvgk3XIt9rOFziF+zcdRlZ3l3ikA5FAoGAfI7mPDQby6/BPFMBG3A7UuL29X7Gb4RfOpqS49YsNuCDA0YYirHyOhn49Ai3s9YuegWLOSlWdm2Goz03YuNW7fbVI+WrNc4EeIyRAkd81PgF9gxTNKq+LVMzaD7bGf8an8F95fvgZi4xNuLHukjGW7Exr9ND8W4y8fv8Grw8RkA=";
        String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
        DefaultIcbcClient client = new DefaultIcbcClient("xxxx", IcbcConstants.SIGN_TYPE_RSA2, MY_PRIVATE_KEY, "UTF-8", "json", APIGW_PUBLIC_KEY, (String)null, (String)null, (String)null, (String)null);
        SaesServicequeryRefundRequestV1 request = new SaesServicequeryRefundRequestV1();
        //7月版apip测试环境，行外网关
        request.setServiceUrl(apipGateWayUrl);

        SaesServicequeryRefundRequestV1.SaesServicequeryRefundRequestV1Biz bizContent = new SaesServicequeryRefundRequestV1.SaesServicequeryRefundRequestV1Biz();

        //组装请求参数
        bizContent.setChannel("1");
        bizContent.setMerType("1");
        bizContent.setMerNo("13243");
        bizContent.setOrderId("1235233");
        bizContent.setRejectId("123474745");
        bizContent.setSubOrderCount("2");//子订单数量为2
        //根据subOrderCount的值组装子订单信息
        //第一个子订单
        JSONObject sub1 = new JSONObject();
        sub1.put("shopCode","123453");
        sub1.put("recNum","1");
        sub1.put("seqNo","12365757");
        sub1.put("oriShopCode","232453");
        sub1.put("serNo","14213");
        sub1.put("busiType","1");
        sub1.put("oriTrxDate","2019-06-19");
        sub1.put("retSubOrderNo","1322345546");
        //第二个子订单
        JSONObject sub2 = new JSONObject();
        sub2.put("shopCode","2435488");
        sub2.put("recNum","2");
        sub2.put("seqNo","23356093");
        sub2.put("oriShopCode","3656");
        sub2.put("serNo","124324");
        sub2.put("busiType","2");
        sub2.put("oriTrxDate","2019-06-19");
        sub2.put("retSubOrderNo","2354354654763");
        //将所有子订单存入JSONArray对象
        JSONArray subInput = new JSONArray();
        subInput.add(sub1);
        subInput.add(sub2);
        bizContent.setOrderSubmitActInput(subInput);

        request.setBizContent(bizContent);

        SaesServicequeryRefundResponseV1 response;
        try {
            //测试时，避免apip识别成重放，请修改msgId,每次手工触发测试执行时，递加1
            response = client.execute(request, "urcnl24ciutr27");
            response.isSuccess();
        } catch (IcbcApiException e) {
            e.printStackTrace();
        }
    }
}
