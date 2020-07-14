package com.icbc.api;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.BillLoadRequestV1;
import com.icbc.api.request.BillLoadRequestV1.BillLoadRequestV1BizBill;
import com.icbc.api.response.BillLoadResponseV1;

public class BillLoadServiceTest {

	private static final String MY_PRIVATE_KEY = "xxxx";
	private static final String APIGW_PUBLIC_KEY = "xxxx";
	
	private static final String URL = "https://gw.open.icbc.com.cn/api/message/templateSend/V1";//api��ַ
	private static final String APPID = "yourAppId";
	private static final String TEMPLATE_ID = "xxxx";//����ģ��Id
	
	public static void main(String[] args) {
		DefaultIcbcClient client = new DefaultIcbcClient(APPID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);

		BillLoadRequestV1 request = new BillLoadRequestV1();		
		request.setServiceUrl("https://gw.open.icbc.com.cn/api/bill/V1/load");
		BillLoadRequestV1.BillLoadRequestV1Biz bizContent = new BillLoadRequestV1.BillLoadRequestV1Biz();
		request.setBizContent(bizContent);
		bizContent.setBatchNo("1000342342342");
		bizContent.setCorpCis("020090003171737");
		bizContent.setProjectId("PJ140014021000000769");
		bizContent.setEbppFlag("0");
		bizContent.setBillName("�˵�����");
//		bizContent.setTotalAmt("10");
		bizContent.setStartNum("1");
		bizContent.setFetchNum("2");
		bizContent.setTotalNum("21");
		List<BillLoadRequestV1BizBill> billList = new ArrayList<BillLoadRequestV1BizBill>();
		BillLoadRequestV1BizBill bill1= new BillLoadRequestV1BizBill();
		bill1.setBillNo(1);
		bill1.setBusiCode("9002");
		bill1.setMobile("13456780099");
		bill1.setBillDate("2017-07-01");
		bill1.setBillAmount(new BigDecimal("4566"));
		bill1.setBusiCode("009");
		bill1.setAgentno("522000000");

		BillLoadResponseV1 response;
		try {
			response = client.execute(request, "msgId");
			if (response.isSuccess()) {
				// ҵ��ɹ�����
//				Assert.assertEquals(response.getPurchasePrice(), 100);
				System.out.println(response.getReturnCode());
				System.out.println(response.getReturnMsg());
				System.out.println(response.getMsgId());
			} else {
				// ʧ��
			}		
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}

	}

}
