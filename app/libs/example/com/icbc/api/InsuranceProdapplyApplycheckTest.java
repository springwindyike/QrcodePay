package com.icbc.api;

import com.icbc.api.request.InsuranceProdapplyApplycheckRequestV1;
import com.icbc.api.response.InsuranceProdapplyApplycheckReponseV1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class InsuranceProdapplyApplycheckTest {
    static Logger log = Logger.getLogger(InsuranceProdapplyApplycheckTest.class.getName());
    //估值表
    protected static String APP_ID = "xxxxxxxxxxxxxxxxxxx";
    protected static String BASE_URL = "http://ip:port/api"; // 行外

    //网关公钥
    protected static String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
    //应用私钥（与内管平台注册app时的“签名公钥”配对）
    protected static String PRI_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCUjFngz91VFDuhCR362irLQp9fgFxLjQ2H0whuQYMZyuAGi2QnoPtf1LlmAl+pZi1bbzANvq3reL7nhexWtIvTKeEeiyg0Mw4u4uXu/t+JmJV1YwCu/1PhiJkq6gTmp3sjonZXJV6v2L3JeP+mF0dv0aX2Chi2/1NUsO6eIWtr2W6u6D1uwsbILx8c+iS5pmplJEwFAUtQR623eyQ6Z8DToB3eovvgikKINZemmXA0LyCMC1qWzPyWIaMkM5ZcZOGephp6sviJG1rP8Jt8oMXzK9yXOlonzPV0F1ePDDaXfdoHEgiPfnm5p5kdDb6ORHc/B2Gd09jDW3nc2wAIuHdBAgMBAAECggEALgDpNL4rBVYmwVBZgH5gEmKniKPv8VXVguLQEZUoTKyPhHdWpQ8tyhfO8tB5X7TNByv/7cHHiszyEjFfZ9qyEss9dIAUC1ZkZhDOtJ0qDSq73oayh397MrVi+e9PZT8o23hMveBM2ph87hAS3BUJgo+infeyf7nCzM+elkozQkqxqTT2zCDpBR39rRVNzOCC4M0RQlPRy3yBMQWnivlWar9jh/+1rEpyPrUJGtNROTbAJTc0arZkCjq5qTyfDVszVRY2BzQGZd2C75gi8w9kMVlGOFo4FmbUt1y+V9rVEN4MdThJ3V3av3p7MvwbbY3RAxAYd3mseeQ1xj51CxMTIQKBgQDlGSLRvyW0tBKgyDvVvVKlzDw8uedVZnG9uQJswrbfX0OUGfNv8Pn0fEATeUuOYOFSCCt3gUUH42cmiGhwhIhxRbOBRov+2JqR0x6reuZwujlw7fOKMisnuJTqn7E23y9weVY2+DUGg3GWwL7zWTbfl2J/3vQ5Ie3tWUZVIdgglwKBgQCl/dK9gegUhnNwkadD9ZZ4ZXHfRPui+hpk4AMnQ5yui8yqxcE8EXeAFPLlJmMFfTsfMLxY6zc/Dvj/8F/7PFXr9FMGnntdDwDTUQnOxKZc4cutiGAiZHDs73U8V0ZAQOT/qVJ72ZYJZPc2KFmCiJaKbM0zLsB+ltL21qykUthJ5wKBgQDcQQk/u9SlYUZTe45DFIxDyBHVlCk66o3Jh/gz1hN4tx7CYRyw721vxpDX6BJi5PNbKW2YrBhQ2CjQW+6E1nZS6F8Gl2t6bIZWUjG3TSYFFJSq5Knyn/7rZkMNOtBmX7Y9HPptSL258F8hP1eVn5zo46MYKqKD1wHm4aCDslEWKwKBgQCYXXYdB+p9NLEwSjKMOhkFqLCu7gZBomup3spmNzTSL3cN5noqZioYAqK23taUClDDn5uzzy0mD9tWK1IfLlH8RYgUklLQp93tGvzytCW1Knoobv83cpUJmAA4BDBy+F57ovQYxTBorSoSp1UKcdAlfhuZeLevO0io1YMhTv5ETwKBgQDTal3uqq9mGR1F8xjuYsoE5C2eGvuHRQakMAQ/7fW40oOuhxsTuPxSflCE9qhSUpKVVTmnCHRY/Knje8XhSHwTv3cI5QLASQpIlG6xmhitEvVtS2GVgPRiQpGtesIhzV2+6kqFAPAjlh9d0LhE7JlHui3ffOEudip4kzhiGc2PSA==";
    protected static String AES_KEY = "PDdrBmItBreMh+NubmU9ug==";
    public static void main(String[] args) throws Exception {
        String URI = "investment/insurance/prodapply/applycheck/V1"; // api地址
        DefaultIcbcClient client =  new DefaultIcbcClient(APP_ID, "RSA2", PRI_KEY, "UTF-8", "json", APIGW_PUBLIC_KEY, "AES", AES_KEY, (String)null, (String)null);
        try {
            // 请求实体
            InsuranceProdapplyApplycheckRequestV1 request = new InsuranceProdapplyApplycheckRequestV1();
            // bizContent实体
            InsuranceProdapplyApplycheckRequestV1.InsuranceProdapplyApplycheckRequestV1Biz bizContent
                    = new InsuranceProdapplyApplycheckRequestV1.InsuranceProdapplyApplycheckRequestV1Biz();
            InsuranceProdapplyApplycheckRequestV1.CommonReqInfo commonReqInfoContent
                    = new InsuranceProdapplyApplycheckRequestV1.CommonReqInfo();
            InsuranceProdapplyApplycheckRequestV1.TransReqInfo transReqInfoContent
                    = new InsuranceProdapplyApplycheckRequestV1.TransReqInfo();
            InsuranceProdapplyApplycheckRequestV1.CustInfo custInfo
                    = new InsuranceProdapplyApplycheckRequestV1.CustInfo();
            InsuranceProdapplyApplycheckRequestV1.ProdInfoList prodInfo
                    = new InsuranceProdapplyApplycheckRequestV1.ProdInfoList();
            InsuranceProdapplyApplycheckRequestV1.HolderInfo holderInfo
                    = new InsuranceProdapplyApplycheckRequestV1.HolderInfo();
            InsuranceProdapplyApplycheckRequestV1.InsuredInfo insuredInfo
                    = new InsuranceProdapplyApplycheckRequestV1.InsuredInfo();
            InsuranceProdapplyApplycheckRequestV1.EnrichedInfoList enrichedInfoList
                    = new InsuranceProdapplyApplycheckRequestV1.EnrichedInfoList();
            InsuranceProdapplyApplycheckRequestV1.ReqContentInfo reqContentInfo
                    = new  InsuranceProdapplyApplycheckRequestV1.ReqContentInfo();

            commonReqInfoContent.setChanNo("15");
            commonReqInfoContent.setInsuId("028");
            commonReqInfoContent.setTransDate("xxxxxxxxxxxxxx");
            commonReqInfoContent.setTransTime("191616");
            commonReqInfoContent.setZoneNo("00200");
            commonReqInfoContent.setBrNo("");
            commonReqInfoContent.setSalerNo("");

         List<InsuranceProdapplyApplycheckRequestV1.ProdInfoList> prodInfoList = new ArrayList<>();
            transReqInfoContent.setCustInfo(custInfo);
            transReqInfoContent.setProdInfoListrodInfoList(prodInfoList);
            transReqInfoContent.setSalerNo("xxxxxxxxxx");


            //custInfo
            custInfo.setEnrichedInfoList(enrichedInfoList);
            custInfo.setHolderInfo(holderInfo);
            custInfo.setInsuredInfo(insuredInfo);
            //ProdInfoList
            prodInfo.setCoverageDuration("");
            prodInfo.setCoverageDurationType("");
            prodInfo.setCoverageAmt("");
            prodInfo.setMainProdFlag("");
            prodInfo.setPaymentDuration("");
            prodInfo.setPaymentDurationType("");
            prodInfo.setPremiumAmt("");
            prodInfo.setProdId("");
            prodInfo.setPaymentType("");
            prodInfo.setShares("");

            //holder_info
            holderInfo.setFullName("");
            holderInfo.setIdType("");
            holderInfo.setIdNo("");
            holderInfo.setIdEndDate("");
            holderInfo.setNationality("");
            holderInfo.setGender("");
            holderInfo.setBirthdate("");
            holderInfo.setAddress("");
            holderInfo.setZip("");
            holderInfo.setMobile("");
            holderInfo.setOfficeTel("");
            holderInfo.setEmail("");
            holderInfo.setHolderInsuredRelation("");

            //insured_info参数说明(关系类型非28-法定)

            insuredInfo.setFullName("");
            insuredInfo.setIdType("");
            insuredInfo.setIdNo("");
            insuredInfo.setIdEndDate("");
            insuredInfo.setNationality("");
            insuredInfo.setGender("");
            insuredInfo.setBirthdate("");
            insuredInfo.setAddress("");
            insuredInfo.setZip("");
            insuredInfo.setMobile("");
            insuredInfo.setOfficeTel("");
            insuredInfo.setEmail("");

            //enriched_info_list参数说明(关系类型非28-法定)

            enrichedInfoList.setFullName("");
            enrichedInfoList.setIdType("");
            enrichedInfoList.setIdNo("");
            enrichedInfoList.setIdEndDate("");
            enrichedInfoList.setNationality("");
            enrichedInfoList.setGender("");
            enrichedInfoList.setBirthdate("");
            enrichedInfoList.setEnrichedInsuredRelation("");
            enrichedInfoList.setPersent("");
            enrichedInfoList.setOrder("");

            reqContentInfo.setCommonReqInfo(commonReqInfoContent);
            reqContentInfo.setTransReqInfo(transReqInfoContent);

            bizContent.setReqContentInfo(reqContentInfo);

            request.setServiceUrl(BASE_URL + "/" + URI);
            request.setBizContent(bizContent);

            InsuranceProdapplyApplycheckReponseV1 response = client.execute(request);
            log.info("InsuranceProdapplyApplycheckReponseV1:"+response);
            boolean flag=response.isSuccess();
            if (flag) {
                // 业务成功处理
                log.info("InsuranceProdapplyApplycheck处理成功:sucess");
            } else {
                // 失败
                log.info("InsuranceProdapplyApplycheck处理失败:error");
            }

        } catch (Exception e) {
            log.info("InsuranceProdapplyApplycheck处理异常:"+e);
        }
    }
}
