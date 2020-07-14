package com.icbc.api;

import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.CmdQueryRequestV1;
import com.icbc.api.response.CmdQueryResponseV1;
import com.icbc.api.request.CmdQueryRequestV1.CmdQueryRequestV1Biz;

import java.util.logging.Logger;
public class CmdQueryTestV1 {

	// 调用方自己的AppId
	private static final String APP_ID = "10000000000004as5765";
//	private static final String APP_ID = "10000000000004095765";
	// 调用方私钥
//	private static final String MY_PRIVATE_KEY = new String(
	private static final String MY_PRIVATE_KEY = new String(
			"MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCOQIx0XGG4Aiz9hrzV03boPPBxajUWlssQyxOnYEoNkk2+q7mLeYtPwVlt+7g3j7oNm+MSkH2UvgfPGf5ZxofLmzvbwES2puocnJD1ipuVRwtMvK/0esCI8J+RMTI2qonwsLCFRTBCSt6Mw5xkbbK+6DMpASvZT+H/swmeydlUztJcUhrRGVpOKRQnxa5+SD8w7bPHtTnqmQlR9yeZIQl3KoXPaq0O5F2t5IIDkGNo0UnMFgCVYIho5WTC+cFnTYkVUj4AB7wmMSuBNXUMtrp1drZAMe3CY7G/4M2GxCtqqfp69ML9YbDOat8sQpi3ujQDmTrjikDHWo54Gt/9HPg7AgMBAAECggEAQYkpbD5XYr/V3GNjwhsvT+UrXQTyOlr0aOM2RclNtJzvpmVVERXJAdBxFAOBJk/YBocIATiCMrGtxVMTZGbbjwkQdbhJr+CMQOw8uHLIJOjbItpXMgoPg8dfrDN/D8JX1ISCfpOWnSQDDdTcy0PisqMlVsHMYsyzsOraBsa1kqUUVEbPYM7WBjnBDm6QbQqtTLZwyWbmAKbaAGrg5QD7JHafCxnmnW8tnay0trENok2sRieq9XnL8bSvmqzR4+n/bFWY7dSfqdYcSfdL69xCQ3Vto2gao15oilzac74WqwWwb3bCdeeuE/xnxsXbLT8FW8WSZ2ezVNi6Ft49EUUf4QKBgQD3zuAAD+Xc+SRJGYppmwIQsD6koYJzaEw/R3ZcVdFq4kovbV3l6KmZIuA06a++h5Mq53pIrAv+ppelyDFHZMYM3PRlIMS++tKAQpVg4H7Pdp24oQe4khIUZqC2wkT5UHnc5sjYraG/1AMb1jIyJJe0JZs5HHnX4KXs9kn4vK+zKwKBgQCS9GKvPQpcQ6oeYAM751N9jjoFslr4TNwB4UnqqS9Htm3LD9tmXp+sYTayH1kq0PPKbcUlEO2gpcASQ4CHgHuJJ+89OTEEqSeORZ+yvd2RI8RRkCjb+I/ZhkcgvfavC3UPp8OtfvvgxQB3zj7ZEBxDL61sTiWxmiZvByANqACHMQKBgEjj2/WIt5co3Wh3D8SCaLgZ70Mjkqh5nDvcvE7qmz+yMhoDNGRk7EX0ATjvJ9eGL16mWcy4doq/28lSulQCq1KrR2PboKOASZyaeS/WuNYzUK83Bnte09yWV12KhRlEd6Pnalp5sCMprIRqm7cuFkVR7nd9DcXW+VdbFmUIszGjAoGAaR867MJMg/2/VuU1ywdKeTlhliuk2ZQZmZqwRpXqBXGhjq30M4Gi1SvhdX/pSDCbBIaLjV1TrySChk4VRlkJhe60O+aKgxwB+MsjVzhso+OjDvmB0QE43dEpVmmtakBW5/EJkDWTNpGWKR23ZY0ZupIDi8NHQYnUzn2ZV0uDvTECgYBHHG5fjae0Kz9Fy4PQ7bq58njrMnkLyWx5UKGdHPjn8cFt6JEV3QSGcLeOTJFwd9Up58b7JNegMFajZMcInrp7Sm/Olofl7MORQMLl4d53sMhdQ7Q9HWH2mCRapKHrbhNMxLCXSf2vlgzRBwPXxwBYXJ4ycbbzZsvMi8GAopR5fA==");
//			"MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQC3l/fHuD6N8WqLIqepv4X7fZyT+D24U7UaH0AhDgDEVKBIq2jOHjJrTg7p/zmsaExK/6hDT6W4sEHvBYjRtBnlzcAcNi43oH02/tKR46VLvDNCaxFFtPsgENoiYs6fhwqfyiauHWNp0ae6TPnAbzvmyZ9nv0JDb55OG3m9XxFHHX/bm164VG9cgGvxSx0hpwmrBjg8HXZ09eWMY1NiUm+cRx+pwkV3u0qvo0O0rqu3qtSOOspYIOKbgYWZGw9zY7sdF/++9+nXKdYYKhq7fUshuTo0unUh42wctrzRIq/aznGlQQv5kevkMV/luVRFmVBbSCe4hq3wMoacBsn24Yc1AgMBAAECggEBALWN4akuaSXjLBJlddomnO9je3jUjux+UuR/LOLDPzzn1w2l/GGAeSmmKpd6HmWBSpkMEzBlTiPCoaEmHvQJn2aivizn43J9EfZVrpQ4w5iOhz5SNOVzILfIEn7YqS4W1AnKVc/vHgViH/Ta9Ew5c8o5bpqhB306nxjskMoVfjeMoQI6SfnOdDTHFmDsUNwJQ5rIc9hdSuZWd3ve6NXKVAs1HNFof1oCCU1YSMOBzTjraRwDZJgRZW6jXhIIw0J0GtP5s/APVkd5UH9hQF/+bDgJOeKqncLhAztDvJ4u0oJY0pKzlVj+Ca5S3qoIGrkNRZK25azEjmt4hvzVEE403cECgYEA/0/VqKlGd/rQm0IZPUsIDJ3t3OHYc70r48txwOpo1s6sZke4hGH6mfKUk3ir3+1/ox28CDxFGWPzB5V0tsztHOHbFcjPBd3PchCf5/OH32OzjeM/7DTuMY5sKeL2tUxk8bB2FetLwfuSTPa0Y5LYvqEL/iuckbacJSfWuDtGV/ECgYEAuBalzDnpPhQ5iqZL6P5EdE63qBxvRXe3r+gslltBDFEcBYrMMH2fRokTe74mz1WDRo0GRljvPfgUbanQZMOmIuTmMcdYrFSFtA8d96rW7fBNAvy2Tz+rV56Mxw5HuKYTXnAU7Q4jZH2fqqDoWL4Qs6qhYJiR+sKGUF5O4hoSR4UCgYEAtAUUwAHrgDnH0VF//mnjWRIaX/6W4rTmN46BvOcL2TqM8OltP1remqIjBQC3IAOUVe1nYd8tUcPZ3uURELvaDN1r3yZiYt6NoP374k8i5O6l8kvkDKcdtK+ZsMcp8ZfWLVyhRr9MAZFjDQV/GB642WEw1Zzmnw/FdaVrjyesZ+ECgYEAp56nlQ/eG1KbGm5VjG+JsUXD4OUTRHO/5AJKJxYsYqSwGTPKvRSFpNpHzVLVT9CTWfgrEH8GSKzNHRWU1Ut4ySkXmZfkW/YSUGO7a7o5PiqiVOf6sKpOv9d0ZAPStoUx+bmgtEE9ZNEmQ12EctmNp6rkimoh8eySFDfrJ+GJZ2kCgYAeyPEYGTip3LwjNlnBvNbNNce/3vcN5iKVdA7fSAsZj+TTb6jWy7AV+TIorWfjE5xMkGa0xbWd3CkP/Ac5VcsXus8mys/qGc5AL2GCUGf8NmZD66QpgN+9fn1SawMrtntsaqcXwUusaG3JOZmAsbeJ5dORNsV5se360Xx7szR99g==");
	// API网关公钥(固定的）
	private static final String APIGW_PUBLIC_KEY = new String(
			"MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB");
	// API请求地址
//	private static final String API_SERVICE_URL = new String("http://122.64.61.115:8081/api");
	private static final String API_SERVICE_URL = new String("http://ip:port/api");
	// AES加密密钥
	private static final String AES_KEY = "PqyIFFYqF/4AWd5G0hd1ag==";
//	private static final String AES_KEY = "U92s0I009oZk2V+vhT4xDA==";

	public static void main(String[] args) {

		
		// 签名类型为SHA256WithRSA时，传入appid，私钥和网关公钥，签名类型使用定值IcbcConstants.SIGN_TYPE_RSA2，其他参数使用缺省值
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID,IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY, IcbcConstants.CHARSET_UTF8,IcbcConstants.FORMAT_JSON,APIGW_PUBLIC_KEY,IcbcConstants.ENCRYPT_TYPE_AES, AES_KEY, null, null);
		
		
		CmdQueryRequestV1 request = new CmdQueryRequestV1();
		
		

		//访问工行API平台URL
		request.setServiceUrl(API_SERVICE_URL + "/owapb/remit/cmd/query/V1");

		CmdQueryRequestV1Biz bizContent = new CmdQueryRequestV1Biz();
		
		//交易代码
		bizContent.setTranCode("280508");
		//地区号
		bizContent.setAreaCode("0103");
		//交易流水号
		bizContent.setSdicCashTransactionReference("123456");			
		

		request.setBizContent(bizContent);

		
		CmdQueryResponseV1 response;

		try {
			response = client.execute(request);
			Logger log = Logger.getLogger(CmdQueryResponseV1.class.getName());
			if (response.isSuccess()) {
				
				// 业务成功处理
				log.info("ReturnCode:" + response.getReturnCode() + "\n Response:" + JSONObject.toJSONString(response));
			} else {
				// 失败
				log.info("ReturnCode:" + response.getReturnCode() + "\n Response:" + JSONObject.toJSONString(response));
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}

	}

}
