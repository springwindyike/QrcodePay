package com.icbc.api;

import java.util.Date;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.BasFaceFacesdeleteRequestV1;
import com.icbc.api.request.BasFaceFacesdeleteRequestV1.BasFaceFacesdeleteRequestV1Biz;
import com.icbc.api.response.BasFaceFacesdeleteResponseV1;

public class BasFaceFacesdeleteV1Test {
//	调用方自己的AppId
	private static final String APP_ID = new String("10000000000000003698");
//	调用方私钥
	private static final String MY_PRIVATE_KEY = new String("MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCQzxWD3j7XSb3b");
//	API网关公钥
	private static final String APIGW_PUBLIC_KEY = new String("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV");
//	API请求地址
	private static final String API_SERVICE_URL = new String("http://gw.open.icbc.com.cn/api");
	
	public static void main(String[] args) {
//		签名类型为SHA256WithRSA时，传入appid，私钥和网关公钥，签名类型使用定值IcbcConstants.SIGN_TYPE_RSA2，其他参数使用缺省值
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		BasFaceFacesdeleteRequestV1 request = new BasFaceFacesdeleteRequestV1();
		request.setServiceUrl(API_SERVICE_URL +"/bas/face/facesdelete/V1");
//		请对照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值
		BasFaceFacesdeleteRequestV1Biz bizContent = new BasFaceFacesdeleteRequestV1Biz();
		bizContent.setId("testhuangwj1");
		bizContent.setChannel("202");
		bizContent.setTrCode(getTrxCode());
		bizContent.setAppName("F-BAS");
		bizContent.setAppInfo("tesadthuangwj");
		bizContent.setPostMethod("0");
		request.setBizContent(bizContent);

		BasFaceFacesdeleteResponseV1 response = new BasFaceFacesdeleteResponseV1();
		try {
			response = client.execute(request, "" + new Date().getTime());
			System.out.println("Msg_id:" + response.getMsgId());
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
	
	public static String getTrxCode() {
		String timeStr = "" + new Date().getTime();
		String retStr = "";
		retStr = timeStr + timeStr + timeStr;
		retStr = retStr.substring(retStr.length() - 36);
		System.out.println("trcode:"+retStr);
		return retStr;
	}

}
