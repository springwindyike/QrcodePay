package com.icbc.api;


import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.EnterpriseMerctservQryrefundRequestV1;
import com.icbc.api.request.EnterpriseMerctservQryrefundRequestV1.EnterpriseMerctservQryrefundRequestV1Biz;
import com.icbc.api.response.EnterpriseMerctservQryrefundResponseV1;

public class EnterpriseMerctservQryrefundRequestTest {

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
		// �����������request
		EnterpriseMerctservQryrefundRequestV1 request = new EnterpriseMerctservQryrefundRequestV1();	
		// ��������·��
		request.setServiceUrl("https://ip:port/api/enterpris/merctserv/qryrefund/V1");
		EnterpriseMerctservQryrefundRequestV1Biz bizContent = new EnterpriseMerctservQryrefundRequestV1Biz();
		bizContent.setFunctionID("F-EBANKC-B2CRefund");
		bizContent.setO2oFlag("1");//1-���ϣ�2-���²�����;�����Ͳ�У�飬���ͻᰴ�ձ�־У�鶩�����ͣ��粻�����򱨴�
		bizContent.setOnLine_merID("0200EC20001259");
		bizContent.setOffLine_merID("0200EC20001259");
		bizContent.setChannel_merID("0200EC20001259");
		bizContent.setOrderNum("20081114110804");//1�����ⶩ���� 2�����Ϸ�֧�֧��30λ�����·�֧�֧��50λ;
		bizContent.setEmallRejectId("20081114110804");
		bizContent.setSerialNo("HFI111");
		bizContent.setRejectType("1");
 

		request.setBizContent(bizContent);
		try {
			// �������ύ�ı����ؿͻ���������ñ����Զ��ύ��ɵ���
			EnterpriseMerctservQryrefundResponseV1 response = (EnterpriseMerctservQryrefundResponseV1) client.execute(request, "msgId");
			if (response.isSuccess()) {
			    System.out.println("resultS:"+response.getReturnCode());
			    System.out.println("MsgS:"+response.getReturnMsg());
			} else {
			    System.out.println("resultS:"+response.getReturnCode());
			    System.out.println("MsgS:"+response.getReturnMsg());
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
