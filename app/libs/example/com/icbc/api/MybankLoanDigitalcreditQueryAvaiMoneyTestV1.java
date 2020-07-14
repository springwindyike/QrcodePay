package com.icbc.api;

import java.util.HashMap;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.MybankLoanDigitalcreditQueryAvaiMoneyRequestV1;
import com.icbc.api.request.MybankLoanDigitalcreditQueryAvaiMoneyRequestV1Biz;
import com.icbc.api.response.MybankLoanDigitalcreditQueryAvaiMoneyResponseV1;

public class MybankLoanDigitalcreditQueryAvaiMoneyTestV1 {
public static void main(String[] args) {
		
		try {

			String apigwPublicKey =  "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
			String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJ42tqQomxbLvuZTVKO4bBLwGp8SzRMiJ7jX9JNlS4sqmZzs9Z4lw/SSxf4dF9JJUErpNReUjzLp0As2FiuV8BALh6GYmiHGTWx7+v3HuWH9LiZNI00Ia+1HfpkJ8Sao8Ny5h1Pu49LayVleeLy496+phRE81dqlqaSHH8cKWnK1AgMBAAECgYBxod5f3QI2xzNe/e7GgAivOWAFbF16JofdDM4Opyww0fHucYqfgYRSPrCRqJeZYyqWAxUs0HhhGulfhAM8Xr5BxY5//x4HDqE2rOF7mrc/xkWNL+S9X5U0T8cdA3fnF/rYAUnJjKmeliuD2gcf5xYJENcnb8p/GQbiwIjoHDqe6QJBANzcevl9ke4cx1fa3ZcxVS3A1eHVtp573M/lo+8pRJlrf96ghFB54CzumsC0F7YfojDgCAN2egTqCGqNOuPJWWcCQQC3YqT5xlMlGk6Agav5Y6E5blx/AKJB8DeZSbjXLvytpXOASzoNR/A40uQXanXVqNU68l96FSq415AmTHi9OdWDAkA0el7t8Rw/i68B/Qsx5ZLrsCoh4vnlZmDtNQ9iwFeAbL6RU2qdBJhzlK5Io4IO0C1ll5XP3NLZYBJn3u7jOPB5AkEAiM/qHoHsM8j9effD0kmW1V7VWNajNqg9AnoykS73yaCem78DrzbVK7+B9UoyYNUVR2Xc/xpdhgsj+r6gcSN9ewJANSmxYF34601mteAnZwhyGKCJomiuSMNTr52i2uTspdZi0zqaerI1EGD3dAENxRebyPmPFxhwCcCbzF2gNUr1fw==";
			String appId = "10000000000000005509";
			String url = "http://122.64.109.110:8081/api/mybank/loan/digitalcredit/queryAvaiMoney/V1";
			
			DefaultIcbcClient client = new DefaultIcbcClient(appId, privateKey,apigwPublicKey);
			MybankLoanDigitalcreditQueryAvaiMoneyRequestV1 request = new MybankLoanDigitalcreditQueryAvaiMoneyRequestV1();
			request.setServiceUrl(url);
			MybankLoanDigitalcreditQueryAvaiMoneyRequestV1Biz bizContent = new MybankLoanDigitalcreditQueryAvaiMoneyRequestV1Biz();
			HashMap<String,Object> bizParaMap = new HashMap<String,Object>();
			
			bizParaMap.put("SerialNo", "201805131234567");
			bizParaMap.put("AppNo", "F-EBANKC");
			bizParaMap.put("AreaCode", "");
			bizParaMap.put("Teller", "");
			bizParaMap.put("Language", "zh_CN");
			bizParaMap.put("Verify", "");
			bizParaMap.put("TransNo", "IQueryAvaiMoneyService");
			bizParaMap.put("VER", "1.0");
			bizParaMap.put("PlatformNo", "02");
			bizParaMap.put("CustomerNumb", "1");			
			bizParaMap.put("CertificateType","01");
			
			bizContent.setParam(bizParaMap);
			request.setBizContent(bizContent);
			
			MybankLoanDigitalcreditQueryAvaiMoneyResponseV1 response;		
			response = client.execute(request);
			if (response.isSuccess()) {
				String a = response.getReturnContent();
				System.out.println(a);
				
			} else {
				
			}
		}  catch (IcbcApiException e1) {
			e1.printStackTrace();
		} 
	}
}
