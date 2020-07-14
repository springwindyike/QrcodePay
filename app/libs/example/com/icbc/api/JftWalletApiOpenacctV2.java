package com.icbc.api;

import org.junit.Test;

import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.JftWalletApiOpenacctRequestV2;
import com.icbc.api.request.JftWalletApiOpenacctRequestV2.JftWalletApiOpenacctRequestV2Biz;
import com.icbc.api.response.JftWalletApiOpenacctResponseV2;


/**
 * 寮�鎴�
 *
 * @author kfzx-wangpeng02
 *
 */
public class JftWalletApiOpenacctV2 {

	//  公钥（根据环境变化）
//String MY_PRIVATE_KEY2 = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCcRR0FmtNV+Z4NVSfdNLLpOrbCIWKUS2OPYpXaHtbKT1cVgYf5Kg/s5mukcfU5cdGqO74NfegzbRyj+/YXTlADRYOSDTl/Pg+4pzUwmddfjJTwXbi+YY0L0YYPh1r503ih6zgQ4tkWiEP9qerKG4DMJhz1brNM+tPDxnQhEtqDp3uDUothZ1kLF3NwP25MhM0lF3h9dlEm2do5IwbgQbCYv4CISyaXkajHSVxLFwh0z06QximHtYlwWJCzKv1njUJSte+5E0SkSluShsaJI/yduvAs3ITrTW0XanIsKthSPJH7VIt8epiuXZxwdE4jwXkGaxTxW0MpR+zw+12EqJm9AgMBAAECggEAFfQjsqDgpchuquLWud3ocJmeCUHVbo30y7UG5mDEviFNU6kh6CA/ooFwh+a2k75ovSitd4nDsE3Y4zTHitimpv8CD+eptzWJ0eAzucMzHapLVkVkaeKchReHZPEYF9bcsKqx8rVb2C2Gl8FiSch5XLTSBqzppZvrWiqsL+VNK4eIgVSNuQFPjCNvfHxqflo+z1VtLmnMWqqdOi6Cvz7/rpClltwM6UZZIeSg2cDN9DYIJjLxzkgAChus+YyRJutLZgqKb1HTxOMbzRLa1tobzNIcsrbs5e7Ky72qRnjovFd6U5fzZ4guxIlzMq2GrEqMNxs7T/YCLZHF6r3DlQZRYQKBgQDbsWWkYSKrueI0kr1xTfRcBQNXBZ/GYjq7HWU38Aj4eZH728w8iVeuRoAvD3cmi99BSAuH89hrzigOS/ixJTit2zQLQTuLW+CCilspY/dg1iSwwFxM7qUQp4Q7NaxtSm4fsYH1+Gn9L35/eMW8MdhNjzP59x2ISKROQ9s7Tb35VQKBgQC2GHcCCip4K2TNbF9JzEzX9atnLfX+87I5+T4oa+CNQjsOElrw6hKmqhxSEFeDrbauKDHUrUFJuqpuhC6UkPNIGustLpHDmz9tFo4Z8R/3ibIQ6Tdoic3ZhER5FESM3LPuBLEbYhlGMqb0XmaoI2zeHzpf7aoU+ipZWCJ88qh+yQKBgE1C7gQJRTAvhyYGFSmryKwz9yC7kZ0rHox/ogEyIXWBC54PhpwjkPpxQNNMFRMxTaqfs650S0BemCevAB8MgApkdMEgh9hSz3oZPkYoKe+cX/rpK4zCwLpCr3ZDQgiNjH0I6DOg0WWBNnON/bxZq0BbhGP8TB6JrX74zjjk9lKhAoGBAKZ5iVtxBdClA1wWhqsGPv5018XVq/7wtnDv35a+wSUDds/vkfqMVI7QGGIiFJAK4Wco0h24Y2bPY/7zk045kmDKU1UULSjiJsNJipJG8k2xMfzp6cEFsw74ME1tbRpGr6yb13rMXYTiy+W+5CU1ddNAQ3Lt6b+R0eOqgqUuh0KZAoGBAKekWvDphNf8IRILhnkUfSK9HF08ztRSUN9jVoUCLLd4fWjqIRvLuW+QPtNMY/xAR38MR58TqMX0jx+N8spk0cMYSJFzUmjh/5BQjmtxxobUcZxU6kxmldWfUG/bHWJDJPj8FWrDhst0fctfCeDGCtXcs3LGjn42Inq6iNEl8Z8K";
// 公钥（根据环境变化）	   	
//String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
	//9月莫测				  	
	String MY_PRIVATE_KEY2 = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCF7eCVTURFK5+gpeaQios8lw6uTcltPalYM6/VNfNDAirGnpFP5RQNI7duf5nr+3QLe1FNMbaR6Cl1BeWcaFzYqba4UTjNrttGf9E2LBnVa7sR0sVWX/1o71nIou21+Wh044zqcSl1T6FEBpSP70fz5ahytU41hVy6lyJymDhyWzZepr4Yqnrs69GB6V/v2DDuX8t4tpZAK1cxsOSrBJHOYxUoTomLb9dX8dFI/4AIShjKv4hmwryviHJRlZSiyV8j72FgOUs7BmMz+KCaKGVGo1G+YrppnX5IruNvaXDB59bcu3lsjPODUkfMKsMr+Vrg4ipDEboCCtKuaPrZ2xMNAgMBAAECggEAY3qQcXWl+xbvB52Sx9QQnh25yuB+eETvz1L9DQp4uVIXwdYwKz8FiMj5y/q9stnglVKwzfzaFkBy4rhRl76xEEHnNbsmzShPOWthU7KoMa1Gk3OSHplIGjSG5Q+YL62k2AXZOp55Y+iU6XlVyh+6uz/fwexHvltjyDjQXnwQmWdvUHM+cy7yTxlfz8FGecZOyRY2jRUJZ7w0WfUx0p1R0vWRRpjRddMDyu7sjtkTQ54KfmqE5HQWKrQVDio2hSw7EbaylAo6HSZO8i2ZSW3neKenvV2YCUVk6AbhfJj/SfTzqzEePduOv5bUq/vaTRCWAImcHnohLhzQQS5zn3jDpQKBgQDTncyUAAOL275viu9Xbk2IBsv/tyFaNji/G8BdE0jB++7x7J3EtLRJIBOJE16vvWUJfD7CXvezqArZWLADt7lholdPuUKlEOJtXvqlYvg7zKDce+wA7HAK0a2sMSvU51nC0q4LLaI+NlGxZZcPYcoj6PYLXw/BHaqGAHm5Y+RMhwKBgQCiBNz3zYP4RnfBTazWBRm3P7jybcteFMh5inmOyw9mfpphIUpFlw9lRbt7J2+sauzlIKZ2d9MOoZIurAZ/zbgIf2msTEoyczzO6yUpyeKinl6HjizMKggLEponU7nk2nQsuVbf7wYoHPwwjT+a5k9R+PMrYVO0B74Z8PIQpHd8ywKBgQCD//qMlzWfGANCMLf7IaLbJuI5MFJto0TicL0dUdogprX10lLXUKDkvE1zQ9HcbZeIwyeitvpr5nZd/SROLVxFuq4b3MPlkxKqhoRyhbmyE4KEBgjAyrtZBFIBBusAcw9ap3BJKL37cIak0WnY/nbIz5gqn7GEFK05yTIkolrWIQKBgH2U42m4BKi2hjBw8pzZSzt8yvAuJkoANfvvV5VU09UQIL1Uvmr+UdKfoFgvEyJDpudazWxaKF/Y4KQIduktHY6Io/IHGCPOqr2ACkg/0clWk9LiYtrFYYKjopUFErvOj+nypuHgNZd2EAvaEAkSpzzUiDeBsw2CStl0p0w7DtrNAoGAIsqskDGGewcgBWQmXvSqa7o0do3coiH3ToMAQm9vlGgHAAw5xlgfVQpGwe8GR4ilysh+5EuiuLnINDt0tXpv9K7dAQgjKAmszFrOjmyBMnSDebfysynABFj3c8GglO+l9J+ljFMqgqPVzsLAgIItciyq80Xmv8TjpbwFM2v34lI=";
	String APIGW_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhe3glU1ERSufoKXmkIqLPJcOrk3JbT2pWDOv1TXzQwIqxp6RT+UUDSO3bn+Z6/t0C3tRTTG2kegpdQXlnGhc2Km2uFE4za7bRn/RNiwZ1Wu7EdLFVl/9aO9ZyKLttflodOOM6nEpdU+hRAaUj+9H8+WocrVONYVcupcicpg4cls2Xqa+GKp67OvRgelf79gw7l/LeLaWQCtXMbDkqwSRzmMVKE6Ji2/XV/HRSP+ACEoYyr+IZsK8r4hyUZWUoslfI+9hYDlLOwZjM/igmihlRqNRvmK6aZ1+SK7jb2lwwefW3Lt5bIzzg1JHzCrDK/la4OIqQxG6AgrSrmj62dsTDQIDAQAB";


	protected static final String APP_ID = "10000000000000056013";// 根据实际情况确定appid

	// 发送
	@Test
	public void test_cop1() {
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, "RSA",
				MY_PRIVATE_KEY2, "UTF-8", "json", APIGW_PUBLIC_KEY, "AES",
				"i5N/TQHG9hq00OpdNzpUUw==", "", "");

		JftWalletApiOpenacctRequestV2 request = new JftWalletApiOpenacctRequestV2();

		request.setServiceUrl("https://apipcs4.dccnet.com.cn/api/jft/wallet/api/openacct/V2");//鏍规嵁瀹為檯鎯呭喌纭畾url鍜岀鍙�
		JftWalletApiOpenacctRequestV2Biz bizContent = new JftWalletApiOpenacctRequestV2Biz();

		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		bizContent.setAppId("10000000000000056013");//商户appid
		bizContent.setCorpSerno("100000000000000080622018091200000001");//每次交易改流水号，必须由20位APPID+交易单号组成，最大长度不得超过36位。
		bizContent.setBindMedium("6212264000000505871");// 绑定的I类卡号
		bizContent.setCertNo("433023197208285180");// 身份证
		bizContent.setCertType(0);// 证件类型
		bizContent.setCorpDate("2017-03-15");
		bizContent.setCorpMediumId("100024577653");// 合作方介质号，如微信号
		bizContent.setCustName("窑故");
		bizContent.setMobileNo("13528604603");
		bizContent.setNotifyAddr("https://apipcs4.dccnet.com.cn/api/jft/api/wallet/openAcct/V1");//合作方可接收http请求的回调地址
		bizContent.setOutServiceCode("openaccount");//固定不改
		bizContent.setTrxAccDate("2017-03-15");
		bizContent.setTrxAccTime("13:30:01");
		bizContent.setUserProFlag("03"); //协议 00-都不开  01- 开一类开 02-二类户协议 03-都开

		//风险特征值
		bizContent.setCustIp("82.32.02.33");
		bizContent.setCustMac("1121212");
		bizContent.setDeviceId("82.39.02.33");
		bizContent.setBrowserLang("");
		bizContent.setBrowserVersion("");
		bizContent.setChannelType("1");//1-app,CustIp、CustMac和DeviceId必输；2-非app
		bizContent.setCvn2("");
		bizContent.setExpired("");
		bizContent.setFactoryInfo("");
		bizContent.setMemoryCapacity("");
		bizContent.setScreenResolution("");
		bizContent.setSystemVersion("");
		bizContent.setCpuId("");
		
		//新增4个必填的
		bizContent.setOccupation(1);  //职业：1-公务员;2-事业单位员工;3-公司员工;4-军人警察;5-工人;6-农民;7-管理人员;8-技术人员;9-私营业主; 10-文体明星;11-自由职业者;12-学生; 13-无职业;
		bizContent.setForeverFlag(0); //证件长期有效标志   0 非， 1 是长期有效
		bizContent.setValidityPeriod("1998-11-19"); //证件失效日期（当forever_flag为0时必输）
		bizContent.setSignDate("");	     //证件签发日期
		bizContent.setGender(1);    //性别 1- 男。 2-女

		/**
		 * 国籍<br> 156-中国
		 * type:int<br>
		 * length:3<br>
		 */
		bizContent.setNationality(0);

		/**
		 * 出生日期<br>
		 * type:str<br>
		 * length:10<br>
		 */
		bizContent.setBirthday("");

		/**
		 * 发证机关<br>
		 * type:str<br>
		 * length:30<br>
		 */
		bizContent.setIssuingAuthority("");

		/**
		 * 地址<br>
		 * type:str<br>
		 * length:120<br>
		 */
		bizContent.setAddress("");

		/**
		 * 申税标志<br> 1-是 2-否 0-默认
		 * type:int <br>
		 * length:1<br> 未填写 就是 0
		 */   
		bizContent.setTaxDeclarationFlag(0);

		/**
		 * 合作方上送的客户定制化信息<br>
		 * type:str<br>
		 * length:200<br>
		 */
		bizContent.setCustomizationInfo("");

		/**
		 * 使用SM2公钥加密的sm4对称密钥，使用密文时必输，Base64编码 <br>
		 * type:str<br>
		 * length:152<br>
		 */
		bizContent.setSecretKey("");

		/**
		 * 绑定的I类卡号的哈希值，目前是通过md5生成，英文统一小写<br>
		 * type:str<br>
		 * length:32<br>
		 */
		bizContent.setBindMediumHash("");

		

		/**
		 * 是否开通e支付（默认为否，需要配置产品协议参数）<br>  0-否，1-是
		 * type:INT<br>
		 * length:1<br>
		 */
		bizContent.setIsOpenEpay(0);

		/**
		 * 是否开通快捷支付（默认为否，需要配置产品协议参数）<br>  0-否，1-是
		 * type:int<br>
		 * length: 1<br>
		 */
		bizContent.setIsOpenQpay(0);

		/**
		 * 四位我行快捷支付机构号（当is_open_qpay为1时必输）<br>  0147（财付通）
		 * type:str<br>
		 * length:4 <br>
		 */
	   bizContent.setQpayCorpNo("");

		/**
		 * 证件影像上送状态  <br>  0-未上送(默认)，1-已上送
		 * type:str<br>
		 * length:1 <br>
		 */
		bizContent.setImgUploadStatus(0);

		/**
		 * 营销代码 <br>
		 * type:str<br>
		 * length:20 <br>
		 */
		bizContent.setSellerCode("");

		/**
		 * 分行鉴权单号 <br>
		 * type:str<br>
		 * length: 32 <br>
		 */
		bizContent.setIndentifySerno("");

		/**
		 * 合作方指定归属机构 <br>
		 * type:str<br>
		 * length:32 <br>
		 */
		bizContent.setAccountOrgNo("");

		/**
		 * 开户场所 <br>
		 * type:str<br>
		 * length:40 <br>
		 */
		bizContent.setOpenPlace("");

				
				
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		System.out.println(bizContent);
		request.setBizContent(bizContent);

		JftWalletApiOpenacctResponseV2 response;
		try {
			response = (JftWalletApiOpenacctResponseV2) client.execute(request,
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


	public static void main(String[] args) {
		new JftWalletApiOpenacctV2().test_cop1();
	}
}
