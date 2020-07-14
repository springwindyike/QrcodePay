
import java.text.SimpleDateFormat;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.IcbcConstants;

import com.icbc.api.request.CardbusinessNcpayNcpreauthRequestV1;
import com.icbc.api.request.CardbusinessNcpayNcpreauthRequestV1.CardbusinessNcpayNcpreauthBiz;

import com.icbc.api.response.CardbusinessNcpayNcpreauthResponseV1;


public class CardbusinessNcpayNcpreauthTestV1 {
	public static void main(String[] args) throws IcbcApiException {

		  //1、API平台申请的APPID
		  String APP_ID = "0200EH0013035";

		  //2、网关公钥
		  String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

		  //3、密钥对认证方式，公钥在API平台登记，此处为私钥
		  String MY_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCFU5DA/sQnebYdQB56AkGxMkRx60/QI14zFbRl7CUk4izkMjx+O95UwRb8UfaBQSffeAZ2J9OjOxUzvFfLDG25HYQU2WV7KN+gviJPJyDnIqqvqy8eZs2S5cx8OmVaAMB28LZ0DFFbPXeh7pzTB7B5zag0YQEC0VsCeCAkKQ6EUcKxwmDxNOv5ta7B/SAnr283HgOw0wZouxDEq9sx2CUvI+FpkS5AfL94w5+BaIMxujSXhNl31br7Z6tLtYK45kxIso3vgRkXhhbvw0BONI7zu5ty4tIB7v8ygLtKXa6xejfqLuWb0D8BjMGqRCCbRCDQNFSdENQo2v8TfTm5VK6PAgMBAAECggEASQUEcX7WhVw2bnywdFgKDHcgX1fmBXNpYwcPHwcfLL0movAUi3pUgQyjfxuQqye5I73DpDCZy3tPWF9dodozub+9mAGcf8BaAdpARiOC9LPa0Y0qqDbbfgmXXa5J1eo1fq7E7nfUkujuPWTGxRkgAQWuislZ2WY5tvd9evB1f+fOftuXvfj2OhncNH2ZpECASFKu1LhYV8Frg8k7INtxX/OQF8bMc1wlJBPiGMMUXiX+m6kJ2MTHC1/8jlxgHWiDsQ8zS+oSLwNmcYLX3V88ng1RPV/gH0N+Fgb3v8Jlj+3GT+QbspEclNWW0wUBRbYsac884r0bhvCbdazTiVJVcQKBgQDZDUV+1pkoqOFt7R3UoxVYLGRmv9pvcyKx/niSwsChGjUxanKig9Qde5Q6qy9M5i4D0Zl5Ha70mtNDF3GD5AA9qlNveswpRp92g70zB96sroo3S07Xe5wDS26XjSEENcsfLb406PSAThg5ueAsw47W4VZsjuwOu6tmEZuTPF1wiQKBgQCdQDFRuknpQIYm+0YkV1xT2Jlzzm9mNZSx9PYo33NAA+wZH9fXdaUrhuGfN6DQqkpnYWurMzKNO2uPkJ2ApfpTkAWpukl3aGMRZClrFaDSuEQeXCnq6TzfEB/BvG/m9KcV178vKfn4eRyXkZbIS3SKcedzoKmok3Mm7mEyKLvwVwKBgHHX2imK2U5QNdz4T3smBp32urqBykpGc140gH1JlMtq+Zdvo6zFxE2qcbbL7sVAvcXW+85g2VEGm+RGuY1Z2x585cJFACxuFFmPA39uk0azTV9vKm0vMkcwG1N1/Gk+5cj2rxsFTKi3TVGJwqD3+UWPb0sFM58Oo/mnJph1QvUxAoGBAJJfyojU6y/gDAAFLcluOFcj69NMeY2emob8CpcJSHJyNDc+2N+KdvEJYMOgOGWD3jZVDLATvB6TDRBaAQJbfaSDD4JqETDBTlZF8ffn7ge31lCcYbh022CX1be0/ETzvwQqC6CPZkvQELlVoBFZi2XDmTqcdtCgUDQQ+RCDsk2JAoGBAJX/7F2frby5eq57rvvWWhFDx9ok4c+17b4d/TRxoGyl/NhHaGUVkiO7ZVq2r+8Z2AprfjTNleuIL9Zi95lPUfpfXioBa3hRa6B9pK2qRXf8OyrACgkzrbYRJGGujMoJCqWNUdekIUaC5hsupNpQ/R+N6xoPEOvfK4UD40EU5cn3";

		  DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);

		  CardbusinessNcpayNcpreauthRequestV1 request = new  CardbusinessNcpayNcpreauthRequestV1();

		  //4、API网关地址：根据测试环境和生产环境替换相应IP和端口
		  request.setServiceUrl("http://gw.dccnet.com.cn:8081/api/cardbusiness/ncpay/ncpreauth/V1");//功能

		  //5、请参照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值
		  CardbusinessNcpayNcpreauthBiz bizContent = new CardbusinessNcpayNcpreauthBiz();

			SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
			long dataNum = System.currentTimeMillis();

		    bizContent.setTrxSerno("E111456135");
		    bizContent.setTrxDate(sdfDate.format(dataNum));
		    bizContent.setTrxTime(sdfTime.format(dataNum));
	        bizContent.setMerchantNo("02000E1020483");//商户编号
	        bizContent.setMerGroupNo("123456");//商圈编号
	        bizContent.setSiteNo("6666");
	        bizContent.setVerifyCode("577032");//动态码
	        bizContent.setTrxAmt("100");//交易金额
	        bizContent.setSignMedtype("3");//2-车牌 3-ETC
	        bizContent.setExtendInfo("test-pre-auth");//扩展信息
	        bizContent.setPlateNum("");//车牌
	        bizContent.setSceneType("1");

			request.setBizContent(bizContent);
		    CardbusinessNcpayNcpreauthResponseV1 response;
			try {
				String msg_id = String.valueOf(System.currentTimeMillis());
				response = client.execute(request, msg_id);//msgId消息通讯唯一编号，要求每次调用独立生成，APP级唯一

				if (response.isSuccess()) {
					// 6、业务成功处理，请根据接口文档用response.getxxx()获取同步返回的业务数据
					//System.out.println("ReturnCode:"+ response.getReturnCode());
					//System.out.println("Response:" + response.getReturnMsg());
					//System.out.println("sceneAgreement:" + response.getSceneAgreement());
					//System.out.println("PlateNum:" + response.getPlateNum());
					//System.out.println("bankTrxDate:" + response.getBankTrxDate());
					//System.out.println("bankTrxSerno:" + response.getBankTrxSerno());
					//System.out.println("authorNo:" + response.getAuthorNo());

				} else {
					// 失败
					//System.out.println("ReturnCode:"+ response.getReturnCode());
					//System.out.println("ReturnMsg:"+ response.getReturnMsg());
				}
			} catch (IcbcApiException e) {
				e.printStackTrace();
			}
	}

}
