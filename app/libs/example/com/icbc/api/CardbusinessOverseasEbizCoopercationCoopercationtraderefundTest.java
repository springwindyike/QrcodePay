package com.icbc.api;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.CardbusinessOverseasEbizCoopercationCoopercationtraderefundRequestV1;
import com.icbc.api.request.CardbusinessOverseasEbizCoopercationCoopercationtraderefundRequestV1.CardbusinessOverseasEbizCoopercationCoopercationtraderefundRequestV1Biz;
import com.icbc.api.response.CardbusinessOverseasEbizCoopercationCoopercationtraderefundResponseV1;

public class CardbusinessOverseasEbizCoopercationCoopercationtraderefundTest {

	//证书私钥  
	protected static final String MY_PRIVATE_KEY ="";  
	//网关公钥  
	protected static final String APIGW_PUBLIC_KEY = "";  

	protected static final String APP_ID = "Oikeclo001";  

	//证书公钥  
	protected static final  String MY_PUB_KEY = "";  

//	@Test
	public static void test_cop() {
		
		// 构造client对象  

		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY,MY_PUB_KEY);

		CardbusinessOverseasEbizCoopercationCoopercationtraderefundRequestV1 request = new CardbusinessOverseasEbizCoopercationCoopercationtraderefundRequestV1();		
		request.setServiceUrl("http://ip:port/api/cardbusiness/overseas/ebiz/coopercation/coopercationtraderefund/V1");
		CardbusinessOverseasEbizCoopercationCoopercationtraderefundRequestV1Biz bizContent = new CardbusinessOverseasEbizCoopercationCoopercationtraderefundRequestV1Biz();
		bizContent.setOrderNo("334957328573");
		bizContent.setRefundAmt("200");
		bizContent.setAreaCode("0119");
		bizContent.setShopCode("011944444");
		
		request.setBizContent(bizContent);

		CardbusinessOverseasEbizCoopercationCoopercationtraderefundResponseV1 response;
		try {
			response = client.execute(request, "msgId");
			if (response.isSuccess() ) {
				 // 业务成功处理 
				  
			} else {
				 // 失败 
				 
			}		
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * TODO 方法的描述：。
	 * 
	 * <pre>
	 * 
	 * </pre>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		test_cop();

	}
}
