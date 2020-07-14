package com.icbc.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.icbc.api.IcbcApiException;
import com.icbc.api.IcbcConstants;
import com.icbc.api.UiIcbcClient;
import com.icbc.api.internal.util.internal.util.fastjson.JSON;
import com.icbc.api.request.EpasscLogonRequestV1;
import com.icbc.api.request.EpasscLogonRequestV1.BusiData;
import com.icbc.api.request.EpasscLogonRequestV1.BusinessEntryData;
import com.icbc.api.request.EpasscLogonRequestV1.EpasscLogonRequestV1Biz;
//import com.icbc.crypto.utils.TripleDesCryptFileInputKey;
//import com.icbc.crypto.utils.Base64;

public class EpasscLogonRequestTest {

	protected static final String MY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAMNfWT8xOPrpQAS+88loK1rjUB4EdHvCFQ4mhlZqNM0ABt4LgDXkfSM8w4Q/kWTzmjxoGm2SY32K5VBfvg3fSr43TrNdMDurPxBAsYpe1YnBXx+NxwB0GZ3dL2mMsgu8z1plDIgVqUfHwkczuGsUvWu432CC/h1EQfG2qwM2xudNAgMBAAECgYBMVYbDP/IpZtUShaEuwjqeSk5VTBxO9mfPnZHDVb/HkQkd3JR9egbCq80gcM3YCa3riCk7QoUI2in6m03gkavbs1fQJKMgp53qXYmbV18sivkOAkt4YU50MFTUrWt47TRlnvblNwZNA3P5+UvTgD8FCNZbq0ehZRiwdqoDHNBx6QJBAOdegVgusYky3mm03/TSGXEJ68XN9KIgqxhPkrNWGrO/FzBt/V9HwjBDLfSS+qp8xEGWU8SLFrq7QbQEPY9Ws5cCQQDYK9OY4O8ujxqrsojFr9G1ohMOKV47rek0E/83k1hYK/e/5sh6j0+MAl+jL08P6JT94T/Bb4UFMkBxZpbgcwi7AkAIu+6SD6EwFrWCtAtISK4hMEiwPOghPq52yno1PujfJDWR5HUOJb1U6RRRCUNhMDiQaUZcQwvmnK8MRqS0RoedAkBx594Ob2/445UVJfUl3bgt8iICU1ABOGlqdKMFwNFLXJemec/nrL4os1N7pEEPy+k+QcObhMzd6RXF613TFSpjAkEA5uf5ozWTzTWpvkZYrvIIcHH05PCEMmX+0FbAZLoYpCpyKzd/7+KNt+OO5TJDEvab7U8+ICOQIbNms3vi2p3i3A==";
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	protected static final String APP_ID = "10000000000000794554";

	protected static final String PASSWORD = "12345678";
	
	
	private static String from = "CHRM";
	private static String timeStamp;
	private static String expireTime;
	private static String func_id = "51001";
	private static String version = "1.0";
	private static String fromDomain = "";
	private static String chanData  = "";
	private static String busiData  = "";
	
	private static String  TripleDESKeyFilePath = "";
	

	public static void test_cop() throws Exception{

		String castr = APIGW_PUBLIC_KEY;
		// ȥ��ǩ�����ݼ�֤�������еĿո� added for Safari
		Pattern p = Pattern.compile("\\s*|\t");
		Matcher m2 = p.matcher(castr);
		castr = m2.replaceAll("");
		
		
		// ����client
		UiIcbcClient client = new UiIcbcClient(APP_ID, MY_PRIVATE_KEY,
				IcbcConstants.CHARSET_UTF8, castr, PASSWORD);

		EpasscLogonRequestV1 request = new EpasscLogonRequestV1();
		request.setServiceUrl("https://gw.open.icbc.com.cn/ui/epassc/logon/V1");
		
		
		//����BusiData
		BusiData  busiData = new BusiData();
		busiData.setForward_url("forward_url");
		busiData.setCallbackmodpwd("callbackmodpwd");
		busiData.setBack_url("back_url");
		
		//����BusinessEntryData
		BusinessEntryData busiEntrydata = new BusinessEntryData();
		busiEntrydata.setFrom(from);
		busiEntrydata.setTimeStamp(timeStamp);
		busiEntrydata.setExpireTime(expireTime);
		busiEntrydata.setFunc_id(func_id);
		busiEntrydata.setVersion(version);
		busiEntrydata.setFromDomain(fromDomain);
		busiEntrydata.setChanData(chanData);
		busiEntrydata.setBusiData(JSON.toJSONString(busiData));
		
		//����bizContent
		EpasscLogonRequestV1Biz bizContent = new EpasscLogonRequestV1Biz();
		
		String encryptBusiEntryData = JSON.toJSONString(busiEntrydata);//��Ҫ��encryptBusiEntryData��3DES���ܺ��뵽bizContent.setBusinessEntryData()�С�
		bizContent.setBusinessEntryData(encryptBusiEntryData);
		//bizContent.setBusinessEntryData(encrypt(JSON.toJSONString(busiEntrydata),"utf-8"));
		
		try {
			request.setBizContent(bizContent);

			// �������ύ�ı����ؿͻ���������ñ����Զ��ύ��ɵ���
			System.out.println(client.buildPostForm(request));
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}

	
	
     /**
     * ʹ��3DES��������,�����ַ�������dataEncodingת��Ϊ�ֽں���
     * @param sourceData ��������
     * @param dataEncoding ���������ݵ��ַ����뷽ʽ
     * @return 3DES���ܺ������
     * @throws CryptoException
     */
/*    private static String encrypt(String sourceData, String dataEncoding) throws Exception {

        try {
            byte[] bTranData = sourceData.getBytes(dataEncoding);
            byte[] outTranData = new byte[(bTranData.length / 8) * 8 + 8];
			//
			  //�ӽ��ܵķ�ʽ��0���ܣ�1����
			  //�ڲ����ܷ�ʽ��1--ECB;2--CBC;3--CFB;4--OFB
			  //�ڲ��㷨��ʽ��0 �ӼӼӣ�1 �ӽ��
			//
            final int module = 0;
            final int method = 1;
            final int destype = 1;
			int ret = TripleDesCryptFileInputKey.IcbcTripleDes(bTranData, bTranData.length, outTranData, module, method, destype, TripleDESKeyFilePath);
            if(ret < 0){
                //����С��0�ĺ��壺
                //-1���������in����outΪ�գ�
                //-2��ȱʡ��Կ���ȣ�16����ASCII��ʾ������32��48��ASCII�ַ�����Ϊ��
                //-3������ļӽ���ģʽ�����ǡ�0���ܣ�1���ܡ������ֵ
                //-4����ȱʡ��Կת��Ϊ16���Ʊ�ʾ�����ε�ʱ�����ȱʡ��ԿΪ�Ƿ���Կ����Կ�ַ����ķ�ΧΪ[0-9]��[A-F]��[a-f]
                //-5������ģʽʱ����������Ļ��������Ȳ�������С����ӦΪ(len/8)*8+8
                //-6������ģʽʱ������ĳ��Ȳ���8��������
                //-7������ģʽʱ������������ĳ��Ȳ������淵������
                //-8�������Ľ��н��ܺ�õ����Ĳ�����PKCS#5�Ĳ�λ������������Ĵ���
                //-9��IV����Ϊ�գ�����IV�����ĳ��Ȳ���8
                //-10�����ܻ��������Ļ��������Ȳ�������С����ӦΪlen
                //-11���ڲ����ܷ�ʽmethod����1--ECB;2--CBC;3--CFB;4--OFB�⼸����ֵ��1/2/3/4��
                //-25���ڲ��㷨��ʽ��0 �ӼӼӣ�1 �ӽ�ӣ���ֵ�ǣ�0/1��
                //-26��in�������顢out�������ĳ��Ȳ���8
                //-27����Կ���Ȳ�����Ҫ��
                //-28����ȡ��Կʧ�ܣ���Կ�ļ��Ƿ�������
                throw new Exception(ret+":TripleDesCryptFileInputKey.IcbcTripleDes()");
            }
            return Base64.icbcbase64encode(outTranData).replaceAll("[\n\r]", "");

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }
    }
*/
	/**
	 * <pre>
	 * </pre>
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		test_cop();

	}
}
