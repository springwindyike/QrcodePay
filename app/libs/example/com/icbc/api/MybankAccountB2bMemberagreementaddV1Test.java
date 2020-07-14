package com.icbc.api;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.junit.Test;

import com.icbc.api.request.MybankAccountB2bMemberagreementaddV1Request;
import com.icbc.api.request.MybankAccountB2bMemberagreementaddV1Request.MybankAccountB2bMemberagreementaddV1RequestBiz;
import com.icbc.api.response.MybankAccountB2bMemberagreementaddV1Response;

/**
 * 合作方会员产品协议录入
 * 
 * 请商户配置SDK中的lib文件夹中的jar包后，根据备注1-6提示进行数据替换
 */
public class MybankAccountB2bMemberagreementaddV1Test {

	// 1、网关公钥
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	// 2、appid
	protected static final String APP_ID = "10000000000000003917";

	// 3、密钥对认证方式，公钥在API平台登记，此处为私钥
	protected static final String MY_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDH8nn5xSLmJVrXDm4480Yr9KanIITe4htlMjBB8AHnezhD6oEtB7g5AuuH0V3ZIRK9hvxJPMPPfjzdJaAyecX1Hbm2OBstgnCunXWhtUBeq27JAKvtWhomyuMo1xi+rbmOtLeNXydXWeq8Lh6hBwLvWjk9ZgH3f5iOEkv7NCR2uJef3getAJC2wrn3Sn0ck9UtvqXKVkMKdfOCnz+kmd81R5qJ+9wEILsp2Lv1pn1klE7+vjhS9ySPkfsDLZQGpj07k4TogELJIxzMPSRQ1mu5mlQuN1k3e3RwcXY4ZkpyJ406tajAA6NG/V4kNLIN0qthWZSaI8ejPupZRTsJucO5AgMBAAECggEAbthx3pH3YvdagNazLEdRo5Shvw08HAPlhBhqwGM56wZYju42Zqxc6N5BjK35BSJcrU1kF4XkV+d3/nGZeeIgaF7uUaKRDo29wk/wopFE+ja32B7TMWY+ETtw63czdKICuKZfC7SwrrBefaxjtomYivDNwsgGVxsZi8mA7eZeQKHiAjETf7YpkTyznRI2GC6wXzqrQTBOjnmzMyXH880kSQwglXHeV3YACkgeH8RnZpjVvVby3LWITmTQsUi6aYyLpxv9cRHzlCxNCt/0ny2mOS59FOIZbqBNWxK8xg9v6x5hsAr1CrAQmLqtzdMQlUwCaWx9OP6/HF6vnTnRWagE8QKBgQDrOz3RHJ1rzwF2j7IYb4h50JEVmc3k5joc1Mz9svCQ1UhlBHjVtNfRxxtbdPYtGLGEYoBcbltH40oqx4S4gUZdgL4e1vVOiv357hMcdawHYWNvY62cPsTS81ejUo04DhfHZKrV8BJrCzr3poS4+bjFv2/GfeTs6tI+GsRUvZQUVwKBgQDZmbtfANTxufegEBkBTwPpipcKV6CxWc+Ktzpgp2plzyAlMQ3AF7sP/xs6gsGuYiZnW3gAkD/x8+rsdYpkZaycpzEFz5hkvYo5uzVWEwLlRNGGtzWQGL86Kyr2Cc9VkJOy6D60G5Trn0/s19C8DnXH1NKBjPvb6Q7uZNMKETtebwKBgGjgIcBwlJLzWQCmMk4Is/0ziuvphc2PA8vE6JwXwn+gR8WaB9Gn7iz+K2lMLVGP191hGT+ciB/16yRFjhvAr0GS27DeP8JD39YlWenvYMJtniqUc1vc9F3k1mbfsEyUo+9nJ294uI13FVRCrpvV4pZvsoL5sC4cx52ey3fIihPDAoGAMXIJbbEWskb7yddelzmJPgxL/gGjdileS7sO/N+OAcxrFYhsA3Zg/2WMnmMP97w91canIhmlLimq/EhJRj8EViR3s0ZU7q9TNYMgv4paYhadNetztGarLWCZxoa8IklUBpdXiD2sPU5aLwtrVxBCG0J1AxMyN+phhjJK8kKwJukCgYAP03AqwmRaDYQ0zYx6vQcbetIjRTtqT4nWBHJzM60ilkMuLVQfMNXAGOZOxOYwCNKFU4Vr0r8n63P+p+I7e/jOi1O+y6wI5C2/6K6YP4z+kkpKXpgCQvOt7HjMpNzsN//3fZiPcArd7royTCHGvDB/az08SqV1H2qgdJ7AJoATtQ==";

	SimpleDateFormat sd = new SimpleDateFormat("yyMMddHHmmss");

	@Test // 增加企业会员
	public void testAddEnterprise() throws Exception {

		// 签名类型为RSA2时，需传入appid，私钥和网关公钥，签名类型使用定值IcbcConstants.SIGN_TYPE_RSA2，其他参数使用缺省值
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY,
				APIGW_PUBLIC_KEY);

		MybankAccountB2bMemberagreementaddV1Request request = new MybankAccountB2bMemberagreementaddV1Request();

		// 4、根据测试环境和生产环境替换相应ip和端口
		//request.setServiceUrl("http://122.64.109.110:8081/api/mybank/account/b2b/memberagreementadd/V1");
		request.setServiceUrl("http://122.64.61.115:8081/api/mybank/account/b2b/memberagreementadd/V1");

		// 5、请对照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值，非必输字段可不上送
		MybankAccountB2bMemberagreementaddV1RequestBiz bizContent = new MybankAccountB2bMemberagreementaddV1RequestBiz();

		bizContent.setTrxDate("2021-10-20"); // 交易日期
		bizContent.setCheckWorkDateFlag("2"); // 核对交易日期标志
		bizContent.setPartnerProno("1801627"); // 合作方协议编号
		bizContent.setMemberNo(sd.format(new Date())); // 会员编号
		bizContent.setMemberName("北京大宗商品交易所有限公司"); // 会员名称
		bizContent.setMemberType("1"); // 会员类型
		bizContent.setCorpRepreName("阿宝"); // 法人代表姓名
		bizContent.setIdCardNo("34012319840503233X"); // 身份证号码
		bizContent.setIdCardSignDate("2019-06-21"); // 身份证签发日期
		bizContent.setTelphoneNo("18666130001"); // 手机号
		bizContent.setAccBankFlag("1"); // 账号本他行标志
		bizContent.setAccno("0200041719213559609"); // 账号
		bizContent.setCurrtype("1"); // 币种
		bizContent.setAccName("北京大宗商品交易所有限公司（北京）"); // 账户名称
		// bizContent.setAccBankNo(""); // 开户行号
		// bizContent.setAccBankName("工商银行"); // 开户银行
		bizContent.setDealName("丹娜"); // 经办人姓名
		bizContent.setDealTelphoneNo("18666130002"); // 经办人手机号
		bizContent.setSociCreCode("911101057263777049"); // 统一社会信用代码
		bizContent.setPickCashDays("12");//货款自动提现天数 
		bizContent.setConfFlag("2"); //认证标志
		// bizContent.setSingNoNoteAmtd("100000"); // 单笔免短信验证码额度
		bizContent.setPayMode("0"); //入账方式

		request.setBizContent(bizContent);

		MybankAccountB2bMemberagreementaddV1Response response = new MybankAccountB2bMemberagreementaddV1Response();
		try {
			response = client.execute(request, UUID.randomUUID().toString().replaceAll("-", ""));// msgId消息通讯唯一编号，要求每次调用独立生成，APP级唯一
			if (response.isSuccess()) {
				// 6、业务成功处理，请根据接口文档用response.getxxx()获取同步返回的业务数据
				System.out.println("ReturnCode:" + response.getReturnCode());
				System.out.println("returnMsg:" + response.getReturnMsg());
			} else {
				System.out.println("returnCode:" + response.getReturnCode());
				System.out.println("returnMsg:" + response.getReturnMsg());
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}

/*	@Test // 增加个人会员
	public void testAddPersonalCustomer() throws Exception {

		// 签名类型为RSA2时，需传入appid，私钥和网关公钥，签名类型使用定值IcbcConstants.SIGN_TYPE_RSA2，其他参数使用缺省值
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY,
				APIGW_PUBLIC_KEY);

		MybankAccountB2bMemberagreementaddV1Request request = new MybankAccountB2bMemberagreementaddV1Request();

		// 4、根据测试环境和生产环境替换相应ip和端口
		request.setServiceUrl("http://122.64.109.110:8081/api/mybank/account/b2b/memberagreementadd/V1");

		// 5、请对照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值，非必输字段可不上送
		MybankAccountB2bMemberagreementaddV1RequestBiz bizContent = new MybankAccountB2bMemberagreementaddV1RequestBiz();

		bizContent.setTrxDate("2021-10-20"); // 交易日期
		bizContent.setCheckWorkDateFlag("2"); // 核对交易日期标志
		bizContent.setPartnerProno("1801627"); // 合作方协议编号
		bizContent.setMemberNo(sd.format(new Date())); // 会员编号
		bizContent.setMemberName("阿宝"); // 会员名称
		bizContent.setMemberType("2"); // 会员名称,企业名称/个人名称
		// bizContent.setCorpRepreName(""); // 法人代表姓名
		bizContent.setIdCardNo("34012319840503233X"); // 身份证号码
		bizContent.setIdCardSignDate("2019-06-21"); // 身份证签发日期
		bizContent.setTelphoneNo("18666130079"); // 手机号
		bizContent.setAccBankFlag("1"); // 账号本他行标志
		bizContent.setAccno("6222080200001187619"); // 账号
		bizContent.setCurrtype("1"); // 币种
		bizContent.setAccName("阿宝"); // 账户名称
		// bizContent.setAccBankNo(""); // 开户行号
		bizContent.setAccBankName("工商银行"); // 开户银行
		// bizContent.setDealName(""); // 经办人姓名
		// bizContent.setDealTelphoneNo(""); // 经办人手机号
		// bizContent.setSociCreCode(""); // 统一社会信用代码
		// bizContent.setSingNoNoteAmtd("100000"); // 单笔免短信验证码额度

		request.setBizContent(bizContent);

		MybankAccountB2bMemberagreementaddV1Response response = new MybankAccountB2bMemberagreementaddV1Response();
		try {
			response = client.execute(request, UUID.randomUUID().toString().replaceAll("-", ""));// msgId消息通讯唯一编号，要求每次调用独立生成，APP级唯一
			if (response.isSuccess()) {
				// 6、业务成功处理，请根据接口文档用response.getxxx()获取同步返回的业务数据
				System.out.println("ReturnCode:" + response.getReturnCode());
				System.out.println("returnMsg:" + response.getReturnMsg());
			} else {
				System.out.println("returnCode:" + response.getReturnCode());
				System.out.println("returnMsg:" + response.getReturnMsg());
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}*/

}
