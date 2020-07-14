package com.icbc.api;

import java.util.HashMap;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.MybankLoanDigitalcredentialsUploadtrdinformationRequestV1;
import com.icbc.api.request.MybankLoanDigitalcredentialsUploadtrdinformationRequestV1Biz;
import com.icbc.api.response.MybankLoanDigitalcredentialsUploadtrdinformationResponseV1;

public class MybankLoanDigitalcredentialsUploadtrdinformationTestV1 {
public static void main(String[] args) {
		
		try {

			String apigwPublicKey =  "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
			String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJ42tqQomxbLvuZTVKO4bBLwGp8SzRMiJ7jX9JNlS4sqmZzs9Z4lw/SSxf4dF9JJUErpNReUjzLp0As2FiuV8BALh6GYmiHGTWx7+v3HuWH9LiZNI00Ia+1HfpkJ8Sao8Ny5h1Pu49LayVleeLy496+phRE81dqlqaSHH8cKWnK1AgMBAAECgYBxod5f3QI2xzNe/e7GgAivOWAFbF16JofdDM4Opyww0fHucYqfgYRSPrCRqJeZYyqWAxUs0HhhGulfhAM8Xr5BxY5//x4HDqE2rOF7mrc/xkWNL+S9X5U0T8cdA3fnF/rYAUnJjKmeliuD2gcf5xYJENcnb8p/GQbiwIjoHDqe6QJBANzcevl9ke4cx1fa3ZcxVS3A1eHVtp573M/lo+8pRJlrf96ghFB54CzumsC0F7YfojDgCAN2egTqCGqNOuPJWWcCQQC3YqT5xlMlGk6Agav5Y6E5blx/AKJB8DeZSbjXLvytpXOASzoNR/A40uQXanXVqNU68l96FSq415AmTHi9OdWDAkA0el7t8Rw/i68B/Qsx5ZLrsCoh4vnlZmDtNQ9iwFeAbL6RU2qdBJhzlK5Io4IO0C1ll5XP3NLZYBJn3u7jOPB5AkEAiM/qHoHsM8j9effD0kmW1V7VWNajNqg9AnoykS73yaCem78DrzbVK7+B9UoyYNUVR2Xc/xpdhgsj+r6gcSN9ewJANSmxYF34601mteAnZwhyGKCJomiuSMNTr52i2uTspdZi0zqaerI1EGD3dAENxRebyPmPFxhwCcCbzF2gNUr1fw==";
			String appId = "XXXXXXXXXXXXXXXXXX";
			String url = "http://ip:8081/api/mybank/loan/digitalcredentials/uploadtrdinformation/V1";
			
			DefaultIcbcClient client = new DefaultIcbcClient(appId, privateKey,apigwPublicKey);
			MybankLoanDigitalcredentialsUploadtrdinformationRequestV1 request = new MybankLoanDigitalcredentialsUploadtrdinformationRequestV1();
			request.setServiceUrl(url);
			MybankLoanDigitalcredentialsUploadtrdinformationRequestV1Biz bizContent = new MybankLoanDigitalcredentialsUploadtrdinformationRequestV1Biz();
			HashMap<String,Object> bizParaMap = new HashMap<String,Object>();
			
			bizParaMap.put("serialNo", "XXXXXXXXXXXXXXXXXX");
			bizParaMap.put("appNo", "F-DCS");
			bizParaMap.put("areaCode", "");
			bizParaMap.put("employeeCode", "");
			bizParaMap.put("language", "zh_CN");
			bizParaMap.put("transNo", "IImportTradeInfoCocoaService");
			bizParaMap.put("ver", "1.0");
			
			HashMap<String,Object> modelMap = new HashMap<String,Object>();
			modelMap.put("appName", "appname");
			modelMap.put("tradeInfoType", "1");
			modelMap.put("contractNo", "11111111");

			JSONArray jsonArr = new JSONArray();
			JSONObject json = new JSONObject();
			//��һ��JSONObjectΪó����Ϣexcel�ϵı�ͷ��Ϣ
			json.put("fied1","��ͬʱƾ֤����,ƾ֤ʱ���ͺ�ͬ���");
			json.put("fied2","��ͬʱ����ƾ֤����,ƾ֤ʱ���ͺ�ͬ����");
			json.put("fied3","��ͬʱ����ƾ֤����,ƾ֤ʱ���͹�Ӧ������");
			json.put("fied4","��ͬʱ����ƾ֤���,ƾ֤ʱ���͹���������");
			json.put("fied5","��ͬʱ����ƾ֤����,ƾ֤ʱ���͡���ͬ���");
			json.put("fied6","����");
			json.put("fied7","��Ӧ��֤������");
			json.put("fied8","��Ӧ��֤������");
			json.put("fied9","������֤������");
			json.put("fied10","������֤������");

			//�ڶ���JSONObject֮��Ϊó����Ϣ��������    
			jsonArr.add(json);
			JSONObject json1 = new JSONObject();
			json.put("fied1","��ͬʱƾ֤����,ƾ֤ʱ���ͺ�ͬ���");
			json.put("fied2","��ͬʱ����ƾ֤����,ƾ֤ʱ���ͺ�ͬ����");
			json.put("fied3","��ͬʱ����ƾ֤����,ƾ֤ʱ���͹�Ӧ������");
			json.put("fied4","��ͬʱ����ƾ֤���,ƾ֤ʱ���͹���������");
			json.put("fied5","��ͬʱ����ƾ֤����,ƾ֤ʱ���͡���ͬ���");
			json.put("fied6","����");
			json.put("fied7","��Ӧ��֤������");
			json.put("fied8","��Ӧ��֤������");
			json.put("fied9","������֤������");
			json.put("fied10","������֤������");
			//......
             
			jsonArr.add(json1);
			modelMap.put("tradeInfoList", jsonArr);
			modelMap.put("class","com.icbc.hz1.service.dcs.tradeinfo.dto.ImportTradeInfoInModel");

			bizParaMap.put("model", modelMap);

			bizContent.setParam(bizParaMap);
			request.setBizContent(bizContent);
			
			MybankLoanDigitalcredentialsUploadtrdinformationResponseV1 response;		
			response = client.execute(request);
			if (response.isSuccess()) {
				String a = response.getReturnContent();
				log.debug(a);
				
			} else {
				
			}
		}  catch (IcbcApiException e1) {
			e1.printStackTrace();
		} 
	}
}
