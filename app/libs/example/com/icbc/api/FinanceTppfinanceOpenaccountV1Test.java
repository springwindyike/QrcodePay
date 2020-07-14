package com.icbc.api;

import java.util.UUID;

import org.junit.Test;

import com.icbc.api.request.FinanceTppfinanceOpenaccountRequestV1;
import com.icbc.api.request.FinanceTppfinanceOpenaccountRequestV1.FinanceTppfinanceOpenaccountRequestV1Biz;
import com.icbc.api.response.FinanceTppfinanceOpenaccountResponseV1;

public class FinanceTppfinanceOpenaccountV1Test {

	// 1、网关公钥
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	// 2、appid
	protected static final String APP_ID = "10000000000000003916";

	// 3、密钥对认证方式，公钥在API平台登记，此处为私钥
	protected static final String MY_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDH8nn5xSLmJVrXDm4480Yr9KanIITe4htlMjBB8AHnezhD6oEtB7g5AuuH0V3ZIRK9hvxJPMPPfjzdJaAyecX1Hbm2OBstgnCunXWhtUBeq27JAKvtWhomyuMo1xi+rbmOtLeNXydXWeq8Lh6hBwLvWjk9ZgH3f5iOEkv7NCR2uJef3getAJC2wrn3Sn0ck9UtvqXKVkMKdfOCnz+kmd81R5qJ+9wEILsp2Lv1pn1klE7+vjhS9ySPkfsDLZQGpj07k4TogELJIxzMPSRQ1mu5mlQuN1k3e3RwcXY4ZkpyJ406tajAA6NG/V4kNLIN0qthWZSaI8ejPupZRTsJucO5AgMBAAECggEAbthx3pH3YvdagNazLEdRo5Shvw08HAPlhBhqwGM56wZYju42Zqxc6N5BjK35BSJcrU1kF4XkV+d3/nGZeeIgaF7uUaKRDo29wk/wopFE+ja32B7TMWY+ETtw63czdKICuKZfC7SwrrBefaxjtomYivDNwsgGVxsZi8mA7eZeQKHiAjETf7YpkTyznRI2GC6wXzqrQTBOjnmzMyXH880kSQwglXHeV3YACkgeH8RnZpjVvVby3LWITmTQsUi6aYyLpxv9cRHzlCxNCt/0ny2mOS59FOIZbqBNWxK8xg9v6x5hsAr1CrAQmLqtzdMQlUwCaWx9OP6/HF6vnTnRWagE8QKBgQDrOz3RHJ1rzwF2j7IYb4h50JEVmc3k5joc1Mz9svCQ1UhlBHjVtNfRxxtbdPYtGLGEYoBcbltH40oqx4S4gUZdgL4e1vVOiv357hMcdawHYWNvY62cPsTS81ejUo04DhfHZKrV8BJrCzr3poS4+bjFv2/GfeTs6tI+GsRUvZQUVwKBgQDZmbtfANTxufegEBkBTwPpipcKV6CxWc+Ktzpgp2plzyAlMQ3AF7sP/xs6gsGuYiZnW3gAkD/x8+rsdYpkZaycpzEFz5hkvYo5uzVWEwLlRNGGtzWQGL86Kyr2Cc9VkJOy6D60G5Trn0/s19C8DnXH1NKBjPvb6Q7uZNMKETtebwKBgGjgIcBwlJLzWQCmMk4Is/0ziuvphc2PA8vE6JwXwn+gR8WaB9Gn7iz+K2lMLVGP191hGT+ciB/16yRFjhvAr0GS27DeP8JD39YlWenvYMJtniqUc1vc9F3k1mbfsEyUo+9nJ294uI13FVRCrpvV4pZvsoL5sC4cx52ey3fIihPDAoGAMXIJbbEWskb7yddelzmJPgxL/gGjdileS7sO/N+OAcxrFYhsA3Zg/2WMnmMP97w91canIhmlLimq/EhJRj8EViR3s0ZU7q9TNYMgv4paYhadNetztGarLWCZxoa8IklUBpdXiD2sPU5aLwtrVxBCG0J1AxMyN+phhjJK8kKwJukCgYAP03AqwmRaDYQ0zYx6vQcbetIjRTtqT4nWBHJzM60ilkMuLVQfMNXAGOZOxOYwCNKFU4Vr0r8n63P+p+I7e/jOi1O+y6wI5C2/6K6YP4z+kkpKXpgCQvOt7HjMpNzsN//3fZiPcArd7royTCHGvDB/az08SqV1H2qgdJ7AJoATtQ==";

	@Test
	public void test() throws IcbcApiException {

		// 签名类型为RSA时，需传入appid，私钥和网关公钥，签名类型使用定值IcbcConstants.SIGN_TYPE_RSA，其他参数使用缺省值
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY,
				APIGW_PUBLIC_KEY);

		FinanceTppfinanceOpenaccountRequestV1 request = new FinanceTppfinanceOpenaccountRequestV1();
		request.setServiceUrl("https://gw.open.icbc.com.cn/api/finance/tppfinance/openaccount/V1");

		FinanceTppfinanceOpenaccountRequestV1Biz bizContent = new FinanceTppfinanceOpenaccountRequestV1Biz();

		bizContent.setClient_id("ICBCTEST80001"); // 客户ID（第三方平台保证唯一）
		bizContent.setIs_icbc("1"); // 是否工行标志（0-否；1-是）
		bizContent.setReg_type("101"); // 证件类型（100-全国组织机构代码证书;101-营业执照;102-行政机关;103-社会团体法人登记证书;104-军队单位开户核准通知书;105-武警部队单位开户核准通知书;106-下属机构(具有主管单位批文号);107-其他;108-商业登记证;109-公司注册证）
		bizContent.setReg_no("911100001011122986"); // 证件号码
		bizContent.setClient_name("XX控股股份有限公司"); // 客户名称
		bizContent.setCurrtype("CNY"); // 币种
		bizContent.setAccno("0200099809277692335"); // 结算账户账号
		bizContent.setAccname("XX控股股份有限公司"); // 结算账户户名
		bizContent.setPhoneno("18688888888"); // 手机号
		bizContent.setSms_no("443253"); // 短信编号
		bizContent.setSms_identify_no("0ac63bcfcf1de3be"); // 验证码
		bizContent.setSms_id("ICBCTEST8000120210615161443000007"); // 短信认证唯一编号，认证短信发送后需记录下，后和短信编号、短信验证码一同上送
		bizContent.setSms_key(
				"0bb0cc1ac3a554de73550d2cd35a84a51af5a5c0d320a82e30a380626b269b5ff56aabfc346e39a9aa82f113e1a661b84e252356217bd0bebfe679bc71d52a6a710e6056df4882a50dd8122d5afc7d14b0acc610a7ef2600e04b11cd14be15c717a7fab85776151cc1da889f05c2c06b215a202d89291631cf6b5e8d05c8e0812da8096fc4cf8d653eb8adfe4a5ffeb7e2adbe4b2380772956cb189f269f7d3a4864d8093b9accd1b69d17c8ce062a85517bd672cb9e3f00a188165d10c76385347d0c75d90223757704cfe62fa97924aa67a57e18547ad50d7fa3894fd9c3f6e64325d71be07c85704aacd8defd5c5d01dba5796a9acd571894c998ebc34098"); // 验证码密钥（第三方公司随机生成192位对称密钥，使用该密钥加密验证码，并使用工行公钥加密后在本字段上送）
		request.setBizContent(bizContent);

		FinanceTppfinanceOpenaccountResponseV1 response = new FinanceTppfinanceOpenaccountResponseV1();
		String msgId = UUID.randomUUID().toString().replaceAll("-", "");
		response = client.execute(request, msgId); // msgId消息通讯唯一编号，要求每次调用独立生成，APP级唯一

		if (response.isSuccess()) {

			System.out.println("return_code             :       " + response.getReturnCode());
			System.out.println("return_msg              :       " + response.getReturnMsg());
			System.out.println("msg_id                  :       " + response.getMsgId());

			// 业务成功处理，请根据接口文档用response.getxxx()获取同步返回的业务数据
			System.out.println("fund_account            :       " + response.getFund_account()); // 资金账号（非工行客户时返回）
			System.out.println("fund_name               :       " + response.getFund_name()); // 资金账号户名（只用于非工行客户线下汇款时和资金账号一同使用）
			System.out.println("fin_account             :       " + response.getFin_account()); // 理财交易账号

		} else {

			System.out.println("return_code             :       " + response.getReturnCode());
			System.out.println("return_msg              :       " + response.getReturnMsg());
			System.out.println("msg_id                  :       " + response.getMsgId());

		}

	}
}
