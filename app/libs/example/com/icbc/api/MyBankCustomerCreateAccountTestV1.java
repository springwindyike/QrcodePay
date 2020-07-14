package com.icbc.api;

import com.icbc.api.request.MyBankCustomerCreateAccountRequestV1;

/**
 * @Author: kfzx-lihh
 * @Description: 页面服务测试类
 * @Date: 2019/10/23
 */
public class MyBankCustomerCreateAccountTestV1 {
    private static final String url = "xxxxx";
    //private static final String appId = "xxxx";
    private static final String certCode = "xxxx";
    public static void main(String[] args) throws IcbcApiException {
        // 以下为测试环境的信息，生产环境请替换成生产上的appId、生产上分行的私钥、以及生产上的api网关
        //UiIcbcClient client = new UiIcbcClient(appId, "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCTBL1u89Ka0tsMNEqbYPbJjxTn8Xkr8tIHwJZ9odHWkcfTmnOU877cYl+UhdhkfcFEKuvEhX2isPGdaIrqzkm9RBh+K1PQwyViGAhkFiUXDNcp/MdPzGyEjhwd+adKwR3CJfZZoWhZITT0O7fq71ufcSLvCrc6jzOPIDzxLheVall79ZHgVOCDjpTI8JUsj/0kAmHzhRIJ3lUGWyv4mTipwyAT9lzmvXhMcMnzStJ7Jzn1le7VXAd3ERvEz/PKEaXtPJ3kd1Grt0Q2EAns6ozvUg7spEjSBL7K8G77nwuOGWvVqfYQ2o36f5UTczpDaq47zrFVq6tFOIh21LBiYEThAgMBAAECggEAMKeb7bFBnL11gtd3bW6snc39dDllCZdlzOz+oPtBz8oVIMF3yO7V1me0DBozoCZCJMYzmqk3B/WZMKfdeZHls35qwK6kIW3D3G/prv3pLnSwbJPcfls/+qpxQbZSmBnLOGqJ2eXh+8VSmhV9a4Hlh6HQlt2r//ROcuqPYJ4JbgfvW/XIOCzakodAFeGLR2MXa5w+M7/Wc4Ipy1R5Cn10ZElJdAq8Hn8maAzQnQMNfkElZwX+7P8kyv/ueeeTeR+4HHhP5Xd0XLAJ4WVgw/jvzpRyBFdy+Kalvc0G0utIR8+9yUXlQ9yojJFVTzVukq+RHgPQg9PFLtYW9BKMkXgbsQKBgQDhCskBxEgr6DsdjoqpVYHSq8IyTD46+ton1lR6yE6cfuabPqdqVhV1rcANPNI7sCHjdQJUOABJiOIXn5v3soTx2C3dnWVUAck33e5t0fXwlpN5d2lEok6ZYhk1n29S/fDv5FLP860hYIxWD1Hggcd/AqhTPqXAVDgIpAThi9id/QKBgQCnPjrOqsj7Sq0+3b9LF8ScSquxK5QaAJ712SnBT/EbjQJK0QiNHRl/03jFMIUwXHDVd6wYo0JYCBJFDZuZyVndPONz2rlx9Y9nP112RZedo4/lIdXV4ZQl8nsUrSS3zn2dHA9d/kcLTgV+0WQr1CSrCDnxXOgXRGNyu1dNJN8ltQKBgAcygRs9W9GLq9hWJrkjsvM56wwQxCy+uRttD2ad4WW/6UAt0Mzl0+nflLTXrSGbkHnl1B09bUTsy85VnHdfjkDt2QmtbwAwzm6q+mUoweTf6/eGiidXyYu+R3AfmT/eP0Zs1vkvoenfXJ2j/8peXDMDsr520nZEO0aLeFx+TH9BAoGBAIgEp6Vv5zfhe1d2197F/OS0IkFc1P305VPEBB6x2sFyhJu+uHq0YQnCPyX5GUnE1Qv4YaJEHXAlWF6K+7MuvISfwcl26X4Snkf1lBjd7rqJzT0osJZb+baHKK0fSI6pRSZjLOhgJv29veBvgk3XIt9rOFziF+zcdRlZ3l3ikA5FAoGAfI7mPDQby6/BPFMBG3A7UuL29X7Gb4RfOpqS49YsNuCDA0YYirHyOhn49Ai3s9YuegWLOSlWdm2Goz03YuNW7fbVI+WrNc4EeIyRAkd81PgF9gxTNKq+LVMzaD7bGf8an8F95fvgZi4xNuLHukjGW7Exr9ND8W4y8fv8Grw8RkA=", IcbcConstants.CHARSET_UTF8);
        MyBankCustomerCreateAccountRequestV1 request = new MyBankCustomerCreateAccountRequestV1();
        request.setServiceUrl(url);
        MyBankCustomerCreateAccountRequestV1.MyBankCustomerCreateAccountRequestV1Biz bizContent = new MyBankCustomerCreateAccountRequestV1.MyBankCustomerCreateAccountRequestV1Biz();
        bizContent.setCustName("张立");
        bizContent.setCertType("0");
        bizContent.setCertCode(certCode);
        bizContent.setCustType("00004");
        bizContent.setBusiArea("0090100000");
        bizContent.setEmpCode("888804591");
        bizContent.setAreaCode("0090100000");
        bizContent.setCertValid("20191031");
        bizContent.setModifyFlag("0");

        request.setBizContent(bizContent);
        //System.out.println(client.buildPostForm(request));
    }
}
