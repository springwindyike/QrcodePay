package com.icbc.api.test;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.JftApiVendorInfoModifyRequestV1;
import com.icbc.api.request.JftApiVendorInfoModifyRequestV1.JftApiVendorInfoModifyRequestV1Biz;
import com.icbc.api.response.JftApiVendorInfoModifyResponseV1;

/**
 * 聚富通子商户修改接口
 * 
 * 请商户配置SDK中的lib文件夹中的jar包后，根据备注1-6提示进行数据替换
 */
public class JftApiVendorInfoModifyTestV1 {

	// 1、网关公钥（不是APP的公钥）
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5"
			+ "BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lT"
			+ "W3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
	// 2、appid
	protected static final String APP_ID = "10000000000000005452";
	// 3、密钥对认证方式，公钥在API平台登记，此处为私钥
	protected static final String MY_PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDI/Pm9FdqP7cTo+B9hQt...";

	public static void main(String[] args) throws Exception {

		// 签名类型为RSA2时，需传入appid，私钥和网关公钥，签名类型使用定值IcbcConstants.SIGN_TYPE_RSA2，其他参数使用缺省值
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, "RSA", MY_PRIVATE_KEY, "UTF-8", "json",
				APIGW_PUBLIC_KEY, "AES", "yuzLR7IMjAOZzlNZ83iXIw==", "", "");

		JftApiVendorInfoModifyRequestV1 request = new JftApiVendorInfoModifyRequestV1();

		// 4、根据测试环境和生产环境替换相应ip和端口
		request.setServiceUrl("https://ip:port/api/jft/api/vendor/info/modify/V1");

		// 5、请对照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值
		JftApiVendorInfoModifyRequestV1Biz bizContent = new JftApiVendorInfoModifyRequestV1Biz();
		bizContent.setAppId("10000000000000004473");
		bizContent.setOutVendorId("999900001");
		bizContent.setVendorName("XXX公司");
		bizContent.setVendorShortName("X公司简称");
		bizContent.setVendorPhone("13888888881");
		bizContent.setVendorEmail("aa1@wqeq.com");
		bizContent.setProvince("130000");
		bizContent.setCity("130100");
		bizContent.setCounty("130102");
		bizContent.setAddress("xx路xx号xx楼xxx");
		bizContent.setPostcode("123010");
		bizContent.setOperatorName("李四");
		bizContent.setOperatorMobile("18988888888");
		bizContent.setOperatorEmail("123@qq.com");
		bizContent.setOperatorIdNo("230702199205271133");
		bizContent.setCorprateName("李四");
		bizContent.setCorprateMobile("13666666600");
		bizContent.setCorprateIdType("0");
		bizContent.setCorprateIdNo("230702199205271133");
		bizContent.setCorprateIdPic1("merca308c0cb903494ab8e7f45b43fcce50");
		bizContent.setCorprateIdPic2("merca308c0cb903494ab8e7f45b43fcce50");
		bizContent.setCertType("01");
		bizContent.setCertNo("0455FE12323");
		bizContent.setCertPic("merca308c0cb903494ab8e7f45b43fcce50");
		bizContent.setOtherCertPic1("merca308c0cb903494ab8e7f45b43fcce50");
		bizContent.setOtherCertPic2("merca308c0cb903494ab8e7f45b43fcce50");
		bizContent.setOtherCertPic3("merca308c0cb903494ab8e7f45b43fcce50");
		bizContent.setAccountBizType("1");
		bizContent.setAccountName("XXX公司");
		bizContent.setAccountBankProvince("北京");
		bizContent.setAccountBankCity("北京");
		bizContent.setAccountBankNm("中国工商银行");
		bizContent.setAccountBankName("中国工商银行股份有限公司泸州分行业务处理中心");
		bizContent.setAccountBankCode("102657000121");
		bizContent.setAccountNo("0200088809210121234");
		bizContent.setAccountMobile("16888888888");
		bizContent.setSingleWithdrawLimit("111000");
		bizContent.setDayWithdrawLimit("222000");
		bizContent.setDayWithdrawTimes("5");

		request.setBizContent(bizContent);

		JftApiVendorInfoModifyResponseV1 response;
		try {
			response = (JftApiVendorInfoModifyResponseV1) client.execute(request, System.currentTimeMillis() + "");
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
