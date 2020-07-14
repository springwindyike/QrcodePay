package com.icbc.api;


import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.EnterpriseMerctservRefundRequestV1;
import com.icbc.api.request.EnterpriseMerctservRefundRequestV1.EnterpriseMerctservRefundRequestV1Biz;
import com.icbc.api.response.EnterpriseMerctservRefundResponseV1;

public class EnterpriseMerctservRefundRequestTest {

	//֤��˽Կ  

	protected static final String MY_PRIVATE_KEY ="";  

	//���ع�Կ  

	protected static final String APIGW_PUBLIC_KEY = "";  

	 protected static final String APP_ID = "Oikeclo001";  

	//֤������

	 protected static final String password = "12345678";

	 //֤�鹫Կ  

	protected static final  String MY_PUB_KEY = "";  

//	@Test
	public static void test_cop() {
//		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		
		// ����client����  

		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY,MY_PUB_KEY,password);

//		DefaultIcbcClient client = new DefaultIcbcClient("999", "999", "999");
		EnterpriseMerctservRefundRequestV1 request = new EnterpriseMerctservRefundRequestV1();		
		request.setServiceUrl("https://ip:port/api/enterpris/merctserv/refund/V1");
		EnterpriseMerctservRefundRequestV1Biz bizContent = new EnterpriseMerctservRefundRequestV1Biz();
		bizContent.setFunctionID("F-EBANKC-B2CRefund");
		bizContent.setO2oFlag("1");//1-���ϣ�2-���²�����;�����Ͳ�У�飬���ͻᰴ�ձ�־У�鶩�����ͣ��粻�����򱨴�
		bizContent.setOnLine_merID("0200EC20001259");
		bizContent.setOffLine_merID("0200EC20001259");
		bizContent.setChannel_merID("0200EC20001259");
		bizContent.setPayDate("20180529");
		bizContent.setOrderNum("20081114110804");//1�����ⶩ���� 2�����Ϸ�֧�֧��30λ�����·�֧�֧��50λ;
		bizContent.setEmallRejectId("20081114110804");

		bizContent.setRejectReson("�˿�");
		bizContent.setRejectAmt("100");
		bizContent.setThirdPayFlag("1");
		bizContent.setOrderNumType("0");//0-�̻��Զ��嶩���ţ�1-���ж�����
		bizContent.setMerattach("�̻��Զ�������ֶ�");
		
		request.setBizContent(bizContent);

		EnterpriseMerctservRefundResponseV1 response;
		try {
			response = client.execute(request, "msgId");
			if (response.isSuccess() ) {
				 // ҵ��ɹ����� 
				  System.out.println("success");//
			} else {
				 // ʧ�� 
				  System.out.println("error");
			}		
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * TODO ��������������
	 * 
	 * <pre>
	 * 
	 * </pre>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		test_cop();

	}
}
