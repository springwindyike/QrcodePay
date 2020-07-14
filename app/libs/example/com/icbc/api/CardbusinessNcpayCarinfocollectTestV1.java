package com.icbc.api;

import com.icbc.api.request.CardbusinessNcpayCarinfocollectRequestV1;
import com.icbc.api.request.CardbusinessNcpayCarinfocollectRequestV1.CardbusinessNcpayCarinfocollectRequestV1Biz;
import com.icbc.api.response.CardbusinessNcpayCarinfocollectResponseV1;

import java.util.logging.Logger;


public class CardbusinessNcpayCarinfocollectTestV1 {
	public static void main(String[] args) throws IcbcApiException {

		//1、API平台申请的APPID
		
		String APP_ID = "1000000000BCSS0004097056";

		//2、网关公钥
		String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

		//3、密钥对认证方式，公钥在API平台登记，此处为私钥
		String MY_PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCpx55HRWBecD9PDGnjgG14gySvwgsWahRXl+6wvlsC/oT1Gr4vQyVIQ6JJDkWFopyKrbcfSm5YPanGLiM2iBZ4/Vsa5mUGmr7Ne4DAD2zEFhDPlFrMuyP7h5t89qtnL9Q4vgz89W35qDAiJ3lLjutRgk2LmyvYFpgTazdH/34cIkBIfhlTLLUGKEXL2fEc0A5oKkLPHtu1/YF6u8rlsu7Xe6WLOBeHk9KqBR7BH+5ctL75oZBBRbwKauFPRWE/tQcjXv+qxJJVq6TfbQCRPKpzdmt/YcsiWnJwL1CEeXndXsY6mX14fSH1jHmU2cnkjccudA/bBJAKPSzFfQ1FCp2NAgMBAAECggEBAKiAqiJqRJ72IJ8/3sggaoW1AvA9UevJFK9q50cbZhCusx7gj+kwZww1tBd1xqI/JcatapXvtVx2ts0udVxl7IfgTE+CYroPU1d1P+9eX8CtdbnPr96JzciSaku4NZ2P5rz6QsG8hI3H0x3St5u6GOsou/XW58jrg7uiKZeXh347DwtxFJEhgjZBGUDw1+GOWapz1WFXfkjxEiikYTW6YSLYGHR765YXG5wpanIqknz1iTBkXxedlzc4WbIfJMYNlilrYGUhEwaMuCHHz6HIVqSRQxmmJT+ZwZ4aCFeZnvBKe7dDRrhisqigJh0QqqnwO0aIVc0fBdKBFbb0sxrkaYECgYEA7ML1DPoGGMrpWOUiFzwpOkg3ZpL/9+KyReTzxAY/eMV9C4dUMXSE0yh46YueeYiqlinj88Ob7Q2AmzHh4M+J9BbmyR8pV8uM/W7X7Rzs9YkgcB2dQcU7WBfSaErwvIVTR62ABLoCgv9q74sWdPOTGxfIGQafzJNBEKmUdJxJx9kCgYEAt5NTbUk99cONlI7k98Ow8FVcAnx1qvmZfuVukRb6lufgbLhCKy3bz23hYkyUyVLl8Q6o+Vgg/TTuXQ8DCCPF5F/Cv/s8S+/ulF1sT7J/P9x3a/tCSCICfiRNM5jByG9zDZI4UgxzDV8AR2BvH19sCL355ENA/8ljkrvZkbfSRtUCgYEA5rMVOp7JoBDgDWm/rSpG9e52ZTGpz24KzgZI7OI1qMWukbQ8+q+R2XtfThpowf3EUuvgnZ8l6Xe1sAOMGJXB06EZIjKGA3FpIW2HYxlDYAFNJVIF8JdxuuYDdPJI3zl+q6JI0tI5LlIZbe52ZGEPH2At7wzAWwPFa6oB6Rp83gkCgYBo6kMgz14g6j0tLSmAzI+AG1i1dwoMyA/IrTkupLJcsnLZz8jJQrFAcG0CMABMuxr9VMKPlqVr8OdVufGiokdECNKVw/Em+R4iHu568em1xrtdtECiVwWTsA2LMn91nPRlSi7z/Xd3qdbP9DYt+OwWZvS9Vw574U4OG1vx4tvDbQKBgQCpIFfrj19CQU/+oWwtkdfdK/E/hMfK1ESFHfWAX+Pq4pIyEIz/Kb3IweKy9uEGbE/zNfi3m5ClCf9H3B4BYk5EKbSk3lVDKg3F4U+1ETNE4fwvKdBfCgpJMi12xdTtkuhfrVUjhaw7T0pFc8fJkP5P5Q+elY6iwYgn+JPm+2yb8A==";

		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);

		CardbusinessNcpayCarinfocollectRequestV1 request = new CardbusinessNcpayCarinfocollectRequestV1();

		//4、API网关地址：根据测试环境和生产环境替换相应IP和端口
		//request.setServiceUrl("http://122.64.61.111:8081/api/cardbusiness/ncpay/carinfocollect/V1");//功能内网
		//request.setServiceUrl("http://122.64.61.194:8081/api/cardbusiness/ncpay/carinfocollect/V1");//功能内网
		//request.setServiceUrl("http://122.64.61.81:8081/api/cardbusiness/ncpay/carinfocollect/V1");//功能内网
		request.setServiceUrl("http://gw.dccnet.com.cn:8088/api/cardbusiness/ncpay/carinfocollect/V1");//功能外网

		//5、请参照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值
		CardbusinessNcpayCarinfocollectRequestV1Biz bizContent = new CardbusinessNcpayCarinfocollectRequestV1Biz();

		bizContent.setVehicleId("1001130BCSS101123450");//车辆唯一标识(50)
		bizContent.setPlateNum("京R00011");//车牌号(20)粤A88888
		bizContent.setObuId("45002233BCSS221155");//obu序号编号(20)
		bizContent.setPlateColor("0");//车牌颜色(3)
		bizContent.setVehicleType("1");//车型(8)
		bizContent.setEngineNum("1-a-2-b-3-c-4-d-5-e");//发动机号(50)
		bizContent.setEquipmentNum("123");//设备识别器ID(50)
		bizContent.setMergroupNo("95743821BCSS2242");//商圈编号(13)
		bizContent.setMerchantNo("0200010BCSS20893");//商户编号(12)
		bizContent.setSiteNo("6666");//站点编号(50)
		bizContent.setSceneType("1");//场景类型(3)(1-自助加油；2-无感加油；3-智慧停车)
		bizContent.setInOutFlag("1");//出入场标识(3)(1-入场；2-出场)
		bizContent.setPlateIdentifyType(3);//车辆识别方式，默认为3-ETC (1-电子标签 2-车牌 3-ETC 4-人脸 5-EID)

		// 非必输
		bizContent.setSiteName("test");//站点名称
		bizContent.setMocIssuerid("b9f3d6dd52010001");//发行方标识
		bizContent.setContractVersion(1);//合同版本
		bizContent.setContractType(2);//协约类型
		bizContent.setContractSerno("1205001");//合同序列号
		bizContent.setContractSignDate("20191205");//合同签署日期
		bizContent.setContractExpiredDate("20201209");//合同到期日期
		bizContent.setTamperedStatus(1);//拆卸状态
		bizContent.setCoprFlag(1);//用户类型
		bizContent.setCardHolderIdentity("0");//持卡人身份标识
		bizContent.setCardHolderName("张三");//持卡人姓名
		bizContent.setCardHolderIdtype(0);//持卡人证件类型
		bizContent.setCardHolderIdno("4401101995BCSS06062222");//持卡人证件号码
		bizContent.setCardType(1);//卡片类型
		bizContent.setCardVersion("1");//卡片版本号
		bizContent.setCardNetNo("5201");//卡片网络编号
		bizContent.setUserCardNo("A0001");//用户卡内部编号
		bizContent.setStartDate("20191205");//启用时间
		bizContent.setEndDate("20201208");//到期时间

		// 0为使用验证码，否则使用通知
		bizContent.setCooperationId("0");//合作方标识，0-其它合作公司 1-中石油

		request.setBizContent(bizContent);
		CardbusinessNcpayCarinfocollectResponseV1 response;
		try {
			String msg_id = String.valueOf(System.currentTimeMillis());
			response = client.execute(request, msg_id);//msgId消息通讯唯一编号，要求每次调用独立生成，APP级唯一

			Logger log = Logger.getLogger(CardbusinessNcpayCarinfocollectTestV1.class.getName());
			if (response.isSuccess()) {
				// 6、业务成功处理，请根据接口文档用response.getxxx()获取同步返回的业务数据
				log.info("ReturnCode:"+ response.getReturnCode()+"\n      Response:"+response.getReturnMsg());
				//System.out.println("ReturnCode:"+ response.getReturnCode());
				//System.out.println("Response:" + response.getReturnMsg());
			} else {
				// 失败
				log.info("ReturnCode:"+ response.getReturnCode()+"\n      Response:"+response.getReturnMsg());
				//System.out.println("ReturnCode:"+ response.getReturnCode());
				//System.out.println("ReturnMsg:"+ response.getReturnMsg());
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}

}
