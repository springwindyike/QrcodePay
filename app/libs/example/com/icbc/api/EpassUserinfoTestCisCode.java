package com.icbc.api;
import com.icbc.api.request.EpassUserinfoRequestV1;
import com.icbc.api.request.EpassUserinfoRequestV1.EpassUserinfoRequestV1Biz;
import com.icbc.api.response.EpassUserinfoResponseV1;

public class EpassUserinfoTestCisCode {

	//1�����ع�Կ
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
	//2��appid ����ͨ��֤APP 
	protected static final String APP_ID = "10000000000000014027";
	//3����Կ����֤��ʽ����Կ��APIƽ̨�Ǽǣ��˴�Ϊ˽Կ �������
	protected static final String MY_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCVZypmsxSW20n4PU9vbmaf3XHD9zLpclYDUCmYQB32uEysnVLRdnzhH8bk5TMH3hQ6/gnBq+UmUlr+mjmow78nEG4o6A34BPpIqCvCHhX2PUydE5aPlqn6XlBfL0YlBOXHj413svg+uiGfpqGWKKiXbJL52savN9d0EbK++SQDQMMkDfoAAu0f98H5eLMcO5j62zjX+cUNh3VQNsoNCpmbVC67uYCoNBXY5VQwOELZeyZr9CZli0tYj+zhFYruNqFXAAULtSZE29iksHbOgqS3aDpetDPEq4cldz+tgxSeIIS3llQ7mHtHiHjucONSBWBGL756kYgByR7lh3GWBcDrAgMBAAECggEAcSiQfvTIdXJmVjTpw3aVGCR7lHfZAePtrdi7iGuXxlTVDjCil6/s6f5NgPTwb9cO75eWADCYASyDay+Y2HBaidXx+d25Js9uWjW13vM2oyjOrHI3qU3uNInWyiFeOY+6EipydeUCDVChQvDMlpT5DKfZspC3x+K9t1XoUqkVU7hDCnxHSa4Y6qf5TLavWKKdOoxDJQ8CPvL4nj9eRozdCAmh6CoXMgCcF71osfZNAsZ9de8yfJpHiLQUojHufup503ituSDcDXbr09rOjpY1CiqixLPPaUuHjB7dPXOrL+B/MkDZ2FHfSTdavH3T6gXBFk7a3D0MlS0t9BObi+qecQKBgQDMYy6TkYiheH5IaLLm57SszNBO1OQTezSHUnp84NqCnrWaMV7y2zv9xItxvotnd7ezcW3Pdet66ZSuQcu5b2mllsY0ewmOkhzgJ+OZEVDVF3lyxgzsvtB23VT0EgHhinyy+v2fnQQSyrv3q3RiunrrCdP74+N8tagZRsjK0+4y/QKBgQC7IXZ6+oX1VkscUTlXpx+R+NTzBTAqKSOOezQP/yXpTwpmXNhquvNMGDjAZgZaN0emsbhqSZMbFgo5llURbn+elsdjSDeL3ZkzszecU5Qh6c7hwfs6XxKlInu3ch4VHWt8PAYXmncy8t4fZZQwGNOlKvKTR6OSDBN5E30P8yCMBwKBgBnkHoxXDUXXK7gkezVA+ORC9chms5W8L8VMr3OOUF/nlv23b124Y/sboMaB6srqoXy7y7tSJshlOo5wi0wsTufJF8aiJ23GGJ5Ur0I+rUyxMpNVf2GmMmY8V3yro01c67sIjIRhsZhn0jPnplCzasrHbfEkxzaPFIJPMzRucGhJAoGAS/1BtJzJCyB4rc4aAAsgmdE3AFyp+2TrSG+la52L0ptDOOAZDfZO2Ca53P9RMw9hrEJdBeRMtWIU0t/GOabqcgb+fsWTsNtS3Bi5y2RxMfhVB34TO9fhpWdEX/EaYC6rOC7TtoAGSY0wQAWq0IE0aMzw5nff52259p/AWFq9a78CgYBC2nuWLVUjsVlZDxjQAkuHCfKW9JZOcUNUrCSNArArw9BgTiVBCJOp3hcYszp6+H+rUhuKxwdNHRU0fboOhoXt05gvwhsFNxTD7M3WhPrYLY/wGupFMyKLflhBBpJCLlxHRwpdPk1peWZ4SWQ+UzzLANzdazBWMVYdZtBZT8rzvQ==";

	public static void main(String[] args) throws Exception {
		
		//ǩ������ΪSHA256WithRSAʱ���贫��appid��˽Կ�����ع�Կ��ǩ������ʹ�ö�ֵIcbcConstants.SIGN_TYPE_RSA2����������ʹ��ȱʡֵ
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		
		EpassUserinfoRequestV1 request = new EpassUserinfoRequestV1();
		
		//4�����ݲ��Ի��������������滻��Ӧip�Ͷ˿�
		//��������
		request.setServiceUrl("http://122.64.61.80:8081/oauth/api/epass/userinfo/CisNum/V1");

		//5������սӿ��ĵ���bizContent.setxxx()������ҵ���������ݽ��и�ֵ			
		EpassUserinfoRequestV1Biz bizContent = new EpassUserinfoRequestV1Biz();
		bizContent.setAPIGW_APPID("10000000000000014027");
		bizContent.setCHANNELCODE("904");
		bizContent.setclientIp("127.0.0.1");
		bizContent.setcurrentMAC("68-F7-28-C8-C2-AD");
		bizContent.setmsg_id("1234567890");
		bizContent.setFCODE("passGetUserInfo");
		bizContent.settimestamp("");
		request.setBizContent(bizContent);
		//����������
		EpassUserinfoResponseV1 response = new EpassUserinfoResponseV1();
		try {
			response = client.execute(request);
			//System.out.println(JSONObject.toJSONString(response));
			if (response.isSuccess()) {
				//6��ҵ��ɹ���������ݽӿ��ĵ���response.getxxx()��ȡͬ�����ص�ҵ������
				int retcode = response.getReturnCode();
				System.out.println("ReturnCode:"+retcode);
				System.out.println("CisNum:" + response.getCisCode());
			} else {
				//ʧ��
				System.out.println("ReturnCode:"+response.getReturnCode());
				System.out.println("ReturnMsg:"+response.getReturnMsg());
			}		
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}

	
}

