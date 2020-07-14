package com.icbc.api;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.icbc.api.internal.util.codec.Base64;
import com.icbc.api.request.B2cBiometricbasedPaymentPayRequestV1;
import com.icbc.api.request.B2cBiometricbasedPaymentPayRequestV1.B2cBiometricbasedPaymentPayRequestV1Biz;
import com.icbc.api.response.B2cBiometricbasedPaymentPayResponseV1;

public class B2cBiometricbasedPaymentPayV1Test {
	
	//appid
	protected static final String APP_ID = "10000000000000002156";
	
	//������˽Կ
	protected static final String MY_PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDs6rAC+FOC9YtxP4BCjoO1N33H8DXn7GlOg1ohuaBeqKU+zHTNXpYrB9Egawe7D8UzrT0WQY+oyAnfKeGHjnrsk6sdzYtNJqoywaJlh9UVDsVDhnFaROeLC6CsobfZ2As4ZNtypdjO4aAKJmsAsZ5jvkuvgNJGFgz6A3GsH8H8/OoDw3o/LEn41/79Mrt6SyJEBkGfje+YdKsIgzgnlnWMY87HXGMasDQj4iqFAHU12EU272Wt4BXnilT7Lmh9v5e/wPJwD8waW7hSHlj1+mmfElq722+sqlm6JLgVD7XiH71VEKfSDxleVw/h1mJ4fMH5W5e92zKiw5XgF6hXu98xAgMBAAECggEBAMMRxZTcdJ6KoKLBX1Dt2QI3y4f5f9kTLe3odyj3l1T5VP3tCGska07I4+bmWXorVPrktDyEBM46zu4BpOGhbhMmzyj92anPoSmjh5xDiC4LeF7N7r0dqOwyybv6d8+VdD+dw5aVeXt2CPjygv4SQVDtGZJK5lewxkSA23KWv3oWCs8fi5mKNpc+1eL2tDaKQYq6vWjkE3jozXAa6VhV32KVm68YbuRBDY2dhXx/NI19CPcJB3mO6qqtA+n7v3bNOVia5bAYloCjv83vYVdYmM/9Zvq6mrwC+k+FefVGHVT9I7+4Ng9349Ec7Sm4blMFi7fBJj2WqLMpcxtu0JMMZ3ECgYEA+6Di6ElCxmFTdbMwv8rHie4ExELW2pASdaIcHlEGgoE03VEk7r41q5PU9aFODqYEQNMQsKD7Nupyrle+1XoqIIMTko3LGinjdj2m2wMt3rhwIkhEYrKbsGfGopfWd1lvJc/SSnVANuJA+rDbe1eu+lFo1rpW/YIiT6OQiSd3a6UCgYEA8Qhe/nk43A8VO5XYXwg0OsCpsFD3X5ZgEAVqg7x7ipMwbn2wKRKizYe9TNQTZ4WH0txVeGS2IWUJ4WxkEBO+dGVlMM65zobPrArb5DhA/zTE4uPNEgCvrUpNrltdOJ4TA/8cqcYLIl/Yb44el87qVha4bxaEbdvrZCYivqU4f50CgYBRdl+fdgBROzcK1s1EekCpTc5rP3xRW+0t+iKCShcCbxQPRnLfe+LiPkTmlKcxpNuhpPM1S5ioybQA71VPxXIX/nd6rb8AJGmIYSNAqkHSZgGfh6fkEBDJRn+PKfr7vo92PVbGVjlIy2zf/BvCTbvPPEXlpoP9JIE5KSnkzUsjJQKBgQCugioMwgV5xe3Qgy/xtgXil8UDo8tGSKBqWRGCKX+kl+aTyKo3QofemK1kp5MY+2OYNfAnx3rZ+MZLkGduAG1+5j56NOHv9kj7Pa1wsY3VeAYoY1gA9cA7jbVqTDnVGRWZaiX9gSZkj9IrClF6BdRB2hdUTpA43eWyT64OK58ZPQKBgQC/CzncRwpeNd5xAy5CX1ZgH3DPGGJuYMA/07gSmQ7CsD6LK7uORJAY2YwToy3OcFb3bon/3yU0jQM/KDmSfBt0M4LKxkOLtdo1DkzSTgVni2KlfU0gcRyWYlEi7/KEhJQaPjMf5AJZReh83JumiusqrgdkMfh0XcR1mYbewAn9iQ==";
	
	//���ع�Կ
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
	
	//AES��Կ
	protected static final String AES_KEY = "LEWdRZPqgkloxb3bMhnhQQ==";
		
	@Test
	public void test_cop() throws IcbcApiException {
		DefaultIcbcClient client = new DefaultIcbcClient(
														APP_ID,
														IcbcConstants.SIGN_TYPE_RSA2, 
														MY_PRIVATE_KEY,
														IcbcConstants.CHARSET_UTF8, 
														IcbcConstants.FORMAT_JSON,
														APIGW_PUBLIC_KEY, 
														IcbcConstants.ENCRYPT_TYPE_AES,
														AES_KEY, 
														null, null);
		
		B2cBiometricbasedPaymentPayRequestV1 request = new B2cBiometricbasedPaymentPayRequestV1();
		Date date = new Date();
		Base64.encodeBase64String(null);
        SimpleDateFormat d = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateStr = d.format(date);
        
		//���ݲ��Ի��������������滻��Ӧip�Ͷ˿�http://gw.dccnet.com.cn:8081/ 
        request.setServiceUrl("https://apipcs4.dccnet.com.cn/api/biometricbased/payment/pay/V1");

		
		B2cBiometricbasedPaymentPayRequestV1Biz bizContent = new B2cBiometricbasedPaymentPayRequestV1Biz();
		bizContent.setConsumerId("XX�̳Ǳ��YYY������");//���÷�����,������־��¼
		bizContent.setMerchantId("020001020461");//�̻�ID���̻��ڹ��п��������̻�ʱ���ɹ��и�֪�̻���
		bizContent.setMerchantType("2");//���������̻���־��1-���ϣ�2-���¡�
		bizContent.setOrderId(dateStr);//�����š��ͻ�֧�����̻���վ������һ��Ψһ�Ķ����ţ��ö�����Ӧ�����൱����ʱ���ڲ��ظ�������ͨ�������żӶ���������Ψһȷ��һ�ʶ������ظ��ԡ�
		bizContent.setOrderAmt("6050");//�������ͻ�֧���������ܽ�һ�ʶ���һ�����Է�Ϊ��λ��������Ϊ�㣬������Ͻ���׼��
		bizContent.setOrderDate(dateStr);//��������ʱ�� ��ʽΪ��YYYYMMDDHHmmss Ҫ��������ϵͳ��ǰʱ���ǰ1Сʱ�ͺ�12Сʱ��Χ�ڣ������ж�����ʱ��Ƿ���
		bizContent.setEndTime("20180430000000");//���׽�ֹ����ʱ�� ��ʽΪ��YYYYMMDDHHmmss 
		bizContent.setCustomerId("18100000014");//��������ʶ��ͻ��ı�ʶ��Ϣ�����ֻ��ŵ�
		bizContent.setFeatureType("face");//������������ ��ֻ֧������face-�沿ʶ��
		bizContent.setFeatureValue("$���������ʶ��ɼ���Ϣ");//������������  ����ˢ��֧����Ҫ����base64���봦��
		bizContent.setPayLimit("no_credit");//֧����ʽ�޶� �͡�no_credit����ʾ��֧�����ÿ�֧���������ͻ����Ϳձ�ʾ������
		bizContent.setGoodsBody("�Ҵ�");//��Ʒ����
		bizContent.setGoodsDetail("{'good_name':'�Ҵ��ζ300ml��װ','good_id':'1001','good_num':'1'}");//��Ʒ����
		bizContent.setAttach("");//ҵ����չ�������̻��ɶ������ݣ���ʽΪjson String
		
		request.setBizContent(bizContent);

		B2cBiometricbasedPaymentPayResponseV1 response;
		try {
			response = (B2cBiometricbasedPaymentPayResponseV1) client.execute(request, "msgId");
			if (response.isSuccess()) {
				// ҵ��ɹ�����
				String orderId = response.getOrderId();
			} else {
				// ʧ��
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
		UiIcbcClient client1 = new UiIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA2, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		client1.buildPostForm(request);
	}
	
}
