package com.icbc.api;

import com.icbc.api.request.QueryOrderMerInRetRequestV1;
import com.icbc.api.request.QueryOrderMerInRetRequestV1.QueryOrderMerInRetRequestV1Biz;
import com.icbc.api.response.QueryOrderMerInRetResponseV1;

public class QueryOrderMerInRetV1Test {
	// 1、网关公钥
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	// 2、appid
	protected static final String APP_ID = "10000000000000012106";

	// 3、密钥对认证方式，公钥在API平台登记，此处为私钥
	protected static final String MY_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCUc69Ynt3MEpMKfl3edzEbfJk+dlOv5pyugJMd01bcX2U6mch8NBAis9Eb6QyVNf+rXrPRd1VoYlEYVVEOGa3wR519CqPHdtd9UIiCIgMlY1S8p/SEbHztwLXM6CnELgtOmlUjmSrloeRQfhHuMZ/T7qjApx5WHooa4oyzcxuBDpxr+q/81ynZwDTAiBYOyQsYcnoh27Ih71vWB3dP9qFYYfWZXKpVA+5UdxwmJEvrqmtbzO+R7U680GSGIv4SnAqlf8V6frVo8qKElUfk+5lzp/a0Y58nEFCe4baA1HDSAdqzcWYkKEY1Jjjhd/ZB7fRBNO4djfjum4PEl3SgEZ4FAgMBAAECggEAOaTSKa9GoL91qVV4TbIqt2mid8aqqFr77Caw+Zve1qOUQzUDzHbK7S61vAi6ghX9uSWE3Ylg+K90neZDGx6NlAe695ryDbnv4xEqcJ2Uaygu9zKgl+sod4mlDnP4A919NoBnHvOS3KgIZ9kMTVmnnjvF+0jpVrd1GQtvZx8DRxE0LUjYJ7eBKp3lsmuU4iO8sQpv7V1E75lzNsVNo4gPUM3ZUB+1Q83yAhwYHK8Ju8g3THA+BhcSCINP8iLbTNzmRiacBvPZ913zc64QC2uKwBk6T1HOgdBTAA1RhaKt6VMukvY9IeHNW0GJDbYPbnhCaI1kvoBCgnHGn+8pV5X9AQKBgQDjR0XnXfj51YC/woe9oBuTlKK070AN1EYRfRoLC3P/p16r35xjBFQVJ7yCIcMDghkrlHk3ZyhRGw26UtqZvVIUzEWoXHVV8ECm6mu1X2UcT53GIKCd8OoWFWntyRTxmPWvmt1fOszo/T9ErmygNS71mEc2IPe/aqpwYg3VcYH62QKBgQCnNkfDD9y65mZntczEInV3Tk13id/IjMWruSx5IruUzmpwdLDaZLGPdNssPM2z0mkPSL1xSGohSan0GsoRSGkS3s+zO6dXeMbMWGWSQ/ZbORXBHCFYvCgcmG7/ArYLnct3FfRbp0uZH5vnu5/EGQ/yVq6muajODN8y6j7YVXBJDQKBgDegMhO2hEFhZ+mHCwH2NcmhD1GJXPwFgEC3hbA+VV208Q7P4864OHwVBaYz7S7moJJx/Fj6/nsbS/jWXnpSQ8yjUkkql+04qBoyNbpmZrDPK6ZaRfViCWjuRMbV+DJJZZhdJuEv2wcLNHjy19M+MQgbBRLSbtCCosRuu0QKS+3BAoGAEwK11/SGuO0W+XWO6UGtrznEzvFq8ucmVibAaqlLQFjTeyOZM8s88L1tabMkA+zJKwavGyELh+tTGkCtdpeP8qhIXu1KUkSV/YeTTLTTXn23/nOPSwJhYRbnj7CkN9/h0RE67eywSKFyXT9Uo7vht0CprKTxDzQhcC13parZEEUCgYBPj78NexXFIYlNJ/EMnI2NshMOQ1FpqQtncObrsrPmrSzvm90K1Yi+Dk+7dF7ZV9Huq6jozfTRCcPWjUYibdEsB3GigNiWtblSCIk3m5j0FGFZnfK6aAhxAsnNQtP9J5EqntUfhnwbcSgFnznpWGeO7T9f6kk9xrtKK41rvqO3xA==";

	public static void main(String[] args) throws Exception {

		// 签名类型为RSA2时，需传入appid，私钥和网关公钥，签名类型使用定值IcbcConstants.SIGN_TYPE_RSA2，其他参数使用缺省值
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY,
				APIGW_PUBLIC_KEY);

		QueryOrderMerInRetRequestV1 request = new QueryOrderMerInRetRequestV1();

		// 4、根据测试环境和生产环境替换相应ip和端口
		request.setServiceUrl("http://122.64.61.115:8081/api/saes/servmer/queryordermerinret/V1");
		// 5、请对照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值
		QueryOrderMerInRetRequestV1Biz bizContent = new QueryOrderMerInRetRequestV1Biz();
		bizContent.setSerNo("0200000000031");
		bizContent.setApiID("1");
		bizContent.setBusiType("2");
		bizContent.setSubOrderNoType("1");
		bizContent.setSubOrderNo("20180718990000000000000000000000000000000000000101");
		bizContent.setSeqNo("040400008213200140507000013");
		bizContent.setOriTrxDate("2018-10-01");
		bizContent.setOriShopCode("0200EC10000057");
		bizContent.setShopCode("0200EC10000055");

		request.setBizContent(bizContent);
		QueryOrderMerInRetResponseV1 response;
		try {
			response = client.execute(request, "23344544454440");// msgId消息通讯唯一编号，要求每次调用独立生成，APP级唯一

			System.out.println("response:" + response.getReturnCode());

			if (response.isSuccess()) {
				// 6、业务成功处理，请根据接口文档用response.getxxx()获取同步返回的业务数据
				System.out.println("ReturnCode:" + response.getReturnCode());
				System.out.println("response:" + response);
			} else {
				// 失败
				System.out.println("ReturnCode:" + response.getReturnCode());
				System.out.println("ReturnMsg:" + response.getReturnMsg());
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}
}
