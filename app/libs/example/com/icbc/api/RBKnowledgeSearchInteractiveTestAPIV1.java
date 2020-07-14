package com.icbc.api;

import com.icbc.api.request.RBKnowledgeSearchInteractiveReqAPIV1;
import com.icbc.api.request.RBKnowledgeSearchInteractiveReqAPIV1.RBKnowledgeSearchInteractiveReqAPIBiz;
import com.icbc.api.response.RBKnowledgeSearchInteractiveResAPIV1;

/**
 * RBInteractKwlgSearchService����ʽ�����������񻯽ӿڣ�V0022���񻯽ӿڣ�
 * 
 * ���̻�����SDK�е�lib�ļ����е�jar���󣬸��ݱ�ע1-6��ʾ���������滻
 */


public class RBKnowledgeSearchInteractiveTestAPIV1 {
	//1�����ع�Կ
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	//2��appid
	protected static final String APP_ID = "10000000000000002156";

	//3����Կ����֤��ʽ����Կ��APIƽ̨�Ǽǣ��˴�Ϊ˽Կ
	protected static final String MY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIJBzZNaiobplRUgtJ4OzmUvZRK99ih/fUyDBOoFLtpJJCCRzp8T6V11YNlE7Xg5dt+EG7byQs2NImqg0eWEj/mBdZ7UmlAct7BNw2hyF2h4R5OEfXyjoH3wqGjKJayhaHTvLM1DYy/mDFBb0ShJYI1QMScQJZhsOhMMFhrrZwIZAgMBAAECgYAA2kdrOIOBoJPOQJmOE1C8jtPdjIrI9xSt5Imqsn/9A8+NuwacOfgkGXmZ0n6vc8jYa7f2uZ1AVTUtd4IIO5bpq8s0Tw2BfWALYwr/JdUuNKSjHVQsh/Do+wl8BgOgB4RqsNXWNGtoMC8lHKHmrVcpyJMfDc3cP07NZ1wG2zB0lQJBAM+dNZv2L/Z4RzvQcoVZEthYavZ4pkFoWGYC4jwc5G8um76zoQyrtxWYrtTP0GS+xFFX2dEuiGXxwzmSQJrPdrMCQQCgnUXcQe/if2c6TFt4x9v+6L0pmFClYyiOi9RuBSz1sHmPouuc/YYvuxAOdOzu3yzOkeo7b5KcCKITTWvKI+oDAkA5dl6vIw2VXycAJCp+Q/AWVyqLu0rw0Yud+HBbiPek2jabKqaJlkFfRdol5rrcF3zIstMDtahk5uxM0/DzqDZHAkBGnZ8vfdYIUVeDbDrzWXvCEXXJqewbKwOT2KqnTKM9yj9IBatttJGgvrAKiyH4zCqZD9JaG23sKGeJ8QopL60dAkEAtc4tlKoj3XZzRUXboqz0EhkgkjzDj50zpCD1sJKZ2EZH+A/7tXwPug+RnuSmKpM2uv3msqw3prdS3K4En8+rog==";
		
	public static void main(String[] args) throws Exception {
		
		//ǩ������ΪRSA2ʱ���贫��appid��˽Կ�����ع�Կ��ǩ������ʹ�ö�ֵIcbcConstants.SIGN_TYPE_RSA2����������ʹ��ȱʡֵ
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA2, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		
		RBKnowledgeSearchInteractiveReqAPIV1 request = new RBKnowledgeSearchInteractiveReqAPIV1();
		
		//4�����ݲ��Ի��������������滻��Ӧip�Ͷ˿�
		request.setServiceUrl("https://ip:port/api/knowledgesearch/interactiveapi/V1");

		//5������սӿ��ĵ���bizContent.setxxx()������ҵ���������ݽ��и�ֵ
		RBKnowledgeSearchInteractiveReqAPIBiz bizContent = new RBKnowledgeSearchInteractiveReqAPIBiz();
		bizContent.setSpTransCode("V0022");	//д��V0022
		bizContent.setSChannel("01");	//��Դ����
		bizContent.setSSerialNo("13591097788");// 01����Ϊ�ֻ��ţ���������ͬ��
		bizContent.setSInQuestion("���ÿ�����");//�ͻ�����
		request.setBizContent(bizContent);

		RBKnowledgeSearchInteractiveResAPIV1 response;
		try {
			response = client.execute(request, "msgId");//msgId��ϢͨѶΨһ��ţ�Ҫ��ÿ�ε��ö������ɣ�APP��Ψһ
			if (response.isSuccess()) {
				//6��ҵ��ɹ���������ݽӿ��ĵ���response.getxxx()��ȡͬ�����ص�ҵ������
				System.out.println("ReturnCode:"+response.getReturnCode());
				System.out.println("response:" + response);
			} else {
				//ʧ��
				System.out.println("ReturnCode:"+response.getReturnCode());
				System.out.println("ReturnMsg:"+response.getReturnMsg());
			}		
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}

}
