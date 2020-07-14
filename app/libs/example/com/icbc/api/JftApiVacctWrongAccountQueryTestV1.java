package com.icbc.api;

import org.junit.Test;

import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.JftApiVacctWrongAccountQueryRequestV1;
import com.icbc.api.request.JftApiVacctWrongAccountQueryRequestV1.JftApiVacctWrongAccountQueryRequestV1Biz;
import com.icbc.api.response.JftApiVacctWrongAccountQueryResponseV1;


public class JftApiVacctWrongAccountQueryTestV1 {


	protected static final String MY_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCavjp2dLfcL0U+AUGslw28gWqEfWXQVRuWo5YjR5Ynw8ykqI12wD+7sOwXzmRJx9YkkOCHl926Reav8V7df+ot5PodmAlioCCUSoxbgSHU3lHqok81agzYapF4LK9tvMtfea6tYjaZ+OVgCorYrzRMDRHzJL1TlsIYHpajSqgXIKQSK/942wsuVXk5//40gQLf7wM8h5sBGcfjFLxVT+hHK5/l7DaSOm8zEenOqR59lwvMskhhbpdQ0cRKLA7n7+t37eJXPZGALm4Jew8dgI7vpJl2+iqWjMXcmhtDD6ksYQzu7M3GxfRktX2XBhInh4imB4sQXbaxIXfu2ckTcIyJAgMBAAECggEAHlQ8hy0XQDuvmZiLc7VjhtfitbcSNoQH1T2Y1q9YOdEBkiBLIcRKeZISpBPayi81xJL0vv7AAZtjvIZVbpp8nqQrdZNv+3mhCQ+XdPPZWqx8Z72KQtDXVa+FdYVkmOCRB9SErQz74K/M3UcTsaadXG6PXxWLWg/JWQrdwYGHcoiugsMr6zskUk5trh761F40/Z1yhc9W7IWBKI+6DIbx8uC6WE2nnNhHs3UYwGon6u1YdXdkgML6Jzb8W+ATRITkVXa9T7FioU8xV8AdZzUfudjepxw/zaCF4OZ2HLBV9ZhbfUsWhNyTJGeW1mC3DyOaQO1VSace1xkLPqMsB6DHgQKBgQD1Z4KblWIdmMlIngqpGmw4MVQSpVV3fkrho9WpNIe10Ack5JCUFKgPTyZOMrhrkJ7F0msN55AplLpqwixZ9spQx1SOCB5VD5QktTJlqPQIPqNS81uKpV9xbVQJN3/aOU9k2B1wC0VMiifMWX266bxu3AbFXWgayPxx7MqJQeBROQKBgQChbKBJ3zng8I18T+R+HFo9irPjq78Rjo7uQfBwYAos9+BbBGMmZZQJrbwhba9IQk324SZI7BPnASpkLTWYMPB+cSkWoyH64F+PUwTlqDyWp+eyBD/W+Jq8LnRtYYzs8ga7uh/Tt/kctA3geZcj2FEfKNuZQW4s33ADUugxeRkl0QKBgHBIdif9x7DHEYHaXgJVhqKHX3JQl7Re4qAvODl9QYLctggZVFWMxgCLNHmfF2aP+zWEO1tXUkzUMh9azLQ1CQjAy11ZNZex0xSgm3iMP2vuTQhNNNtRI0Rgw4ycCjGs+zim8YEshv6oT+FeKPr2qzMGFUsEm/d1cpwlvd3jeGFxAoGAI4uG1B1qYkS18vyopLhbipejOuvTm+sXQBGW/ze2peZDKeeSaZ8OdP8joPzFDxVCk61KP950F3bjPcHSvltwaXdDg++SCOslP6sZNfTQup/oXgOfhxehAvT7wCYt4PL+VpIKdhVZrl9beuVrSYJVgpX9nQaSWyEsSh8Ub+hpiDECgYEAtU+5G4hd0hwEEy2ImtcvvnroZHG2tNYgVa0GFUU7ak0tJ7491/yZ0DtOixiwIHWklUgTpAh1UcV9LBvwSlo5r5yJKOGtxh6MvUlI11tOFQVKUS+P5Xt2H5Zb3+T4wKvjbvRzu31N/GgYTS6aNOEJffUUZVrnzMy/CDSgXxmV/e4=";

	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
	
	protected static final String APP_ID = "10000000000000004964";

	@Test
	public void test_cop() {
		
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID,"RSA", MY_PRIVATE_KEY,"UTF-8", "json",APIGW_PUBLIC_KEY,"AES","eyiSiHvFqYFLu/AZDCt+4w==", "", "");
		JftApiVacctWrongAccountQueryRequestV1 request = new JftApiVacctWrongAccountQueryRequestV1();
		request.setServiceUrl("http://122.20.173.105:8081/api/jft/api/vacct/wrong/account/query/V1");
											   
		JftApiVacctWrongAccountQueryRequestV1Biz bizContent = new JftApiVacctWrongAccountQueryRequestV1Biz();
		bizContent.setAppId("123455");
		
		bizContent.setAcDate("2018-04-15");
		bizContent.setPage("1");
		bizContent.setPageSize("2");
		bizContent.setVersion("1.0.0");//设置接口访问版本号
		
		request.setBizContent(bizContent);

		JftApiVacctWrongAccountQueryResponseV1 response;
		try {
			response = (JftApiVacctWrongAccountQueryResponseV1) client.execute(request, System.currentTimeMillis()+"");
			
			System.out.println(JSONObject.toJSONString(response));
			if (response.isSuccess()) {
				// 业务成功处理
				System.out.println(response.getReturnCode());
			} else {
				//失败
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
//{"msg_id":"1523956051672","response":{"rds":{"rd":[{"failStatus":"02","patchId":"1201804171810",
//	"acExceptionId":"1201804170000000434","acDate":"2018-04-12","serialNo":"1JFT2022013100000001384",
//	"acTime":"19:57:43"},{"failStatus":"03","patchId":"1201804171810","acExceptionId":"1201804170000000435",
//	"acDate":"2018-04-12","serialNo":"1JFT2022013100000007431","acTime":"20:06:19"}]},
//	"total":3,"totalPage":"2","pageSize":"2","page":"1"},"return_code":0,"return_msg":"交易成功","success":true}
	}
	
	public static void main(String[] args) throws Exception {
		new JftApiVacctWrongAccountQueryTestV1().test_cop();
	}
}

