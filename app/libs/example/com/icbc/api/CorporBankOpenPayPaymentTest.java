package com.icbc.api;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;
import com.icbc.api.IcbcConstants;
import com.icbc.api.UiIcbcClient;
import com.icbc.api.request.CorporBankOpenPayPaymentRequestV1;
import com.icbc.api.request.CorporBankOpenPayPaymentRequestV1.CorporBankOpenPayPaymentRequestV1Biz;
import com.icbc.api.request.CorporBankOpenPayPaymentRequestV1.CorporBankOpenPayPaymentRequestV1Biz.CorporBankOpenPayPaymentRecInfo;
import com.icbc.api.request.CorporBankOpenPayPaymentRequestV1.CorporBankOpenPayPaymentRequestV1Biz.CorporBankOpenPayPaymentGoodInfo;


public class CorporBankOpenPayPaymentTest {

	protected static final String MY_PRIVATE_KEY = "Al84Gc7IXK8AfR1qLPdW96blEjRN8pVdJ9crarCngQPIkIvx1abQXlx5PCmgs/7Bqu3vJpdRlK2EnFJ5FMN6p9Ga6r1ILcPK4ldVahY4J02/ZQjw7poXMZ+NwZYdXpVyrqfvMLz/JbDPih/gU9sN39hdJrYAeqpXmmtvl3657dDkz45i7UBwKLZQ/+couNOcXgrGvuqbVGRkK0k1lfmj9U0gbbER+7VS47sukjXxNLx/V+8W1I9Xw8hZberSYx8RAaFDb68ZNcKdMRgoM5g7AgEmMWxkemN46f/0xjZuDMdH00KEfTZDzq6EnyZG++92wU9n8BPxqPxtK0M5h7OXqRrq3+H9JBoYlRVB1SHyIcIo8RduvZdleVhRkFsAuKN4m9lpomFxMNSz4HRuOEY0RkRaInl0XColI10a81cxXG9Nngmu2o6flGCe6VZUDiNSp/HzD+WroaIMsiN3kJl0yg5dPmO6KyTnc4D27WxRkOfCfasiLbaXCfc7rldTmplZnkc0RbNMijG5ToQAp8bZbq5JpYwDl9+c33tYhU89CZrTujFEeTnL4kLBWv1F4n3/TEl83M5zyAxLLzy3MymdQNvEdk+D5wlhbM3dJdLlqusyVnaswIJ0SDXWca+24s0SvUiQcNOwbkeEYbo29FeWYoFNpKfTARx7vE+rqvfx6MwEx9vAlqReD3YdE0vSHFWU1cZ0dULyHKvZ5Hy7/dY2VQCcwKWDBKarMdPafUCDLfXjJn2gq0WHVROXmB5N9WIq9bBsmOJ6TrvjV6qTBJPbdfnIEOtETezC5qCKZKhcFrEw";

	protected static final String APIGW_PUBLIC_KEY = "MIIDDzCCAfegAwIBAgIKbaHKEE0tAABStDANBgkqhkiG9w0BAQUFADA3MRkwFwYDVQQKExBjb3JiYW5rNDMuY29tLmNuMRowGAYDVQQDExFjb3JiYW5rMTI4IHNkYyBDTjAeFw0xNjA5MTMwODQ2MDdaFw0yMjAzMDEwODQ2MDdaMEUxGTAXBgNVBAMTEGx1aHV6eTAwMS55LjAyMDAxDTALBgNVBAsTBDAyMDAxGTAXBgNVBAoTEGNvcmJhbms0My5jb20uY24wgZ8wDQYJKoZIhvcNAQEBBQADgY0AMIGJAoGBAIYomiojXul1Ri/9CnknLHZ1txuq1o0vF/DpeiRspzldFpB0RKxTqfcC1gs82nN76vYo50xIgtP0tLJ1/rDqc/t/AMpnCpDPJXKymOq8j9iESfrgEpypbQ/6Hhozq1tFxIi+/TARf3TlZB6OnTMu5EEaYXOKaDfEv90PkYpq2OMzAgMBAAGjgZIwgY8wHwYDVR0jBBgwFoAUnoARo7tXznf98Sdn/uThfyLyUfMwTQYDVR0fBEYwRDBCoECgPqQ8MDoxDjAMBgNVBAMTBWNybDIyMQ0wCwYDVQQLEwRjY3JsMRkwFwYDVQQKExBjb3JiYW5rNDMuY29tLmNuMB0GA1UdDgQWBBSCIdS+x+AlXsCCvB36nJmsvuVt4jANBgkqhkiG9w0BAQUFAAOCAQEACBF+MaxsHRH52Im+amFM8xBrvO57xN8rQ94nyozd25gaGh3CgtgxY1SgIGwk05rmNyeDi0QSByMFZ7aFhgxCxEeR1i0VT/gNzgoyXYmocBsFnVKo+ihHGE7OdXz9DrGCOhk+EAqnFBOrnalNSaZs7bklpnc9AzuLTLqRZxkAiQpPj+UNOot/y6/lb/rJsjC43idECycAGc3M6TmZQH5wNeccxXtuv3DbLTme9mbh+8eEWYtwBgqQCDwHxDPoHcBSzRaCb/N6u3dEBLDFs1I/SIyyUSUwUKneS3iUYIyE1hPZASQSZAOIUvUvG3BRr/mwrpePcTpPhZubSHlCYAG68A==";

	protected static final String APP_ID = "10000000000000004447";
	
	protected static final String PASSWORD = "12345678";
	
	@Test
	public void test_cop() throws IcbcApiException {
		
		// ����client����
		String castr = APIGW_PUBLIC_KEY;
		// ȥ��ǩ�����ݼ�֤�������еĿո� added for Safari
		Pattern p = Pattern.compile("\\s*|\t");
		Matcher m2 = p.matcher(castr);
		castr = m2.replaceAll("");
		UiIcbcClient client = new UiIcbcClient(APP_ID, MY_PRIVATE_KEY, IcbcConstants.CHARSET_UTF8, castr, PASSWORD);
		
		// �����������request
		CorporBankOpenPayPaymentRequestV1 request = new CorporBankOpenPayPaymentRequestV1();

		CorporBankOpenPayPaymentRequestV1Biz bizContent = new CorporBankOpenPayPaymentRequestV1Biz();
		
		// ��������·��
		request.setServiceUrl("http://122.20.173.105:8081/ui/corporbank/openpay/test/payment/V1");
		
		bizContent.setApi_name("OPENPAY");
		bizContent.setApi_version("001.001.002.001");
		bizContent.setFile_code("0200EG0000001");
		bizContent.setFile_name("ƽ̨����");
		bizContent.setFile_serialno("6633074382999");
		bizContent.setTradeplat_name("����ƽ̨����");
		bizContent.setTradeplat_code("773382910333");
		bizContent.setTrade_orgcode("32444324343");
		bizContent.setAcct_orgcode("43243455332");
		bizContent.setOrder_no("100000111");
		bizContent.setTrade_time("20180310162230");
		bizContent.setAmout("100");
		bizContent.setCurrtype("001");
		bizContent.setPay_name("����");
		bizContent.setPay_acct_num("6222020200012245389");
		bizContent.setPay_phoneno("010-01234567");
		bizContent.setGet_province("������");
		bizContent.setGet_city("������");
		bizContent.setGet_county("������");
		bizContent.setGet_email("zhangsan@icbc.com");
		bizContent.setGet_phone("13811112222");
		bizContent.setGet_address("�����к�����***��¥");
		bizContent.setGet_post("100101");
		bizContent.setTradeplat_rem("����ƽ̨��ע");
		bizContent.setPay_rem("���ע");
		bizContent.setOrder_rem("������ע");  
		List<CorporBankOpenPayPaymentRecInfo> reclist = (List)new ArrayList<CorporBankOpenPayPaymentRecInfo>();
		List<CorporBankOpenPayPaymentGoodInfo> goodslist = (List)new ArrayList<CorporBankOpenPayPaymentGoodInfo>();
		
		CorporBankOpenPayPaymentRecInfo recinfo1 = new CorporBankOpenPayPaymentRecInfo();
		CorporBankOpenPayPaymentRecInfo recinfo2 = new CorporBankOpenPayPaymentRecInfo();
		CorporBankOpenPayPaymentRecInfo recinfo3 = new CorporBankOpenPayPaymentRecInfo();
		//�տ���1
		recinfo1.setRec_seqno("1");
		recinfo1.setRec_name("����");
		recinfo1.setRec_acct_num("6222020200066551234");
		recinfo1.setRec_bnkclscode("12");
		recinfo1.setRec_orgcode("1234567890");
		recinfo1.setSystem_flag("1");
		//�տ���2
		recinfo2.setRec_seqno("2");
		recinfo2.setRec_name("����");
		recinfo2.setRec_acct_num("6222020200066551234");
		recinfo2.setRec_bnkclscode("12");
		recinfo2.setRec_orgcode("1234567890");
		recinfo2.setSystem_flag("1");
		//�տ���3
		recinfo3.setRec_seqno("3");
		recinfo3.setRec_name("����");
		recinfo3.setRec_acct_num("6222020200066551234");
		recinfo3.setRec_bnkclscode("12");
		recinfo3.setRec_orgcode("1234567890");
		recinfo3.setSystem_flag("1");
		reclist.add(recinfo1);
		reclist.add(recinfo2);
		reclist.add(recinfo3);
		
		CorporBankOpenPayPaymentGoodInfo goodinfo1 = new CorporBankOpenPayPaymentGoodInfo();
		CorporBankOpenPayPaymentGoodInfo goodinfo2 = new CorporBankOpenPayPaymentGoodInfo();
		CorporBankOpenPayPaymentGoodInfo goodinfo3 = new CorporBankOpenPayPaymentGoodInfo();
		
		//��Ʒ��Ϣ1
		goodinfo1.setGoods_seqno("1");
		goodinfo1.setGoods_name("��Ʒ1");
		goodinfo1.setGoods_num("100");
		goodinfo1.setWeight("��");
		goodinfo1.setPrice("1000000");
		goodinfo1.setSeller_name("����");
		goodinfo1.setSeller_address("13812345678");
		goodinfo1.setUnits("100");
		//��Ʒ��Ϣ1
		goodinfo2.setGoods_seqno("2");
		goodinfo2.setGoods_name("��Ʒ2");
		goodinfo2.setGoods_num("100");
		goodinfo2.setWeight("��");
		goodinfo2.setPrice("1000000");
		goodinfo2.setSeller_name("����");
		goodinfo2.setSeller_address("13812345678");
		goodinfo2.setUnits("100");
		//��Ʒ��Ϣ1
		goodinfo3.setGoods_seqno("3");
		goodinfo3.setGoods_name("��Ʒ3");
		goodinfo3.setGoods_num("100");
		goodinfo3.setWeight("��");
		goodinfo3.setPrice("1000000");
		goodinfo3.setSeller_name("����");
		goodinfo3.setSeller_address("13812345678");
		goodinfo3.setUnits("100");
		goodslist.add(goodinfo1);
		goodslist.add(goodinfo2);
		goodslist.add(goodinfo3);
		
		bizContent.setReclist(reclist);
		bizContent.setGoodslist(goodslist);
	
		request.setBizContent(bizContent);
		
		// �������ύ�ı����ؿͻ���������ñ����Զ��ύ��ɵ���
		System.out.println(client.buildPostForm(request));
		
		
	}
}
