package com.icbc.api;


import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.B2cLicenseplatePaymentQueryRequestV3;
import com.icbc.api.request.B2cLicenseplatePaymentQueryRequestV3.B2cLicenseplatePaymentQueryRequestV3Biz;
import com.icbc.api.response.B2cLicenseplatePaymentQueryResponseV3;




public class B2cLicenseplatePaymentQueryV3Test {
	
	//appid
	protected static final String APP_ID = "************";
	
	//合作方私钥
	protected static final String MY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALAWAcPiTMRU906PTdy0ozspX7XptZnkEw2C8R64RDB9BiRFXAj0cU4aTA1MyfmGIlceeVdgJf7OnmvpHnYxjQ7sGxMItPtodrGwA2y8j0AEbHc5pNWU8Hn0zoY9smHS5e+KjSbWv+VNbdnrRFTpDeiJ3+s2E/cKI2CDRbo7cAarAgMBAAECgYABiA933q4APyTvf/uTYdbRmuiEMoYr0nn/8hWayMt/CHdXNWs5gLbDkSL8MqDHFM2TqGYxxlpOPwnNsndbW874QIEKmtH/SSHuVUJSPyDW4B6MazA+/e6Hy0TZg2VAYwkB1IwGJox+OyfWzmbqpQGgs3FvuH9q25cDxkWntWbDcQJBAP2RDXlqx7UKsLfM17uu+ol9UvpdGoNEed+5cpScjFcsB0XzdVdCpp7JLlxR+UZNwr9Wf1V6FbD2kDflqZRBuV8CQQCxxpq7CJUaLHfm2kjmVtaQwDDw1ZKRb/Dm+5MZ67bQbvbXFHCRKkGI4qqNRlKwGhqIAUN8Ynp+9WhrEe0lnxo1AkEA0flSDR9tbPADUtDgPN0zPrN3CTgcAmOsAKXSylmwpWciRrzKiI366DZ0m6KOJ7ew8z0viJrmZ3pmBsO537llRQJAZLrRxZRRV6lGrwmUMN+XaCFeGbgJ+lphN5/oc9F5npShTLEKL1awF23HkZD9HUdNLS76HCp4miNXbQOVSbHi2QJAUw7KSaWENXbCl5c7M43ESo9paHHXHT+/5bmzebq2eoBofn+IFsyJB8Lz5L7WciDK7WvrGC2JEbqwpFhWwCOl/w==";
	
	//网关公钥
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
	public static void main(String[] args) {
		
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		B2cLicenseplatePaymentQueryRequestV3 request = new B2cLicenseplatePaymentQueryRequestV3();
		
		//根据测试环境和生产环境替换相应ip和端口
		request.setServiceUrl("https://ip:port/api/b2c/licenseplate/payment/query/V3");

		B2cLicenseplatePaymentQueryRequestV3Biz bizContent = new B2cLicenseplatePaymentQueryRequestV3Biz();
		bizContent.setConsumerId("xxx");
		bizContent.setMerchantId("*******");
		bizContent.setMerchantType("1");
		bizContent.setPlateno("*******");
		bizContent.setPlatecolor("0");
		bizContent.setAreacode("****");
		bizContent.setMimsSend("1");
		
		request.setBizContent(bizContent);

		B2cLicenseplatePaymentQueryResponseV3 response;
		try {
			response = client.execute(request, "msgId");
			if (response.isSuccess()) {
				// 业务成功处理
				/*String plateno = response.getPlateno();
				String prtoex = response.getPrtoex();
				String startdate = response.getStartdate();*/
			} else {
				//失败
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}
	
}
