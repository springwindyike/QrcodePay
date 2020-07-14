package com.icbc.api;
import com.icbc.api.request.AggregatePaymentRequestV1;
import com.icbc.api.request.AggregatePaymentRequestV1.AggregatePaymentRequestV1Biz;
import com.icbc.api.request.AggregatePaymentRequestV1;

/**
 * ������ά���ѯ�ӿ�
 * 
 * ���̻�����SDK�е�lib�ļ����е�jar���󣬸��ݱ�ע1-6��ʾ���������滻
 */
public class AggregatePaymentRequestTest {

	//1�����ع�Կ
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	//2��appid
	protected static final String APP_ID = "10000000000000002156";

	//3����Կ����֤��ʽ����Կ��APIƽ̨�Ǽǣ��˴�Ϊ˽Կ
	protected static final String MY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIJBzZNaiobplRUgtJ4OzmUvZRK99ih/fUyDBOoFLtpJJCCRzp8T6V11YNlE7Xg5dt+EG7byQs2NImqg0eWEj/mBdZ7UmlAct7BNw2hyF2h4R5OEfXyjoH3wqGjKJayhaHTvLM1DYy/mDFBb0ShJYI1QMScQJZhsOhMMFhrrZwIZAgMBAAECgYAA2kdrOIOBoJPOQJmOE1C8jtPdjIrI9xSt5Imqsn/9A8+NuwacOfgkGXmZ0n6vc8jYa7f2uZ1AVTUtd4IIO5bpq8s0Tw2BfWALYwr/JdUuNKSjHVQsh/Do+wl8BgOgB4RqsNXWNGtoMC8lHKHmrVcpyJMfDc3cP07NZ1wG2zB0lQJBAM+dNZv2L/Z4RzvQcoVZEthYavZ4pkFoWGYC4jwc5G8um76zoQyrtxWYrtTP0GS+xFFX2dEuiGXxwzmSQJrPdrMCQQCgnUXcQe/if2c6TFt4x9v+6L0pmFClYyiOi9RuBSz1sHmPouuc/YYvuxAOdOzu3yzOkeo7b5KcCKITTWvKI+oDAkA5dl6vIw2VXycAJCp+Q/AWVyqLu0rw0Yud+HBbiPek2jabKqaJlkFfRdol5rrcF3zIstMDtahk5uxM0/DzqDZHAkBGnZ8vfdYIUVeDbDrzWXvCEXXJqewbKwOT2KqnTKM9yj9IBatttJGgvrAKiyH4zCqZD9JaG23sKGeJ8QopL60dAkEAtc4tlKoj3XZzRUXboqz0EhkgkjzDj50zpCD1sJKZ2EZH+A/7tXwPug+RnuSmKpM2uv3msqw3prdS3K4En8+rog==";
		
	public static void main(String[] args) throws Exception {
		String priKey = "TKhSiK9Blwr6+aCq+O0MFg==";
		//prikeyΪAES��Կ
		
		//ǩ������ΪRSA2ʱ���贫��appid��˽Կ�����ع�Կ��ǩ������ʹ�ö�ֵIcbcConstants.SIGN_TYPE_RSA2����������ʹ��ȱʡֵ
		UiIcbcClient client = new UiIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA2, MY_PRIVATE_KEY,"UTF-8","AES",priKey);
		
		AggregatePaymentRequestV1 request = new AggregatePaymentRequestV1();
		
		//4�����ݲ��Ի��������������滻��Ӧip�Ͷ˿�
		request.setServiceUrl("https://123.123.123.123:8080/ui/aggregate/payment/request/V1");

		//5������սӿ��ĵ���bizContent.setxxx()������ҵ���������ݽ��и�ֵ
		AggregatePaymentRequestV1Biz bizContent = new AggregatePaymentRequestV1Biz();
		bizContent.setMerId("020001020461");
		bizContent.setChannelId("C020001020121");
		bizContent.setOutTradeNo("TCO001Icbc_w180125144301p532582");
		bizContent.setTranType("OfflinePay");
		bizContent.setOrderDate("20171213102409");
		bizContent.setEndTime("20171213102909");
		bizContent.setBody("�Ҵ�");
		bizContent.setGoodsTag("{'good_name':'�Ҵ��ζ300ml��װ','good_id':'1001','good_num':'1'}");
		bizContent.setAttach("�ѱ�");
		bizContent.setOrderDate("10000");
		bizContent.setSpbillCreateIp("82.201.125.104");
		bizContent.setNotifyUrl("http://122.16.173.77:11452/servlet/ICBCOFSTEBizServlet?tokenID=1303");
		bizContent.setResultType("0");
		bizContent.setNotifyType("HS");
		bizContent.setBackup1("");
		bizContent.setBackup2("");
		bizContent.setBackup3("");
		bizContent.setBackup4("");
		bizContent.setInterfaceVersion("1.0.0.0");
		request.setBizContent(bizContent);

		System.out.println(client.buildPostForm(request));


		
	}

	
}

