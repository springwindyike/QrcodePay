package com.icbc.api;

import org.junit.Test;

import com.icbc.api.request.MybankAccountBankconfirmationrequestBcrrequestcancelRequestV1;
import com.icbc.api.request.MybankAccountBankconfirmationrequestBcrrequestcancelRequestV1.MybankAccountBankconfirmationrequestBcrrequestcancelRequestV1Biz;
import com.icbc.api.response.MybankAccountBankconfirmationrequestBcrrequestcancelResponseV1;

/**
 * ��������Ա��ƷЭ��¼��
 * 
 * ���̻�����SDK�е�lib�ļ����е�jar���󣬸��ݱ�ע1-6��ʾ���������滻
 */
public class MybankAccountBankconfirmationrequestBcrrequestcancelV1Test {

	// 1�����ع�Կ
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	// 2��appid
	protected static final String APP_ID = "10000000000000002156";

	// 3����Կ����֤��ʽ����Կ��APIƽ̨�Ǽǣ��˴�Ϊ˽Կ
	protected static final String MY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIJBzZNaiobplRUgtJ4OzmUvZRK99ih/fUyDBOoFLtpJJCCRzp8T6V11YNlE7Xg5dt+EG7byQs2NImqg0eWEj/mBdZ7UmlAct7BNw2hyF2h4R5OEfXyjoH3wqGjKJayhaHTvLM1DYy/mDFBb0ShJYI1QMScQJZhsOhMMFhrrZwIZAgMBAAECgYAA2kdrOIOBoJPOQJmOE1C8jtPdjIrI9xSt5Imqsn/9A8+NuwacOfgkGXmZ0n6vc8jYa7f2uZ1AVTUtd4IIO5bpq8s0Tw2BfWALYwr/JdUuNKSjHVQsh/Do+wl8BgOgB4RqsNXWNGtoMC8lHKHmrVcpyJMfDc3cP07NZ1wG2zB0lQJBAM+dNZv2L/Z4RzvQcoVZEthYavZ4pkFoWGYC4jwc5G8um76zoQyrtxWYrtTP0GS+xFFX2dEuiGXxwzmSQJrPdrMCQQCgnUXcQe/if2c6TFt4x9v+6L0pmFClYyiOi9RuBSz1sHmPouuc/YYvuxAOdOzu3yzOkeo7b5KcCKITTWvKI+oDAkA5dl6vIw2VXycAJCp+Q/AWVyqLu0rw0Yud+HBbiPek2jabKqaJlkFfRdol5rrcF3zIstMDtahk5uxM0/DzqDZHAkBGnZ8vfdYIUVeDbDrzWXvCEXXJqewbKwOT2KqnTKM9yj9IBatttJGgvrAKiyH4zCqZD9JaG23sKGeJ8QopL60dAkEAtc4tlKoj3XZzRUXboqz0EhkgkjzDj50zpCD1sJKZ2EZH+A/7tXwPug+RnuSmKpM2uv3msqw3prdS3K4En8+rog==";

	@Test
	public void test() throws Exception {

		// ǩ������ΪRSA2ʱ���贫��appid��˽Կ�����ع�Կ��ǩ������ʹ�ö�ֵIcbcConstants.SIGN_TYPE_RSA2����������ʹ��ȱʡֵ
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID,
				IcbcConstants.SIGN_TYPE_RSA2, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		MybankAccountBankconfirmationrequestBcrrequestcancelRequestV1 request = new MybankAccountBankconfirmationrequestBcrrequestcancelRequestV1();

		// 4�����ݲ��Ի��������������滻��Ӧip�Ͷ˿�
		// request.setServiceUrl("http://ip:port/api/mybank/account/enterprise/applycurrentaccount/V2");
		request.setServiceUrl("http://122.64.109.110:8081/api/mybank/account/bankconfirmationrequest/bcrrequestcancel/V1");
		// 5������սӿ��ĵ���bizContent.setxxx()������ҵ���������ݽ��и�ֵ���Ǳ����ֶοɲ�����
		MybankAccountBankconfirmationrequestBcrrequestcancelRequestV1Biz bizContent = new MybankAccountBankconfirmationrequestBcrrequestcancelRequestV1Biz();

		bizContent.setConfirmationNO("201904080000001");// ���뵥���
		request.setBizContent(bizContent);
		// System.out.println(client.buildPostForm(request));
		MybankAccountBankconfirmationrequestBcrrequestcancelResponseV1 response = new MybankAccountBankconfirmationrequestBcrrequestcancelResponseV1();
		try {
			response = client.execute(request,
					String.valueOf(System.currentTimeMillis()));// msgId��ϢͨѶΨһ��ţ�Ҫ��ÿ�ε��ö������ɣ�APP��Ψһ
			System.out.println("ReturnCode:" + response.getReturnCode());
			System.out.println("ReturnMsg:" + response.getReturnMsg());
			if (response.isSuccess()) {
				// 6��ҵ��ɹ���������ݽӿ��ĵ���response.getxxx()��ȡͬ�����ص�ҵ������
				System.out.println("ReturnCode:" + response.getReturnCode());
			} else {
				System.out.println("returnCode:" + response.getReturnCode());
				System.out.println("returnMsg:" + response.getReturnMsg());
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		} finally {
		}
	}
}
