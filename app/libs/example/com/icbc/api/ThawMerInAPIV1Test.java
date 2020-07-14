package com.icbc.api;

import com.icbc.api.request.ThawMerInAPIRequestV1;
import com.icbc.api.request.ThawMerInAPIRequestV1.ThawMerInAPIRequestV1Biz;
import com.icbc.api.response.ThawMerInAPIResponseV1;

public class ThawMerInAPIV1Test {
	// 1、网关公钥
	protected static final String APIGW_PUBLIC_KEY = "MIGf*******AB";

	// 2、appid
	protected static final String APP_ID = "10000000*******5646";

	// 3、密钥对认证方式，公钥在API平台登记，此处为私钥
	protected static final String MY_PRIVATE_KEY = "MIIEvQIBADAKU*******";

	public static void main(String[] args) throws Exception {

		// 签名类型为RSA2时，需传入appid，私钥和网关公钥，签名类型使用定值IcbcConstants.SIGN_TYPE_RSA2，其他参数使用缺省值
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY,APIGW_PUBLIC_KEY);

		ThawMerInAPIRequestV1 request = new ThawMerInAPIRequestV1();

		// 4、根据测试环境和生产环境替换相应ip和端口
		request.setServiceUrl("http://*******/api/mybank/mer/merin/thaw/V1");
		// 5、请对照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值
		ThawMerInAPIRequestV1Biz bizContent = new ThawMerInAPIRequestV1Biz();
		bizContent.setOutProdagrId("02*******244");
		bizContent.setMerNo("134134");
		bizContent.setOrderNo("2019*******33");
		bizContent.setOrderSubSerial("123");
		bizContent.setTrxSerialNo("2019*******0906001");
		request.setBizContent(bizContent);
		ThawMerInAPIResponseV1 response;
		try {
			response = client.execute(request, "233445*******4471");// msgId消息通讯唯一编号，要求每次调用独立生成，APP级唯一

			//System.out.println("response:" + response.getReturnCode());

			if (response.isSuccess()) {
				// 6、业务成功处理，请根据接口文档用response.getxxx()获取同步返回的业务数据
				//System.out.println("ReturnCode:" + response.getReturnCode());
				//System.out.println("response:" + response);
			} else {
				// 失败
				//System.out.println("ReturnCode:" + response.getReturnCode());
				//System.out.println("ReturnMsg:" + response.getReturnMsg());
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}
}
