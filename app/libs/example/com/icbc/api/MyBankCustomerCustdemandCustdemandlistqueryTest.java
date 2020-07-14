package com.icbc.api;


import java.util.logging.Logger;

import com.icbc.api.request.CorporatecustCustdemandCustdemandlistQueryRequestV1;
import com.icbc.api.response.CorporatecustCustdemandCustdemandlistQueryResponseV1;

public class MyBankCustomerCustdemandCustdemandlistqueryTest {

	static Logger log = Logger.getLogger(MyBankCustomerCustdemandCustdemandlistqueryTest.class.getName());
    //证书公钥
    protected static final  String MY_PUB_KEY =  "";
    //证书私钥
    protected static final String MY_PRIVATE_KEY="";
    //网关公钥
    protected static final String APIGW_PUBLIC_KEY = "";

    protected static final String APP_ID = "";

    public static void testApi(){
        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
        CorporatecustCustdemandCustdemandlistQueryRequestV1 request = new CorporatecustCustdemandCustdemandlistQueryRequestV1();
        request.setServiceUrl("http://ip:port/api/corporatecust/custdemand/custdemandlist/query/V1");
        CorporatecustCustdemandCustdemandlistQueryRequestV1.CorporatecustCustdemandCustdemandlistQueryRequestV1Biz bizContent = new CorporatecustCustdemandCustdemandlistQueryRequestV1.CorporatecustCustdemandCustdemandlistQueryRequestV1Biz();
        bizContent.setCompanyId("");
        bizContent.setStatus("");
        bizContent.setCurrType("");
        bizContent.setProdType("");
        bizContent.setCreateDateBeg("");
        bizContent.setCreateDateEnd("");
        bizContent.setBegNum(21);
        bizContent.setFetchNum(20);

        request.setBizContent(bizContent);

        CorporatecustCustdemandCustdemandlistQueryResponseV1 response;
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
