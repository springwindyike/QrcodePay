package com.icbc.api;

import org.junit.Test;
import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.request.EnterpriseOpenpayReleaseRequestV1;
import com.icbc.api.request.EnterpriseOpenpayReleaseRequestV1.EnterpriseOpenpayReleaseV1Biz;
import com.icbc.api.response.EnterpriseOpenpayReleaseResponseV1;

public class EnterpriseOpenpayReleaseTest {

	protected static final String MY_PRIVATE_KEY ="Al84Gc7IXKWHVROXmB5N9W6qTBJPbdfnIEOtETezC5qCKZKhcFrEw";

	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	protected static final String APP_ID = "10000000000000004447";
	
	protected static final String password = "12345678";
	
	protected static final  String MY_PUB_KEY = "MIIDDzCCAfegAwIBMHZ1txuq1xDPSQSZAOIUvUvG3BRr/mwrpePcTpPhZubSHlCYAG68A==";
	
	@Test 
	public void test_cop() { 
	// ����client����
	DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY,MY_PUB_KEY,password);

	// �����������request
	EnterpriseOpenpayReleaseRequestV1 request = new EnterpriseOpenpayReleaseRequestV1();
	// ��������·��
	request.setServiceUrl("http://IP:PORT/api/enterprise/openpay/release/V1");
	

	EnterpriseOpenpayReleaseV1Biz bizContent = new EnterpriseOpenpayReleaseV1Biz();

	bizContent.setTransCode("ZJJK"); 
	bizContent.setCis("dongxiao2017045"); 
	bizContent.setBankCode("102"); 
	bizContent.setId("xiaoqiao02030327.y.0200"); 
	bizContent.setTranDate("20201231"); 
	bizContent.setTranTime("105899000"); 
	bizContent.setfSeqno("ZJJKHB20180305104754-12"); 
	bizContent.setFileCode("0200EH0003042"); 
  bizContent.setTradePlatCode("0200TT0001002"); 
	bizContent.setTradePlatName("tmptest"); 
	bizContent.setFileSerialno("new032"); 
	bizContent.setOrgFileSerialno("ZJBL1236"); 
  bizContent.setCurrType("001"); 
  bizContent.setAmt("1"); 
	bizContent.setUserRem("010-8270XXXX"); 
  bizContent.setSignTime("20210101144749923"); 
    
	request.setBizContent(bizContent);
	
	EnterpriseOpenpayReleaseResponseV1 response; 
	 try { 
	  response = (EnterpriseOpenpayReleaseResponseV1) client.execute(request, "msgID"); 
	  if (response.isSuccess() ) { 
	   // ҵ��ɹ����� 
		  System.out.println("success");//
		 } else { 
		   // ʧ�� 
		  System.out.println("error");
		 }   
	 } catch (IcbcApiException e) { 
	  e.printStackTrace(); 
	 } 
	}
	
}
