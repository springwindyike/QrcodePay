package com.icbc.api;

import java.util.HashMap;
import java.util.Map;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.MobileVerifyRequestV1;
import com.icbc.api.response.MobileVerifyResponseV1;

public class MobileVerifyTest {


	private static final String APIGW_PUBLIC_KEY = null;
	private static final String MY_PRIVATE_KEY = null;
	protected static String APP_ID = "10000000000000002225";
	public static void main(String[] args) {
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);

		MobileVerifyRequestV1 request = new MobileVerifyRequestV1();		
		request.setServiceUrl("https://gw.open.icbc.com.cn/api/mobile/verify/V1");
		MobileVerifyRequestV1.MobileVerifyRequestV1Biz bizContent = new MobileVerifyRequestV1.MobileVerifyRequestV1Biz();
		request.setBizContent(bizContent);
		bizContent.setMobile("15158114810");
		bizContent.setAcctName("XUZZ");
		bizContent.setAcctNo("6222020200000072500");
		bizContent.setIdType("1");
		bizContent.setIdNo("331082198911178108");
		bizContent.setTrxType("01");
		bizContent.setProjectId("PJ140014011000002153");
		bizContent.setTextSerno("00");//ֻ����00����01������Ĭ��00ͨ��ģ��
		bizContent.setPrtlLmtAmt("20000000");//��λ�֣���Ҫ��С�����Ǳ���
		bizContent.setSmsNote("�Զ��屸ע����");//���Ż���ʾ��XXXXXXXX����ע���Զ��屸ע����
		Map<String,String> templateParams = new HashMap<String,String>();
    templateParams.put("prtl_enddate","2018-11-22");
    bizContent.setTemplateParams(templateParams);
		MobileVerifyResponseV1 response;
		try {
			response = client.execute(request, "msgId");
			if (response.isSuccess()) {
				// ҵ��ɹ�����
				System.out.println(response.getReturnCode());

			} else {
				// ʧ��
			}		
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}
}