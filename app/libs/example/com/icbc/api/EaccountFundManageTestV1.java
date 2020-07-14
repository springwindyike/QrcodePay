package com.icbc.api;

import com.icbc.api.IcbcApiException;
import com.icbc.api.IcbcConstants;
import com.icbc.api.UiIcbcClient;
import com.icbc.api.request.EaccountFundManageRequestV1;
import com.icbc.api.request.EaccountFundManageRequestV1.EaccountFundManageRequestV1Biz;

public class EaccountFundManageTestV1 {
	protected static String APP_ID = "10000000000000014011";
	protected static String MY_PRIVATE_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJCoQe/O+uqpOtyE/2CUjD7wosZw8jI1AlLNJCllOmlX+obA6h97b0JsEL0SjMCAR3xJyw7MKLqkcy5qQ/bBgw2XSrodmjzOVqfT1OXRii0xw0HiVkHR4cEWnEAAdfo0lDc4iuzCIQrnT5gM0+U+qeSV6JFfwVRjgYzBdHQRPCf1AgMBAAECgYAdQUoEe7GXH5591o/nMmOinvvscg8pRDsyD7bOgGBtyZMrCXzP3SDFKCHCeyvoColqg2oDlhpulK+OpYMVNlGQcO4eubOJp9MUc3m4A9RxkVr3dsVrmygM5czPfWHAPVQ4dECDruBJn9zoo1ci0myRTh4KSCq6SxpCE0Pbf3j7iQJBAOdMPFRfOkSQ1hsN9Mg4jd9on8r7+mF8gFPhkNI6qvEKw/prmU3obUWvZL42vRlLOQyyB92mBF24PStR/B6CjR8CQQCgGz0VoqCplurSCapGdgX3D7bNSDtMUmaLJYJxih8v+zghP0YtVgDeV3NjogVjOlz8/9Rebo0PoFcqyJnNA1RrAkEAul3dBoasZm7ldWsrXuDiv66HgoDB4Cb3J59Kl3oaHpp0CqUEI5gx48JNRE7K00SfNTGF0Pxh7Dn1X6Bxqwu6NQJADrdyPfLc4bnFi9jnleJzWepP2z6wdKt+UXv5KYaQp1BoMGYohTJKkiVnrdjOtfg/Y+IAG03+GVmbqYsW2AleUQJBANYQklohKtsmq8ptX3as6hjcuXcTpc2DSpVeOnCueNv107+dDJ+K14tbiVYzF3tkHBNMRkGtr6EuGKJ+A63sJ00=";
	private static String AES_KEY = "xMh0xFsG7G80ziePFdnT8g==";
	
	public static void main(String[] args) throws IcbcApiException {
		// TODO Auto-generated method stub
		//UiIcbcClient client = new UiIcbcClient(APP_ID, MY_PRIVATE_KEY, IcbcConstants.CHARSET_UTF8);
		UiIcbcClient client = new UiIcbcClient(APP_ID,IcbcConstants.SIGN_TYPE_RSA,"MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJCoQe/O+uqpOtyE/2CUjD7wosZw8jI1AlLNJCllOmlX+obA6h97b0JsEL0SjMCAR3xJyw7MKLqkcy5qQ/bBgw2XSrodmjzOVqfT1OXRii0xw0HiVkHR4cEWnEAAdfo0lDc4iuzCIQrnT5gM0+U+qeSV6JFfwVRjgYzBdHQRPCf1AgMBAAECgYAdQUoEe7GXH5591o/nMmOinvvscg8pRDsyD7bOgGBtyZMrCXzP3SDFKCHCeyvoColqg2oDlhpulK+OpYMVNlGQcO4eubOJp9MUc3m4A9RxkVr3dsVrmygM5czPfWHAPVQ4dECDruBJn9zoo1ci0myRTh4KSCq6SxpCE0Pbf3j7iQJBAOdMPFRfOkSQ1hsN9Mg4jd9on8r7+mF8gFPhkNI6qvEKw/prmU3obUWvZL42vRlLOQyyB92mBF24PStR/B6CjR8CQQCgGz0VoqCplurSCapGdgX3D7bNSDtMUmaLJYJxih8v+zghP0YtVgDeV3NjogVjOlz8/9Rebo0PoFcqyJnNA1RrAkEAul3dBoasZm7ldWsrXuDiv66HgoDB4Cb3J59Kl3oaHpp0CqUEI5gx48JNRE7K00SfNTGF0Pxh7Dn1X6Bxqwu6NQJADrdyPfLc4bnFi9jnleJzWepP2z6wdKt+UXv5KYaQp1BoMGYohTJKkiVnrdjOtfg/Y+IAG03+GVmbqYsW2AleUQJBANYQklohKtsmq8ptX3as6hjcuXcTpc2DSpVeOnCueNv107+dDJ+K14tbiVYzF3tkHBNMRkGtr6EuGKJ+A63sJ00=", IcbcConstants.CHARSET_UTF8,IcbcConstants.ENCRYPT_TYPE_AES, AES_KEY);
		EaccountFundManageRequestV1 request = new EaccountFundManageRequestV1();
		request.setServiceUrl("http://122.64.61.115:8081/ui/eaccount/fund/manage/V1");
		
		EaccountFundManageRequestV1Biz bizContent = new EaccountFundManageRequestV1Biz();
		bizContent.setCorpAppId(APP_ID);
		bizContent.setCorpMediumId("020078999979641");
		bizContent.setCustName("Õ¯“¯≤‚ ‘");
		bizContent.setCertNo("440111199111111115");
		bizContent.setPhoneNo("13700001111");
		bizContent.setBackAddr("http://seas.icbc");
		
		long systime = System.currentTimeMillis(); // 
		String orderTimeStamp=new Long(systime).toString();		
		System.out.println("orderTimeStamp:"+orderTimeStamp);
		bizContent.setReqTimestamp(orderTimeStamp);
		
		request.setBizContent(bizContent);
		System.out.println(client.buildPostForm(request)); 
	}
}
