/**
 * 
 */
package com.icbc.api.request;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.BamvasCorgMemInfoQueryRequestV2.BamvasCorgMemInfoQueryRequestBizV2;
import com.icbc.api.response.BamvasCorgMemInfoQueryResponseV2;

/**
 * 合作方会员信息查询
 * 
 * @author kfzx-lizm
 *
 */
public class BamvasCorgMemInfoQueryTestV2 {
    // MY_PRIVATE_KEY
    protected static final String MY_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC1551qVQMhx4/DO2qQqyK7rYSUnmJ7fYWbRoqpM46xaXletLJzsIBjc6jelHgEpDw/p81xDYb2reOi2/mLLGCie3k7S2+kXn5JK6ZIBcatbzQvrKdh7bGaFnbd64Y62YQpSq1VWQVmTL8m4VnqiN3oq4kp+cLOrVwebaQiKuBsA1xC3Z7v0l9GQjnZ+p4wsyhOtmsTmti6CQasbhbIg5GnWmHe8yGJO03DHvAkOePzmfI73DiFmnyQUbiXy9VEjNTbUdasBT40MrH2N7Scx4pp+Ru42KQyPpmPGzUBtBD0fD4qnQEADfJjblqoBkEY0DM48tjAPtzU4dZJXLSKSLS1AgMBAAECggEAHIk2J50ofZ8ZzW2/vOwr6bdByjLCjk7Vq9M4I20EII7ETHgaWo3Axlk5j5lI7ql5Dh9b2jVeC8qhoEXT8uJGUpb+ILAn1mhAdWgUkM3fKgv86tGx/GnWZ67IfO3aw9alpfiiEnaBo1e80POfMGzCKyLlxKD6z4NgpSFcE0QYqrjkNfxstIouz6TUCJN7VOpZJKtx9H1E2+KkUm+wB1FhZU38lcEzoF/Wrrm1GQuiDwQSwgy3DaeE1fekZ6J530Tmc210Babq54a4kiKP6YbLb+ac1F+cZZByPED3PC6EIZDvT1P1CnOmmRIIfjmONsFVPvjqAloEzkLzywPCD65aYQKBgQDtokR0xxI+xqOPXhYRJinTQ3gn9C6jmTE9XV3OkCqky7NJDJPc2sG8fBh7RmWuXzSr+DweXd9hpV5rgFUk2GUosCxZUCO+Y+4yZ/iZa36ViwEZrbhe/O7TaHhdF3yXuG/pFS5Ol7Bf+/mM8wZU1xLp+MfZA1WlSJg3Et0l1RK/DQKBgQDD9rZuI0zUbrJSAMw5w8C74bhCFBzEU3pH00ix0nhU5jnP8e0XRiGLI074eIQtWK5v61eQpYNQ9tdBDtOBPiUXAfBXW8IC7W9mKTKhR0d9Ai0zpSxaS2CP03Bu21t/G+Z2S09c9u1rcS0zfjfDaZ22Z+4EwtyJ76VUEIlXZLKiSQKBgQC/SIk2PzBum9L5CtFUiJXOW1cTQjlws1WxgcCLD/1jnhz5RkiX1PdyU6oZQTeEP1rUuwMZppKztTvl6O2gtRfowrdQRXQgQ6xvosW4KZFBqxz9oJryy0MrpcKNnORL9MkQpF4cIXp2KQxd6xpDnMS61el4xHhijacJXgPp+jQW2QKBgDt3swTZUYdl0FdyRoeBEAv0A6aJ0/EAJCuHwpez9zBMbV7dW8WkUqmWnXBpojLgpo7wLDKJB8CaJ9hmV2jxIvBIdlcMUWPyCcxG1EZ9CwS0lGMHzN3Z4gPDdmstxiZcoSNk10Cu7n2casslkmaKtoGUKHbpa2Owhcts+UC8HjmBAoGAYkgGXxAc9NMnDk1VaOSrSQ9A779anbGPnE826cb949irBwg5eGLpqFbnNsn0loc6aEg4izrqPWaLQQsYTufV8nupRmvOGC6AJQhG2gRH1CmwAT71WQpo+cDbCu37Kua02XfSka8VOrskQyk/otNc/7detxgAIaOjDeo25mMj3t0=";

    // APIGW_PUBLIC_KEY
    protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
   
    // APP_ID
    protected static final String APP_ID = "10000000000004094824";
    
    protected static final String RSA = "RSA";
    protected static final String RSA2 = "RSA2";

    public static void main(String[] args) throws Exception {
        BamvasCorgMemInfoQueryTestV2 a = new BamvasCorgMemInfoQueryTestV2();
        a.test_cop();
    }

    public void test_cop() throws IcbcApiException {
        BamvasCorgMemInfoQueryRequestV2 request = new BamvasCorgMemInfoQueryRequestV2();
        request.setServiceUrl("http://122.64.109.110:8081/api/bamvas/corgMemInfo/query/V2");
        BamvasCorgMemInfoQueryRequestBizV2 bizContent = new BamvasCorgMemInfoQueryRequestBizV2();
        
        bizContent.setCorpId("0000000322");
        bizContent.setCorgNo("000006");
        bizContent.setOrdersrc("3");
        bizContent.setManufacturerId("LandiCmp01");
        bizContent.setTrademode("1");
        bizContent.setClientTransNo("02020190422102628165");
        bizContent.setPayAmt(new BigDecimal(1000));
        bizContent.setTimeStamp("2019-06-05 13:47:49");
        bizContent.setPayType("2");
        bizContent.setTotalAmt(new BigDecimal(1000));
        bizContent.setClientType("3");
        bizContent.setMerNo("123456");
        bizContent.setImeiNo("00021064032");
        bizContent.setMsgFlag("1");
        bizContent.setOptionType("1");
        bizContent.setGoodsType("001");
        bizContent.setIndustry("001");
        bizContent.setDataSrc("1");
        List<GoodsInfoDto> goods = new ArrayList<GoodsInfoDto>();
        GoodsInfoDto good1 = new GoodsInfoDto();
        good1.setGoodsId("201904230000001149");
        try {
            good1.setGoodsName(URLEncoder.encode("北方大馍","UTF-8"));
        } catch (UnsupportedEncodingException e) {
            good1.setGoodsName("BEI FAGN DA MO");
        }
        good1.setGoodsNum(new BigDecimal(1));
        good1.setGoodsAmt(new BigDecimal(500));
        good1.setGoodstype("001");
        try {
            good1.setGoodsName(URLEncoder.encode("特大号","UTF-8"));
        } catch (UnsupportedEncodingException e) {
            good1.setGoodsName("TE DA");
        }
        good1.setGroupNo(null);
        good1.setPeriodid(null);
        good1.setTypeid(null);
        good1.setGoodsback(null);
        good1.setDistributeDate(null);
        goods.add(good1);
        GoodsInfoDto good2 = new GoodsInfoDto();
        good2.setGoodsId("201904230000001141");
        try {
            good2.setGoodsName(URLEncoder.encode("老面馒头","UTF-8"));
        } catch (UnsupportedEncodingException e) {
            good2.setGoodsName("LAO MAIN MAN TOU");
        }
        good2.setGoodsNum(new BigDecimal(1));
        good2.setGoodsAmt(new BigDecimal(500));
        good2.setGoodstype("001");
        try {
            good2.setGoodsName(URLEncoder.encode("特大号","UTF-8"));
        } catch (UnsupportedEncodingException e) {
            good2.setGoodsName("TE DA");
        }
        good2.setGroupNo(null);
        good2.setPeriodid(null);
        good2.setTypeid(null);
        good2.setGoodsback(null);
        good2.setDistributeDate(null);
        goods.add(good2);
        bizContent.setGoods(goods);
        bizContent.setParam1(
                "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");
        
        request.setBizContent(bizContent);
        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID,RSA2,MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
        BamvasCorgMemInfoQueryResponseV2 response = client.execute(request);
        System.out.println(JSONObject.toJSONString(response));
    }
    
}
