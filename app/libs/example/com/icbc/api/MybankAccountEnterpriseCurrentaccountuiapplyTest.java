
package com.icbc.api;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 
import com.icbc.api.IcbcConstants;
import com.icbc.api.UiIcbcClient;
import com.icbc.api.request.MybankAccountEnterpriseCurrentaccountuiapplyRequestV1;
import com.icbc.api.request.MybankAccountEnterpriseCurrentaccountuiapplyRequestV1.MybankAccountEnterpriseCurrentaccountuiapplyRequestV1Biz;
public class MybankAccountEnterpriseCurrentaccountuiapplyTest {
	protected static final String MY_PRIVATE_KEY = "Al84Gc7IXK8AfR1qLPdW96blEjRN8pVdJ9crarCngQPIkIvx1abQXlx5PCmgs/7Bqu3vJpdRlK2EnFJ5FMN6p9Ga6r1ILcPK4ldVahY4J02/ZQjw7poXMZ+NwZYdXpVyrqfvMLz/JbDPih/gU9sN39hdJrYAeqpXmmtvl3657dDkz45i7UBwKLZQ/+couNOcXgrGvuqbVGRkK0k1lfmj9U0gbbER+7VS47sukjXxNLx/V+8W1I9Xw8hZberSYx8RAaFDb68ZNcKdMRgoM5g7AgEmMWxkemN46f/0xjZuDMdH00KEfTZDzq6EnyZG++92wU9n8BPxqPxtK0M5h7OXqRrq3+H9JBoYlRVB1SHyIcIo8RduvZdleVhRkFsAuKN4m9lpomFxMNSz4HRuOEY0RkRaInl0XColI10a81cxXG9Nngmu2o6flGCe6VZUDiNSp/HzD+WroaIMsiN3kJl0yg5dPmO6KyTnc4D27WxRkOfCfasiLbaXCfc7rldTmplZnkc0RbNMijG5ToQAp8bZbq5JpYwDl9+c33tYhU89CZrTujFEeTnL4kLBWv1F4n3/TEl83M5zyAxLLzy3MymdQNvEdk+D5wlhbM3dJdLlqusyVnaswIJ0SDXWca+24s0SvUiQcNOwbkeEYbo29FeWYoFNpKfTARx7vE+rqvfx6MwEx9vAlqReD3YdE0vSHFWU1cZ0dULyHKvZ5Hy7/dY2VQCcwKWDBKarMdPafUCDLfXjJn2gq0WHVROXmB5N9WIq9bBsmOJ6TrvjV6qTBJPbdfnIEOtETezC5qCKZKhcFrEw";

	protected static final String APIGW_PUBLIC_KEY = "MIIDDzCCAfegAwIBAgIKbaHKEE0tAABStDANBgkqhkiG9w0BAQUFADA3MRkwFwYDVQQKExBjb3JiYW5rNDMuY29tLmNuMRowGAYDVQQDExFjb3JiYW5rMTI4IHNkYyBDTjAeFw0xNjA5MTMwODQ2MDdaFw0yMjAzMDEwODQ2MDdaMEUxGTAXBgNVBAMTEGx1aHV6eTAwMS55LjAyMDAxDTALBgNVBAsTBDAyMDAxGTAXBgNVBAoTEGNvcmJhbms0My5jb20uY24wgZ8wDQYJKoZIhvcNAQEBBQADgY0AMIGJAoGBAIYomiojXul1Ri/9CnknLHZ1txuq1o0vF/DpeiRspzldFpB0RKxTqfcC1gs82nN76vYo50xIgtP0tLJ1/rDqc/t/AMpnCpDPJXKymOq8j9iESfrgEpypbQ/6Hhozq1tFxIi+/TARf3TlZB6OnTMu5EEaYXOKaDfEv90PkYpq2OMzAgMBAAGjgZIwgY8wHwYDVR0jBBgwFoAUnoARo7tXznf98Sdn/uThfyLyUfMwTQYDVR0fBEYwRDBCoECgPqQ8MDoxDjAMBgNVBAMTBWNybDIyMQ0wCwYDVQQLEwRjY3JsMRkwFwYDVQQKExBjb3JiYW5rNDMuY29tLmNuMB0GA1UdDgQWBBSCIdS+x+AlXsCCvB36nJmsvuVt4jANBgkqhkiG9w0BAQUFAAOCAQEACBF+MaxsHRH52Im+amFM8xBrvO57xN8rQ94nyozd25gaGh3CgtgxY1SgIGwk05rmNyeDi0QSByMFZ7aFhgxCxEeR1i0VT/gNzgoyXYmocBsFnVKo+ihHGE7OdXz9DrGCOhk+EAqnFBOrnalNSaZs7bklpnc9AzuLTLqRZxkAiQpPj+UNOot/y6/lb/rJsjC43idECycAGc3M6TmZQH5wNeccxXtuv3DbLTme9mbh+8eEWYtwBgqQCDwHxDPoHcBSzRaCb/N6u3dEBLDFs1I/SIyyUSUwUKneS3iUYIyE1hPZASQSZAOIUvUvG3BRr/mwrpePcTpPhZubSHlCYAG68A==";

	protected static final String APP_ID = "10000000000000004447";
	
	protected static final String PASSWORD = "12345678";
	

	public void test_cop() throws IcbcApiException {
		// ����client����
		String castr = APIGW_PUBLIC_KEY;
		// ȥ��ǩ�����ݼ�֤�������еĿո� added for Safari
		Pattern p = Pattern.compile("\\s*|\t");
		Matcher m2 = p.matcher(castr);
		castr = m2.replaceAll("");
		UiIcbcClient client = new UiIcbcClient(APP_ID, MY_PRIVATE_KEY, IcbcConstants.CHARSET_UTF8, castr, PASSWORD);
		
		// �����������request
		MybankAccountEnterpriseCurrentaccountuiapplyRequestV1 request = new MybankAccountEnterpriseCurrentaccountuiapplyRequestV1();

		MybankAccountEnterpriseCurrentaccountuiapplyRequestV1Biz bizContent = new MybankAccountEnterpriseCurrentaccountuiapplyRequestV1Biz();
		
		// ��������·��
		request.setServiceUrl("http://122.20.173.105:8081/ui/mybank/account/enterprise/currentaccountuiapply/V1");
		
		bizContent.setApi_name("PRSIGN");
		bizContent.setApi_version("001.001.001.001");//�ӿڰ汾
		bizContent.setFile_code("0200EG0000001");//�����ж�ע��һ��ƽ̨ʱ���ɵĺ���
		bizContent.setFile_name("ƽ̨����");//�����ж�ע��һ��ƽ̨ʱ���ɵ�����
		bizContent.setFile_serialno("6633074382999");//һ��ƽ̨��ˮ��
		bizContent.setTradeplat_name("����ƽ̨����");//����ƽ̨����
		bizContent.setTradeplat_code("773382910333");//����ƽ̨��
		bizContent.setTrade_orgcode("32444324343");//����ƽ̨ͳһ������ô���
		bizContent.setTrade_time("20180310162230");//����ƽ̨�����ʱ�䣬��ʽ��YYYYMMDDHHMMSS
		bizContent.setEnt_name("��Ѿҽ����е�����������޹�˾");//��ҵ����
		bizContent.setEnt_orgcode("429006NA000000022X");//��ҵͳһ������
		bizContent.setEnt_type("�ɷ����޹�˾");//��ҵ����
		bizContent.setFr_name("����Ѿ");//��������������
		bizContent.setCorp_type("000");//����������֤������,���֤��000
		bizContent.setIdentity_cardnt("431128198512270068");//�������֤��
		bizContent.setTel("18026285748");//����������ϵ�绰
		bizContent.setRegcap_cur("001");//ע���ʱ����� ����� 001
		bizContent.setRegcap("3895.12");//ע���ʱ� 1234.88 ���ܴ���,Ԫ�������ַ�����С������С�����2λ
		bizContent.setOp_from("20150203");//ע�����ھ�Ӫ������
		bizContent.setOp_to("20220203");//��Ӫ������
		bizContent.setBus_enddate("20220203");//Ӫҵִ�յ�������
		bizContent.setOp_scope("ҽ����е����");//��Ӫҵ��Χ
		bizContent.setDom("�麣�����԰·2��");//ע���ַ
		bizContent.setCis_phone("020-82706349");//��λ��ϵ�绰
		bizContent.setHolder_name("����Ѿ");//�عɹɶ�����
		bizContent.setHolder_corptype("000");//�عɹɶ�֤������
		bizContent.setHolder_custid("431128198512270059");//�عɹɶ�֤������
		bizContent.setEnt_status("Ӫҵ��");//��Ӫ״̬
		bizContent.setNeed_addinfo("1");//�Ƿ���Ҫ���ؽ�����˺ŵ���Ϣ0������Ҫ��1����Ҫ
		bizContent.setIs_fr("1");//�Ƿ��Ƿ����Լ�����0,�ǣ�1����
		bizContent.setSign_name("��СY");//��������������
		bizContent.setSign_id("431128198512270999");//�������������֤����
		bizContent.setPhonenumber("18026284788");//����ʹ�õ��ֻ�����
		bizContent.setNotifyurl("https://xxxx/do.jsp");//�첽֪ͨ�ĵ�ַ
		bizContent.setProvince_name("����");//����ʡ������
		bizContent.setCity_name("����");//�����е�����
		request.setBizContent(bizContent);
		
		// �������ύ�ı����ؿͻ���������ñ����Զ��ύ��ɵ���
		System.out.println(client.buildPostForm(request));
	}
		
}
