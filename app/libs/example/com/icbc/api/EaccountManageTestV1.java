/**
 * TODO
 *
 * @author kfzx-weiwf
 * 
 */
package com.icbc.api;

import java.net.URLEncoder;
import java.net.URLDecoder;

import com.icbc.api.UiIcbcClient;
import com.icbc.api.request.EaccountManageRequestV1;
import com.icbc.api.request.EaccountManageRequestV1.EaccountManageRequestBizV1;

/**
 * TODO
 *
 *
 * @author kfzx-weiwf
 */
public class EaccountManageTestV1{
	 
	 protected static String APP_ID = "10000000000000011062";// "10000000000000002826";
	 protected static String MY_PRIVATE_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJCoQe/O+uqpOtyE/2CUjD7wosZw8jI1AlLNJCllOmlX+obA6h97b0JsEL0SjMCAR3xJyw7MKLqkcy5qQ/bBgw2XSrodmjzOVqfT1OXRii0xw0HiVkHR4cEWnEAAdfo0lDc4iuzCIQrnT5gM0+U+qeSV6JFfwVRjgYzBdHQRPCf1AgMBAAECgYAdQUoEe7GXH5591o/nMmOinvvscg8pRDsyD7bOgGBtyZMrCXzP3SDFKCHCeyvoColqg2oDlhpulK+OpYMVNlGQcO4eubOJp9MUc3m4A9RxkVr3dsVrmygM5czPfWHAPVQ4dECDruBJn9zoo1ci0myRTh4KSCq6SxpCE0Pbf3j7iQJBAOdMPFRfOkSQ1hsN9Mg4jd9on8r7+mF8gFPhkNI6qvEKw/prmU3obUWvZL42vRlLOQyyB92mBF24PStR/B6CjR8CQQCgGz0VoqCplurSCapGdgX3D7bNSDtMUmaLJYJxih8v+zghP0YtVgDeV3NjogVjOlz8/9Rebo0PoFcqyJnNA1RrAkEAul3dBoasZm7ldWsrXuDiv66HgoDB4Cb3J59Kl3oaHpp0CqUEI5gx48JNRE7K00SfNTGF0Pxh7Dn1X6Bxqwu6NQJADrdyPfLc4bnFi9jnleJzWepP2z6wdKt+UXv5KYaQp1BoMGYohTJKkiVnrdjOtfg/Y+IAG03+GVmbqYsW2AleUQJBANYQklohKtsmq8ptX3as6hjcuXcTpc2DSpVeOnCueNv107+dDJ+K14tbiVYzF3tkHBNMRkGtr6EuGKJ+A63sJ00=";
	 private String AES_KEY = "xMh0xFsG7G80ziePFdnT8g==";	
	
	 
	public static void main(String[] args) throws IcbcApiException {
		
		//  public UiIcbcClient(String appId, String signType, String privateKey, String charset, String encryptType, String encryptKey)
		UiIcbcClient client = new UiIcbcClient(APP_ID,IcbcConstants.SIGN_TYPE_RSA,
				"MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJCoQe/O+uqpOtyE/2CUjD7wosZw8jI1AlLNJCllOmlX+obA6h97b0JsEL0SjMCAR3xJyw7MKLqkcy5qQ/bBgw2XSrodmjzOVqfT1OXRii0xw0HiVkHR4cEWnEAAdfo0lDc4iuzCIQrnT5gM0+U+qeSV6JFfwVRjgYzBdHQRPCf1AgMBAAECgYAdQUoEe7GXH5591o/nMmOinvvscg8pRDsyD7bOgGBtyZMrCXzP3SDFKCHCeyvoColqg2oDlhpulK+OpYMVNlGQcO4eubOJp9MUc3m4A9RxkVr3dsVrmygM5czPfWHAPVQ4dECDruBJn9zoo1ci0myRTh4KSCq6SxpCE0Pbf3j7iQJBAOdMPFRfOkSQ1hsN9Mg4jd9on8r7+mF8gFPhkNI6qvEKw/prmU3obUWvZL42vRlLOQyyB92mBF24PStR/B6CjR8CQQCgGz0VoqCplurSCapGdgX3D7bNSDtMUmaLJYJxih8v+zghP0YtVgDeV3NjogVjOlz8/9Rebo0PoFcqyJnNA1RrAkEAul3dBoasZm7ldWsrXuDiv66HgoDB4Cb3J59Kl3oaHpp0CqUEI5gx48JNRE7K00SfNTGF0Pxh7Dn1X6Bxqwu6NQJADrdyPfLc4bnFi9jnleJzWepP2z6wdKt+UXv5KYaQp1BoMGYohTJKkiVnrdjOtfg/Y+IAG03+GVmbqYsW2AleUQJBANYQklohKtsmq8ptX3as6hjcuXcTpc2DSpVeOnCueNv107+dDJ+K14tbiVYzF3tkHBNMRkGtr6EuGKJ+A63sJ00=",
				IcbcConstants.CHARSET_UTF8,IcbcConstants.ENCRYPT_TYPE_AES, "xMh0xFsG7G80ziePFdnT8g==");
		EaccountManageRequestV1 request = new EaccountManageRequestV1();		
		request.setServiceUrl("http://122.64.61.111:8081/ui/eaccount/manage/V1");///
		EaccountManageRequestBizV1 bizContent = new EaccountManageRequestBizV1();
		bizContent.setMobileNo("13703878410");//选输，手机号
		bizContent.setIdcode("128440810108044");//选输，身份证号
		bizContent.setName(URLEncoder.encode("芡悠"));//选输，用户姓名
		bizContent.setUserId("128440810108044");//必输，需控制不能为空，用户唯一标识,送身份证号
		bizContent.setBacAddr(URLEncoder.encode("http://www.test.com"));//选输，回调地址
		bizContent.setEpayflag("0");//选输，工银e支付标志，0-短信、1-静态密码，集成客户端SDK的方式能送0-短信或1-静态密码，非APP方式只能送0-短信，不送默认为0-短信
		
		bizContent.setCorpAppid(APP_ID);//外公司合作方送APP_ID的值，行内应用如e支付等送外公司合作方的APPID
		long systime = System.currentTimeMillis(); // 现时间戳		
		String orderTimeStamp=new Long(systime).toString();
		
		System.out.println("orderTimeStamp:"+orderTimeStamp);
		bizContent.setOrderTimeStamp(orderTimeStamp);//生成请求的时间,必输
		
		bizContent.setZoneno("00200");//地区号号，选输，5位数字，上送值联系对接分行提供
		bizContent.setBrno("00260");//网点号，选输，5位数字，上送值联系对接分行提供
		
		request.setBizContent(bizContent);
		System.out.println(client.buildPostForm(request));// 实际调用时的相关返回结果及异常处理，请自行添加
	}
}
