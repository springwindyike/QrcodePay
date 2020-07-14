package com.icbc.api;

import com.icbc.api.request.MybankLoanInclusivefinanceRepayplanqryRequestV1;
import com.icbc.api.response.MybankLoanInclusivefinanceRepayplanqryResponseV1;

/**
 * @ClassName
 * @Descirption 个人经营贷款还款计划查询
 * @Author kfzx-chend1
 */
public class MybankLoanInclusivefinanceRepayplanqryTestV1 {
    //appid,privateKey,apigwPublicKey  根据实际的应用场景进行修改
    protected static final String appId = "123";

    protected static final String privateKey = "actualprivateKeyValue";
    protected static final String apigwPublicKey = "actualpublicKeyValue+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
    public static void main(String[] args) throws IcbcApiException {
        DefaultIcbcClient client = new DefaultIcbcClient(appId, privateKey, apigwPublicKey);
        MybankLoanInclusivefinanceRepayplanqryRequestV1 request = new MybankLoanInclusivefinanceRepayplanqryRequestV1();

        request.setServiceUrl("http://ip:port/api/mybank/loan/inclusivefinance/repayplanqry/V1");
        MybankLoanInclusivefinanceRepayplanqryRequestV1.MybankLoanInclusivefinanceRepayplanqryV1Biz param = new MybankLoanInclusivefinanceRepayplanqryRequestV1.MybankLoanInclusivefinanceRepayplanqryV1Biz();
        //公共参数
        param.put("serialNo", "12334455");
        param.put("appNo", "F-EBNKP");
        param.put("areaCode", "0020000072");
        param.put("employeeCode", "000393868");
        param.put("language", "zh_CN");
        param.put("transNo", "IQueryPerLoaRepayPlanCocoaService");
        param.put("ver", "1.0");
        param.put("turnPageFlag", "");
        param.put("beginRow", "");
        param.put("rowCount", "");
        //私有参数
        param.put("cooperUnit", "ST2313014");
        param.put("lnno", "1");
        param.put("apply_no", "123");
        param.put("ebank_loan_apply_no", "123");
        param.put("init_flag", "1");
        param.put("rtnplan_no", "");
        param.put("begindate", "2019-01-01");
        param.put("enddate", "2020-01-01");
        param.put("cnltype", "405");
        param.put("terminal_type", "");
        param.put("terminal_ip", "");
        param.put("terminal_mac", "");

//        System.out.println("-------个人经营贷款还款计划查询 入参--------" + param);
        request.setBizContent(param);
        MybankLoanInclusivefinanceRepayplanqryResponseV1 response = new MybankLoanInclusivefinanceRepayplanqryResponseV1();
        try {
            response = client.execute(request);
        } catch (Exception e) {
//            System.out.println(e.getMessage());
        }
        if (response.isSuccess()) {
//            System.out.println("success!");
        } else {
//            System.out.println("fail" + response.getReturnMsg());
        }
//        System.out.println(response);
    }


}
