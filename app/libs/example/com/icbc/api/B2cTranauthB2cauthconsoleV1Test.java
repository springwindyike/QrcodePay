package com.icbc.api;

import org.junit.Test;

import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.B2cTranauthB2cauthconsoleRequestV1;
import com.icbc.api.request.B2cTranauthB2cauthconsoleRequestV1.B2cTranauthB2cauthconsoleBizContentV1;

public class B2cTranauthB2cauthconsoleV1Test {
	
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
		UiIcbcClient client = new UiIcbcClient(APP_ID, 
																			IcbcConstants.SIGN_TYPE_RSA2, 
																			MY_PRIVATE_KEY,
																			IcbcConstants.CHARSET_UTF8,
																			IcbcConstants.ENCRYPT_TYPE_AES,
																			AES_KEY);
		B2cTranauthB2cauthconsoleRequestV1 request = new B2cTranauthB2cauthconsoleRequestV1();
        
		//���ݲ��Ի��������������滻��Ӧip�Ͷ˿�http://gw.dccnet.com.cn:8081/ 
        request.setServiceUrl("https://apipcs4.dccnet.com.cn/ui/b2c/tranauth/b2cauthconsole/V1");

		
        B2cTranauthB2cauthconsoleBizContentV1 bizContent = new B2cTranauthB2cauthconsoleBizContentV1();
        JSONObject tranJsonData = new JSONObject();
		tranJsonData.put("IN_cusChannel", "1");
		tranJsonData.put("IN_eventID", "2");
		tranJsonData.put("IN_mainCIS", "020079000040718");
		tranJsonData.put("IN_phoneNum", "");
		/**
		 * 
		 */
		bizContent.setInterfaceName("ICBC_EPAY_AUTHEN");
		bizContent.setTranData(tranJsonData.toJSONString());
		bizContent.setPageModel("0");
		request.setBizContent(bizContent);
		System.out.println(JSONObject.toJSONString(bizContent));
		/**
		 * ͨ�� client.buildPostForm(request) ��ʽ�齨 ���ױ��ģ�
		 * �����齨��Ϻ�ͨ��ҳ������ύ��������͹���
		 */
		System.out.println(client.buildPostForm(request));
	}
	
}
