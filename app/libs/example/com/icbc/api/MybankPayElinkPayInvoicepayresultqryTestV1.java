package com.icbc.api;

import java.net.URLDecoder;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.MybankPayElinkPayInvoicepayresultqryRequestV1;
import com.icbc.api.request.MybankPayElinkPayInvoicepayresultqryRequestV1.MybankPayElinkPayInvoicepayresultqryRequestV1Biz;
import com.icbc.api.response.MybankPayElinkPayInvoicepayresultqryResponseV1;

/**
 * 发票支付结果查询
 *
 * @version 2019年10月版
 */
public class MybankPayElinkPayInvoicepayresultqryTestV1 {
    protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
    protected static final String APP_ID = "10000000000000092015";
    protected static final String MY_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCXY3LeSkYCtpk2mmyeLKYA2OrFyp36vW7OOkfU0w6OkAnGnOFY5qn92ig49Psn2sw96yRbdbq2466SM9Vy13RCYLg2WnGDNmx2+QZr1j5gSmCusk76fVvFv5c0/WCdg/9IQt/NPLR3Pg9vyVGTrw1zZwP5MRtizOTTBAMMgfbPOD8JrS2+my1CwX7P9vrBxvQZMLGMHJsMneaAuoG9Kfo7UpEUnIBiKLq/9DbDMQQ1fSS0l0xA64IJLuLG+nwiwzgyWX7AblQtCtdPTHmBCPk4o8Y5hpNAyQ4dtcWk1F90i/YxexyDwbDBnPJ9uP+HFp895Je8XoPy3VqMEQToEdF/AgMBAAECggEAYoeJVYAFvPJXGaC8HN52VIrZkk3jMDRmj7aC1dNf4A2DL08fo5rM/LkmAJwBctkGoS4Pha9EDJB3KBSwUYRE2IbWnhmTU5DyWySMt1bDVixSbKEEoidAuZ2OriBS53HnjoJn4s4lro4nwdvHSlVebcOYZHE/n7g3Hde4nEVh+09hb6JXXFC3EK/7p80zt0wjp1yv9/iLPgXSvyXRW9qM8ED5JbDpsO4nDvF5ZwXWjQ3iauQjsKjVgYcNg31PNq6tl39I3sivx2AP8IYoYz/J5IukKrc6Yeb9KLyjrhMzeoJr3gzpp5T/VPb2vgeH+z8ytU91inMiS7WqmD+xNq33QQKBgQDSph1K/fq8+ZyckERklNudVdtsIKHtNL5kFvPFZUSF94oUgg6y6IkWO1wtDUIUAxi9B88/l34TBeYqmvCfDe/MN7npAjNbDhh6m6VyPZqgUkCdLCUqPpoI3vEP7N8iLPCXZoVs6nvrOqh0tbsLUplQpDc3KOzQqYhhGGyoqZNfUQKBgQC3+zRUH0Y8TUdtkD+VWB74+FzfmgalNZQZMjVbhkpmPWLCj69IxtHIFwWtKQQdeAvYii8PgHrstkQOSEcpXTItIJXcHpwRCypyZpO1i/ScvflhdHJdWKYsaho7k/peGWTP09mD7UHv3SzEC0taU6GzvUE7ZsZbZCwQf8OPkbIPzwKBgQCROH4HXjMHJtpmQTs1UD5bKH6d+51Gh88d94jVNCxaYz5pRwRVKOShVAkG8hX07/GVGBYz0//Ro4Z7Jtft/1CrLFvZnG/FPWF43Wbg7EF2d14ePPneNsxAg1oTTYzC5dJzvfUMEled4pGR7Ftnwej6ZEvAllE0xTvFHG6ElGuKEQKBgDuIBzipHfrpLpGfOVPDvdHl23dmyXuvyIoWmvlQjMZkWo6GG7u6yaqq+GU9fl1iuMKKhAvKEPyDRaYxcQVLaK79ekBNj0ZcjJGT63u1G6OUPRtxqIfX5X09n9tjWIIWSW6OKDXuEYXh1VhiJzHFGe+k73SfHtP3p+J21PqhtDI1AoGBAMQZUXTDb6wSA76b2Lc5/pqYYvoO1GQYJvWm8o4ZTlno7iBdFTAOEz7ekKFmyuW/NiZq58hOA5PQevRmXKggLix5qSlvjLJc8y93gC6kqW/Znuaf2fYHR7fl7jR1neltETtEWvrW0Ei7YugeBb4sim1lagbPLI87Ab8hwSJahwHh";
    protected static final String ENCRYPT_KEY = "mQbJILokBccRHUkS+XBk7A==";

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("请求测试开始");

        String serviceUrl = "http://83.28.222.45:8081/mybank/pay/elink/pay/invoicepayresultqry/V1";

        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, "RSA", MY_PRIVATE_KEY, "UTF-8", "json", APIGW_PUBLIC_KEY, "AES", ENCRYPT_KEY, "", "");

        MybankPayElinkPayInvoicepayresultqryRequestV1Biz bizContent = new MybankPayElinkPayInvoicepayresultqryRequestV1Biz();
        bizContent.setPayerID("110105000247");
        bizContent.setTradeTime("2016-10-29 20:44:38");
        bizContent.setCompleteTime("2016-10-27 20:44:38");
        bizContent.setPartnerSeq("000000020");

        MybankPayElinkPayInvoicepayresultqryRequestV1 request = new MybankPayElinkPayInvoicepayresultqryRequestV1();
        request.setServiceUrl(serviceUrl);
        request.setBizContent(bizContent);

        MybankPayElinkPayInvoicepayresultqryResponseV1 response = null;
        try {
            System.out.println(JSONObject.toJSONString(bizContent));
            System.err.println("--------------------");
            response = client.execute(request, System.currentTimeMillis() + "");
            System.out.println(JSONObject.toJSONString(response));
            String resdata = response.getResdata();
            if (resdata != null && resdata.length() > 0) {
                resdata = URLDecoder.decode(resdata, "UTF-8");
                System.out.println("resdata = " + resdata);
            } else {
                System.out.println("resdata is null");
            }
            if ("2".equals(response.getReturnCode())) {
                // 失败
                System.out.println("业务处理失败！");
            } else {
                // 业务成功处理
                System.out.println("业务处理成功！");
                System.out.println(response.getReturnCode());
            }
        } catch (Exception e) {
            System.out.println("请求测试异常" + e);
            e.printStackTrace();
        }
    }
}
