/**
 * 
 */
package com.icbc.api;


import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;

import com.icbc.api.request.BamBamapApplyoutdataApplyoutdataRequestV1;
import com.icbc.api.request.BamBamapApplyoutdataApplyoutdataRequestV1.BamBamapApplyoutdataApplyoutdataBizV1;
import com.icbc.api.response.BamBamapApplyoutdataApplyoutdataResponseV1;

/**
 * TODO �����������
 * 
 * <pre>
 * 
 * </pre>
 * 
 * <pre>
 * modify by KFZX-HUANGYB on 2017-8-4
 *    fix->1.
 *         2.
 * </pre>
 */

public class BamBamapApplyoutdataApplyoutdataTestV1 {

	protected static final String MY_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCqNhPalfp6V8kLGrKBLR/JEfgg4MrRrLPPEeWwaiBaKoQ2OTM4Pjn9jIa5LzWGGzZo7CVJfCU4GBKqyBbalale2WkZ30N6Wpq/98xgbDNEAKcbHDQ5g70kXLqdBp3oMYfntbwJIRnkPQQ8ljF25wuHkHNDbOlGTEof03s8xi2N3qPyZAhoVB2Uoyst0PQhVUjzKcN3NOFQKRN4PXC/JsKl4CYAHFv0TrTGOniLGYbPDSYGyu4j4gFz6+47QFqRHQsN1u9oWNqFzmyVNzAEVutlytfarwcAnNIdEXv7OgoXJdTzwCLbVoxcDy+AM+5eFXl2i15Job9G0QGRaW1B1MaNAgMBAAECggEADlIidX+s5WJBbge/ARNU20wBvnJrXhzTvBZbZu5m7m8pVI6XeqHxqx2JsEcCj9f2SfmkYXxqfT+5Qlk3Ywi4iVxtdVnNiZvZ7VDiBzLTVWNgq+1Bj50/6rFKmi+WVZTlRF+MBJCeZw+jLZ3NZ52k4LEMoZ2mOt3sVqUqd0CNUKRJWp1/h4GDqBM8ZX9SuPdGj23LF+5UDF/OZBeks4COYmWT6d4HPMUitAOHbFUavaDOUk04O/J8/FVgrTDjxHKxHF4P5d5ftXuhC5PSpFrcmlBTygkfioEZqdVfgiPFpKgARLx1iwcNsG00kJ0hlqsqOfb/d4BY3D18TCFKlWcYmQKBgQDwEpaiTP3a5LuiayiyEbZhiHcDRUKMHRoz6ts2XfgK/6toct45LwEN7HX/xpYvF7AFPUBhtRWovu2aQwkXeZB4MGCPMJfAHIi7z+X7bJlCHakmpU8DngWaC+C72kb5XiBh2tl5cvF99zIhlzkBmw78nkqU1M7kuVXjQeYMxZv84wKBgQC1gPVR0WBT4mA5JmVkfyOdeMu0UpC+XvwsiI29b+NTIulUAHpY3ivIyDUJoI3JDsLOX7VUYyhqN+bJ9hmwmScaqYCT2R92h5LT/949xu8bt4OOXwY+FiRB3csyu91BLEUynzpPjGUF4CH/zfk+e62VlZ6Yrzzgd9RrZdE/rOR5zwKBgQCeiqgP5uh+di+zwzDM6AWZw5VVA5g/D7kOMDs0XDpCiTWZdMJs4S3BFDeZAnyL/QixbRHndL8pAW3IQhzu88kElm4uIdkVdcKWxWUL9VwA3bWnX+Qeb20jnlR7ulrEs/SOqwiTu+TfWzAwHr324X+0NJTsVN2NDxg5THuwU5AAIQKBgAY2+C9o/+dfZPQQAIDEaa/GpxLxkMsz7WaI9nF6F0qNc3fQ3F+Wm+EwGcDOoowz2S+/zzGog4W/jEN2DcMiO1iKXUCyuoUQd1KS/EUZPq6wRezmDAysLWmj8oU2MYk9vtDQ6uo2YG8nEYL0xogBLBxnFxsbRPZapAdZYSTRArG5AoGAPJq08rzNF1q4hL9nLWpvn8/gUzLlrWHzLrp04PbuzF2W2tlHOyavnsFEUbAhvEW9CVDIZ5V8mEAJSBetkJ3p/iiKdfC1ms8Zqkk8Iv/6E2WtxPrgYGLlkLHqkPTyaK38w/+tBjcbcWyjdGCgbCEBT6AlhCUgBoPa9Zi/h4UJPyM=";

	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	protected static final String APP_ID = "10000000000000002710";
	
	public static void main(String[] args) throws Exception{
		BamBamapApplyoutdataApplyoutdataTestV1 a=new BamBamapApplyoutdataApplyoutdataTestV1();
		a.test_cop();
	}

	public void test_cop() throws IcbcApiException {

		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID,MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);

		BamBamapApplyoutdataApplyoutdataRequestV1 request = new BamBamapApplyoutdataApplyoutdataRequestV1();
		request.setServiceUrl("http://122.19.61.228:8081/api/bam/bamap/applyoutdata/V1/applyoutdata");

		BamBamapApplyoutdataApplyoutdataBizV1 bizContent = new BamBamapApplyoutdataApplyoutdataBizV1();
		bizContent.setCompanycode("JDJR");// ��˾����
		bizContent.setSerialnum("1234567890123456789012345");// ��ˮ��
		bizContent.setData1("1");// �ⲿ�ֶ�1
		bizContent.setData2("1");// �ⲿ�ֶ�2
		bizContent.setData3("1");// �ⲿ�ֶ�3
		bizContent.setData4("1");// �ⲿ�ֶ�4
		bizContent.setData5("1");// �ⲿ�ֶ�5
		bizContent.setData6("1");// �ⲿ�ֶ�6
		bizContent.setData7("1");// �ⲿ�ֶ�7
		bizContent.setData8("1");// �ⲿ�ֶ�8
		bizContent.setData9("1");// �ⲿ�ֶ�9
		bizContent.setData10("1");// �ⲿ�ֶ�10
		bizContent.setData11("1");// �ⲿ�ֶ�11
		bizContent.setData12("1");// �ⲿ�ֶ�12
		bizContent.setData13("1");// �ⲿ�ֶ�13
		bizContent.setData14("1");// �ⲿ�ֶ�14
		bizContent.setData15("1");// �ⲿ�ֶ�15
		bizContent.setData16("1");// �ⲿ�ֶ�16
		bizContent.setData17("1");// �ⲿ�ֶ�17
		bizContent.setData18("1");// �ⲿ�ֶ�18
		bizContent.setData19("1");// �ⲿ�ֶ�19
		bizContent.setData20("1");// �ⲿ�ֶ�20
		bizContent.setData21("1");// �ⲿ�ֶ�21
		bizContent.setData22("1");// �ⲿ�ֶ�22
		bizContent.setData23("1");// �ⲿ�ֶ�23
		bizContent.setData24("1");// �ⲿ�ֶ�24
		bizContent.setData25("1");// �ⲿ�ֶ�25
		bizContent.setData26("1");// �ⲿ�ֶ�26
		bizContent.setData27("1");// �ⲿ�ֶ�27
		bizContent.setData28("1");// �ⲿ�ֶ�28
		bizContent.setData29("1");// �ⲿ�ֶ�29
		bizContent.setData30("1");// �ⲿ�ֶ�30
		bizContent.setData31("JD123445232342");// �ⲿ�ֶ�31
		bizContent.setData32("1");// �ⲿ�ֶ�32
		bizContent.setData33("1");// �ⲿ�ֶ�33
		bizContent.setData34("50");// �ⲿ�ֶ�34
		bizContent.setData35("1");// �ⲿ�ֶ�35
		bizContent.setData36("1");// �ⲿ�ֶ�36
		bizContent.setData37("2");// �ⲿ�ֶ�37
		bizContent.setData38("3");// �ⲿ�ֶ�38
		bizContent.setData39("4");// �ⲿ�ֶ�39
		bizContent.setData40("5");// �ⲿ�ֶ�40
		bizContent.setData41("6");// �ⲿ�ֶ�41
		bizContent.setData42("1");// �ⲿ�ֶ�42
		bizContent.setData43("1");// �ⲿ�ֶ�43
		bizContent.setData44("1");// �ⲿ�ֶ�44
		bizContent.setData45("1");// �ⲿ�ֶ�45
		bizContent.setData46("1");// �ⲿ�ֶ�46
		bizContent.setData47("2");// �ⲿ�ֶ�47
		bizContent.setData48("2");// �ⲿ�ֶ�48
		bizContent.setData49("2");// �ⲿ�ֶ�49
		bizContent.setData50("2");// �ⲿ�ֶ�50
		bizContent.setData51("2");// �ⲿ�ֶ�51
		bizContent.setData52("2");// �ⲿ�ֶ�52
		bizContent.setData53("2");// �ⲿ�ֶ�53
		bizContent.setData54("2");// �ⲿ�ֶ�54
		bizContent.setData55("2");// �ⲿ�ֶ�55
		bizContent.setData56("2");// �ⲿ�ֶ�56
		bizContent.setData57("2");// �ⲿ�ֶ�57
		bizContent.setData58("2");// �ⲿ�ֶ�58
		bizContent.setData59("2");// �ⲿ�ֶ�59
		bizContent.setData60("3");// �ⲿ�ֶ�60
		bizContent.setData61("4");// �ⲿ�ֶ�61
		bizContent.setData62("2");// �ⲿ�ֶ�62
		bizContent.setData63("1");// �ⲿ�ֶ�63
		bizContent.setData64("3");// �ⲿ�ֶ�64
		bizContent.setData65("3");// �ⲿ�ֶ�65
		bizContent.setData66("2");// �ⲿ�ֶ�66
		bizContent.setData67("4");// �ⲿ�ֶ�67
		bizContent.setData68("2");// �ⲿ�ֶ�68
		bizContent.setData69("1");// �ⲿ�ֶ�69
		bizContent.setData70("2");// �ⲿ�ֶ�70
		bizContent.setData71("2");// �ⲿ�ֶ�71
		bizContent.setData72("2");// �ⲿ�ֶ�72
		bizContent.setData73("2");// �ⲿ�ֶ�73
		bizContent.setData74("2");// �ⲿ�ֶ�74
		bizContent.setData75("2");// �ⲿ�ֶ�75
		bizContent.setData76("2");// �ⲿ�ֶ�76
		bizContent.setData77("2");// �ⲿ�ֶ�77
		bizContent.setData78("2");// �ⲿ�ֶ�78
		bizContent.setData79("2");// �ⲿ�ֶ�79
		bizContent.setData80("2");// �ⲿ�ֶ�80
		bizContent.setData81("2");// �ⲿ�ֶ�81
		bizContent.setData82("2");// �ⲿ�ֶ�82
		bizContent.setData83("2");// �ⲿ�ֶ�83
		bizContent.setData84("2");// �ⲿ�ֶ�84
		bizContent.setData85("3");// �ⲿ�ֶ�85
		bizContent.setData86("4");// �ⲿ�ֶ�86
		bizContent.setData87("2");// �ⲿ�ֶ�87
		bizContent.setData88("2");// �ⲿ�ֶ�88
		bizContent.setData89("1");// �ⲿ�ֶ�89
		bizContent.setData90("2");// �ⲿ�ֶ�90
		bizContent.setData91("2");// �ⲿ�ֶ�91
		bizContent.setData92("2");// �ⲿ�ֶ�92
		bizContent.setData93("2");// �ⲿ�ֶ�93
		bizContent.setData94("2");// �ⲿ�ֶ�94
		bizContent.setData95("2");// �ⲿ�ֶ�95
		bizContent.setData96("2");// �ⲿ�ֶ�96
		bizContent.setData97("2");// �ⲿ�ֶ�97
		bizContent.setData98("2");// �ⲿ�ֶ�98
		bizContent.setData99("2");// �ⲿ�ֶ�99
		bizContent.setData100("2");// �ⲿ�ֶ�100

		request.setBizContent(bizContent);
		BamBamapApplyoutdataApplyoutdataResponseV1 response = client.execute(request);
		

		System.out.println(JSONObject.toJSONString(response));
	}

}
