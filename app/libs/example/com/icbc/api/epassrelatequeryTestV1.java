package com.icbc.api;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.response.epassrelatequeryResponseV1;
import com.icbc.api.response.epassrelatequeryResponseV1.PRIVATEResponseV1Message;
import com.icbc.api.response.epassrelatequeryResponseV1.appstatv10ResponseV1Message;
import com.icbc.api.IcbcConstants;
import com.icbc.api.request.epassrelatequeryRequestV1;
import com.icbc.api.request.epassrelatequeryRequestV1.epassrelatequeryRequestV1Biz;

public class epassrelatequeryTestV1 {

	//1、网关公钥
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
	
	//2、appid 通行证第三方测试1 (行外)
	protected static final String APP_ID = "10000000000000014035";

	//3、密钥对认证方式，公钥在API平台登记，此处为私钥 行外访问
	protected static final String MY_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCO/Q2D4B77lM9GbN5n7NTkqIHloL5RJh8hh4Hbt8dWGj19pTmtDucMn7alRQk99DHW230So/OgH6OiX5GVGNKfH6I9ONEuJ69Oq7lXg9KvUg4LrsI6HhiMdqVhUx0/5YXCaNBP3yj0GJH2VEHtD9iJkqbT5K42SM0alwEvqZ3GQ30ADFNT73xif+/qK/FHqM9CaS1m1EzgXhITeHZ1sgCoXWz3oJjtv5+K3XFXg44h3sVDwUKGMOMMg+EyZMU8pg+pDxoAnD9W3vKAhWN2myVedzP2Ua8xJMPQwB3IaBHhTtD07j7Lskg995D+3HLEOg4w2F3n/V9a0o2U6A/4r93bAgMBAAECggEALof88PBrRLWdai6dhbZVZX/Mnbxckq3ULaYaRTUeIk/xuMSe60lRORN0bX30zvt7iI7uubUu3+nL51gwWRO13uB9fGzT7bAuZWyOqQMV+cW7GmQpgp4uoO8vTGeuug9oIubW+1cEzcJ9JWsv9QRWFBbsQUJGyxWP4VpIoYkR9eWdARrnDN4Oc3tQo6Mn+cE6rykm7eLxtGq8BK5B+ktUYx12nEMtVwOvkNbdY+ryIa/Zqh8+vNj7MCEOZXDFMhNCEFH0SlNppcF6JN6tj47RIgumAH7hiAcVJREg3oz3ScI3QmDWG0wZfjDMNwlTzpRX7rLr9THRzxIGcikFz+p6wQKBgQDYK+wQsPsNUZ8ZYjSRcUJdrDuyJGEWe0AqOpJ8f4Q9jc/XIPmrgBbQ9lWwcT4NLzsQ4Ls0zCG/pPbikrJ2x5HjtjhhD6hqd6T5jK4RpokDdQU4LY3ib7H4aaLFr9/p7az2DVYfndWeuxxx4YblBcqZzPOy4KshdgCl7WyKj0iTewKBgQCpVVVfy8QB9YZjw/+jMMjX+OvCydDVSzhIxWOlVHN4e/a6UhNDrwS8O4G2hN7cUsa2/e5DpUvdKId0ZZXTjgE3ZJ7NcKA9MWOsjsLfUeip8y7Jeb8tmfw+yo+VMqQ/D9Wmd0mpIm6dsjfwsuRfvD+46wTjx7FrASmPi7yUrlYhIQKBgEsG44XfhyLWQ1vyA8C/CIOudYGcsr20xU5iydjAAUvD3nESFtV5PXIFLTRx+VFmJR/0f8URXF1BihaVR6+GEJJx+htl7dQV9oJOW1Pw8vjqMoeO+AGxNpm7QC1Qn2x3e2JiupN6mlvfIT49Qi5W1jyPL73T0FFqvUrZnqRwmoXlAoGAVOM4d1uZGTpScrUQ9GhCZzKcTfwKOsMIpkJ936XkdSP/3gvDKI0WnJ5gOnWFm4HLqHTH+xVkYKwuq4U5hOKNbY19ppOtYL/freOrgXR4ZKpKbCoiUuP89iVpsWu/tvVjL55hSO6/8UIklP+5SN0APN1kiCPVp0Tf5twwX4C+IMECgYEAzdo0jQjqz/ijnQDAFHw/pgAnbUIxp0nXnjoPjBRM9vonD0z/3BrvvRyldglo6urWRx1v+/ONkbXGSEpmWESOaRKRCiIZpcf294fAgKHDubMKpSJqu5WMfJx6Ffx5s+WmTHGcboAXEabMM87iE1nUF6eRnRTeT6SWtL5DKEgGYUs=";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//签名类型为SHA256WithRSA时，需传入appid，私钥和网关公钥，签名类型使用定值IcbcConstants.SIGN_TYPE_RSA2，其他参数使用缺省值
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);		
		
		epassrelatequeryRequestV1 request = new epassrelatequeryRequestV1();
		
		//4、根据测试环境和生产环境替换相应ip和端口
		//行外流程
		request.setServiceUrl("http://122.64.109.110:8081/api/cert/epass/thirdparty/epassrelatequery/V1");
		
		//5、请对照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值			
		epassrelatequeryRequestV1Biz bizContent = new epassrelatequeryRequestV1Biz();
		
//		{"mesgpriority":"1","mesgstat":"9","mesgcharset":"UTF-8","appsenderid":"F-WAPB","msg_id":"82.201.173.60.20181011154033.2","veisionid":"01",
//		 "appreceiverid":"F-EPASS","structtype":"JSON"
//		 "ChanCommV10":{"OAPP":"F-WAPB","CHANTYPE":"303"},
//		 "InputV10":{"MOBILE":"13090909090","CISCODE":"020006202558334","ALIASNAME":"13090909090","ISLOGINFLAG":"0","EMAIL":"","ISCREATEUSERID":"0"},
//		 "InfoCommV10":{"TRXTYPE":"6","TRXCODE":"20700","WDFLAG":"1","WORKTIME":"163525","WORKDATE":"2018-10-11"},
//		}
		bizContent.setMesgpriority("1");
		bizContent.setMesgstat("9");
		bizContent.setMesgcharset("UTF-8");
		bizContent.setAppsenderid("F-WAPB");
		bizContent.setMsg_id("82.201.173.60.20181011154033.2");
		bizContent.setVersionid("01");
		bizContent.setAppreceiverid("F-EPASS");
		bizContent.setStructtype("JSON");
		
		epassrelatequeryRequestV1.ChanCommV10RequestV1Message ChanCommV10 = new epassrelatequeryRequestV1.ChanCommV10RequestV1Message();
		ChanCommV10.setOAPP("F-WAPB");
		ChanCommV10.setCHANTYPE("303");
		ChanCommV10.setSERIALNO("33245f29033");
		bizContent.setChanCommV10(ChanCommV10);

		epassrelatequeryRequestV1.InfoCommV10RequestV1Message InfoCommV10 = new epassrelatequeryRequestV1.InfoCommV10RequestV1Message();
		InfoCommV10.setTRXTYPE("6");
		InfoCommV10.setTRXCODE("20700");
		InfoCommV10.setWDFLAG("1");
		InfoCommV10.setWORKTIME("163525");
		InfoCommV10.setWORKDATE("2018-10-11");
		bizContent.setInfoCommV10(InfoCommV10);
		
		epassrelatequeryRequestV1.InputV10RequestV1Message InputV10 = new epassrelatequeryRequestV1.InputV10RequestV1Message();
		InputV10.setCHANNELCODE("302");
		InputV10.setSIGNDATATOAPP("m%2FDimxaj0B%2BTTUYIZLojleL%2FxqeeR1%2FHX1C5jcGtKS2Eji%2FPHxxsmc2GBv5KoT8%2BcKxHMYDFlqifQvniQQ5NpY830NZCsp6WVooMpK9tlf%2BGjWeIS%2FoGWt47%2BA5Hx035AOIuSmZiR%2Fz%2BFYQOptvdDGccTHiKjBGdif7BwxuL9%2Bw%3D");
		InputV10.setENCRYPTEDDATATOAPP("IMR3ob1RHXxa+WpPYBKcK0DdQ9WkPBXnB3NXIf7Vd5G3dDXhtI2FbQBaCYauYroerwu8AYK+3ibGUpWDs0GPXFzGLoAnmkZn+J8h6SK6SL4f0HOMONpYqrixy281d+69civoD9bLzMNbE1QjwhKOsTDr659CAyHXfVbP/8gYsduZiIZ6gD7Wa59PwXDrndWNqzxGoBQlxdvJKg6VgE+x1tWRbc9c20Pf2tWYfR83Z6NlG8d54Trnk6TOCyV2WwCtqINrPMdU2Fo=");
		bizContent.setInputV10(InputV10);
		
		request.setBizContent(bizContent);
		//建立返回项
		epassrelatequeryResponseV1 response = new epassrelatequeryResponseV1();
		try {
			response = client.execute(request);
			//System.out.println(JSONObject.toJSONString(response));
			epassrelatequeryResponseV1.appstatv10ResponseV1Message appstatv10 = response.getAppstatv10();
			epassrelatequeryResponseV1.PRIVATEResponseV1Message privatev10 = response.getPrivatev10();	
			System.out.println("return_code:"+ appstatv10.getReturn_code());
		    System.out.println("transok:"+ appstatv10.getTransok());
			System.out.println("return_msg:"+ appstatv10.getReturn_msg());		
			
			System.out.println("USERID:"+ privatev10.getUSERID());	
			System.out.println("ISRELATE:"+ privatev10.getISRELATE());
			System.out.println("MOBILE:"+ privatev10.getMOBILE());
			
			System.out.println("OPENID:"+ privatev10.getOPENID());
			System.out.println("CISCODE:"+ privatev10.getCISCODE());
			System.out.println("USERTYPEFLAG:"+ privatev10.getUSERTYPEFLAG());
			System.out.println("ISREGIST:"+ privatev10.getISREGIST());
			System.out.println("THIRD_USERTYEP:"+ privatev10.getTHIRD_USERTYEP());
			System.out.println("CHANNELIDENTIFY_FHH:"+ privatev10.getCHANNELIDENTIFY_FHH());
			
		
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}

	}

}
