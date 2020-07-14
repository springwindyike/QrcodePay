package com.icbc.api;

import java.io.File;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.MallB2bCporderDeliverPushRequestV1;
import com.icbc.api.request.MallB2bCporderDeliverPushRequestV1.MallB2bCporderDeliverPushRequestV1Biz;
import com.icbc.api.request.MallB2bCporderDeliverPushRequestV1.MallB2bCporderDeliverPushRequestV1Biz.DeliverProdInfo;
import com.icbc.api.response.MallB2bCporderDeliverPushResponseV1;


public class MallB2bCporderDeliverPushTestV1 {

	protected static final String MY_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCa4ZHW0f6AocKGJuKnN0WrZe4x9FWRNKBadbPXu++uHwX6pVuhW0XN10k8Va6c4VOxLbNq5K1HqHU0lytvE8WITnTY1oHmcl3XW0+sFwmJeh6KgDth2Z/qeEcc2xKz4FKx5ByzU6Nr+TqBViBKM/Q3ZVbNG0+iRpxpO56lKmzIp/WAdd3WW5M9IzckqdNE+Ze7YzUHqxaLOZDlvRpFTcIyLGzPwlYy/zVWIpqteAjDpClRX29sNq9/EKzJXC3+wxBHYp2HmC5pO2YwBf0D39zbfIccGjZdSxg7NzqZBKQyuIN6ZeoyK3/7d2w3ucK4SQ16EH0ndduvPyy07+rMRquDAgMBAAECggEAJ2vsu/n9Rm5l3dF99UPbRtIN+8cOFISJoBy/ZtTeH7qjwfVeykY6ETeP23yPkjzEGZ/hP/7uoAOfuYAUvRQSPiyCD0MiEy7e9da3A71lXwmnRmd3NeO3kW2F5DFapFAfnEnMiFRsjyoDmzH5zAlHSuZPXqtp7Ir+esaDDdUrlTLKyFsrHTlSMAXHrtWyTxFNw4CjWcblXNlwwOIw/MObrK89Kan2eemA+HZ0dDkDp8yT8wvSh8BDaRE4EX2+xqhtsXk59sEc0n5BYcJXn+cy8BG1CCbl1uiWrKwZ4yP2YPKVVyRV8eKaVoBQrm3iA4Fyn6RmmHccDX2Ob2zOHbPwaQKBgQD8qENmm9u9ukkgn+1mynqu3zO3uzosz0Cm1ezONxVmJi3Dby0q2XHHRLM1DownQLq6KORIxbMO12kIDdTtF2Bv2bNrBC9DvLCEEDpu/kTZFe4qfsjZY0KvkRd8geGeWSvaIjWAWpItFdfntHphI4v5g5Kj/Cbt5yh3fidfnEuYDwKBgQCc7iTQscCu7Iu7UYCpPXerI2N0uozzEawAkhAUk9nY43sE5El6DNWH8X3ugPzq7+qmhRJihl2kSXorOJOyGH3sWcAGqvUV5YoSY8FIKNRCwDiKeRHbtqtOYwaUnp7k7qrQRKhY7TbTGkCr7Vyv0COTyPUPAf/O4Rg6dIkD1hAhTQKBgDWdMyhL/JZHOItexI7ieqQvIxdi+JZXqH1+udCMqdLSWTW2mtwT5mwFrQ2eN6mAt98XHFJA+Z01oskdvkhNhJ5XkRYtfiYenUp48x1ogY2bdL25x78xrA37eQNnwEvM2lxgk//XuFsu3nEBwFJqq6JYBD8eG9iyC8lHkO1eCkCLAoGAJQsZ6aFr6F6yBT+R7WEzFFTAL1ex2da8EU5pOVJFRCs+aMMyjPrmlLZukZQlH5gOfcw/sL4i8JrfmcA7LPkXEGmHKIvGWqraUsj1YQEySadyMU2u53xRJ6m8beybeVLVQ2BRlNw56s7xoSPgkyfAniv7nNVN+xmrTHEhvqQTHqkCgYEAvgDLJ2RbQCyY5oBWvjNorYeCzEzBaODjZx32oWjwebBXU60V3TDZ2G1PfGzuxcPeHwD4lPjvm9kqDSZazS1JJUICnVtONftq9Lo2ZKgEqjr308EE4Ibyk+X1HcOMyXrR37hbLaGnvPy69s1+fZEDdGeGNvdP7vpwLUyleKrsEEc=";

	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	protected static final String APP_ID = "10000000000000003939"; 
	
	
	private static Log log = LogFactory.getLog(MallB2bCporderDeliverPushTestV1.class);
	public static void main(String[] args) throws Exception{

	DefaultIcbcClient client = new DefaultIcbcClient(APP_ID,"RSA", MY_PRIVATE_KEY,"UTF-8", 
				"json",APIGW_PUBLIC_KEY,"AES","hdZdNozJr5oATedE9UmuSA==", "", "");
		MallB2bCporderDeliverPushRequestV1 request = new MallB2bCporderDeliverPushRequestV1();

		request.setServiceUrl("http://122.19.61.61:8081/api/mall/b2b/cporder/deliver/push/V1");
		MallB2bCporderDeliverPushRequestV1Biz biz = new MallB2bCporderDeliverPushRequestV1Biz();
		biz.setOrderId("202002210000005870");
		biz.setDeliverId("201802280000000012");
		biz.setExpCode("yuantong");
		biz.setExpId("521512012512084");
		biz.setVendorId("10001309");
		biz.setDeliverTime("20180228100444881");
		biz.setDeliverUser("chainnnn000000001");
		biz.setConsigneeProvince("大雨");
		biz.setConsigneeCity("潮州市");
		biz.setConsigneeCounty("潮安县");
		biz.setConsigneeDetailAddress("水水水水水水水水的发送的");
		biz.setConsigneeZip("819283");
		biz.setConsigneeName("大雨");
		biz.setConsigneeMobile("13783432344");
		biz.setConsigneeTel("");
		biz.setVendorDeliverStaffName("XXX");
		biz.setVendorDeliverStaffMoblie("18910719830");
		biz.setRemarks("已发货XXX");
		biz.setAttachment("address.xls");
		//byte[] byteArray = FileUtils.readFileToByteArray(new File("D:/address.xls"));
		//biz.setAttachmentData(new BASE64Encoder().encode(byteArray));
		
		List<DeliverProdInfo> prodList = new ArrayList<DeliverProdInfo>();
		DeliverProdInfo deliverProdInfo = new DeliverProdInfo();
		deliverProdInfo.setProdId("202002210000000601");
		deliverProdInfo.setVendorProdId("XXXXXX");
		deliverProdInfo.setQuantity(new BigDecimal("1"));
		prodList.add(deliverProdInfo);
		biz.setProdList(prodList);
		request.setBizContent(biz);

		MallB2bCporderDeliverPushResponseV1 response;
		try {
			log.info(JSONObject.toJSONString(biz));
			System.err.println("--------------------");
			response = (MallB2bCporderDeliverPushResponseV1) client.execute(request, System.currentTimeMillis()+"");
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

