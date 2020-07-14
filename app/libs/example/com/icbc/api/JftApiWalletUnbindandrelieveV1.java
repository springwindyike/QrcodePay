package com.icbc.api;

import org.junit.Test;

import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.UnbindAndRelieveIn;
import com.icbc.api.request.UnbindAndRelieveIn.UnbindAndRelieveInBiz;
import com.icbc.api.response.UnbindAndRelieveOut;

/**
 * ��󼰽�Э�������
 * @author kfzx-gaona
 *
 */
public class JftApiWalletUnbindandrelieveV1 {
	String MY_PRIVATE_KEY2 = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDQMxL2onxMxY3ssAOkF2p7ryzTk6wq++YQxFXqb+gsEzToRDoDcrBa14muwmPWrk8TTg9N9Pn/sy7aLLtmVjBdCLRA69l0+e9DKDS7GBpobp9K9IJ7YZa4La3c/+dg2LTer09fSKGUNsSzNF8elbRz++nx7hscn/daNcn5qUS//GjaMcPVipqxHGJ+G+tEChVNrRlISUJOW0BOeR5oHkTHFUMuWe5VK+OF80APgDxuiHVWRwN3SOGbNeDW1Ic1nQYP/Zt9EvtwDIO49ERxjfr+Ai8Gp0+wYZ9TZUREG8SjR8qwsaIyqz//WLILXhPw0E/K7r9OTnTqYZx9YaDIf2R9AgMBAAECggEBAMv8rqDNVIIXsVVsozSb6K2kVYQ7FJ3Mzn4xD4ix+kVs0BKd/kUwko9+zJxYQ1+syzc77QzRcDxSgB4tY7MB0ULl604MhrPwybb/5qJFHGKjuBjFdi6S0AxGXSnB5R5jVNs14suVqxI/kvuN3YBm5zYYZP+v7gpexQgy2WBuszhxvpOAd0ffmK9ubieG6xdB+1f4tMUpP2sIMsxRSgzbKwZQivJtT3yXElMbUWYpbB9JS6wfdJSY2EICaF6TUAi8otmwRr1ee4CT5U7lvNO2//6ocidl8LqIy1tpLaTfREIAqneWBEoRC4DBZmgOwX7A35cZC0YlbbersMc/JzP3RQECgYEA6PYJGmGkJ31RXdK9BhiUegr+PMx1/9eMxOC1TXxrMtZh7eeyUrbxxPMsiq8jMQWhTEKqsg/AXjCy+AmQeoydMipGUze4+qwN4P69k5m3SVWELnh70QVyhw3rrAa9KHiX5MX4em5p5DM6V0nZ2GutyElpIjRQuZteFZMHPLue6z0CgYEA5Moj9E36S1qEVDYa4YZrUm3E0F064z2sJunQybEjwlAVctax3tInUl2qLCzCIE1UBY9duLcyaOh1HQSKdXlyB2PoS4WH9cH1tJ8I+YBzked7lj4S1u5KMN+azQ2r0qyJClPtLilE2UraZuLXjjq19Thoj1qlrK4zy0lJ0to+8kECgYB5eDBu7RKm9JUEkum00AQ7TpgaI5IzgLUJwxFGAeXzcA1H+1PkBTgzNYi4F3IGEaV1Gh3fEo9/jW0EIBiRjdg5XAmnQprVOflSpAE9gR0sw8ZUZMZKyshY201TOYBQJfEtfHx/eisEriFxejR4wEyw7nY/O4AMB5MbNLrFVB8dEQKBgDF6Wa4y0udK6wU/Mi8Fn94SqRaaouqT4tADjsifi2kxYoIUViEm96QDZ5LoFw9fScVuDMmurLMtWm5tFfhzzCo2+/yhIxcN3DI0ln9GvTeXhQ2n3PEoVVkecl7YDwmfkH9wSQHLoP0RCAxqEE3M+p7OlSYzZ1Lh1YeoENQNqMFBAoGACpZ1SY+eKCa5b5X7j5Z28xsnEjThLqozcNdp/zqWB9z8Qs/yIPpOxRKxRHJ7fIr3ZeD+pcE7fqxtGwVuZwafqmKUVv4zn089iCBuWqTPI0l51u1hhkjWmlBWKHz2y4T8gTuu0bQeDkK5Hi4bhgVWP38vXZkhF6CYGXhiMbA1Xwk=";
	String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	protected static final String APP_ID = "10000000000000012090";

	// ��󼰽�Э��
	@Test
	public void test_cop1() {
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, "RSA", MY_PRIVATE_KEY2, "UTF-8", "json",
				APIGW_PUBLIC_KEY, "AES", "zl+5SxQAx6P7bjpqRu693Q==", "", "");

		UnbindAndRelieveIn request = new UnbindAndRelieveIn();
		request.setServiceUrl("http://122.64.61.111:8081/api/jft/wallet/api/unbindandrelieve/V1");// 11��
		UnbindAndRelieveInBiz bizContent = new UnbindAndRelieveInBiz();
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		bizContent.setAppId("10000000000000012090");// �̻�appid
		bizContent.setCorpSerno("AasD10999988889876");// ÿ�ν��׸���ˮ��
		bizContent.setMediumId("111117778855555");//������������
		bizContent.setBindMedium("6222080200022954104");// �󶨵�I�࿨��
		bizContent.setCorpDate("2017-03-15");
		bizContent.setCorpMediumId("1000000001854");// ���������ʺ� ��useridһ��
		bizContent.setMobileNo("18952000005");// �ֻ���
		bizContent.setOutServiceCode("unbinding");// �̶�����
		bizContent.setTrxAccDate("2017-03-15");
		bizContent.setTrxAccTime("13:30:01");
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		System.out.println(bizContent);
		request.setBizContent(bizContent);

		UnbindAndRelieveOut response;
		try {
			response = (UnbindAndRelieveOut) client.execute(request, System.currentTimeMillis() + "");
			System.out.println("~~~~~~~~~");
			System.out.println(JSONObject.toJSONString(response));
			System.out.println("~~~~~~~~~");
			if (response.isSuccess()) {
				// ҵ��ɹ�����
				System.out.println(response.getReturnCode());
			} else {
				// ʧ��
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}

}
