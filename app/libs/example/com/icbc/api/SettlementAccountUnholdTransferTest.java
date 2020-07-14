package com.icbc.api;

import org.junit.Test;

import com.icbc.api.request.SettlementAccountUnholdTransferRequestV1;
import com.icbc.api.request.SettlementAccountUnholdTransferRequestV1.SettlementAccountUnholdTransferRequestV1Biz;
import com.icbc.api.response.SettlementAccountUnholdTransferResponseV1;

public class SettlementAccountUnholdTransferTest {

	protected static final String MY_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC3v/0CdVTv6vRdxF7syUpYwa1x90VKv91VbBKSL6ea0VBJxN14CphDjPD9TRAf/4z+cVky2NxdIDEvJS5ItXcD7KoKLlxQ+BBQJvLyeXofQJ6tWnX6snhOibJF6mGFef63FS2Gm1bECKOa6SC38I0eD8i0LZttrOvyEly4cGtrk5CMll3XYwvzt9KKozvdCOivhZavt42JF7IoMSIUIlm9tTJfwB3jtX1KdCeiV8//pft/k0ZJmpJHWmDymfrZAEodANvNPDqAo4SI3QbMC+hVw5BEjNuDZcm8cMnBDHk+siyJfPjZd+ec7CE+TTH6u3O/BteaDyOPRcl1TOzlzTaJAgMBAAECggEAUzIpMzi+uVYvSFlGBX3qHJ+skWI8zGhspWWmTuwmvfExogTxpY1efY9N+dIvj91cEERv95a6x6twuYDjIOaQuYUpRCzTfZGjiTbpXyHjSk0uyxyfOGAgGqc7wW4qs42V530+PKkOsvmaYeRV/RJ8QnUxEWto6VKXDeaEdrnn2S+ToGuaRlU+U1EGb27xahldUs+Y7eQrtacidvxS421EuW1kOEC2XaPDsC+r6T3DcuFb+J0EUQiI4EKbcSQDf0/xT1cIkkCPkKzwZIqFI+icZuwnRaIvI9xXv3DvCdhWyLCnDBDgwOewB30+rLAc6yqGtN/4iD2EQvpU9gRsm683kQKBgQD6XZ0g2NdnYAj07ms9TVTUjfO8nw2uizdUduMW+tG83js4Uq1rjt9IeLwrSHaRGTtnECMXKEPK/+TsX+aKrfbU9D/Lw34q4hVlnHAe9mswFl+nH87k4f3ntMX10puW8NWVxgZ/I+YQ80mJ+B3DmnxUbnZ00rC3itOXBL5XcoOr7QKBgQC74pfuyanx9acIvj3nyxieTjv8XzcEr6uvrW7YgGJ++1Ma2MZFH4KEmwbUmM+Lhdfa+0eGHp0v7Bun1s0tPibCbGpo+9npaByyNuo2WTbyCavlVQIc6xryiTXEfYXMyYgCKNOQ+qmZT9bNZyKSNi8uFwWwT6euZpYAS1xtb4b5jQKBgHD3uoVuskr3vzLdPVAsy4EZCAhs8Bx4vp+DAVaGGAsTbz8rtwpYLhGiQK17BdzUuMP5OQwi4+v96MprPzgF5OET0JFdhVlOJ/9wRfsCjzzka4aaSJ1oB0v8enI/9Gp4AreQ4a+OgCnXzK/PX4a59y2VpidyRcCbiHuU7VnB1v3FAoGAKHudcwUeyhS9JeQf4JbhOhLvV+SILUlQu+ypqpqXHnc2o907c19jtwDUSvCWH6D6LqPf+GUWR2IfX12oHex7W38SuoYxoNoe/MNaWdWFQkeVMzfK2cJKryGjZTAKqWJvHNABLgbkjjUmumFTkJ9+MPci8adoIOrXvT5/rtDOC20CgYEAi58Pz/9zHBnI15sgFtWdp02myuDoSlAXS6MCelYoMMFgY2iM1DH8ip4koDPPz/oieN0k8VWSq2kCqk2hyRa0Llib0ilQpUaImvlbBRKtDc2hIfCNsL8OqkyEZZ5LnGSLMJ3oIUwJ2S5zvpbNaB+rqxFWEpmgrDb7TC5TcSNrtHY=";
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
	protected static final String APP_ID = "10000000000000021587";

	@Test
	public void test_cop() throws IcbcApiException {
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		SettlementAccountUnholdTransferRequestV1 request = new SettlementAccountUnholdTransferRequestV1();
		SettlementAccountUnholdTransferRequestV1Biz bizContent = new SettlementAccountUnholdTransferRequestV1Biz();
 
		request.setServiceUrl("ip:port/api/settlement/account/branch/unholdtransfer/V1");	
		
		bizContent.setCorpNo("88888888"); //合作方机构编号
		bizContent.setTrxAccDate("2017-03-23");
		bizContent.setTrxAccTime("12:30:21");
		bizContent.setCorpSerno("123456789"); //合作方交易单号
		bizContent.setCorpDate("2017-03-23"); //合作方工作日期
		bizContent.setOutServiceCode("unholdtransfer"); //外部服务代码
		bizContent.setMediumId("1myGlhZWe8ZVG7DKe/7pAr9ew9Yd08XzaX+L2juTb7Q="); //工行联名卡号
		bizContent.setCcy(1); //币种
		bizContent.setCashExFlag(9); //钞汇标志
		bizContent.setAmount("30000"); //交易额300元
 
		bizContent.setHoldType(3); //保留种类 
		bizContent.setHoldDate("2017-03-02");
        bizContent.setOpMediumId("1myGlhZWe8ZVG7DKe/7pAr9ew9Yd08XzaX+L2juTb7Q=");  //对手介质号
        bizContent.setPersonalFlag(1);    //个人业务标志

		bizContent.setSummary("资金解保留转账"); //摘要
		bizContent.setRemarks("WK0001"); //注释
		bizContent.setSecretKey("h8ZujhDntpKRohwFmGXcnXygNjJHRQbyuVG3183uOdXI2fRgCXeDED9zOw5dO2JucVy7vZ19od7CSUxI2/sVOn6dPklVoaquVElgKRUPlr6D/cqLu25K7hJ3Pt/uOnx4qF/ykmO/IB2qS0rs/sp0Zw==");

        bizContent.setMediumIdHash("1fecd270d3f4b07272a928e4f089dc5b"); //卡号哈希值
        bizContent.setCallType("API"); //卡号哈希值
        bizContent.setNotifyAddr("http://ip:port/path");  //通知地址
        bizContent.setCustName("xYQB69u7X71DiGqvbfVssg==");//客户姓名
        bizContent.setCertType(0);//证件类型
        bizContent.setCertNo("fgwUnpyqiSieQByQyHOmRh1/lqNMPcid73BsZYtLGrI=");//证件号码

		request.setBizContent(bizContent);

		SettlementAccountUnholdTransferResponseV1 response = client.execute(request, "msgId");

		if (response.isSuccess() && response.getReturnCode() == 0) {
			// 业务成功处理
			System.out.println(response.getAccountBalance());//
		} else {
			// 失败
			System.err.println(response.getReturnCode());//
			System.err.println(response.getReturnMsg());//
		}
	}

}
