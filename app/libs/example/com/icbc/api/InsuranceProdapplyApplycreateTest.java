package com.icbc.api;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.request.InsuranceProdapplyApplycreateRequestV1;
import com.icbc.api.response.InsuranceProdapplyApplycreateResponseV1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class InsuranceProdapplyApplycreateTest {
    static Logger log = Logger.getLogger(InsuranceProdapplyApplycreateTest.class.getName());
    //估值表
    protected static String APP_ID = "xxxxxxxxxxxxxxxxxxxx";
    protected static String BASE_URL = "http://ip:port/api"; // 行外

    //网关公钥
    protected static String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
    //应用私钥（与内管平台注册app时的“签名公钥”配对）
    protected static String PRI_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCUjFngz91VFDuhCR362irLQp9fgFxLjQ2H0whuQYMZyuAGi2QnoPtf1LlmAl+pZi1bbzANvq3reL7nhexWtIvTKeEeiyg0Mw4u4uXu/t+JmJV1YwCu/1PhiJkq6gTmp3sjonZXJV6v2L3JeP+mF0dv0aX2Chi2/1NUsO6eIWtr2W6u6D1uwsbILx8c+iS5pmplJEwFAUtQR623eyQ6Z8DToB3eovvgikKINZemmXA0LyCMC1qWzPyWIaMkM5ZcZOGephp6sviJG1rP8Jt8oMXzK9yXOlonzPV0F1ePDDaXfdoHEgiPfnm5p5kdDb6ORHc/B2Gd09jDW3nc2wAIuHdBAgMBAAECggEALgDpNL4rBVYmwVBZgH5gEmKniKPv8VXVguLQEZUoTKyPhHdWpQ8tyhfO8tB5X7TNByv/7cHHiszyEjFfZ9qyEss9dIAUC1ZkZhDOtJ0qDSq73oayh397MrVi+e9PZT8o23hMveBM2ph87hAS3BUJgo+infeyf7nCzM+elkozQkqxqTT2zCDpBR39rRVNzOCC4M0RQlPRy3yBMQWnivlWar9jh/+1rEpyPrUJGtNROTbAJTc0arZkCjq5qTyfDVszVRY2BzQGZd2C75gi8w9kMVlGOFo4FmbUt1y+V9rVEN4MdThJ3V3av3p7MvwbbY3RAxAYd3mseeQ1xj51CxMTIQKBgQDlGSLRvyW0tBKgyDvVvVKlzDw8uedVZnG9uQJswrbfX0OUGfNv8Pn0fEATeUuOYOFSCCt3gUUH42cmiGhwhIhxRbOBRov+2JqR0x6reuZwujlw7fOKMisnuJTqn7E23y9weVY2+DUGg3GWwL7zWTbfl2J/3vQ5Ie3tWUZVIdgglwKBgQCl/dK9gegUhnNwkadD9ZZ4ZXHfRPui+hpk4AMnQ5yui8yqxcE8EXeAFPLlJmMFfTsfMLxY6zc/Dvj/8F/7PFXr9FMGnntdDwDTUQnOxKZc4cutiGAiZHDs73U8V0ZAQOT/qVJ72ZYJZPc2KFmCiJaKbM0zLsB+ltL21qykUthJ5wKBgQDcQQk/u9SlYUZTe45DFIxDyBHVlCk66o3Jh/gz1hN4tx7CYRyw721vxpDX6BJi5PNbKW2YrBhQ2CjQW+6E1nZS6F8Gl2t6bIZWUjG3TSYFFJSq5Knyn/7rZkMNOtBmX7Y9HPptSL258F8hP1eVn5zo46MYKqKD1wHm4aCDslEWKwKBgQCYXXYdB+p9NLEwSjKMOhkFqLCu7gZBomup3spmNzTSL3cN5noqZioYAqK23taUClDDn5uzzy0mD9tWK1IfLlH8RYgUklLQp93tGvzytCW1Knoobv83cpUJmAA4BDBy+F57ovQYxTBorSoSp1UKcdAlfhuZeLevO0io1YMhTv5ETwKBgQDTal3uqq9mGR1F8xjuYsoE5C2eGvuHRQakMAQ/7fW40oOuhxsTuPxSflCE9qhSUpKVVTmnCHRY/Knje8XhSHwTv3cI5QLASQpIlG6xmhitEvVtS2GVgPRiQpGtesIhzV2+6kqFAPAjlh9d0LhE7JlHui3ffOEudip4kzhiGc2PSA==";
    protected static String AES_KEY = "PDdrBmItBreMh+NubmU9ug==";
    public static void main(String[] args) throws Exception {
        String URI = "investment/insurance/prodapply/applycreate/V1"; // api地址

        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA2,PRI_KEY, IcbcConstants.CHARSET_UTF8, "json", APIGW_PUBLIC_KEY, "AES", AES_KEY, (String)null, (String)null);
        try {
            // 请求实体
            InsuranceProdapplyApplycreateRequestV1 request = new InsuranceProdapplyApplycreateRequestV1();
            // bizContent实体
            InsuranceProdapplyApplycreateRequestV1.ApiInvestmentInsuranceProdapplyApplycreateRequestV1Biz bizContent
                    = new InsuranceProdapplyApplycreateRequestV1.ApiInvestmentInsuranceProdapplyApplycreateRequestV1Biz();
            InsuranceProdapplyApplycreateRequestV1.CommonReqInfo commonReqInfoContent
                    = new InsuranceProdapplyApplycreateRequestV1.CommonReqInfo();
            InsuranceProdapplyApplycreateRequestV1.TransReqInfo transReqInfoContent
                    = new InsuranceProdapplyApplycreateRequestV1.TransReqInfo();
            InsuranceProdapplyApplycreateRequestV1.CustInfo custInfo
                    = new InsuranceProdapplyApplycreateRequestV1.CustInfo();
            InsuranceProdapplyApplycreateRequestV1.HolderInfo holderInfo
                    = new InsuranceProdapplyApplycreateRequestV1.HolderInfo();
            InsuranceProdapplyApplycreateRequestV1.InsuredInfo insuredInfo
                    = new InsuranceProdapplyApplycreateRequestV1.InsuredInfo();
            InsuranceProdapplyApplycreateRequestV1.EnrichedInfo enrichedInfo
                    = new InsuranceProdapplyApplycreateRequestV1.EnrichedInfo();
            InsuranceProdapplyApplycreateRequestV1.ProdInfo prodInfo
                    = new InsuranceProdapplyApplycreateRequestV1.ProdInfo();
            InsuranceProdapplyApplycreateRequestV1.ReqContentInfo reqContentInfo =
                    new InsuranceProdapplyApplycreateRequestV1.ReqContentInfo();


            commonReqInfoContent.setChanNo("15");
            commonReqInfoContent.setInsuId("028");
            commonReqInfoContent.setTransDate("2019-07-23");
            commonReqInfoContent.setTransTime("19:16:16");
            commonReqInfoContent.setZoneno("01202");
            commonReqInfoContent.setBrno("00230");
            commonReqInfoContent.setSaler_no("xxxxxxxxxxxxx");

            transReqInfoContent.setOrderId("xxxxxxxxxxxxxx");
            transReqInfoContent.setTotalAmt("xxxxxxxxxxxxx");
            holderInfo.setFullName("张三");
            holderInfo.setIdNo("对应证件号");
            holderInfo.setIdType("0");
            holderInfo.setGender("1");
            holderInfo.setBirthdate("xxxxxxxxxx");
            holderInfo.setAddress("浙江省杭州市西湖区");
            holderInfo.setMobile("xxxxxxxxxxxx");
            holderInfo.setZip("310000");
            holderInfo.setOfficeTel("xxxxxxxxxxxxxxx");
            holderInfo.setHolderInsuredRelation("1");

            insuredInfo.setFullName("李四");
            insuredInfo.setIdNo("对应证件号");
            insuredInfo.setIdType("0");
            insuredInfo.setGender("1");
            insuredInfo.setBirthdate("19580306");
            insuredInfo.setAddress("浙江省杭州市西湖区");
            insuredInfo.setMobile("xxxxxxxxxxxxxxx");
            insuredInfo.setZip("310000");
            insuredInfo.setOfficeTel("xxxxxxxxxxxx");

            enrichedInfo.setFullName("王五");
            enrichedInfo.setIdNo("对应证件号");
            enrichedInfo.setIdType("0");
            enrichedInfo.setGender("1");
            enrichedInfo.setBirthdate("xxxxxxxx");
            enrichedInfo.setPersent("50");
            enrichedInfo.setOrder("1");
            enrichedInfo.setEnrichedInsuredRelation("2");
            List<InsuranceProdapplyApplycreateRequestV1.EnrichedInfo> enrichedInfoList = new ArrayList<>();
            enrichedInfoList.add(enrichedInfo);
            custInfo.setHolderInfo(holderInfo);
            custInfo.setInsuredInfo(insuredInfo);
            custInfo.setEnrichedInfoList(enrichedInfoList);
            transReqInfoContent.setCustInfo(custInfo);
            prodInfo.setProdId("001");
            prodInfo.setMainProdFlag("1");
            prodInfo.setShares("100");
            prodInfo.setPremiumAmt("xxxxxxxxxxxxxxxxx");
            prodInfo.setCoverageAmt("xxxxxxxxxxx");
            prodInfo.setCoverageDurationType("1");
            prodInfo.setCoverageDuration("100");
            prodInfo.setPaymentDuration("8");
            prodInfo.setPaymentDurationType("2");
            prodInfo.setPaymentType("1");
            List<InsuranceProdapplyApplycreateRequestV1.ProdInfo> prodInfoList = new ArrayList<>();
            prodInfoList.add(prodInfo);
            transReqInfoContent.setProdInfoList(prodInfoList);

            reqContentInfo.setCommonReqInfo(commonReqInfoContent);
            reqContentInfo.setTransReqInfo(transReqInfoContent);

            bizContent.setReqContentInfo(reqContentInfo);


            request.setServiceUrl(BASE_URL + "/" + URI);
            request.setBizContent(bizContent);

            InsuranceProdapplyApplycreateResponseV1 response = client.execute(request);
            log.info("InsuranceProdapplyApplycreateResponseV1:"+response);
            boolean flag=response.isSuccess();
            if (flag) {
                // 业务成功处理
                log.info("InsuranceProdapplyApplycreate处理成功:success");
            } else {
                // 失败
                log.info("InsuranceProdapplyApplycreate处理失败:error");
            }
        } catch (Exception e) {
            log.info("InsuranceProdapplyApplycreate处理异常:"+e);

        }
    }
}
