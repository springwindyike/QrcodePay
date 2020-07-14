package com.icbc.api;

import java.util.List;
import java.util.UUID;

import org.junit.Test;

import com.icbc.api.request.MybankPayB2bTradefundlistqueryV1Request;
import com.icbc.api.request.MybankPayB2bTradefundlistqueryV1Request.MybankPayB2bTradefundlistqueryV1RequestBiz;
import com.icbc.api.response.MybankPayB2bTradefundlistqueryV1Response;
import com.icbc.api.response.MybankPayB2bTradefundlistqueryV1Response.MybankPayB2bTradefundlistqueryV1ResponseList;

/**
 * 对公交易结算明细查询
 * 
 * 请商户配置SDK中的lib文件夹中的jar包后，根据备注1-6提示进行数据替换
 */
public class MybankPayB2bTradefundlistqueryV1Test {

	// 1、网关公钥
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	// 2、appid
	protected static final String APP_ID = "10000000000000003917";

	// 3、密钥对认证方式，公钥在API平台登记，此处为私钥
	protected static final String MY_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDH8nn5xSLmJVrXDm4480Yr9KanIITe4htlMjBB8AHnezhD6oEtB7g5AuuH0V3ZIRK9hvxJPMPPfjzdJaAyecX1Hbm2OBstgnCunXWhtUBeq27JAKvtWhomyuMo1xi+rbmOtLeNXydXWeq8Lh6hBwLvWjk9ZgH3f5iOEkv7NCR2uJef3getAJC2wrn3Sn0ck9UtvqXKVkMKdfOCnz+kmd81R5qJ+9wEILsp2Lv1pn1klE7+vjhS9ySPkfsDLZQGpj07k4TogELJIxzMPSRQ1mu5mlQuN1k3e3RwcXY4ZkpyJ406tajAA6NG/V4kNLIN0qthWZSaI8ejPupZRTsJucO5AgMBAAECggEAbthx3pH3YvdagNazLEdRo5Shvw08HAPlhBhqwGM56wZYju42Zqxc6N5BjK35BSJcrU1kF4XkV+d3/nGZeeIgaF7uUaKRDo29wk/wopFE+ja32B7TMWY+ETtw63czdKICuKZfC7SwrrBefaxjtomYivDNwsgGVxsZi8mA7eZeQKHiAjETf7YpkTyznRI2GC6wXzqrQTBOjnmzMyXH880kSQwglXHeV3YACkgeH8RnZpjVvVby3LWITmTQsUi6aYyLpxv9cRHzlCxNCt/0ny2mOS59FOIZbqBNWxK8xg9v6x5hsAr1CrAQmLqtzdMQlUwCaWx9OP6/HF6vnTnRWagE8QKBgQDrOz3RHJ1rzwF2j7IYb4h50JEVmc3k5joc1Mz9svCQ1UhlBHjVtNfRxxtbdPYtGLGEYoBcbltH40oqx4S4gUZdgL4e1vVOiv357hMcdawHYWNvY62cPsTS81ejUo04DhfHZKrV8BJrCzr3poS4+bjFv2/GfeTs6tI+GsRUvZQUVwKBgQDZmbtfANTxufegEBkBTwPpipcKV6CxWc+Ktzpgp2plzyAlMQ3AF7sP/xs6gsGuYiZnW3gAkD/x8+rsdYpkZaycpzEFz5hkvYo5uzVWEwLlRNGGtzWQGL86Kyr2Cc9VkJOy6D60G5Trn0/s19C8DnXH1NKBjPvb6Q7uZNMKETtebwKBgGjgIcBwlJLzWQCmMk4Is/0ziuvphc2PA8vE6JwXwn+gR8WaB9Gn7iz+K2lMLVGP191hGT+ciB/16yRFjhvAr0GS27DeP8JD39YlWenvYMJtniqUc1vc9F3k1mbfsEyUo+9nJ294uI13FVRCrpvV4pZvsoL5sC4cx52ey3fIihPDAoGAMXIJbbEWskb7yddelzmJPgxL/gGjdileS7sO/N+OAcxrFYhsA3Zg/2WMnmMP97w91canIhmlLimq/EhJRj8EViR3s0ZU7q9TNYMgv4paYhadNetztGarLWCZxoa8IklUBpdXiD2sPU5aLwtrVxBCG0J1AxMyN+phhjJK8kKwJukCgYAP03AqwmRaDYQ0zYx6vQcbetIjRTtqT4nWBHJzM60ilkMuLVQfMNXAGOZOxOYwCNKFU4Vr0r8n63P+p+I7e/jOi1O+y6wI5C2/6K6YP4z+kkpKXpgCQvOt7HjMpNzsN//3fZiPcArd7royTCHGvDB/az08SqV1H2qgdJ7AJoATtQ==";

	@Test
	public void test() throws Exception {

		// 签名类型为RSA2时，需传入appid，私钥和网关公钥，签名类型使用定值IcbcConstants.SIGN_TYPE_RSA2，其他参数使用缺省值
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY,
				APIGW_PUBLIC_KEY);
		MybankPayB2bTradefundlistqueryV1Request request = new MybankPayB2bTradefundlistqueryV1Request();

		// 4、根据测试环境和生产环境替换相应ip和端口
		request.setServiceUrl("http://122.64.109.110:8081/api/mybank/pay/b2b/tradefundlistquery/V1");

		// 5、请对照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值，非必输字段可不上送
		MybankPayB2bTradefundlistqueryV1RequestBiz bizContent = new MybankPayB2bTradefundlistqueryV1RequestBiz();

		bizContent.setTrxDate("2022-09-20"); // 交易日期
		bizContent.setCheckWorkDateFlag("2"); // 核对交易日期标志
		bizContent.setInitFlag("1"); // 查询标志
		bizContent.setRowReq("10"); // 一次查询的最大记录数
		bizContent.setPartnerProno("1801627"); // 合作方协议编号
		bizContent.setMemberNo("bjbce0000000004"); // 会员编号
		bizContent.setBegDate("2021-10-20"); // 起始日
		bizContent.setEndDate("2022-09-20"); // 到期日
		bizContent.setPageTurn("2018-11-08 14:28:58.84769"); // 翻页要素

		request.setBizContent(bizContent);

		MybankPayB2bTradefundlistqueryV1Response response = new MybankPayB2bTradefundlistqueryV1Response();
		try {
			response = client.execute(request, UUID.randomUUID().toString().replaceAll("-", ""));// msgId消息通讯唯一编号，要求每次调用独立生成，APP级唯一
			if (response.isSuccess()) {
				// 6、业务成功处理，请根据接口文档用response.getxxx()获取同步返回的业务数据
				System.out.println("return_code:" + response.getReturnCode());
				System.out.println("return_msg:" + response.getReturnMsg());
				System.out.println("items:" + response.getItems());

				if (!"0".equals(response.getItems())) {
					// 查询成功 获取返回结果
					List<MybankPayB2bTradefundlistqueryV1ResponseList> list = response.getList();
					// 获取结果集中字段
					for (MybankPayB2bTradefundlistqueryV1ResponseList detail : list) {

						System.out.println("=============================begin======================");

						System.out.println("currType        :    " + detail.getCurrType());
						System.out.println("accnoSeqno      :    " + detail.getAccnoSeqno());
						System.out.println("partnerProno    :    " + detail.getPartnerProno());
						System.out.println("memberNo        :    " + detail.getMemberNo());
						System.out.println("accType         :    " + detail.getAccType());
						System.out.println("memberName      :    " + detail.getMemberName());
						System.out.println("trxNumber       :    " + detail.getTrxNumber());
						System.out.println("trxDate         :    " + detail.getTrxDate());
						//System.out.println("trxTimestamp    :    " + detail.getTrxTimestamp());
						System.out.println("pageTurn        :    " +  detail.getPageTurn());
						System.out.println("trxCode         :    " + detail.getTrxCode());
						System.out.println("upTrxFlag       :    " + detail.getUpTrxFlag());
						System.out.println("revTrxFlag      :    " + detail.getRevTrxFlag());
						System.out.println("drcrFlag        :    " + detail.getDrcrFlag());
						System.out.println("amount          :    " + detail.getAmount());
						System.out.println("ownBalance      :    " + detail.getOwnBalance());
						System.out.println("wayBalance      :    " + detail.getWayBalance());
						System.out.println("valueDay        :    " + detail.getValueDay());
						System.out.println("note            :    " + detail.getNote());
						System.out.println("usages          :    " + detail.getUsages());
						System.out.println("summary         :    " + detail.getSummary());
						System.out.println("enSummry        :    " + detail.getEnSummry());
						System.out.println("busType         :    " + detail.getBusType());
						System.out.println("orderNo         :    " + detail.getOrderNo());
						System.out.println("otherAccType    :    " + detail.getOtherAccType());
						System.out.println("otherMemberNo   :    " + detail.getOtherMemberNo());
						System.out.println("otherMemberName :    " + detail.getOtherMemberName());
						System.out.println("otherAccno      :    " + detail.getOtherAccno());
						System.out.println("otherCurrType   :    " + detail.getOtherCurrType());
						System.out.println("otherAccnoName  :    " + detail.getOtherAccnoName());
						System.out.println("otherBanksFlag  :    " + detail.getOtherBanksFlag());
						System.out.println("otherBkName     :    " + detail.getOtherBkName());
						System.out.println("otherBkNo       :    " + detail.getOtherBkNo());
						System.out.println("cardNo          :    " + detail.getCardNo());

						System.out.println("=============================end======================");

					}
				} else {
					// 失败
					System.out.println("return_code:" + response.getReturnCode());
					System.out.println("return_msg:" + response.getReturnMsg());
					System.out.println("items:" + response.getItems());
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
