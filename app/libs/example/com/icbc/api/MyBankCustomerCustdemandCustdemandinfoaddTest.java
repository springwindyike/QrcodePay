package com.icbc.api;


import java.util.logging.Logger;

import com.icbc.api.request.CorporatecustCustdemandAddRequestV1;
import com.icbc.api.response.CorporatecustCustdemandAddResponseV1;
import com.icbc.api.DefaultIcbcClient;


public class MyBankCustomerCustdemandCustdemandinfoaddTest {
	static Logger log = Logger.getLogger(MyBankCustomerCustdemandCustdemandinfoaddTest.class.getName());
    //证书公钥
    protected static final  String MY_PUB_KEY =  "";
    //证书私钥
    protected static final String MY_PRIVATE_KEY="";
    //网关公钥
    protected static final String APIGW_PUBLIC_KEY = "";

    protected static final String APP_ID = "";

    public static void testApi(){
    	

        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
        CorporatecustCustdemandAddRequestV1 request = new CorporatecustCustdemandAddRequestV1();
        request.setServiceUrl("http://ip:port/api/corporatecust/custdemand/add/V1");
        CorporatecustCustdemandAddRequestV1.CorporatecustCustdemandAddRequestV1Biz bizContent = new CorporatecustCustdemandAddRequestV1.CorporatecustCustdemandAddRequestV1Biz();
        
        bizContent.setAccNo("");
        bizContent.setCustId("");
        bizContent.setCustName("");
        bizContent.setCompanyId(""); 
        bizContent.setProjectName("");
        bizContent.setProdTop("");
        bizContent.setProdKind("");
        bizContent.setProdType("");
        bizContent.setIntentionMoney("");
        bizContent.setCurrType("");
        bizContent.setIntentionPrice("");
        bizContent.setIntentionTerm("");
        bizContent.setTermType("");
        bizContent.setMessageAdvice("");
        bizContent.setAttchName("");
        bizContent.setAttchSeq("");
        bizContent.setOperType(""); 
        bizContent.setCustWishDate("");
        bizContent.setDataSource("");
        bizContent.setContactPerson("");
        bizContent.setContactPhone("");
        bizContent.setBusinessProdType("");
        bizContent.setProdDesc("");
        request.setBizContent(bizContent);

        CorporatecustCustdemandAddResponseV1 response;
        
        try {
        	
            response = (CorporatecustCustdemandAddResponseV1)client.execute(request);
            
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
