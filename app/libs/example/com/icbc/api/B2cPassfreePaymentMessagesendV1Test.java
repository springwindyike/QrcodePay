﻿package com.icbc.api;

import java.util.List;

import org.junit.Test;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.B2cPassfreePaymentMessagesendRequestV1;
import com.icbc.api.request.B2cPassfreePaymentMessagesendRequestV1.B2cPassfreePaymentMsgSendRequestV1Biz;
import com.icbc.api.response.B2cPassfreePaymentMessagesendResponseV1;

public class B2cPassfreePaymentMessagesendV1Test {
	
	//appid
	protected static final String APP_ID = "10000000000000002156";
	
	//合作方私钥
	protected static final String MY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALAWAcPiTMRU906PTdy0ozspX7XptZnkEw2C8R64RDB9BiRFXAj0cU4aTA1MyfmGIlceeVdgJf7OnmvpHnYxjQ7sGxMItPtodrGwA2y8j0AEbHc5pNWU8Hn0zoY9smHS5e+KjSbWv+VNbdnrRFTpDeiJ3+s2E/cKI2CDRbo7cAarAgMBAAECgYABiA933q4APyTvf/uTYdbRmuiEMoYr0nn/8hWayMt/CHdXNWs5gLbDkSL8MqDHFM2TqGYxxlpOPwnNsndbW874QIEKmtH/SSHuVUJSPyDW4B6MazA+/e6Hy0TZg2VAYwkB1IwGJox+OyfWzmbqpQGgs3FvuH9q25cDxkWntWbDcQJBAP2RDXlqx7UKsLfM17uu+ol9UvpdGoNEed+5cpScjFcsB0XzdVdCpp7JLlxR+UZNwr9Wf1V6FbD2kDflqZRBuV8CQQCxxpq7CJUaLHfm2kjmVtaQwDDw1ZKRb/Dm+5MZ67bQbvbXFHCRKkGI4qqNRlKwGhqIAUN8Ynp+9WhrEe0lnxo1AkEA0flSDR9tbPADUtDgPN0zPrN3CTgcAmOsAKXSylmwpWciRrzKiI366DZ0m6KOJ7ew8z0viJrmZ3pmBsO537llRQJAZLrRxZRRV6lGrwmUMN+XaCFeGbgJ+lphN5/oc9F5npShTLEKL1awF23HkZD9HUdNLS76HCp4miNXbQOVSbHi2QJAUw7KSaWENXbCl5c7M43ESo9paHHXHT+/5bmzebq2eoBofn+IFsyJB8Lz5L7WciDK7WvrGC2JEbqwpFhWwCOl/w==";
	
	//网关公钥
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
	
	@Test
	public void test_cop() throws IcbcApiException {
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		B2cPassfreePaymentMessagesendRequestV1 request = new B2cPassfreePaymentMessagesendRequestV1();
		
		//根据测试环境和生产环境替换相应ip和端口
		request.setServiceUrl("https://ip:port/api/b2c/passfree/payment/messagesend/V1");

		B2cPassfreePaymentMsgSendRequestV1Biz bizContent = new B2cPassfreePaymentMsgSendRequestV1Biz();
		bizContent.setShopName("XXXXXX");
		bizContent.setCardno("62266666666666666");
		bizContent.setMerchantId("1234567890");
		bizContent.setMerchantType("1");
		bizContent.setMobile("13900000000");
		bizContent.setPartnerFlag("0");
		
		request.setBizContent(bizContent);

		B2cPassfreePaymentMessagesendResponseV1 response;
		try {
			response = client.execute(request, "msgId");
			if (response.isSuccess()) {
				// 业务成功处理-demo为返回数据集类型
				//String externalAgreementNo = response.getExternalAgreementNo();
				//String agreementNo = response.getAgreementNo();
				//String validTime = response.getValidTime();
				//String inValidTime = response.getInValidTime();
				String ums_msg_no = response.getUmsMsgNo();
			} else {
				// 失败
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}
	
}
