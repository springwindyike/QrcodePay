package com.icbc.api;

import java.net.URLDecoder;

import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.MallB2bCrborderpayVendorsynstatusqryRequestV1;
import com.icbc.api.request.MallB2bCrborderpayVendorsynstatusqryRequestV1.ExportByInputtingQueryRequestV1Biz;
import com.icbc.api.response.MallB2bCrborderpayVendorsynstatusqryResponseV1;

// e链通建档状态查询接口
public class MallB2bCrborderpayVendorsynstatusqryTestV1 {

	protected static final String	MY_PRIVATE_KEY		= "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCXY3LeSkYCtpk2mmyeLKYA2OrFyp36vW7OOkfU0w6OkAnGnOFY5qn92ig49Psn2sw96yRbdbq2466SM9Vy13RCYLg2WnGDNmx2+QZr1j5gSmCusk76fVvFv5c0/WCdg/9IQt/NPLR3Pg9vyVGTrw1zZwP5MRtizOTTBAMMgfbPOD8JrS2+my1CwX7P9vrBxvQZMLGMHJsMneaAuoG9Kfo7UpEUnIBiKLq/9DbDMQQ1fSS0l0xA64IJLuLG+nwiwzgyWX7AblQtCtdPTHmBCPk4o8Y5hpNAyQ4dtcWk1F90i/YxexyDwbDBnPJ9uP+HFp895Je8XoPy3VqMEQToEdF/AgMBAAECggEAYoeJVYAFvPJXGaC8HN52VIrZkk3jMDRmj7aC1dNf4A2DL08fo5rM/LkmAJwBctkGoS4Pha9EDJB3KBSwUYRE2IbWnhmTU5DyWySMt1bDVixSbKEEoidAuZ2OriBS53HnjoJn4s4lro4nwdvHSlVebcOYZHE/n7g3Hde4nEVh+09hb6JXXFC3EK/7p80zt0wjp1yv9/iLPgXSvyXRW9qM8ED5JbDpsO4nDvF5ZwXWjQ3iauQjsKjVgYcNg31PNq6tl39I3sivx2AP8IYoYz/J5IukKrc6Yeb9KLyjrhMzeoJr3gzpp5T/VPb2vgeH+z8ytU91inMiS7WqmD+xNq33QQKBgQDSph1K/fq8+ZyckERklNudVdtsIKHtNL5kFvPFZUSF94oUgg6y6IkWO1wtDUIUAxi9B88/l34TBeYqmvCfDe/MN7npAjNbDhh6m6VyPZqgUkCdLCUqPpoI3vEP7N8iLPCXZoVs6nvrOqh0tbsLUplQpDc3KOzQqYhhGGyoqZNfUQKBgQC3+zRUH0Y8TUdtkD+VWB74+FzfmgalNZQZMjVbhkpmPWLCj69IxtHIFwWtKQQdeAvYii8PgHrstkQOSEcpXTItIJXcHpwRCypyZpO1i/ScvflhdHJdWKYsaho7k/peGWTP09mD7UHv3SzEC0taU6GzvUE7ZsZbZCwQf8OPkbIPzwKBgQCROH4HXjMHJtpmQTs1UD5bKH6d+51Gh88d94jVNCxaYz5pRwRVKOShVAkG8hX07/GVGBYz0//Ro4Z7Jtft/1CrLFvZnG/FPWF43Wbg7EF2d14ePPneNsxAg1oTTYzC5dJzvfUMEled4pGR7Ftnwej6ZEvAllE0xTvFHG6ElGuKEQKBgDuIBzipHfrpLpGfOVPDvdHl23dmyXuvyIoWmvlQjMZkWo6GG7u6yaqq+GU9fl1iuMKKhAvKEPyDRaYxcQVLaK79ekBNj0ZcjJGT63u1G6OUPRtxqIfX5X09n9tjWIIWSW6OKDXuEYXh1VhiJzHFGe+k73SfHtP3p+J21PqhtDI1AoGBAMQZUXTDb6wSA76b2Lc5/pqYYvoO1GQYJvWm8o4ZTlno7iBdFTAOEz7ekKFmyuW/NiZq58hOA5PQevRmXKggLix5qSlvjLJc8y93gC6kqW/Znuaf2fYHR7fl7jR1neltETtEWvrW0Ei7YugeBb4sim1lagbPLI87Ab8hwSJahwHh";
	protected static final String	APIGW_PUBLIC_KEY	= "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
	protected static final String	APP_ID				= "10000000000000654554";
	protected static final String	ENCRYPT_KEY			= "mQbJILokBccRHUkS+XBk7A==";
	
	public static void main(String[] args) {
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID,"RSA", MY_PRIVATE_KEY,"UTF-8", 
				"json",APIGW_PUBLIC_KEY,"AES",ENCRYPT_KEY, "", "");
		
		MallB2bCrborderpayVendorsynstatusqryRequestV1 request = new MallB2bCrborderpayVendorsynstatusqryRequestV1();
//        request.setServiceUrl("http://gw.dccnet.com.cn:8085/api/mall/b2b/crborderpay/vendorsynstatusqry/V1");
		request.setServiceUrl("http://122.64.61.115:8081/api/mall/b2b/crborderpay/vendorsynstatusqry/V1");
		ExportByInputtingQueryRequestV1Biz bizContent = new ExportByInputtingQueryRequestV1Biz();
		bizContent.setParentVendorId("10002778");
		bizContent.setVendorId("9B0001926");
		request.setBizContent(bizContent);
		
		MallB2bCrborderpayVendorsynstatusqryResponseV1 response = null;
		try {
			System.out.println(JSONObject.toJSONString(bizContent));
			System.err.println("--------------------");
			response = client.execute(request, System.currentTimeMillis()+"");
			System.out.println(JSONObject.toJSONString(response));
			String resdata = response.getResdata();
			if(resdata != null && resdata.length() >0){
				resdata = URLDecoder.decode(resdata,"UTF-8");
				System.out.println("resdata = " + resdata);
			}else{
				System.out.println("resdata is null");
			}
			if (response.isSuccess()) {
				// 业务成功处理
				System.out.println(response.getReturnCode());
			} else {
				// 失败
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
