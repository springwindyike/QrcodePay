import java.text.SimpleDateFormat;
import java.util.logging.Logger;
import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.CardbusinessNcpayNcpreauthconfirmRequestV1.CardbusinessNcpayNcpreauthconfirmRequestV1Biz;
import com.icbc.api.request.CardbusinessNcpayNcpreauthconfirmRequestV1;
import com.icbc.api.response.CardbusinessNcpayNcpreauthconfirmResponseV1;
import com.icbc.api.IcbcConstants;

public class CardbusinessNcpayNcpreauthconfirmTestV1 {
	public static void main(String[] args) {

	  //1��APIƽ̨�����APPID
	  String APP_ID = "0200EH0013035";

	  //2�����ع�Կ
	  String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	  //3����Կ����֤��ʽ����Կ��APIƽ̨�Ǽǣ��˴�Ϊ˽Կ
	  String MY_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCFU5DA/sQnebYdQB56AkGxMkRx60/QI14zFbRl7CUk4izkMjx+O95UwRb8UfaBQSffeAZ2J9OjOxUzvFfLDG25HYQU2WV7KN+gviJPJyDnIqqvqy8eZs2S5cx8OmVaAMB28LZ0DFFbPXeh7pzTB7B5zag0YQEC0VsCeCAkKQ6EUcKxwmDxNOv5ta7B/SAnr283HgOw0wZouxDEq9sx2CUvI+FpkS5AfL94w5+BaIMxujSXhNl31br7Z6tLtYK45kxIso3vgRkXhhbvw0BONI7zu5ty4tIB7v8ygLtKXa6xejfqLuWb0D8BjMGqRCCbRCDQNFSdENQo2v8TfTm5VK6PAgMBAAECggEASQUEcX7WhVw2bnywdFgKDHcgX1fmBXNpYwcPHwcfLL0movAUi3pUgQyjfxuQqye5I73DpDCZy3tPWF9dodozub+9mAGcf8BaAdpARiOC9LPa0Y0qqDbbfgmXXa5J1eo1fq7E7nfUkujuPWTGxRkgAQWuislZ2WY5tvd9evB1f+fOftuXvfj2OhncNH2ZpECASFKu1LhYV8Frg8k7INtxX/OQF8bMc1wlJBPiGMMUXiX+m6kJ2MTHC1/8jlxgHWiDsQ8zS+oSLwNmcYLX3V88ng1RPV/gH0N+Fgb3v8Jlj+3GT+QbspEclNWW0wUBRbYsac884r0bhvCbdazTiVJVcQKBgQDZDUV+1pkoqOFt7R3UoxVYLGRmv9pvcyKx/niSwsChGjUxanKig9Qde5Q6qy9M5i4D0Zl5Ha70mtNDF3GD5AA9qlNveswpRp92g70zB96sroo3S07Xe5wDS26XjSEENcsfLb406PSAThg5ueAsw47W4VZsjuwOu6tmEZuTPF1wiQKBgQCdQDFRuknpQIYm+0YkV1xT2Jlzzm9mNZSx9PYo33NAA+wZH9fXdaUrhuGfN6DQqkpnYWurMzKNO2uPkJ2ApfpTkAWpukl3aGMRZClrFaDSuEQeXCnq6TzfEB/BvG/m9KcV178vKfn4eRyXkZbIS3SKcedzoKmok3Mm7mEyKLvwVwKBgHHX2imK2U5QNdz4T3smBp32urqBykpGc140gH1JlMtq+Zdvo6zFxE2qcbbL7sVAvcXW+85g2VEGm+RGuY1Z2x585cJFACxuFFmPA39uk0azTV9vKm0vMkcwG1N1/Gk+5cj2rxsFTKi3TVGJwqD3+UWPb0sFM58Oo/mnJph1QvUxAoGBAJJfyojU6y/gDAAFLcluOFcj69NMeY2emob8CpcJSHJyNDc+2N+KdvEJYMOgOGWD3jZVDLATvB6TDRBaAQJbfaSDD4JqETDBTlZF8ffn7ge31lCcYbh022CX1be0/ETzvwQqC6CPZkvQELlVoBFZi2XDmTqcdtCgUDQQ+RCDsk2JAoGBAJX/7F2frby5eq57rvvWWhFDx9ok4c+17b4d/TRxoGyl/NhHaGUVkiO7ZVq2r+8Z2AprfjTNleuIL9Zi95lPUfpfXioBa3hRa6B9pK2qRXf8OyrACgkzrbYRJGGujMoJCqWNUdekIUaC5hsupNpQ/R+N6xoPEOvfK4UD40EU5cn3";

	  DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);

	  CardbusinessNcpayNcpreauthconfirmRequestV1 request = new CardbusinessNcpayNcpreauthconfirmRequestV1();

	  //4��API���ص�ַ�����ݲ��Ի��������������滻��ӦIP�Ͷ˿�
	  request.setServiceUrl("http://gw.dccnet.com.cn:8081/api/cardbusiness/ncpay/ncpreauthconfirm/V1");//����


		CardbusinessNcpayNcpreauthconfirmRequestV1Biz bizContent = new CardbusinessNcpayNcpreauthconfirmRequestV1Biz();

		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
		long dataNum = System.currentTimeMillis();


		bizContent.setTrxDate(sdfDate.format(dataNum));
		bizContent.setTrxTime(sdfTime.format(dataNum));
		bizContent.setTrxSerno("12345");
		bizContent.setMerGroupNo("123456");
		bizContent.setMerchantNo("123456");
		bizContent.setOAuthorNo("356247");
		bizContent.setOBankTrxDate("2024-07-01");//��Ȩ���з��ص�����
		bizContent.setTrxAmt("100");
		bizContent.setOTrxAmt("100");
		bizContent.setSceneAgreement("111111");
		bizContent.setOBankTrxSerno("123456");
		bizContent.setExtendInfo("");

		request.setBizContent(bizContent);
		request.isNeedEncrypt();

		String msg_id = String.valueOf(System.currentTimeMillis());
		try {
			CardbusinessNcpayNcpreauthconfirmResponseV1 response = client.execute(request, msg_id);

    if (response.isSuccess()) {
			//System.out.println("sucessflg=>" + response.getReturnCode() + "|" + response.getReturnMsg());
			//System.out.println("getCard_no:" + response.getCard_no());
		}else{
			//System.out.println("sucessflg=>" + response.getReturnCode() + "|" + response.getReturnMsg());
			//System.out.println("getCard_no:" + response.getCard_no());
//		      System.out.println("PlateNum:" + response.getPlate_num());
//		      System.out.println("SiteNo:" + response.getSite_no());
//		      System.out.println("TankerNo:" + response.getTanker_no());
//		      System.out.println("NozzleNo:" + response.getNozzle_no());
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}

}
