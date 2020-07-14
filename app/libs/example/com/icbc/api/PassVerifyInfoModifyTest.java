package com.icbc.api;

import java.util.Calendar;
import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.PassVerifyInfoModifyRequestV1;
import com.icbc.api.request.PassVerifyInfoModifyRequestV1.PassVerifyInfoModifyRequestV1Biz;
import com.icbc.api.response.PassVerifyInfoModifyResponseV1;



public class PassVerifyInfoModifyTest {

	//1�����ع�Կǧ��Ҫ�� ����ǲ����API��Կ
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	//2��mims
	protected static final String APP_ID = "10000000000001214554";
	//3����Կ����֤��ʽ����Կ��APIƽ̨�Ǽǣ��˴�Ϊ˽Կ �������
	protected static final String MY_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDCKa1UknsiKQXzsnf3IWDJ7URfZVQqj0Mh4cQsLEnNcyFShxKX4ncJF5ngRrzHu9960F731KRBQnU/dB7uYp+1l9rmLBthr0Qj+W12EQLc5iDm/1iEXvV3HErEGAntKxw8FaK1gtxSjxGC8pd7iRGp0ZaXxghxgxqk4MDUkf9PWCsHShKZa+HZwCs7tO/q1GWo6UiVrRMqQ0veZdBAcq1MI1qjoYkocFfoioYGo6MXIrvudmPJR6D6yboP95HsUFeoddrSNFm7jlpNFpquAXDNb38IoQkYlbUkbn6UZNg1NJDyjXfnWhAamw0l2vUaQhiZ52vOtIbXCqZarv7YG9bTAgMBAAECggEAQSL+NRsXF/SvPHwo5s1ZzSQ+BcrWm5iIKvu0diU9dSEkkq0hvbaJvJEgXC8e8drDNE5nLbk2iXYkI29vWQXZEnCpTQKLBRBpSbBJ2owGa9kAPL55EZ9Rte3V30c5PUlzJW0UstP92eyJMWb1DsqDFHdtj+ktt/cFnz6PMkDwZ8tUobhZh2ekSPYaIomRmlDfPgN4E/xcYeda9M4AsaYOXxeTeiaVQQHKqKiMTE0gsb9pq4iL6qTtrA8kQIsQ8NwIU4nRb1bNl2NExs+TxTQSbNruD1Gnf83QdKMBff8cOTcP6IrFc17au3aQ3AopT/hPI+iOqH5eOqM0V7GPQvc6MQKBgQDnkz4+5lyQO505ss0IayP3UiBlkEIONP/m1qQYaTcc5ZW2PIiu1tM4IobNTKdVcmm05hzAwdeN8QdsLAFR7+8BP/Gv1rHfy1ZuFbqPpSTO+1Mo5iSyOfRe3b/QLe6ror81PXA93QnJw173Kzs/v49NrpyMMGbQj0m8bTQZ56Oz5QKBgQDWpENmWA/PvG3Yxc5nHaqXSp7OHYP6tV2DZTjFGG3XdfhivCpxHEXqiG2fSV+o37V4pDwFf4uMzBWHw4HLgJ5uJK2P08038HD5rO8qxDZFLA4BBA1dWZK7klmQUwhk4KqUmoMKOrOYTyl/pp0hi/S65Q4QKSHIhqjqi8RDIZ+kVwKBgEqQYKSELB3M9C0V42rohKYn7YKGVp6YdiVvy1qI1lQZoIETMLeLOGuEwn7sRZz/wAWdaniucaekik1MRgiKBx0R59JEgPWcVXIQ0Qdbl2SGDBrJL9urSYIaSJ7Ri138gzCzXaatu28Z10QiyWsXVR8gMAv7sb9Jw+ZGC1aj/VP5AoGBAKWsCl3/kMy+W2cbXvJWgqreLO9Y9trXjINz6Lqw3W+WHg9Pv86ojQq3HS36e3ykl7Szx6RSy0r055VwAUorT54ib1j5mYgY7Yq5wa0X3+/KTlDYaNxp3AktsDXm8S6z/tZO4OBPaPoh+B0QZG5VUaPEUvOEXBAkaFMJaIaMeGVnAoGBAIclLqmP9yrwTOcOX3s5OtaoLFhiPWYrU7OrIJrMFEZnd1lUslbIaAAGChwwlO1ugopi7SAL6JBhQusaZ3BEoFpR0qoXyqpquV7pis/4PRq8w/VQJsdyT0rhaGiFRynAK5ccVWli157csu3/xJSYk4CYjuFLCCxYLzAq0zIZmArL";

	public static void main(String[] args) throws Exception {
		
		//ǩ������ΪSHA256WithRSAʱ���贫��appid��˽Կ�����ع�Կ��ǩ������ʹ�ö�ֵIcbcConstants.SIGN_TYPE_RSA2����������ʹ��ȱʡֵ
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		
		PassVerifyInfoModifyRequestV1 request = new PassVerifyInfoModifyRequestV1();
		
		//4�����ݲ��Ի��������������滻��Ӧip�Ͷ˿�						/cert/epass/authentoken
		//��������							/epass/PassTransInfoE/cert/epass/epassverifyinfomodify/V1
		request.setServiceUrl("http://122.64.61.111:8081/api/cert/epass/epassverifyinfomodify/V1");		
		PassVerifyInfoModifyRequestV1Biz bizContent = new PassVerifyInfoModifyRequestV1Biz();
		//��ͷ
		bizContent.setVersionid("1");
		bizContent.setAppsenderid("F-MIMS");
		bizContent.setAppreceiverid("F-EPASS");
		bizContent.setOrigsenddate("1");
		bizContent.setOrigsendtime("2");
		bizContent.setStructtype("JSON");
		bizContent.setMesgcharset("UTF-8");
		bizContent.setMesgstat("9");
		bizContent.setMsg_id("82.201.61.178.20181011154033.2");
		bizContent.setMesgpriority("1");
		//chanCommV10
		PassVerifyInfoModifyRequestV1.ChanCommV10RequestV1Message chanCommV10 = new PassVerifyInfoModifyRequestV1.ChanCommV10RequestV1Message();
		chanCommV10.setCHANNELIDENTIFIER("82.201.61.178.20181011154033.2");
		chanCommV10.setCHANTYPE("309");
		chanCommV10.setIP("82.200.61.178");
		bizContent.setChanCommV10(chanCommV10);
		//infoCommV10
		PassVerifyInfoModifyRequestV1.InfoCommV10RequestV1Message infoCommV10 = new PassVerifyInfoModifyRequestV1.InfoCommV10RequestV1Message();
		infoCommV10.setTRXCODE("passVerifyInfoModifyAPI");
		infoCommV10.setWORKDATE("2020-10-21");
		infoCommV10.setWORKTIME("191518");
		bizContent.setInfoCommV10(infoCommV10);
		//inputV10
		PassVerifyInfoModifyRequestV1.InputV10RequestV1Message inputV10 = new PassVerifyInfoModifyRequestV1.InputV10RequestV1Message();
		inputV10.setUSERID("201311290001092163");
		inputV10.setLOGIN_IDFLAG("0");
		inputV10.setPASSWORDFLAG("0");
		inputV10.setEMAILFLAG("0");
		inputV10.setPROVINCEFLAG("0");
		inputV10.setCITYFLAG("0");
		inputV10.setMOBILEFLAG("0");
		inputV10.setCIS_CODEFLAG("0");
		inputV10.setNICKFLAG("1");
		inputV10.setLOGIN_ID("");
		inputV10.setPASSWORD_OLD("");
		inputV10.setPASSWORD_NEW("");
		inputV10.setEMAIL("");
		inputV10.setPROVINCE("");
		inputV10.setCITY("");
		inputV10.setMOBILE("");
		inputV10.setCIS_CODE("b280600000011255");
		inputV10.setNICKNAME("�ǳ�0");
		inputV10.setTEMP1("");
		inputV10.setTEMP2("");
		inputV10.setTEMP3("");
		bizContent.setInputV10(inputV10);
		request.setBizContent(bizContent);
		System.out.println(request.getBizContent());
		//����������
		PassVerifyInfoModifyResponseV1 response = new PassVerifyInfoModifyResponseV1();
		try {
			response = client.execute(request);	
			System.out.println(JSONObject.toJSONString(response));
			String retcode = response.getAppstatv10().getTransok();
			System.out.println("transok:"+retcode);
			String return_code = response.getAppstatv10().getReturn_code();
			System.out.println("return_code:" + return_code);
			System.out.println("rresponse:" + response.getAppstatv10().getReturn_msg());
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}

	
}

