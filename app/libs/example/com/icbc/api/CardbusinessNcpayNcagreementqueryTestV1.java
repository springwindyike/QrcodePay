package com.icbc.api;

import java.lang.reflect.Constructor;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;

import com.icbc.api.BizContent;
import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.IcbcConstants;
import com.icbc.api.request.CardbusinessNcpayNcagreementqueryRequestV1;
import com.icbc.api.request.CardbusinessNcpayNcagreementqueryRequestV1.CardbusinessNcpayNcagreementqueryRequestV1Biz;
import com.icbc.api.response.CardbusinessNcpayNcagreementqueryResponseV1;

/**
 * @author kfzx-huangsc
 */
public class CardbusinessNcpayNcagreementqueryTestV1 {
	public static void main(String[] args) {

		String APP_ID = "1000000000000BCSS4095733";

		String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

		String MY_PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCpx55HRWBecD9PDGnjgG14gySvwgsWahRXl+6wvlsC/oT1Gr4vQyVIQ6JJDkWFopyKrbcfSm5YPanGLiM2iBZ4/Vsa5mUGmr7Ne4DAD2zEFhDPlFrMuyP7h5t89qtnL9Q4vgz89W35qDAiJ3lLjutRgk2LmyvYFpgTazdH/34cIkBIfhlTLLUGKEXL2fEc0A5oKkLPHtu1/YF6u8rlsu7Xe6WLOBeHk9KqBR7BH+5ctL75oZBBRbwKauFPRWE/tQcjXv+qxJJVq6TfbQCRPKpzdmt/YcsiWnJwL1CEeXndXsY6mX14fSH1jHmU2cnkjccudA/bBJAKPSzFfQ1FCp2NAgMBAAECggEBAKiAqiJqRJ72IJ8/3sggaoW1AvA9UevJFK9q50cbZhCusx7gj+kwZww1tBd1xqI/JcatapXvtVx2ts0udVxl7IfgTE+CYroPU1d1P+9eX8CtdbnPr96JzciSaku4NZ2P5rz6QsG8hI3H0x3St5u6GOsou/XW58jrg7uiKZeXh347DwtxFJEhgjZBGUDw1+GOWapz1WFXfkjxEiikYTW6YSLYGHR765YXG5wpanIqknz1iTBkXxedlzc4WbIfJMYNlilrYGUhEwaMuCHHz6HIVqSRQxmmJT+ZwZ4aCFeZnvBKe7dDRrhisqigJh0QqqnwO0aIVc0fBdKBFbb0sxrkaYECgYEA7ML1DPoGGMrpWOUiFzwpOkg3ZpL/9+KyReTzxAY/eMV9C4dUMXSE0yh46YueeYiqlinj88Ob7Q2AmzHh4M+J9BbmyR8pV8uM/W7X7Rzs9YkgcB2dQcU7WBfSaErwvIVTR62ABLoCgv9q74sWdPOTGxfIGQafzJNBEKmUdJxJx9kCgYEAt5NTbUk99cONlI7k98Ow8FVcAnx1qvmZfuVukRb6lufgbLhCKy3bz23hYkyUyVLl8Q6o+Vgg/TTuXQ8DCCPF5F/Cv/s8S+/ulF1sT7J/P9x3a/tCSCICfiRNM5jByG9zDZI4UgxzDV8AR2BvH19sCL355ENA/8ljkrvZkbfSRtUCgYEA5rMVOp7JoBDgDWm/rSpG9e52ZTGpz24KzgZI7OI1qMWukbQ8+q+R2XtfThpowf3EUuvgnZ8l6Xe1sAOMGJXB06EZIjKGA3FpIW2HYxlDYAFNJVIF8JdxuuYDdPJI3zl+q6JI0tI5LlIZbe52ZGEPH2At7wzAWwPFa6oB6Rp83gkCgYBo6kMgz14g6j0tLSmAzI+AG1i1dwoMyA/IrTkupLJcsnLZz8jJQrFAcG0CMABMuxr9VMKPlqVr8OdVufGiokdECNKVw/Em+R4iHu568em1xrtdtECiVwWTsA2LMn91nPRlSi7z/Xd3qdbP9DYt+OwWZvS9Vw574U4OG1vx4tvDbQKBgQCpIFfrj19CQU/+oWwtkdfdK/E/hMfK1ESFHfWAX+Pq4pIyEIz/Kb3IweKy9uEGbE/zNfi3m5ClCf9H3B4BYk5EKbSk3lVDKg3F4U+1ETNE4fwvKdBfCgpJMi12xdTtkuhfrVUjhaw7T0pFc8fJkP5P5Q+elY6iwYgn+JPm+2yb8A==";

		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID,
				IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);

		CardbusinessNcpayNcagreementqueryRequestV1 request = new CardbusinessNcpayNcagreementqueryRequestV1();

		CardbusinessNcpayNcagreementqueryRequestV1Biz bizContent = new CardbusinessNcpayNcagreementqueryRequestV1Biz();

		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");

		long dataNum = System.currentTimeMillis();
		bizContent.setTrxSerno("080BCSS8120253510522");		
		bizContent.setTrxDate(sdfDate.format(dataNum));
		bizContent.setTrxTime(sdfTime.format(dataNum)); 
		bizContent.setMerGroupNo("4600000000001AS");
		bizContent.setMerchantNo("020001020483"); 		
		bizContent.setSignMedtype(3);//ǩԼ�������͡�ǩԼ���ʱ��ͬʱ¼��
		bizContent.setSignMedid("粤A12345");//���ơ�ǩԼ������ˮ�ű�����һ	
		bizContent.setOtrxSerno("");//���ơ�ǩԼ������ˮ�ű�����һ"0909104715618465"
		
		request.setServiceUrl("http://gw.dccnet.com.cn:8081/api/cardbusiness/ncpay/ncagreementquery/V1");//功能外网
		//String serviceUrl = "http://122.64.61.111:8081/api/cardbusiness/ncpay/ncagreementquery/V1";
		//request.setServiceUrl(serviceUrl);
		
		request.setBizContent(bizContent);
		request.isNeedEncrypt();

		String msg_id = String.valueOf(System.currentTimeMillis());
		try {
			CardbusinessNcpayNcagreementqueryResponseV1 response = client.execute(request, msg_id);
			
			Logger log = Logger.getLogger(CardbusinessNcpayNcagreementqueryTestV1.class.getName());
			if (response.isSuccess()) {
			//System.out.print(response); 
			log.info("ReturnCode:"+ response.getReturnCode()+"\n Response:"+response.getReturnMsg());
			} else {	 
			log.info("ReturnCode:"+ response.getReturnCode()+"\n Response:"+response.getReturnMsg());
			}
			//System.out.println("ReturnCode:"+ response.getReturnCode()+"\nReturnMsg:"+response.getReturnMsg());
			//System.out.println("ǩԼ���:" + response.getSignResult());
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}

}
