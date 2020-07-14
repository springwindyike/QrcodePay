package com.icbc.api;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.icbc.api.request.MybankLoanGylloanAccepttradeinfoRequestV2;
import com.icbc.api.request.MybankLoanGylloanAccepttradeinfoRequestV2Biz;
import com.icbc.api.response.MybankLoanGylloanAccepttradeinfoResponseV2;

public class MybankLoanGylloanAccepttradeinfoTestV2 {

	private static Log log = LogFactory.getLog(MybankLoanGylloanAccepttradeinfoTestV2.class);

	public static void main(String[] args) throws ParseException {
		
		try {
			String apigwPublicKey =  "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQA";
			String privateKey = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCMkkwRnaKS34Tw7EopW5IYTXqDNUoAOktjiHcDk/IBS0FEikwkFfLunl7L0428PsCBFiVt04OuQ0poJ5m2uzqQtr8tPEHfy3iv+4xBjbV9iIXd2EBjsZv/sS7A1yPnVpdMOGF3e2R5YNKJ60Y41bz2NWLVDj5W/9AVCQMXsbQo3vkO1nPCcztNTfyKxHrY30lFsHMBCodHd4Tsxjawit7vASo6iVczy8MGO8KDpIMMd5fgyepKIMdFR+M7RIMnsozjWSdPQLr+YDHZjIWWuTrYtjabkCDUAlyIte7ynRZvhe8V+wGcTxnmhBJEym8tOWIPEdkzeecIQsRlPSmVXm0tAgMBAAECggEAH/JHk2FNxy9BGTe6CvgilZ9WDmeX78FPzMkAszF2OFEP/jGn6DOMyCn5xTzI41Unjq6nxvPg40Orr0wApQSb5LODcxZUqjWlsejrESLRcjwKoEY7K+z7VPrBc1XxdOu66rmNfQfv553Xezya8uOwVAwB8AWSqVbtxToNF99s4DSllRjlv9x1bhiEGeB205Io8KiL+D0jATrAoTus6XgnbNKaY/1F2Hj5gCWAN+pcKrVVwTjb+tyNvXv+gtA4JBmyDTt7kFpHknYnAitv0Jujf6e7WVU9uMNXimzY8yGCEdrYDkLE/jYvZVYWyJaVvb58K50w7wJqdUPPZBLhFJX9SQKBgQDSzkfKqOnGvPlUcW98pBibpyK+CEa7Ps9mK5Bv63XIvwlTd+iHEmIwdnxiPnzTXORmU+pjGz1ixFptwPDHW8YWnO1PN+WSddG7u1WRHUB78YNhAraDnaETodPS8IqWUTr7IUsVaNZnjkJo7gknQ5KFdDmuMFqoQunGKQ8dPCldBwKBgQCqtVM+asyAT5njFPTdaR06lRMTdWTlrBXrmmTekqsfqI8+12WwTW8tId0jvlsTzjZ5CxecBRynMWKumOjOmEsY5KnGxLffVWjLS/8GawsDzibJENjxXYz4xltL5QQ2s5uITgRURoexAyZUji4t4lwyrmpcX4CS04pYnLz3Ao+LKwKBgQC69uMrdeZpMj98SmNTy4Jbwr+IhXSeK5XsiuS+rrm3Qt+1nNqpuX9Gdj/ZLoytNW0I6JIwNf+asoV1ZDLozZeBhMrggLXm0QIkG4FHhAcmJkycZLiVQN+UtulU46w2p3LFOoEKSwIltEFoKP4LSd4Q6MUjnZU6OKZ37wCNsEcLTwKBgQCSzpfFYQF4A3z7TmV7GE/btqKOJHJeFk1Prhq7UvU5p7NxPrqkESPgc3QDrkwTT0+Hb2OheL/4hT8xmiz0pwJGaTgcyca7mW8jDrtGoL37SsoONp/riyGWPLf9H/ostO+4HCga9gDx2RyYsSHDshzKNTchM7yWCLi8liboYtphuwKBgAZxjUvAfAHn7dMAXylVDbgdb7m9vABU1ydQCvNdPHznRsh+/eqvVTrkBnYzKvFhM14MBFxF0YRjwENwrcXZaz5mar6xXXjaG4w8xPw2OGjPxAAU5s0465f+1ykbsITK0ZALs2woxZu+CQuXDncAIKjhU24+eBtXaCpsyqQTtY63";
			String appId = "xxxx";
			String url = "http://ip:port/api/mybank/loan/gylloan/accepttradeinfo/V2";
			
			DefaultIcbcClient client = new DefaultIcbcClient(appId, privateKey,apigwPublicKey);
			MybankLoanGylloanAccepttradeinfoRequestV2 request = new MybankLoanGylloanAccepttradeinfoRequestV2();
			request.setServiceUrl(url);
			MybankLoanGylloanAccepttradeinfoRequestV2Biz bizContent = new MybankLoanGylloanAccepttradeinfoRequestV2Biz();
			
			bizContent.setSerialNo("xxx");
			bizContent.setAppNo("F-GYJ");
			bizContent.setAreaCode("0020000067");
			bizContent.setTeller("020083999");
			bizContent.setLanguage("zh_CN");
			bizContent.setVerify("");
			bizContent.setTransNo("IAcceptTradeInfoService");
			bizContent.setVER("1.0");
			bizContent.setSupplyChainCode("GY-2015000000788");
			bizContent.setEnpCode("020078900071312");
			bizContent.setISCore("0");
			bizContent.setCustType("02");
			bizContent.setDealType("4");
			bizContent.setINSNO("");
			bizContent.setInsType("DDUPLOAD");
			bizContent.setTradeInfoNo("");

			/*HashMap<String,Object> bizParaMap = new HashMap<String,Object>();
			
			 bizParaMap.put("SerialNo", "201805131234567");
   			 bizParaMap.put("AppNo", "F-APIP");
   			 bizParaMap.put("AreaCode", "0120200000");
   			 bizParaMap.put("Teller", "");
   			 bizParaMap.put("Language", "zh_CN");
   			 bizParaMap.put("Verify", "");
   			 bizParaMap.put("TransNo", "IAcceptTradeInfoService");
   			 bizParaMap.put("VER", "1.0");
   			
   			 
   			 bizParaMap.put("SupplyChainCode", "GY-2023000004541");
   			 bizParaMap.put("EnpCode", "020090001926823");
   			 bizParaMap.put("ISCore", "1");
   			 bizParaMap.put("CustType", "02");
   			 bizParaMap.put("DealType", "4");
   			 bizParaMap.put("INSNO", "3");
   			 bizParaMap.put("InsType", "DDUPLOAD");
   			 bizParaMap.put("TradeInfoNo", "");*/
			 
	
			 HashMap<String, Object> OrderInfo = new HashMap<String, Object>();
			 OrderInfo.put("OrderElement1", "������");
			 OrderInfo.put("OrderElement2", "�����ܽ��");
			 OrderInfo.put("OrderElement3", "����");
			 OrderInfo.put("OrderElement4", "��ܺ�ͬ���");
			 OrderInfo.put("OrderElement5", "��ܺ�ͬ���ޣ��£�");
			 OrderInfo.put("OrderElement6", "��ܺ�ͬ���");
			 OrderInfo.put("OrderElement7", "��������");
			 OrderInfo.put("OrderElement8", "��������");
			 OrderInfo.put("OrderElement9", "��������");
			 OrderInfo.put("OrderElement10", "������ʽ");
			 OrderInfo.put("OrderElement11", "Ԥ���������%��");
			 OrderInfo.put("OrderElement12", "Ӧ���˿�Ȩ��ת��");
			 OrderInfo.put("OrderElement13", "Ӧ���˿��Ƿ����");
			 OrderInfo.put("OrderElement14", "���㷽ʽ");
			 OrderInfo.put("OrderElement15", "Ԥ�Ƹ�����");
			 OrderInfo.put("OrderElement16", "����������");
			 OrderInfo.put("OrderElement17", "��������������");
			 OrderInfo.put("OrderElement18", "�����������˺�");
			 OrderInfo.put("OrderElement19", "����������");
			 OrderInfo.put("OrderElement20", "��������������");
			 OrderInfo.put("OrderElement21", "�����������˺�");
			 OrderInfo.put("OrderElement22", "����������");
			 OrderInfo.put("OrderElement23", "����������Ϣ1");
			 OrderInfo.put("OrderElement24", "����������Ϣ2");
			 OrderInfo.put("OrderElement25", "����������Ϣ3");
			 OrderInfo.put("OrderElement26", "��������");
			 OrderInfo.put("OrderElement27", "����״̬");
			 OrderInfo.put("OrderElement28", "��Ӧ��������");
			 OrderInfo.put("OrderElement29", "��Ӧ���ݱ��");
			 OrderInfo.put("OrderElement30", "��Ӧ���ݴ���");
			 OrderInfo.put("OrderElement31", "���ݽ��");
			 OrderInfo.put("OrderElement32", "����");
			 OrderInfo.put("OrderElement33", "��ƷС��");
			 OrderInfo.put("OrderElement34", "��ƷƷ��");
			 OrderInfo.put("OrderElement35", "��ƷƷ��");
			 OrderInfo.put("OrderElement36", "��Ʒ���");
			 OrderInfo.put("OrderElement37", "��Ʒ����");
			 OrderInfo.put("OrderElement38", "��Ʒʶ����");
			 OrderInfo.put("OrderElement39", "��Ʒ����");
			 OrderInfo.put("OrderElement40", "��Ʒ����");
			 OrderInfo.put("OrderElement41", "��Ʒ��λ");
			 OrderInfo.put("OrderElement42", "��Ʒ����");
			 OrderInfo.put("OrderElement43", "������Ʒ��Ϣ1");
			 OrderInfo.put("OrderElement44", "������Ʒ��Ϣ2");
			 OrderInfo.put("OrderElement45", "������Ʒ��Ϣ3");
			 OrderInfo.put("OrderElement46", "");
			 OrderInfo.put("OrderElement47", "");
			 OrderInfo.put("OrderElement48", "");
			 OrderInfo.put("OrderElement49", "");
			 OrderInfo.put("OrderElement50", "");
			 OrderInfo.put("OrderElement51", "");
			 OrderInfo.put("OrderElement52", "");
			 OrderInfo.put("OrderElement53", "");
			 OrderInfo.put("OrderElement54", "");
			 OrderInfo.put("OrderElement55", "");
			 OrderInfo.put("OrderElement56", "");
			 OrderInfo.put("OrderElement57", "");
			 OrderInfo.put("OrderElement58", "");
			 OrderInfo.put("OrderElement59", "");
			 OrderInfo.put("OrderElement60", "");

			 List<Map<String, Object>> OrderInfoList = new ArrayList<Map<String, Object>>();
			 OrderInfoList.add(OrderInfo);
			 
			 OrderInfo.put("OrderElement1", "xyw-20191030-001");
			 OrderInfo.put("OrderElement2", "102426");
			 OrderInfo.put("OrderElement3", "�����");
			 OrderInfo.put("OrderElement4", "");
			 OrderInfo.put("OrderElement5", "");
			 OrderInfo.put("OrderElement6", "");
			 OrderInfo.put("OrderElement7", "");
			 OrderInfo.put("OrderElement8", "");
			 OrderInfo.put("OrderElement9", "");
			 OrderInfo.put("OrderElement10", "��������");
			 OrderInfo.put("OrderElement11", "1");
			 OrderInfo.put("OrderElement12", "��Ѻ");
			 OrderInfo.put("OrderElement13", "��");
			 OrderInfo.put("OrderElement14", "�ֽ�");
			 OrderInfo.put("OrderElement15", "20251231");
			 OrderInfo.put("OrderElement16", "л����");
			 OrderInfo.put("OrderElement17", "���б�������֧��test");
			 OrderInfo.put("OrderElement18", "xxx");
			 OrderInfo.put("OrderElement19", "��������������˾");
			 OrderInfo.put("OrderElement20", "����֧��");
			 OrderInfo.put("OrderElement21", "xxx");
			 OrderInfo.put("OrderElement22", "");
			 OrderInfo.put("OrderElement23", "");
			 OrderInfo.put("OrderElement24", "");
			 OrderInfo.put("OrderElement25", "");
			 OrderInfo.put("OrderElement26", "");
			 OrderInfo.put("OrderElement27", "������");
			 OrderInfo.put("OrderElement28", "Ӧ���˿�ȷ�ϵ�");
			 OrderInfo.put("OrderElement29", "xyw-20191030-001-1");
			 OrderInfo.put("OrderElement30", "xyw-20191030-001-1");
			 OrderInfo.put("OrderElement31", "102426");
			 OrderInfo.put("OrderElement32", "");
			 OrderInfo.put("OrderElement33", "");
			 OrderInfo.put("OrderElement34", "");
			 OrderInfo.put("OrderElement35", "");
			 OrderInfo.put("OrderElement36", "");
			 OrderInfo.put("OrderElement37", "");
			 OrderInfo.put("OrderElement38", "");
			 OrderInfo.put("OrderElement39", "");
			 OrderInfo.put("OrderElement40", "");
			 OrderInfo.put("OrderElement41", "");
			 OrderInfo.put("OrderElement42", "");
			 OrderInfo.put("OrderElement43", "");
			 OrderInfo.put("OrderElement44", "");
			 OrderInfo.put("OrderElement45", "");
			 OrderInfo.put("OrderElement46", "");
			 OrderInfo.put("OrderElement47", "");
			 OrderInfo.put("OrderElement48", "");
			 OrderInfo.put("OrderElement49", "");
			 OrderInfo.put("OrderElement50", "");
			 OrderInfo.put("OrderElement51", "");
			 OrderInfo.put("OrderElement52", "");
			 OrderInfo.put("OrderElement53", "");
			 OrderInfo.put("OrderElement54", "");
			 OrderInfo.put("OrderElement55", "");
			 OrderInfo.put("OrderElement56", "");
			 OrderInfo.put("OrderElement57", "");
			 OrderInfo.put("OrderElement58", "");
			 OrderInfo.put("OrderElement59", "");
			 OrderInfo.put("OrderElement60", "");
			 OrderInfoList.add(OrderInfo);
			 
			 bizContent.setOrderInfoList(OrderInfoList);
			 request.setBizContent(bizContent);

			MybankLoanGylloanAccepttradeinfoResponseV2 response;
			response = client.execute(request);
			if (response.isSuccess()) {
				
				String a = response.getReturnContent();
				
				log.info(a);
				
			} else {
				
			}
			
		}  catch (IcbcApiException e1) {
			e1.printStackTrace();
		}
		 
	}
}
