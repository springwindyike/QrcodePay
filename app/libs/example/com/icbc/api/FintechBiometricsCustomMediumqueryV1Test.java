package com.icbc.api;

import java.util.List;
import java.util.UUID;

import org.junit.Test;

import com.icbc.api.request.FintechBiometricsCustomMediumqueryV1Request;
import com.icbc.api.request.FintechBiometricsCustomMediumqueryV1Request.FintechBiometricsCustomMediumqueryV1RequestBiz;
import com.icbc.api.request.FintechBiometricsCustomMediumqueryV1Request.Private;
import com.icbc.api.response.FintechBiometricsCustomMediumqueryV1Response;
import com.icbc.api.response.FintechBiometricsCustomMediumqueryV1Response.Private.FintechBiometricsCustomMediumqueryV1ResponseList;

/**
 * ����ͻ�����������Ϣ��ѯ
 * 
 * ���̻�����SDK�е�lib�ļ����е�jar���󣬸��ݱ�ע1-6��ʾ���������滻
 */
public class FintechBiometricsCustomMediumqueryV1Test {

	// 1�����ع�Կ

	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	// 2��appid
	protected static final String APP_ID = "10000000000000003917";

	// 3����Կ����֤��ʽ����Կ��APIƽ̨�Ǽǣ��˴�Ϊ˽Կ
	protected static final String MY_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDH8nn5xSLmJVrXDm4480Yr9KanIITe4htlMjBB8AHnezhD6oEtB7g5AuuH0V3ZIRK9hvxJPMPPfjzdJaAyecX1Hbm2OBstgnCunXWhtUBeq27JAKvtWhomyuMo1xi+rbmOtLeNXydXWeq8Lh6hBwLvWjk9ZgH3f5iOEkv7NCR2uJef3getAJC2wrn3Sn0ck9UtvqXKVkMKdfOCnz+kmd81R5qJ+9wEILsp2Lv1pn1klE7+vjhS9ySPkfsDLZQGpj07k4TogELJIxzMPSRQ1mu5mlQuN1k3e3RwcXY4ZkpyJ406tajAA6NG/V4kNLIN0qthWZSaI8ejPupZRTsJucO5AgMBAAECggEAbthx3pH3YvdagNazLEdRo5Shvw08HAPlhBhqwGM56wZYju42Zqxc6N5BjK35BSJcrU1kF4XkV+d3/nGZeeIgaF7uUaKRDo29wk/wopFE+ja32B7TMWY+ETtw63czdKICuKZfC7SwrrBefaxjtomYivDNwsgGVxsZi8mA7eZeQKHiAjETf7YpkTyznRI2GC6wXzqrQTBOjnmzMyXH880kSQwglXHeV3YACkgeH8RnZpjVvVby3LWITmTQsUi6aYyLpxv9cRHzlCxNCt/0ny2mOS59FOIZbqBNWxK8xg9v6x5hsAr1CrAQmLqtzdMQlUwCaWx9OP6/HF6vnTnRWagE8QKBgQDrOz3RHJ1rzwF2j7IYb4h50JEVmc3k5joc1Mz9svCQ1UhlBHjVtNfRxxtbdPYtGLGEYoBcbltH40oqx4S4gUZdgL4e1vVOiv357hMcdawHYWNvY62cPsTS81ejUo04DhfHZKrV8BJrCzr3poS4+bjFv2/GfeTs6tI+GsRUvZQUVwKBgQDZmbtfANTxufegEBkBTwPpipcKV6CxWc+Ktzpgp2plzyAlMQ3AF7sP/xs6gsGuYiZnW3gAkD/x8+rsdYpkZaycpzEFz5hkvYo5uzVWEwLlRNGGtzWQGL86Kyr2Cc9VkJOy6D60G5Trn0/s19C8DnXH1NKBjPvb6Q7uZNMKETtebwKBgGjgIcBwlJLzWQCmMk4Is/0ziuvphc2PA8vE6JwXwn+gR8WaB9Gn7iz+K2lMLVGP191hGT+ciB/16yRFjhvAr0GS27DeP8JD39YlWenvYMJtniqUc1vc9F3k1mbfsEyUo+9nJ294uI13FVRCrpvV4pZvsoL5sC4cx52ey3fIihPDAoGAMXIJbbEWskb7yddelzmJPgxL/gGjdileS7sO/N+OAcxrFYhsA3Zg/2WMnmMP97w91canIhmlLimq/EhJRj8EViR3s0ZU7q9TNYMgv4paYhadNetztGarLWCZxoa8IklUBpdXiD2sPU5aLwtrVxBCG0J1AxMyN+phhjJK8kKwJukCgYAP03AqwmRaDYQ0zYx6vQcbetIjRTtqT4nWBHJzM60ilkMuLVQfMNXAGOZOxOYwCNKFU4Vr0r8n63P+p+I7e/jOi1O+y6wI5C2/6K6YP4z+kkpKXpgCQvOt7HjMpNzsN//3fZiPcArd7royTCHGvDB/az08SqV1H2qgdJ7AJoATtQ==";
	
	@Test // ��2019��01��23�� 13:14:01 �� 2019��01��23�� 15:14:01 ������Ĥ֧��ҵ�����з����������޸ġ�ɾ���Ŀͻ���Ϣ
	public void testQueryByParPronoAndTranSeqno() throws Exception {

		// ǩ������ΪRSA2ʱ���贫��appid��˽Կ�����ع�Կ��ǩ������ʹ�ö�ֵIcbcConstants.SIGN_TYPE_RSA2����������ʹ��ȱʡֵ
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY,APIGW_PUBLIC_KEY);
		FintechBiometricsCustomMediumqueryV1Request request = new FintechBiometricsCustomMediumqueryV1Request();

		// 4�����ݲ��Ի��������������滻��Ӧip�Ͷ˿�                                                                         
		request.setServiceUrl("http://ip:port/api/fintech/biometrics/custmediumquery/query/V1");

		// 5������սӿ��ĵ���bizContent.setxxx()������ҵ���������ݽ��и�ֵ���Ǳ����ֶοɲ�����
		FintechBiometricsCustomMediumqueryV1RequestBiz bizContent = new FintechBiometricsCustomMediumqueryV1RequestBiz();

		Private pfield = new Private();
     pfield.setGroupId("1");//ҵ�����ID��
     pfield.setBioseqenceno("4000000000307");//�����������	
     bizContent.setPrivate(pfield);
     request.setBizContent(bizContent);

		FintechBiometricsCustomMediumqueryV1Response response = new FintechBiometricsCustomMediumqueryV1Response();
		try {
			response = client.execute(request, UUID.randomUUID().toString().replaceAll("-", ""));// msgId��ϢͨѶΨһ��ţ�Ҫ��ÿ�ε��ö������ɣ�APP��Ψһ
			if (response.isSuccess()) {
				// 6��ҵ��ɹ���������ݽӿ��ĵ���response.getxxx()��ȡͬ�����ص�ҵ������
				System.out.println("return_code:" + response.getReturnCode());
				System.out.println("return_msg:" + response.getReturnMsg());
				//System.out.println("response.getItems: " + response.getItems());
				com.icbc.api.response.FintechBiometricsCustomMediumqueryV1Response.Private p = response.getPrivate();

				System.out.println("response.getItems: " + p.getItems());
				if (!"0".equals(p.getItems())) {

					// ��ѯ�ɹ� ��ȡ���ؽ��
					List<FintechBiometricsCustomMediumqueryV1ResponseList> list = p.getList();
					// ��ȡ��������ֶ�
					for (FintechBiometricsCustomMediumqueryV1ResponseList detail : list) {
						// ��ȡ��Ϣ.....

						System.out.println("============================= begin =============================");

						System.out.println("mediumType         :    " + detail.getMediumType());
						System.out.println("mediumId            :    " + detail.getMediumId());
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