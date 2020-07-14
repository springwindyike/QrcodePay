package com.icbc.api;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.IcbcConstants;
import com.icbc.api.request.LoanAmountQueryRequestV1;
import com.icbc.api.request.LoanAmountQueryRequestV1.QueryLoanAmountRequestV1Biz;
import com.icbc.api.response.LoanAmountQueryResponseV1;

public class LoanAmountQueryTestV1 {

	// 1、网关公钥
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	// 2��appid
	protected static final String APP_ID = "10000000000000002697";

	// 3����Կ����֤��ʽ����Կ��APIƽ̨�Ǽǣ��˴�Ϊ˽Կ
	protected static final String MY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIh0pL84ShSJqeoz01ef2b9PoDZKgEz396kXWa69tjz2jRHvhoD3beQRqTPnDYCn1FqT/vV4tElxXNfEPZcmDgGKUxMu8F+t3vyOKS6RKCWJYTddeljLYnPTLL7rPWEhHLPiTNFfkf5qIh3lca9SV1bnARNIc25DweZAcZCkot/3AgMBAAECgYBiLhsDgsq6cDqTSmq710XiwrXxmjUqLBhDz4s1kUZ4IqVpzD+ot16YBKULtSkf8qF18po1oH2Hgktc69Os1zKnkqBXq9PUGF6XRFqCSfus5EWXLKrg9puB02FqbBl6Vja+R0GrYl3f9zl6O7Fooj2p8y04Y7CV4boXcj8DVa+icQJBAOSkuFIp1ywpdr65KQMnxYXr2VissU78nDPFjSqTjxzNks0po/QXTB4HD1PXaxQHtbhiqjUjYui2eZ2lft5IPv0CQQCYyD0nZQoQUJlkoNYBMdFcYhjlJBjbhcX+yMQI5D7AO/OFsS+tmRCKAqluPWruuFJheLPtAtXNViSc2vVEx58DAkBWAVAEOBDkX8R3AZdXxIIcWhcrr+oSWBs5rjnnphHTN9Dcs6kkjA7pzKYLV6DDrBLDBPoZevIdr2YX0sTiQDLRAkBPm/8pmN9+ktDq+1entbK25bK9K2r8cB80XJ6xV2VPO63v2tzSIzDYCP0KIVyn2Umr2n4+oLyRSzK2vO0SksXLAkEAsaSosxPz80d7QVT8Dp2qcT7Zb2omxxJuL9JJSL9cqroIuTKhET7SNCk5DZ8dQRm/t0YM1qf1+Ghg23dXuFt/ZQ==";

	public static void main(String[] args) throws Exception {

		// ǩ������ΪRSA2ʱ���贫��appid��˽Կ����ع�Կ��ǩ������ʹ�ö�ֵIcbcConstants.SIGN_TYPE_RSA2���������ʹ��ȱʡֵ
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID,
				IcbcConstants.SIGN_TYPE_RSA2, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);

		LoanAmountQueryRequestV1 request = new LoanAmountQueryRequestV1();
		// 4����ݲ��Ի���������滻��Ӧip�Ͷ˿�
		request.setServiceUrl("https://ip:port/api/reward/getInfo/V1");

		//5������սӿ��ĵ���bizContent.setxxx()������ҵ��������ݽ��и�ֵ
		QueryLoanAmountRequestV1Biz bizContent = new QueryLoanAmountRequestV1Biz();
		bizContent.setCiNo("hO7da6iW6BLvCYswj2k1PQ==");
		bizContent.setThirdId("HD4600000281");
		bizContent.setAmountSection("0-1;1-2;2-3;3-4;4-5;5-6;6-7;7-8;8-9;9-10");	//最后一个区间没有分号
		request.setBizContent(bizContent);

		LoanAmountQueryResponseV1 response;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
			String msgId = dateFormat.format(new Date());
			response = client.execute(request, msgId);
			if (response.isSuccess()) {
				// ҵ��ɹ�����
				System.out.println("ReturnCode:" + response.getReturnCode());
				System.out.println("response:" + response);
				System.out.print("CisNo:" + response.getCisNo());
				System.out.print("AmountSection:" + response.getAmountSection());
			} else {
				// ʧ��
				System.out.println("ReturnCode:" + response.getReturnCode());
				System.out.println("ReturnMsg:" + response.getReturnMsg());
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}
}
