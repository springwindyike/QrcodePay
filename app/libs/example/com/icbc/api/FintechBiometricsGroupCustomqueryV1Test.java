package com.icbc.api;

import java.util.List;
import java.util.UUID;

import org.junit.Test;

import com.icbc.api.request.FintechBiometricsGroupCustomqueryV1Request;
import com.icbc.api.request.FintechBiometricsGroupCustomqueryV1Request.FintechBiometricsGroupCustomqueryV1RequestBiz;
import com.icbc.api.request.FintechBiometricsGroupCustomqueryV1Request.Private;
import com.icbc.api.response.FintechBiometricsGroupCustomqueryV1Response;
import com.icbc.api.response.FintechBiometricsGroupCustomqueryV1Response.Private.FintechBiometricsGroupCustomqueryV1ResponseList;

/**
 * 分组客户生物特征信息查询
 * 
 * 请商户配置SDK中的lib文件夹中的jar包后，根据备注1-6提示进行数据替换
 */
public class FintechBiometricsGroupCustomqueryV1Test {

	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	// 2、appid
	protected static final String APP_ID = "10000000000000003917";

	// 3、密钥对认证方式，公钥在API平台登记，此处为私钥
	protected static final String MY_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDH8nn5xSLmJVrXDm4480Yr9KanIITe4htlMjBB8AHnezhD6oEtB7g5AuuH0V3ZIRK9hvxJPMPPfjzdJaAyecX1Hbm2OBstgnCunXWhtUBeq27JAKvtWhomyuMo1xi+rbmOtLeNXydXWeq8Lh6hBwLvWjk9ZgH3f5iOEkv7NCR2uJef3getAJC2wrn3Sn0ck9UtvqXKVkMKdfOCnz+kmd81R5qJ+9wEILsp2Lv1pn1klE7+vjhS9ySPkfsDLZQGpj07k4TogELJIxzMPSRQ1mu5mlQuN1k3e3RwcXY4ZkpyJ406tajAA6NG/V4kNLIN0qthWZSaI8ejPupZRTsJucO5AgMBAAECggEAbthx3pH3YvdagNazLEdRo5Shvw08HAPlhBhqwGM56wZYju42Zqxc6N5BjK35BSJcrU1kF4XkV+d3/nGZeeIgaF7uUaKRDo29wk/wopFE+ja32B7TMWY+ETtw63czdKICuKZfC7SwrrBefaxjtomYivDNwsgGVxsZi8mA7eZeQKHiAjETf7YpkTyznRI2GC6wXzqrQTBOjnmzMyXH880kSQwglXHeV3YACkgeH8RnZpjVvVby3LWITmTQsUi6aYyLpxv9cRHzlCxNCt/0ny2mOS59FOIZbqBNWxK8xg9v6x5hsAr1CrAQmLqtzdMQlUwCaWx9OP6/HF6vnTnRWagE8QKBgQDrOz3RHJ1rzwF2j7IYb4h50JEVmc3k5joc1Mz9svCQ1UhlBHjVtNfRxxtbdPYtGLGEYoBcbltH40oqx4S4gUZdgL4e1vVOiv357hMcdawHYWNvY62cPsTS81ejUo04DhfHZKrV8BJrCzr3poS4+bjFv2/GfeTs6tI+GsRUvZQUVwKBgQDZmbtfANTxufegEBkBTwPpipcKV6CxWc+Ktzpgp2plzyAlMQ3AF7sP/xs6gsGuYiZnW3gAkD/x8+rsdYpkZaycpzEFz5hkvYo5uzVWEwLlRNGGtzWQGL86Kyr2Cc9VkJOy6D60G5Trn0/s19C8DnXH1NKBjPvb6Q7uZNMKETtebwKBgGjgIcBwlJLzWQCmMk4Is/0ziuvphc2PA8vE6JwXwn+gR8WaB9Gn7iz+K2lMLVGP191hGT+ciB/16yRFjhvAr0GS27DeP8JD39YlWenvYMJtniqUc1vc9F3k1mbfsEyUo+9nJ294uI13FVRCrpvV4pZvsoL5sC4cx52ey3fIihPDAoGAMXIJbbEWskb7yddelzmJPgxL/gGjdileS7sO/N+OAcxrFYhsA3Zg/2WMnmMP97w91canIhmlLimq/EhJRj8EViR3s0ZU7q9TNYMgv4paYhadNetztGarLWCZxoa8IklUBpdXiD2sPU5aLwtrVxBCG0J1AxMyN+phhjJK8kKwJukCgYAP03AqwmRaDYQ0zYx6vQcbetIjRTtqT4nWBHJzM60ilkMuLVQfMNXAGOZOxOYwCNKFU4Vr0r8n63P+p+I7e/jOi1O+y6wI5C2/6K6YP4z+kkpKXpgCQvOt7HjMpNzsN//3fZiPcArd7royTCHGvDB/az08SqV1H2qgdJ7AJoATtQ==";

	@Test // 查2019年01月23日 13:14:01 到 2019年01月23日 15:14:01 公交虹膜支付业务组中发生新增、修改、删除的客户信息
	public void testQueryByParPronoAndTranSeqno() throws Exception {

		// 签名类型为RSA2时，需传入appid，私钥和网关公钥，签名类型使用定值IcbcConstants.SIGN_TYPE_RSA2，其他参数使用缺省值
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY,
				APIGW_PUBLIC_KEY);
		FintechBiometricsGroupCustomqueryV1Request request = new FintechBiometricsGroupCustomqueryV1Request();

		// 4、根据测试环境和生产环境替换相应ip和端口
		request.setServiceUrl("http://ip:port/api/fintech/biometrics/groupcustomquery/query/V1");

		// 5、请对照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值，非必输字段可不上送
		FintechBiometricsGroupCustomqueryV1RequestBiz bizContent = new FintechBiometricsGroupCustomqueryV1RequestBiz();
		Private pfield = new Private();

		pfield.setGroupId("1");//业务分组ID号
		pfield.setPri_biometrics_type("002");//查询的生物特征类型 002-虹膜 
		pfield.setBegin_date("2019-01-03");//查询开始日期 
		pfield.setBegin_time("13:14:01"); // 查询开始时间
		pfield.setEnd_date("2019-01-03");//查询截止日期
		pfield.setEnd_time("22:14:01");//查询截止时间
		bizContent.setPrivate(pfield);
		request.setBizContent(bizContent);

		FintechBiometricsGroupCustomqueryV1Response response = new FintechBiometricsGroupCustomqueryV1Response();
		try {
			response = client.execute(request, UUID.randomUUID().toString().replaceAll("-", ""));// msgId消息通讯唯一编号，要求每次调用独立生成，APP级唯一
			if (response.isSuccess()) {
				// 6、业务成功处理，请根据接口文档用response.getxxx()获取同步返回的业务数据
				System.out.println("return_code:" + response.getReturnCode());
				System.out.println("return_msg:" + response.getReturnMsg());
				//System.out.println("response.getItems: " + response.getItems());

				com.icbc.api.response.FintechBiometricsGroupCustomqueryV1Response.Private p = response.getPrivate();

				System.out.println("response.getItems: " + p.getItems());
				if (!"0".equals(p.getItems())) {

					// 查询成功 获取返回结果
					List<FintechBiometricsGroupCustomqueryV1ResponseList> list = p.getList();
					// 获取结果集中字段
					for (FintechBiometricsGroupCustomqueryV1ResponseList detail : list) {
						// 获取信息.....

						System.out.println("============================= begin =============================");

						System.out.println("bioseqenceno         :    " + detail.getBioseqenceno());
						System.out.println("biometrics            :    " + detail.getBiometrics());
						System.out.println("status               :    " + detail.getStatus());	
						System.out.println("=============================  end  =============================");

					}
				}
			} else {
				System.out.println("returnCode:" + response.getReturnCode());
				System.out.println("returnMsg:" + response.getReturnMsg());
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}
}