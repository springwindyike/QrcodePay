package com.icbc.api;

import java.util.logging.Logger;

import com.icbc.api.request.CorporatecustCustdemandStatusUpdateRequestV1;
import com.icbc.api.response.CorporatecustCustdemandStatusUpdateResponseV1;

public class MyBankCustomerCustdemandStatusupdateTest {

	static Logger log = Logger.getLogger(MyBankCustomerCustdemandStatusupdateTest.class.getName());
    //证书公钥
    protected static final  String MY_PUB_KEY =  "";
    //证书私钥
    protected static final String MY_PRIVATE_KEY="";
    //网关公钥
    protected static final String APIGW_PUBLIC_KEY = "";

    protected static final String APP_ID = "";

    public static void testApi(){
        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
        CorporatecustCustdemandStatusUpdateRequestV1 request = new CorporatecustCustdemandStatusUpdateRequestV1();
        request.setServiceUrl("http://ip:port/api/corporatecust/custdemand/status/update/V1");
        CorporatecustCustdemandStatusUpdateRequestV1.CorporatecustCustdemandStatusUpdateRequestV1Biz bizContent =
                new CorporatecustCustdemandStatusUpdateRequestV1.CorporatecustCustdemandStatusUpdateRequestV1Biz();

        bizContent.setDemandSeq("");
        bizContent.setOpertype("");

        request.setBizContent(bizContent);
        

        CorporatecustCustdemandStatusUpdateResponseV1 response;
        try {
            response = client.execute(request);
            if (response.isSuccess()) {
            	log.info("success");
            } else {
            	log.info("fail"+response.getReturnMsg());
            }
        } catch (IcbcApiException e) {
        	log.info(e.getMessage());
        }
    }

    public static void main(String[] args) {
        testApi();
    }
}
