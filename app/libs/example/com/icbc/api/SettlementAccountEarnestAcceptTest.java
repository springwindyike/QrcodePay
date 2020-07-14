package com.icbc.api;

import org.junit.Test;

import com.icbc.api.request.SettlementAccountEarnestAcceptRequestV1;
import com.icbc.api.request.SettlementAccountEarnestAcceptRequestV1.SettlementAccountEarnestAcceptRequestV1Biz;
import com.icbc.api.response.SettlementAccountEarnestAcceptResponseV1;

public class SettlementAccountEarnestAcceptTest{
	protected static final String MY_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC3v/0CdVTv6vRdxF7syUpYwa1x90VKv91VbBKSL6ea0VBJxN14CphDjPD9TRAf/4z+cVky2NxdIDEvJS5ItXcD7KoKLlxQ+BBQJvLyeXofQJ6tWnX6snhOibJF6mGFef63FS2Gm1bECKOa6SC38I0eD8i0LZttrOvyEly4cGtrk5CMll3XYwvzt9KKozvdCOivhZavt42JF7IoMSIUIlm9tTJfwB3jtX1KdCeiV8//pft/k0ZJmpJHWmDymfrZAEodANvNPDqAo4SI3QbMC+hVw5BEjNuDZcm8cMnBDHk+siyJfPjZd+ec7CE+TTH6u3O/BteaDyOPRcl1TOzlzTaJAgMBAAECggEAUzIpMzi+uVYvSFlGBX3qHJ+skWI8zGhspWWmTuwmvfExogTxpY1efY9N+dIvj91cEERv95a6x6twuYDjIOaQuYUpRCzTfZGjiTbpXyHjSk0uyxyfOGAgGqc7wW4qs42V530+PKkOsvmaYeRV/RJ8QnUxEWto6VKXDeaEdrnn2S+ToGuaRlU+U1EGb27xahldUs+Y7eQrtacidvxS421EuW1kOEC2XaPDsC+r6T3DcuFb+J0EUQiI4EKbcSQDf0/xT1cIkkCPkKzwZIqFI+icZuwnRaIvI9xXv3DvCdhWyLCnDBDgwOewB30+rLAc6yqGtN/4iD2EQvpU9gRsm683kQKBgQD6XZ0g2NdnYAj07ms9TVTUjfO8nw2uizdUduMW+tG83js4Uq1rjt9IeLwrSHaRGTtnECMXKEPK/+TsX+aKrfbU9D/Lw34q4hVlnHAe9mswFl+nH87k4f3ntMX10puW8NWVxgZ/I+YQ80mJ+B3DmnxUbnZ00rC3itOXBL5XcoOr7QKBgQC74pfuyanx9acIvj3nyxieTjv8XzcEr6uvrW7YgGJ++1Ma2MZFH4KEmwbUmM+Lhdfa+0eGHp0v7Bun1s0tPibCbGpo+9npaByyNuo2WTbyCavlVQIc6xryiTXEfYXMyYgCKNOQ+qmZT9bNZyKSNi8uFwWwT6euZpYAS1xtb4b5jQKBgHD3uoVuskr3vzLdPVAsy4EZCAhs8Bx4vp+DAVaGGAsTbz8rtwpYLhGiQK17BdzUuMP5OQwi4+v96MprPzgF5OET0JFdhVlOJ/9wRfsCjzzka4aaSJ1oB0v8enI/9Gp4AreQ4a+OgCnXzK/PX4a59y2VpidyRcCbiHuU7VnB1v3FAoGAKHudcwUeyhS9JeQf4JbhOhLvV+SILUlQu+ypqpqXHnc2o907c19jtwDUSvCWH6D6LqPf+GUWR2IfX12oHex7W38SuoYxoNoe/MNaWdWFQkeVMzfK2cJKryGjZTAKqWJvHNABLgbkjjUmumFTkJ9+MPci8adoIOrXvT5/rtDOC20CgYEAi58Pz/9zHBnI15sgFtWdp02myuDoSlAXS6MCelYoMMFgY2iM1DH8ip4koDPPz/oieN0k8VWSq2kCqk2hyRa0Llib0ilQpUaImvlbBRKtDc2hIfCNsL8OqkyEZZ5LnGSLMJ3oIUwJ2S5zvpbNaB+rqxFWEpmgrDb7TC5TcSNrtHY=";
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
	//Appid：通过内管查看详情，可获取对应的组织机构、接入方式、公钥等信息
	//APP管理中查看
	protected static final String APP_ID = "10000000000000021587";
	
	@Test
	public void test_cop() throws IcbcApiException{
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		
		SettlementAccountEarnestAcceptRequestV1 request = new SettlementAccountEarnestAcceptRequestV1();
		request.setServiceUrl("https://gw.open.icbc.com.cn/api/settlement/account/earnestaccept/V1");
		SettlementAccountEarnestAcceptRequestV1Biz bizContent = new SettlementAccountEarnestAcceptRequestV1Biz();
		
		bizContent.setCorpNo("corpInst1234"); //合作方机构编号
		bizContent.setTrxAccDate("2017-03-14"); //合作方交易日期
		bizContent.setTrxAccTime("00:00:00"); //合作方交易时间
		bizContent.setCorpDate("2017-03-14"); //合作方工作日期
		bizContent.setCorpSerno("20202020"); //合作方交易单号
		bizContent.setOutServiceCode("earnestaccept"); //外部服务代码
		bizContent.setMediumId("6888888888888888888"); //工行联名卡号
 
		bizContent.setName("张三"); //客户户名
		bizContent.setBindMediumId("6888888888888888888"); //认筹资金卡号
 
		bizContent.setAccountNo("6222030200012340407"); // 定金接收账号
 
		bizContent.setAccountName("万科资金账号"); // 定金接收账号户名
 
		bizContent.setAccountBankNo("1234567891011"); // 定金接收账号行号
		bizContent.setAccountBankName("中国银行深圳分行"); // 定金接收账号行号名
		bizContent.setAccountBankFlag(1); // 定金接收账号行号别
		bizContent.setCcy(1); //币种
		bizContent.setAmount("300"); //交易金额 
 
		bizContent.setHoldType(57); //保留种类
		bizContent.setHoldDate("2017-03-02"); //保留日期
		bizContent.setSummary("DY"); //摘要
		bizContent.setRemarks("DY"); //注释
		bizContent.setNotifyAddr("aaaaa"); //通知地址
		bizContent.setProjectNo("002504");//项目编号
 
        bizContent.setSecretKey("h8ZujhDntpKRohwFmGXcnXygNjJHRQbyuVG3183uOdXI2fRgCXeDED9zOw5dO2JucVy7vZ19od7CSUxI2/sVOn6dPklVoaquVElgKRUPlr6D/cqLu25K7hJ3Pt/uOnx4qF/ykmO/IB2qS0rs/sp0Zw=="); 
        bizContent.setMediumIdHash("SDFDFHTEWTGDFWADADAFSDGSESEFD"); //卡号哈希值
		bizContent.setBindMediumHash("SDFDFHTEWTGDFWADADAFSDGSESEFD"); //认筹资金卡号哈希值 
		bizContent.setAccountNoHash("SDFDFHTEWTGDFWADADAFSDGSESEFD"); // 定金接收账号哈希值
		request.setBizContent(bizContent);
		
		SettlementAccountEarnestAcceptResponseV1 response = client.execute(request, "msgId");

		if (response.isSuccess() && response.getReturnCode() == 0) {
			// 业务成功处理
			System.out.println(response.getEventNo());//
		} else {
			// 失败
			System.err.println(response.getReturnCode());//
			System.err.println(response.getReturnMsg());//
		}
	}
}