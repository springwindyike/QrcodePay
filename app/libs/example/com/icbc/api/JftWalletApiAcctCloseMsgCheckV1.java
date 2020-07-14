package com.icbc.api;

import org.junit.Test;

import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.JftWalletApiAcctCloseMsgCheckRequestV1;
import com.icbc.api.request.JftWalletApiAcctCloseMsgCheckRequestV1.CloseAcctCheckMsgInBiz;
import com.icbc.api.response.JftWalletApiAcctCloseMsgCheckResponseV1;

/**
 * 开户API接口测试类
 *
 *
 * @author kfzx-wangpeng02
 *
 */
public class JftWalletApiAcctCloseMsgCheckV1 {

	/*
	 * 9月功能 String MY_PRIVATE_KEY2 =
	 * "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCcRR0FmtNV+Z4NVSfdNLLpOrbCIWKUS2OPYpXaHtbKT1cVgYf5Kg/s5mukcfU5cdGqO74NfegzbRyj+/YXTlADRYOSDTl/Pg+4pzUwmddfjJTwXbi+YY0L0YYPh1r503ih6zgQ4tkWiEP9qerKG4DMJhz1brNM+tPDxnQhEtqDp3uDUothZ1kLF3NwP25MhM0lF3h9dlEm2do5IwbgQbCYv4CISyaXkajHSVxLFwh0z06QximHtYlwWJCzKv1njUJSte+5E0SkSluShsaJI/yduvAs3ITrTW0XanIsKthSPJH7VIt8epiuXZxwdE4jwXkGaxTxW0MpR+zw+12EqJm9AgMBAAECggEAFfQjsqDgpchuquLWud3ocJmeCUHVbo30y7UG5mDEviFNU6kh6CA/ooFwh+a2k75ovSitd4nDsE3Y4zTHitimpv8CD+eptzWJ0eAzucMzHapLVkVkaeKchReHZPEYF9bcsKqx8rVb2C2Gl8FiSch5XLTSBqzppZvrWiqsL+VNK4eIgVSNuQFPjCNvfHxqflo+z1VtLmnMWqqdOi6Cvz7/rpClltwM6UZZIeSg2cDN9DYIJjLxzkgAChus+YyRJutLZgqKb1HTxOMbzRLa1tobzNIcsrbs5e7Ky72qRnjovFd6U5fzZ4guxIlzMq2GrEqMNxs7T/YCLZHF6r3DlQZRYQKBgQDbsWWkYSKrueI0kr1xTfRcBQNXBZ/GYjq7HWU38Aj4eZH728w8iVeuRoAvD3cmi99BSAuH89hrzigOS/ixJTit2zQLQTuLW+CCilspY/dg1iSwwFxM7qUQp4Q7NaxtSm4fsYH1+Gn9L35/eMW8MdhNjzP59x2ISKROQ9s7Tb35VQKBgQC2GHcCCip4K2TNbF9JzEzX9atnLfX+87I5+T4oa+CNQjsOElrw6hKmqhxSEFeDrbauKDHUrUFJuqpuhC6UkPNIGustLpHDmz9tFo4Z8R/3ibIQ6Tdoic3ZhER5FESM3LPuBLEbYhlGMqb0XmaoI2zeHzpf7aoU+ipZWCJ88qh+yQKBgE1C7gQJRTAvhyYGFSmryKwz9yC7kZ0rHox/ogEyIXWBC54PhpwjkPpxQNNMFRMxTaqfs650S0BemCevAB8MgApkdMEgh9hSz3oZPkYoKe+cX/rpK4zCwLpCr3ZDQgiNjH0I6DOg0WWBNnON/bxZq0BbhGP8TB6JrX74zjjk9lKhAoGBAKZ5iVtxBdClA1wWhqsGPv5018XVq/7wtnDv35a+wSUDds/vkfqMVI7QGGIiFJAK4Wco0h24Y2bPY/7zk045kmDKU1UULSjiJsNJipJG8k2xMfzp6cEFsw74ME1tbRpGr6yb13rMXYTiy+W+5CU1ddNAQ3Lt6b+R0eOqgqUuh0KZAoGBAKekWvDphNf8IRILhnkUfSK9HF08ztRSUN9jVoUCLLd4fWjqIRvLuW+QPtNMY/xAR38MR58TqMX0jx+N8spk0cMYSJFzUmjh/5BQjmtxxobUcZxU6kxmldWfUG/bHWJDJPj8FWrDhst0fctfCeDGCtXcs3LGjn42Inq6iNEl8Z8K";
	 * String APIGW_PUBLIC_KEY =
	 * "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
	 */
	String MY_PRIVATE_KEY2 = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDQMxL2onxMxY3ssAOkF2p7ryzTk6wq++YQxFXqb+gsEzToRDoDcrBa14muwmPWrk8TTg9N9Pn/sy7aLLtmVjBdCLRA69l0+e9DKDS7GBpobp9K9IJ7YZa4La3c/+dg2LTer09fSKGUNsSzNF8elbRz++nx7hscn/daNcn5qUS//GjaMcPVipqxHGJ+G+tEChVNrRlISUJOW0BOeR5oHkTHFUMuWe5VK+OF80APgDxuiHVWRwN3SOGbNeDW1Ic1nQYP/Zt9EvtwDIO49ERxjfr+Ai8Gp0+wYZ9TZUREG8SjR8qwsaIyqz//WLILXhPw0E/K7r9OTnTqYZx9YaDIf2R9AgMBAAECggEBAMv8rqDNVIIXsVVsozSb6K2kVYQ7FJ3Mzn4xD4ix+kVs0BKd/kUwko9+zJxYQ1+syzc77QzRcDxSgB4tY7MB0ULl604MhrPwybb/5qJFHGKjuBjFdi6S0AxGXSnB5R5jVNs14suVqxI/kvuN3YBm5zYYZP+v7gpexQgy2WBuszhxvpOAd0ffmK9ubieG6xdB+1f4tMUpP2sIMsxRSgzbKwZQivJtT3yXElMbUWYpbB9JS6wfdJSY2EICaF6TUAi8otmwRr1ee4CT5U7lvNO2//6ocidl8LqIy1tpLaTfREIAqneWBEoRC4DBZmgOwX7A35cZC0YlbbersMc/JzP3RQECgYEA6PYJGmGkJ31RXdK9BhiUegr+PMx1/9eMxOC1TXxrMtZh7eeyUrbxxPMsiq8jMQWhTEKqsg/AXjCy+AmQeoydMipGUze4+qwN4P69k5m3SVWELnh70QVyhw3rrAa9KHiX5MX4em5p5DM6V0nZ2GutyElpIjRQuZteFZMHPLue6z0CgYEA5Moj9E36S1qEVDYa4YZrUm3E0F064z2sJunQybEjwlAVctax3tInUl2qLCzCIE1UBY9duLcyaOh1HQSKdXlyB2PoS4WH9cH1tJ8I+YBzked7lj4S1u5KMN+azQ2r0qyJClPtLilE2UraZuLXjjq19Thoj1qlrK4zy0lJ0to+8kECgYB5eDBu7RKm9JUEkum00AQ7TpgaI5IzgLUJwxFGAeXzcA1H+1PkBTgzNYi4F3IGEaV1Gh3fEo9/jW0EIBiRjdg5XAmnQprVOflSpAE9gR0sw8ZUZMZKyshY201TOYBQJfEtfHx/eisEriFxejR4wEyw7nY/O4AMB5MbNLrFVB8dEQKBgDF6Wa4y0udK6wU/Mi8Fn94SqRaaouqT4tADjsifi2kxYoIUViEm96QDZ5LoFw9fScVuDMmurLMtWm5tFfhzzCo2+/yhIxcN3DI0ln9GvTeXhQ2n3PEoVVkecl7YDwmfkH9wSQHLoP0RCAxqEE3M+p7OlSYzZ1Lh1YeoENQNqMFBAoGACpZ1SY+eKCa5b5X7j5Z28xsnEjThLqozcNdp/zqWB9z8Qs/yIPpOxRKxRHJ7fIr3ZeD+pcE7fqxtGwVuZwafqmKUVv4zn089iCBuWqTPI0l51u1hhkjWmlBWKHz2y4T8gTuu0bQeDkK5Hi4bhgVWP38vXZkhF6CYGXhiMbA1Xwk=";
	String APIGW_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0DMS9qJ8TMWN7LADpBdqe68s05OsKvvmEMRV6m/oLBM06EQ6A3KwWteJrsJj1q5PE04PTfT5/7Mu2iy7ZlYwXQi0QOvZdPnvQyg0uxgaaG6fSvSCe2GWuC2t3P/nYNi03q9PX0ihlDbEszRfHpW0c/vp8e4bHJ/3WjXJ+alEv/xo2jHD1YqasRxifhvrRAoVTa0ZSElCTltATnkeaB5ExxVDLlnuVSvjhfNAD4A8boh1VkcDd0jhmzXg1tSHNZ0GD/2bfRL7cAyDuPREcY36/gIvBqdPsGGfU2VERBvEo0fKsLGiMqs//1iyC14T8NBPyu6/Tk506mGcfWGgyH9kfQIDAQAB";

	protected static final String APP_ID = "10000000000000012090";// 9月10000000000000008062

	// 销户校验短信
	@Test
	public void test_cop() {

		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, "RSA", MY_PRIVATE_KEY2, "UTF-8", "json",
				APIGW_PUBLIC_KEY, "AES", "zl+5SxQAx6P7bjpqRu693Q==", "", "");// i5N/TQHG9hq00OpdNzpUUw==

		JftWalletApiAcctCloseMsgCheckRequestV1 request = new JftWalletApiAcctCloseMsgCheckRequestV1();

		request.setServiceUrl("http://122.64.61.111:8081/api/jft/wallet/api/acctclosemsgcheck/V1");
		CloseAcctCheckMsgInBiz bizContent = new CloseAcctCheckMsgInBiz();

		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		bizContent.setAppId("10000000000000012090");
		bizContent.setCorpDate("20120101");
		bizContent.setCorpSerno("123456");
		bizContent.setMediumId("654321");
		bizContent.setOutServiceCode("5142");
		bizContent.setTrxAccDate("11");
		bizContent.setTrxAccTime("22");
		bizContent.setOrigCorpSerno("4564");
		bizContent.setPhoneMsgNo("12313");
		bizContent.setSmsSendNo("1231231");
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		System.out.println(bizContent);
		request.setBizContent(bizContent);

		JftWalletApiAcctCloseMsgCheckResponseV1 response;

		try {

			response = (JftWalletApiAcctCloseMsgCheckResponseV1) client.execute(request, System.currentTimeMillis() + "");
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

	public static void main(String[] args) {
		new JftWalletApiAcctCloseMsgCheckV1().test_cop();
	}
}
