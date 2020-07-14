package com.icbc.api;

import org.junit.Test;

import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.IotpthingCargpsUnbindRequestV1;
import com.icbc.api.request.IotpthingCargpsUnbindRequestV1.IotpthingCargpsUnbindRequestV1Biz;
import com.icbc.api.response.IotpthingCargpsUnbindResponseV1;

public class IotpthingCargpsUnbindV1test {
	protected static final String MY_PRIVATE_KEY = "MIICdg...";

	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	protected static final String APP_ID = "100000000000000XXXXX";

	@Test
	public void test_cop() throws IcbcApiException {
		
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		
		IotpthingCargpsUnbindRequestV1 request = new IotpthingCargpsUnbindRequestV1();
		
		request.setServiceUrl("https://gw.open.icbc.com.cn/api/iotpthing/cargps/V1/unbind");
		
		IotpthingCargpsUnbindRequestV1Biz bizContent = new IotpthingCargpsUnbindRequestV1Biz();		
		bizContent.setCorpId("GPS0100001");
		bizContent.setOperUser("王五");
		bizContent.setVin("LSGJA52H1GS068943");	
		bizContent.setDevSn("868120154592495");
		
		request.setBizContent(bizContent);
		
		IotpthingCargpsUnbindResponseV1 response = client.execute(request);
		
		System.out.println(JSONObject.toJSONString(response));
		// 判断调用是否成功，进行后续业务处理 
		if (response.isSuccess()) {
			// TODO 业务成功处理 
			System.out.println(response.getReturnMsg());
		} else { 
			// TODO 失败 
			System.out.println(response.getReturnMsg()); 
		}	
		
	}

}
