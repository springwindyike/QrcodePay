package com.icbc.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.icbc.api.IcbcApiException;
import com.icbc.api.IcbcConstants;
import com.icbc.api.UiIcbcClient;
import com.icbc.api.request.EnterpriseSalaryNormalroomRequestV1;
import com.icbc.api.request.EnterpriseSalaryNormalroomRequestV1.EnterpriseSalaryNormalroomRequestV1Biz;

public class EnterpriseSalaryNormalroomRequestTest {

	protected static final String MY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAMNfWT8xOPrpQAS+88loK1rjUB4EdHvCFQ4mhlZqNM0ABt4LgDXkfSM8w4Q/kWTzmjxoGm2SY32K5VBfvg3fSr43TrNdMDurPxBAsYpe1YnBXx+NxwB0GZ3dL2mMsgu8z1plDIgVqUfHwkczuGsUvWu432CC/h1EQfG2qwM2xudNAgMBAAECgYBMVYbDP/IpZtUShaEuwjqeSk5VTBxO9mfPnZHDVb/HkQkd3JR9egbCq80gcM3YCa3riCk7QoUI2in6m03gkavbs1fQJKMgp53qXYmbV18sivkOAkt4YU50MFTUrWt47TRlnvblNwZNA3P5+UvTgD8FCNZbq0ehZRiwdqoDHNBx6QJBAOdegVgusYky3mm03/TSGXEJ68XN9KIgqxhPkrNWGrO/FzBt/V9HwjBDLfSS+qp8xEGWU8SLFrq7QbQEPY9Ws5cCQQDYK9OY4O8ujxqrsojFr9G1ohMOKV47rek0E/83k1hYK/e/5sh6j0+MAl+jL08P6JT94T/Bb4UFMkBxZpbgcwi7AkAIu+6SD6EwFrWCtAtISK4hMEiwPOghPq52yno1PujfJDWR5HUOJb1U6RRRCUNhMDiQaUZcQwvmnK8MRqS0RoedAkBx594Ob2/445UVJfUl3bgt8iICU1ABOGlqdKMFwNFLXJemec/nrL4os1N7pEEPy+k+QcObhMzd6RXF613TFSpjAkEA5uf5ozWTzTWpvkZYrvIIcHH05PCEMmX+0FbAZLoYpCpyKzd/7+KNt+OO5TJDEvab7U8+ICOQIbNms3vi2p3i3A==";
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	protected static final String APP_ID = "10000000000000794554";

	protected static final String PASSWORD = "12345678";

	public static void test_cop() {

		// ����client����
		String castr = APIGW_PUBLIC_KEY;
		// ȥ��ǩ�����ݼ�֤�������еĿո� added for Safari
		Pattern p = Pattern.compile("\\s*|\t");
		Matcher m2 = p.matcher(castr);
		castr = m2.replaceAll("");
		UiIcbcClient client = new UiIcbcClient(APP_ID, MY_PRIVATE_KEY,
				IcbcConstants.CHARSET_UTF8, castr, PASSWORD);

		EnterpriseSalaryNormalroomRequestV1 request = new EnterpriseSalaryNormalroomRequestV1();
		request.setServiceUrl("https://gw.open.icbc.com.cn/ui/enterprise/salary/normalroom/V1");
		EnterpriseSalaryNormalroomRequestV1Biz bizContent = new EnterpriseSalaryNormalroomRequestV1Biz();
		bizContent.setApiName("NORMALROOM");
		bizContent.setApiVersion("001.001.001.001");
		bizContent.setCertId("020090005134983");
		bizContent.setCheckFlag("1");
		bizContent.setAppName("CHRM");

		request.setBizContent(bizContent);

		try {
			request.setBizContent(bizContent);

			// �������ύ�ı����ؿͻ���������ñ����Զ��ύ��ɵ���
			System.out.println(client.buildPostForm(request));
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}

	/**
	 * TODO ��������������
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
