package com.icbc.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.InvestmentFundtrusteeTraninstrresultqueryRequestV1;
import com.icbc.api.response.InvestmentFundtrusteeTraninstrresultqueryResponseV1;

/**
 * Created by Administrator on 2018/10/16.
 */
public class InvestmentFundtrusteeTraninstrresultqueryV1Test {

    protected static final String MY_PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDWmOlJokJT6xlOU7oo5B3y6MOn1qQhpJQFTU6KlxK8TTAFJKPhUk3To5Jv49FL5qf6pR5rfjdTa3YnO9SXzj2ElZyQL19DQ1QsXDDi81sqJvejzb+5g4HG69A+jaYY2FrxDzCKqbcYxMq8M0+u/7S0xGeKXEcAOZ3SzvJHc3SHiRChqbxvZHguNjV/Cr4tYyOcMeWvQh7J6BDnYqMhfVtXEl3X49IS/hYPdc95CBSfqGYlG2O5fAXKxYQcEVb8VYF+JDNqBMmm0zUG4bo4LvPpwPhMjK6ssLRTEcPPDK6bNVfI/nMI6J203ABaAnZvEFLB0aNrYkfsn2HEYeJdixV5AgMBAAECggEBAKle5HkOTIVJP57XbE1LxetrFMlKGh7Hc2A/5KZzmADwdt8ITSPQPsa0CiavSwg50wh6++hhJK99WDKdASyTRXB4WKpgCTLgV/XvCVKGOcSqHre08wYrKeljQuesCpT/Zb9ueqRmULGG2G/zm4eGIAywGvxT2mHuF4dDeGs2T5mL/JgcQTBN9TmepavsA2M6z9Zkj4xXyGkAHQ5fa1DuWSW2BhaDf2Gid3NGZDUTgxt9jr4xNDTSw8fqMAqOHh5lQHAe2vvPHsURk2oKYQ/1iGBRR8uo/U/pcfVVAZmixH6ePpR+wM4j8aTJOdeYvhsgpvF013uvKRAtqNeMWHKAMYECgYEA++EGAsbWuJPau1640P6I4wtwuRxGc5eQawCsxxSdVUni9gUyKF+O+NuuzARYXWLe5WNpTXtdWU6ExoMOvK5p1YwZhgPVcn8+V7e3+i0tCJU3SlsH93wIhPcTPL/sNRTBFl4vL0C000+dI59mormQL1UrJ3N0F5sAI+wthYlV1PECgYEA2hu8eFIR3HMEMMzfTOFqY4+Cpoi4vcHl0yyvfIm07hyXYqdBqCvCz3h5Sb9pXHundz7Sp+s0hY+jptAHu1aM3VjYma2VEcZrycvV8u31GBZIawekg8DD+IIGQ3qVSo4OtfVhzj9tEcFP6gsV6BxF3tjY0skfRtOL01h1YEEsKQkCgYBv2hKgQwpxNv9oO30ZGh9Rq+/n1B2ZEVJJoigX1Bi2GjSWieInOaA09OFfqgJPnitbdFT72m+uzAZ8XRC7SzymXyuqbqNn0AewTl5903fvGsxN0bTs+wCRg2LglF3hiJDiTPrpIfPq7qzad9vNIVhdHJYoU8XXAbcDPMtORJmAEQKBgQC4p7TX9Tuz9Rh+LGV9VHbbFbwaPDSUSx3FvNZRzNCGq2QrnMlElNAZELk3C7wrFXGBzolQqxxLW4HFD+kL3UnjeH3hFgnYA7JsJYvcYUQZAXyMSOsqtL/1nDerV5Qfi8e+m6ITmLVBy/VZg8snORCai+J+CtLVBvMhmom9VVAK6QKBgQDC6U36jF0SLhmk1Zk6vU6zDgTO8IF7UnkuAs0jzOLqeyclKVXGraf9YDGjF+WVdOwknFa5P+TpEHtxaXsf5apfUpbXGiCGh04okJX+UFvmWjpnsEmrVD0YX+d1TBE0PsiXw5AEa7OSUf9cq1RUWir/f6CScTyddFBRYhDdISqjug==";

    protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

    protected static final String APP_ID = "10000000000000014027";

    @Test
    public void test_cop() throws IcbcApiException {

        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);

        InvestmentFundtrusteeTraninstrresultqueryRequestV1 request = new InvestmentFundtrusteeTraninstrresultqueryRequestV1();
        InvestmentFundtrusteeTraninstrresultqueryRequestV1.InvestmentFundtrusteeTraninstrresultqueryRequestV1Biz bizContent = new InvestmentFundtrusteeTraninstrresultqueryRequestV1.InvestmentFundtrusteeTraninstrresultqueryRequestV1Biz();
        InvestmentFundtrusteeTraninstrresultqueryRequestV1.InvestmentFundtrusteeTraninstrresultqueryRequestV1In in = new InvestmentFundtrusteeTraninstrresultqueryRequestV1.InvestmentFundtrusteeTraninstrresultqueryRequestV1In();
        InvestmentFundtrusteeTraninstrresultqueryRequestV1.InvestmentFundtrusteeTraninstrresultqueryRequestV1InRecord record = new InvestmentFundtrusteeTraninstrresultqueryRequestV1.InvestmentFundtrusteeTraninstrresultqueryRequestV1InRecord();
        List<InvestmentFundtrusteeTraninstrresultqueryRequestV1.InvestmentFundtrusteeTraninstrresultqueryRequestV1InRecord> list = new ArrayList<>();

        in.setFileType("1261");
        in.setFundId("202101");
        in.setReportType("01");
        in.setBeginDate("20170117");
        in.setEndDate("20170117");
        in.setDeptCode("0001");
        in.setCertId("");
        in.setSerialNo("20160502000001066382");

        record.setTimestmp("20170117");
        record.setSeqNo("ZLS2021012015072710002");
        record.setsFileType("");
        list.add(record);
        in.setRecordList(list);

        bizContent.setIn(in);
        request.setBizContent(bizContent);

        request.setServiceUrl("http://122.64.109.110:8081/api/investment/fundtrustee/traninstrresultquery/V3");
        InvestmentFundtrusteeTraninstrresultqueryResponseV1 response = client.execute(request);

        System.out.println(JSONObject.toJSONString(response));
        if (response.isSuccess()) {
            // 业务成功处理
            System.out.println("success.");
        } else {
            // 失败
            System.out.println("error." + response.getReturnCode() + response.getReturnMsg());
        }

    }

}
