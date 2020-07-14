package com.icbc.api;

import java.net.URLDecoder;
import java.util.Map;

import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.MallB2bCporderListQueryRequestV1;
import com.icbc.api.request.MallB2bCporderListQueryRequestV1.MallB2bCporderListQueryRequestV1Biz;
import com.icbc.api.response.MallB2bCporderListQueryResponseV1;

public class MallB2bCporderListQueryTestV1 {

	protected static final String MY_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCa4ZHW0f6AocKGJuKnN0WrZe4x9FWRNKBadbPXu++uHwX6pVuhW0XN10k8Va6c4VOxLbNq5K1HqHU0lytvE8WITnTY1oHmcl3XW0+sFwmJeh6KgDth2Z/qeEcc2xKz4FKx5ByzU6Nr+TqBViBKM/Q3ZVbNG0+iRpxpO56lKmzIp/WAdd3WW5M9IzckqdNE+Ze7YzUHqxaLOZDlvRpFTcIyLGzPwlYy/zVWIpqteAjDpClRX29sNq9/EKzJXC3+wxBHYp2HmC5pO2YwBf0D39zbfIccGjZdSxg7NzqZBKQyuIN6ZeoyK3/7d2w3ucK4SQ16EH0ndduvPyy07+rMRquDAgMBAAECggEAJ2vsu/n9Rm5l3dF99UPbRtIN+8cOFISJoBy/ZtTeH7qjwfVeykY6ETeP23yPkjzEGZ/hP/7uoAOfuYAUvRQSPiyCD0MiEy7e9da3A71lXwmnRmd3NeO3kW2F5DFapFAfnEnMiFRsjyoDmzH5zAlHSuZPXqtp7Ir+esaDDdUrlTLKyFsrHTlSMAXHrtWyTxFNw4CjWcblXNlwwOIw/MObrK89Kan2eemA+HZ0dDkDp8yT8wvSh8BDaRE4EX2+xqhtsXk59sEc0n5BYcJXn+cy8BG1CCbl1uiWrKwZ4yP2YPKVVyRV8eKaVoBQrm3iA4Fyn6RmmHccDX2Ob2zOHbPwaQKBgQD8qENmm9u9ukkgn+1mynqu3zO3uzosz0Cm1ezONxVmJi3Dby0q2XHHRLM1DownQLq6KORIxbMO12kIDdTtF2Bv2bNrBC9DvLCEEDpu/kTZFe4qfsjZY0KvkRd8geGeWSvaIjWAWpItFdfntHphI4v5g5Kj/Cbt5yh3fidfnEuYDwKBgQCc7iTQscCu7Iu7UYCpPXerI2N0uozzEawAkhAUk9nY43sE5El6DNWH8X3ugPzq7+qmhRJihl2kSXorOJOyGH3sWcAGqvUV5YoSY8FIKNRCwDiKeRHbtqtOYwaUnp7k7qrQRKhY7TbTGkCr7Vyv0COTyPUPAf/O4Rg6dIkD1hAhTQKBgDWdMyhL/JZHOItexI7ieqQvIxdi+JZXqH1+udCMqdLSWTW2mtwT5mwFrQ2eN6mAt98XHFJA+Z01oskdvkhNhJ5XkRYtfiYenUp48x1ogY2bdL25x78xrA37eQNnwEvM2lxgk//XuFsu3nEBwFJqq6JYBD8eG9iyC8lHkO1eCkCLAoGAJQsZ6aFr6F6yBT+R7WEzFFTAL1ex2da8EU5pOVJFRCs+aMMyjPrmlLZukZQlH5gOfcw/sL4i8JrfmcA7LPkXEGmHKIvGWqraUsj1YQEySadyMU2u53xRJ6m8beybeVLVQ2BRlNw56s7xoSPgkyfAniv7nNVN+xmrTHEhvqQTHqkCgYEAvgDLJ2RbQCyY5oBWvjNorYeCzEzBaODjZx32oWjwebBXU60V3TDZ2G1PfGzuxcPeHwD4lPjvm9kqDSZazS1JJUICnVtONftq9Lo2ZKgEqjr308EE4Ibyk+X1HcOMyXrR37hbLaGnvPy69s1+fZEDdGeGNvdP7vpwLUyleKrsEEc=";

	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	protected static final String APP_ID = "10000000000000003939";//4月功能

	public static void main(String[] args) throws Exception{

	DefaultIcbcClient client = new DefaultIcbcClient(APP_ID,"RSA", MY_PRIVATE_KEY,"UTF-8", 
				"json",APIGW_PUBLIC_KEY,"AES","hdZdNozJr5oATedE9UmuSA==", "", "");
		MallB2bCporderListQueryRequestV1 request = new MallB2bCporderListQueryRequestV1();

		request.setServiceUrl("http://122.19.61.61:8081/api/mall/b2b/cporder/list/query/V1");
		MallB2bCporderListQueryRequestV1Biz biz = new MallB2bCporderListQueryRequestV1Biz();
		biz.setVendorId("10001309");
		biz.setQueryType("1");
		biz.setQueryBeginDate("20200101");
		biz.setQueryEndDate("20201231");
		biz.setStartNum(0);
		biz.setQueryStatusType("00");
		request.setBizContent(biz);

		MallB2bCporderListQueryResponseV1 response;
		try {
			System.out.println(JSONObject.toJSON(request));
			response = (MallB2bCporderListQueryResponseV1) client.execute(request, System.currentTimeMillis()+"");
			String resdata = response.getResdata();
			System.out.println(JSONObject.toJSONString(response));
			if(resdata != null && resdata.length() >0){
				resdata = URLDecoder.decode(resdata,"UTF-8");
				Map<String,Object> mapJson = JSONObject.parseObject(resdata);
				System.out.println("resdata = " + mapJson);
			}else{
				System.out.println("resdata is null");
			}
			if (response.isSuccess()) {
				// 业务成功处理
				System.out.println(response.getReturnCode());
			} else {
				// 失败
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}

	}
	
}

