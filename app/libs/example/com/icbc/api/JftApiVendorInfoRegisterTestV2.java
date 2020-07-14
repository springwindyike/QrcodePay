package com.icbc.api.test;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.JftApiVendorInfoRegisterRequestV2;
import com.icbc.api.request.JftApiVendorInfoRegisterRequestV2.JftApiVendorInfoRegisterRequestV2Biz;
import com.icbc.api.response.JftApiVendorInfoRegisterResponseV2;

/**
 * 聚富通子商户注册接口
 * 
 * 请商户配置SDK中的lib文件夹中的jar包后，根据备注1-6提示进行数据替换
 */
public class JftApiVendorInfoRegisterTestV2 {

	// 1、网关公钥（不是APP的公钥）
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5"
			+ "BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lT"
			+ "W3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
	// 2、appid
	protected static final String APP_ID = "10000000000001474554";
	// 3、密钥对认证方式，公钥在API平台登记，此处为私钥
	protected static final String MY_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCF7eCVTURFK5+gp...";

	public static void main(String[] args) throws Exception {

		// 签名类型为RSA2时，需传入appid，私钥和网关公钥，签名类型使用定值IcbcConstants.SIGN_TYPE_RSA2，其他参数使用缺省值
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, "RSA", MY_PRIVATE_KEY, "UTF-8", "json",
				APIGW_PUBLIC_KEY, "AES", "5xGJdh7qb+B95SUoxDlatg==", "", "");

		JftApiVendorInfoRegisterRequestV2 request = new JftApiVendorInfoRegisterRequestV2();

		// 4、根据测试环境和生产环境替换相应ip和端口
		request.setServiceUrl("https://ip:port/api/jft/api/vendor/info/register/V2");

		// 5、请对照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值
		JftApiVendorInfoRegisterRequestV2Biz bizContent = new JftApiVendorInfoRegisterRequestV2Biz();
		bizContent.setAppId(APP_ID);
		bizContent.setOutUpperVendorId("888800001");
		bizContent.setOutVendorId("999900001");
		bizContent.setOutUserId("777700001");
		bizContent.setVendorName("某某公司");
		bizContent.setVendorShortName("公司简称");
		bizContent.setVendorPhone("010-99990000");
		bizContent.setVendorEmail("xxx@gmail.com");
		bizContent.setProvince("130000");
		bizContent.setCity("130100");
		bizContent.setCounty("130102");
		bizContent.setAddress("xx路xx号xx楼xxx");
		bizContent.setPostcode("123451");
		bizContent.setOperatorName("张三");
		bizContent.setOperatorMobile("13800001111");
		bizContent.setOperatorEmail("zhangsan@gmail.com");
		bizContent.setOperatorIdNo("110101198801010101");
		bizContent.setVendorType("01");
		bizContent.setCorprateName("李四");
		bizContent.setCorprateMobile("18800001111");
		bizContent.setCorprateIdType("0");
		bizContent.setCorprateIdNo("110123199901121230");
		bizContent.setCorprateIdPic1("merca308c0cb903494ab8e7f45b43fcce46");
		bizContent.setCorprateIdPic2("merca308c0cb903494ab8e7f45b43fcce46");
		bizContent.setCertType("101");
		bizContent.setCertNo("6E66455221");
		bizContent.setCertPic("merc541gc0cb903494ab8e7f45b43fcce46");
		bizContent.setOtherCertPic1("mercaas600cb903494ab8e7f45b43fcce46");
		bizContent.setOtherCertPic2("merc5218c0cb903494ab8e7f45b43fcce46");
		bizContent.setOtherCertPic3("merca250f0cb903494ab8e7f45b43fcce46");
		bizContent.setAccountBizType("1");
		bizContent.setAccountName("某某公司");
		bizContent.setAccountBankProvince("河北");
		bizContent.setAccountBankCity("石家庄");
		bizContent.setAccountBankNm("中国工商银行");
		bizContent.setAccountBankName("中国工商银行石家庄长安支行");
		bizContent.setAccountBankCode("102100029679");
		bizContent.setAccountNo("0200919282761721");
		bizContent.setAccountMobile("17700001111");

		request.setBizContent(bizContent);

		JftApiVendorInfoRegisterResponseV2 response;
		try {
			response = (JftApiVendorInfoRegisterResponseV2) client.execute(request, System.currentTimeMillis() + "");
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
