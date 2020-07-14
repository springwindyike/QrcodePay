package com.icbc.api;

import org.junit.Test;

import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.JftWalletApiVIPCardopensendmsgRequestV1;
import com.icbc.api.request.JftWalletApiVIPCardopensendmsgRequestV1.JftWalletApiVIPCardopensendmsgRequestV1Biz;
import com.icbc.api.response.JftWalletApiVIPCardopensendmsgResponseV1;

public class JftWalletApiVipcardopensendmsgV1 {

	String MY_PRIVATE_KEY2 = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCF7eCVTURFK5+gpeaQios8lw6uTcltPalYM6/VNfNDAirGnpFP5RQNI7duf5nr+3QLe1FNMbaR6Cl1BeWcaFzYqba4UTjNrttGf9E2LBnVa7sR0sVWX/1o71nIou21+Wh044zqcSl1T6FEBpSP70fz5ahytU41hVy6lyJymDhyWzZepr4Yqnrs69GB6V/v2DDuX8t4tpZAK1cxsOSrBJHOYxUoTomLb9dX8dFI/4AIShjKv4hmwryviHJRlZSiyV8j72FgOUs7BmMz+KCaKGVGo1G+YrppnX5IruNvaXDB59bcu3lsjPODUkfMKsMr+Vrg4ipDEboCCtKuaPrZ2xMNAgMBAAECggEAY3qQcXWl+xbvB52Sx9QQnh25yuB+eETvz1L9DQp4uVIXwdYwKz8FiMj5y/q9stnglVKwzfzaFkBy4rhRl76xEEHnNbsmzShPOWthU7KoMa1Gk3OSHplIGjSG5Q+YL62k2AXZOp55Y+iU6XlVyh+6uz/fwexHvltjyDjQXnwQmWdvUHM+cy7yTxlfz8FGecZOyRY2jRUJZ7w0WfUx0p1R0vWRRpjRddMDyu7sjtkTQ54KfmqE5HQWKrQVDio2hSw7EbaylAo6HSZO8i2ZSW3neKenvV2YCUVk6AbhfJj/SfTzqzEePduOv5bUq/vaTRCWAImcHnohLhzQQS5zn3jDpQKBgQDTncyUAAOL275viu9Xbk2IBsv/tyFaNji/G8BdE0jB++7x7J3EtLRJIBOJE16vvWUJfD7CXvezqArZWLADt7lholdPuUKlEOJtXvqlYvg7zKDce+wA7HAK0a2sMSvU51nC0q4LLaI+NlGxZZcPYcoj6PYLXw/BHaqGAHm5Y+RMhwKBgQCiBNz3zYP4RnfBTazWBRm3P7jybcteFMh5inmOyw9mfpphIUpFlw9lRbt7J2+sauzlIKZ2d9MOoZIurAZ/zbgIf2msTEoyczzO6yUpyeKinl6HjizMKggLEponU7nk2nQsuVbf7wYoHPwwjT+a5k9R+PMrYVO0B74Z8PIQpHd8ywKBgQCD//qMlzWfGANCMLf7IaLbJuI5MFJto0TicL0dUdogprX10lLXUKDkvE1zQ9HcbZeIwyeitvpr5nZd/SROLVxFuq4b3MPlkxKqhoRyhbmyE4KEBgjAyrtZBFIBBusAcw9ap3BJKL37cIak0WnY/nbIz5gqn7GEFK05yTIkolrWIQKBgH2U42m4BKi2hjBw8pzZSzt8yvAuJkoANfvvV5VU09UQIL1Uvmr+UdKfoFgvEyJDpudazWxaKF/Y4KQIduktHY6Io/IHGCPOqr2ACkg/0clWk9LiYtrFYYKjopUFErvOj+nypuHgNZd2EAvaEAkSpzzUiDeBsw2CStl0p0w7DtrNAoGAIsqskDGGewcgBWQmXvSqa7o0do3coiH3ToMAQm9vlGgHAAw5xlgfVQpGwe8GR4ilysh+5EuiuLnINDt0tXpv9K7dAQgjKAmszFrOjmyBMnSDebfysynABFj3c8GglO+l9J+ljFMqgqPVzsLAgIItciyq80Xmv8TjpbwFM2v34lI=";
	String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJ h0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	protected static final String APP_ID = "10000000000000012145";

	/*************************************************************
	 * 会员卡开户开始：发送短信
	 **********************************************************************/
	@Test
	public void test_sendSms() {
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, "RSA", MY_PRIVATE_KEY2, "UTF-8", "json",
				APIGW_PUBLIC_KEY, "AES", "5xGJdh7qb+B95SUoxDlatg==", "", "");
		// DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, "RSA",
		// MY_PRIVATE_KEY2, "UTF-8", "json",APIGW_PUBLIC_KEY, "AES",
		// "zl+5SxQAx6P7bjpqRu693Q==", "", "");
		JftWalletApiVIPCardopensendmsgRequestV1 request = new JftWalletApiVIPCardopensendmsgRequestV1();

		// request.setServiceUrl("http://apipcs4.dccnet.com.cn/api/jft/wallet/api/vacctopensendmsg/V1");
		request.setServiceUrl("https://gw.open.icbc.com.cn/api/jft/wallet/api/vipcardopensendmsg/V1");

		JftWalletApiVIPCardopensendmsgRequestV1Biz jftWalletApiVIPCardopensendmsgRequestV1Biz = new JftWalletApiVIPCardopensendmsgRequestV1Biz();

		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		jftWalletApiVIPCardopensendmsgRequestV1Biz.setAppId(APP_ID);
		jftWalletApiVIPCardopensendmsgRequestV1Biz.setOutUserId("10231023");
		jftWalletApiVIPCardopensendmsgRequestV1Biz.setCorpSerno("123456779456123");
		jftWalletApiVIPCardopensendmsgRequestV1Biz.setServiceCode("0");
		jftWalletApiVIPCardopensendmsgRequestV1Biz.setProtocolFlag("Y");
		jftWalletApiVIPCardopensendmsgRequestV1Biz.setAcctName("发送短信");
		jftWalletApiVIPCardopensendmsgRequestV1Biz.setMobilePhone("13522222222");

		jftWalletApiVIPCardopensendmsgRequestV1Biz.setCorpDate("2018-11-16");
		jftWalletApiVIPCardopensendmsgRequestV1Biz.setTrxAccDate("2018-11-16");
		jftWalletApiVIPCardopensendmsgRequestV1Biz.setTrxAccTime("15:47:00");
		
		jftWalletApiVIPCardopensendmsgRequestV1Biz.setDocumentId("110108199001018888");
		jftWalletApiVIPCardopensendmsgRequestV1Biz.setDocumentType("0");
		jftWalletApiVIPCardopensendmsgRequestV1Biz.setIsRegistered("2");
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		System.out.println(jftWalletApiVIPCardopensendmsgRequestV1Biz);
		request.setBizContent(jftWalletApiVIPCardopensendmsgRequestV1Biz);

		JftWalletApiVIPCardopensendmsgResponseV1 response;

		try {

			response = (JftWalletApiVIPCardopensendmsgResponseV1) client.execute(request,
					System.currentTimeMillis() + "");
			System.out.println("~~~~~~~~~");
			System.out.println(JSONObject.toJSONString(response));
			System.out.println("~~~~~~~~~");
			if (response.isSuccess()) {
				// 业务成功处理
				System.out.println(response.getReturnCode());
			} else {
				// 失败
			}

		} catch (IcbcApiException e) {

			e.printStackTrace();

		}
	}

}
