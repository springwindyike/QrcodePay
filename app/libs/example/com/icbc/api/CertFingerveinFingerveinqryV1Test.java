package com.icbc.api;

import java.util.Date;
import java.util.logging.Logger;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.CertFingerveinFingerveinqryRequestV1;
import com.icbc.api.request.CertFingerveinFingerveinqryRequestV1.CertFingerveinFingerveinqryRequestV1Biz;
import com.icbc.api.response.CertFingerveinFingerveinqryResponseV1;


public class CertFingerveinFingerveinqryV1Test {

	private static final String APP_ID = new String("1000s00000a000040a95737");
//	璋冪敤鏂圭閄1�7???
	protected static final String MY_PRIVATE_KEY = new String("MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDSVzg5SO6pIdKUH6nuVd6Oze029R7g+nCBBtm0VlyPpHEXAPbPe2JQgIIqwXtoRm6AkpixSzkp8x74A9H9FfdiKN+iTXjvdNEx+sl6BmnSm3yx6GxAeCtFPtokkM2eiO2zLMQu5J38cCN3z1TIhaVLdvBRe5juC6qrWSm9i2fvojoKCImpDZzSbZNwva8C6eK8xBqs7bvYHf2mAM+9p92rAODz98RzPZU6SkIz2zvOHL4BtHwgCAFHP8yA7palLBUdcdpJXORL1aPgO1NwE5beEqM4FOCqNdMbGP9Wl4GIcH/vlbcaKLTb3OfGTyr1r0RgOgNA3xXOAquwAFsPaAB7AgMBAAECggEAS3O4Gmx8GDWmyTW2imVJKabbAgzZ39BWjSI89ADKwUg2vQ6+el0DPmdqyhWPxC8Hsp1joq2eOtsYb9VG/Wdkz1RkLF9oE1WvOSOCJICqcz8NcvAx7Mpuky9hpx4+dDEgO1bCpSOjPIupXXAFNM0kJzbqLACPMk0DEuYwH+sjBIVhgEd07MwGAqYIkgrVtotHWtdaha8ogIZ/d6oiPGcpQ4H90khF4XCx/pqWkLs6SkWeypAVCPmDSiZPi49dudefoIx0y6ZbIbGnLXVYWrkAb8Al92VY/U+EI+2+TJXkOs60UdqffyLb2IB2xU1D1GMSv28fG+CxAEj9mLr9g3cm8QKBgQDwcxBGVZ7MARAIks59Jq5+MjDoOMO71UDScT99/4dyUbieodMwwiKHMI99oa01KpanS5T3cn+O5vJC4nguVHI6sxrEthuik4djDMsPwlijNxYQ0D4z6QsTLbThwNkil/zS0aXfyJwXg0kJYQpgyIG2LcBLeWuzamowjDZmfEos8wKBgQDf8ases7I2a4FKRRi4CTHSb7Euwwdm+W8FqFF8W66E9BV3lAMZ2llAKKvIOfSrxZN4nc7w1MtcC6ypA8HTHePnMp4zEtWCDeNf7MtbTA8XwOWp4JlfufEYmGDhANxtgHGYT+BimOHV7HPy5F60iDQyUUAeIQeMJnvw6YYiHAAgWQKBgQC7mytxlVBnH9Ugu1q9LzcqY4LhTZj6rzL6fz3o0z0dJ0IDE4QyIObL0EnE3ibEusv9D+3U+9Mm7m7LXOQkUeMmhaQ3I1eAi9cwo0S0sRBzmIFw8On3mrb3acwd8Ff6s9ehrc3cQyv29IpB9SMhzI/YUu4cdUphHIBqDJxNbmB5nQKBgQCeSeBtJBC8XIKXb32IX59ioeX4Kowp4fbyZcWrA9a4TRp7WhhTBr39FoJNVYG2hEG3iLvECHTxS6MwF+LBiagUO/gMG6zkb1Ke8+3NS1aDsKnkyEdAnVpnyxT3FTe5AofIY/UzW+KM5cQTFA5Ixtk2E64hXbFLA8ypPTa9F1OTiQKBgQDNewh/9tIXYybote82xxfelIrDPqNC4uBOJnCv6jgLPZ+TzVjCJ+jtlspBTHrlpYc2BJ0/JYJcqzlREbirbjEeOuaAtfG/gHb3iN+4kNj0I+W68g+uWoO2xMhiur0yoB7FGQrXUBQji7BHkzi3riq/cBztD4zUwIYyepPLZ7V6uA==");
//	API缃戝叧鍏挜
	protected static final String APIGW_PUBLIC_KEY = new String("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB");  
	//	API璇锋眰鍦板潃
	private static final String API_SERVICE_URL = new String("http://gw.open.icbc.com.cn/api");

	public static void main(String[] args) {
//		绛惧悕绫诲�1�7�涓篠HA256WithRSA鏃讹紝浼犲叆appid锛岀閽ュ拰缃戝叧鍏挜锛岀鍚嶇被鍨嬩娇鐢ㄥ畾鍊糏cbcConstants.SIGN_TYPE_RSA2锛屽叾浠栧弬鏁颁娇鐢ㄧ己鐪侊拄1�7�1�7?????
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		CertFingerveinFingerveinqryRequestV1 request = new CertFingerveinFingerveinqryRequestV1();
		request.setServiceUrl(API_SERVICE_URL + "/cert/fingervein/fingerveinqry/V1");
		CertFingerveinFingerveinqryRequestV1Biz bizContent = new CertFingerveinFingerveinqryRequestV1Biz();
		bizContent.setChannel("Test2");
		bizContent.setTrCode("BAS201803171sdajkf421313");
		bizContent.setAppName("F-TEST");
		bizContent.setAppVersion("");
		bizContent.setAppInfo("宸ラ摱e鍔炲叄1�7");
		bizContent.setTrxZone("1001");
		bizContent.setProgramName("queryfingervein");
		bizContent.setUserId("11");
		request.setBizContent(bizContent);

//		log.info(client.buildPostForm(request)); 
		Logger log = Logger.getLogger(CertFingerveinFingerveinqryV1Test.class.getName());
		CertFingerveinFingerveinqryResponseV1 response = new CertFingerveinFingerveinqryResponseV1();
		try {
			response = client.execute(request, "" + new Date().getTime());
			//杈撳嚭api杩斿洖閫氳鍄1�7?
			log.info("response.toString()"+response.toString());
			log.info("response.return_code: " + response.getReturn_code());
			log.info("response.return_msg: " + response.getReturn_msg());
			log.info("response.result: " + response.getResult());
			log.info("response.exMsg: " + response.getExMsg());
			log.info("response.exCode: " + response.getExCode());
			log.info("response.list: " + response.getList());

		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}
	
	public static String getTrxCode() {
		String timeStr = "" + new Date().getTime();
		String retStr = "";
		retStr = timeStr + timeStr + timeStr;
		
		retStr = retStr.substring(retStr.length() - 36);
		Logger log = Logger.getLogger(CertFingerveinFingerveinqryV1Test.class.getName());
		log.info("trcode:"+retStr);
		return retStr;
	}

}
