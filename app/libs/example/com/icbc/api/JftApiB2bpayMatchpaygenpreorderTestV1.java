package com.icbc.test;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.JftApiB2bpayMatchpaygenpreorderRequestV1;
import com.icbc.api.response.JftApiB2bpayMatchpaygenpreorderResponseV1;

import java.util.Collections;

public class JftApiB2bpayMatchpaygenpreorderTestV1 {

    public void test() throws IcbcApiException {

        String APP_ID = "10000000000002554554";
        String MY_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCF7eCVTURFK5+gpeaQios8lw6uTcltPalYM6/VNfNDAirGnpFP5RQNI7duf5nr+3QLe1FNMbaR6Cl1BeWcaFzYqba4UTjNrttGf9E2LBnVa7sR0sVWX/1o71nIou21+Wh044zqcSl1T6FEBpSP70fz5ahytU41hVy6lyJymDhyWzZepr4Yqnrs69GB6V/v2DDuX8t4tpZAK1cxsOSrBJHOYxUoTomLb9dX8dFI/4AIShjKv4hmwryviHJRlZSiyV8j72FgOUs7BmMz+KCaKGVGo1G+YrppnX5IruNvaXDB59bcu3lsjPODUkfMKsMr+Vrg4ipDEboCCtKuaPrZ2xMNAgMBAAECggEAY3qQcXWl+xbvB52Sx9QQnh25yuB+eETvz1L9DQp4uVIXwdYwKz8FiMj5y/q9stnglVKwzfzaFkBy4rhRl76xEEHnNbsmzShPOWthU7KoMa1Gk3OSHplIGjSG5Q+YL62k2AXZOp55Y+iU6XlVyh+6uz/fwexHvltjyDjQXnwQmWdvUHM+cy7yTxlfz8FGecZOyRY2jRUJZ7w0WfUx0p1R0vWRRpjRddMDyu7sjtkTQ54KfmqE5HQWKrQVDio2hSw7EbaylAo6HSZO8i2ZSW3neKenvV2YCUVk6AbhfJj/SfTzqzEePduOv5bUq/vaTRCWAImcHnohLhzQQS5zn3jDpQKBgQDTncyUAAOL275viu9Xbk2IBsv/tyFaNji/G8BdE0jB++7x7J3EtLRJIBOJE16vvWUJfD7CXvezqArZWLADt7lholdPuUKlEOJtXvqlYvg7zKDce+wA7HAK0a2sMSvU51nC0q4LLaI+NlGxZZcPYcoj6PYLXw/BHaqGAHm5Y+RMhwKBgQCiBNz3zYP4RnfBTazWBRm3P7jybcteFMh5inmOyw9mfpphIUpFlw9lRbt7J2+sauzlIKZ2d9MOoZIurAZ/zbgIf2msTEoyczzO6yUpyeKinl6HjizMKggLEponU7nk2nQsuVbf7wYoHPwwjT+a5k9R+PMrYVO0B74Z8PIQpHd8ywKBgQCD//qMlzWfGANCMLf7IaLbJuI5MFJto0TicL0dUdogprX10lLXUKDkvE1zQ9HcbZeIwyeitvpr5nZd/SROLVxFuq4b3MPlkxKqhoRyhbmyE4KEBgjAyrtZBFIBBusAcw9ap3BJKL37cIak0WnY/nbIz5gqn7GEFK05yTIkolrWIQKBgH2U42m4BKi2hjBw8pzZSzt8yvAuJkoANfvvV5VU09UQIL1Uvmr+UdKfoFgvEyJDpudazWxaKF/Y4KQIduktHY6Io/IHGCPOqr2ACkg/0clWk9LiYtrFYYKjopUFErvOj+nypuHgNZd2EAvaEAkSpzzUiDeBsw2CStl0p0w7DtrNAoGAIsqskDGGewcgBWQmXvSqa7o0do3coiH3ToMAQm9vlGgHAAw5xlgfVQpGwe8GR4ilysh+5EuiuLnINDt0tXpv9K7dAQgjKAmszFrOjmyBMnSDebfysynABFj3c8GglO+l9J+ljFMqgqPVzsLAgIItciyq80Xmv8TjpbwFM2v34lI=";
        String icbcPulicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY,
                icbcPulicKey);

        JftApiB2bpayMatchpaygenpreorderRequestV1 request = new JftApiB2bpayMatchpaygenpreorderRequestV1();
        request.setServiceUrl("http://122.64.61.194:8081/api/jft/api/b2bpay/aggregatepay/V1");

        JftApiB2bpayMatchpaygenpreorderRequestV1.JftApiB2bpayMatchpaygenpreorderRequestV1Biz bizContent = new JftApiB2bpayMatchpaygenpreorderRequestV1.JftApiB2bpayMatchpaygenpreorderRequestV1Biz();

        bizContent.setAppId("10000000000007354589");
        bizContent.setOutVendorId("04187334");
        bizContent.setOutUserId("100176524");
        bizContent.setNotifyUrl("http://www.xxx.com");
        bizContent.setJumpUrl("http://www.xxx.com");
        bizContent.setOutOrderId("20181128531212026");
        bizContent.setTradeTime("2019-04-24 11:11:11");
        bizContent.setTrxChannel("01");
        bizContent.setTrxIp("xx.xx.xx.xx");
        bizContent.setPayAmount("0.11");
        bizContent.setOrderAmount("0.11");
        bizContent.setPayMethod("01");
        bizContent.setPayRem("试一下");
        bizContent.setOrderRem("食品");
        bizContent.setAddRemark("食品");
        bizContent.setPayerType("3");
        bizContent.setPayerAcctId("1001765234");
        bizContent.setPayerName("万众集团");
        bizContent.setPayerAcctNum("万众集团");
        bizContent.setCurrency("001");
        bizContent.setRecAcctId("123654123");
        bizContent.setAsynFlag("0");


        JftApiB2bpayMatchpaygenpreorderRequestV1.JftApiB2bpayMatchpaygenpreorderRequestV1Biz.Good goodsInfo = new JftApiB2bpayMatchpaygenpreorderRequestV1.JftApiB2bpayMatchpaygenpreorderRequestV1Biz.Good();
        goodsInfo.setGoodsSeqno("1");
        goodsInfo.setGoodsName("牛肉干");
        goodsInfo.setGoodsNum("10");
        goodsInfo.setGoodsAmt("10");
        goodsInfo.setWeight("肉干");
        goodsInfo.setPrice("50");
        goodsInfo.setSellerAddress("13866668");
        goodsInfo.setSellerName("牛大");
        goodsInfo.setUnits("斤");

        bizContent.setGoodsId("123456789");
        bizContent.setGoodsInfo(Collections.singletonList(goodsInfo));

        request.setBizContent(bizContent);

        JftApiB2bpayMatchpaygenpreorderResponseV1 responseV1 = client.execute(request);
        System.out.println(responseV1);

    }
}