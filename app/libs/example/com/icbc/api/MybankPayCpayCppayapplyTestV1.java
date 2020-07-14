package com.icbc.api;

import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.MybankPayCpayCppayapplyRequestV1;
import com.icbc.api.response.MybankPayCpayCppayapplyResponseV1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MybankPayCpayCppayapplyTestV1 {

	protected static final String MY_PRIVATE_KEY = "BKcYpFbllOCOFO9edvl82KOEtxYeppjGtvtmQELrK6D1SG70UGbJtRlYT9zaUNoD2jz8/IaaSh9YDoTm2e2wbFXnpEuzbmAXI4M8fxzcn3gD+UEs4eZcss+6p7PVyWu3hVfMD9sMLMOnrGsXpJG9xHnBa4DKKY6zzTOGbnblXIqI3tzWYop9jf2ggm+0fY/ns3iz78bOX/9Xocx0PdFT0RP+rxrnzY9ObCeVZieHXo5vekttMat+B4l0uRKsg1/QZ79OMb5amhFgliuXvnQ6MDXvUgz99LgjRKUqI6eln4eXm1azecXXbhupuhY5mvOxe08MfNSw4Fj/2oTQvUQky+ibZKQMQWOCMPxVZ3C3/GVh1XBYUgcGWKovMTPadyesSy0/2jZ4M5Vy+XKLmlgywYXbhUXQ/7FucHxQmjl+y5mtr1Ne/O4wFZ90A2BhDKacqpgezdzQLJKpgDDI1DFLKcdIimGFzmAHvgTAeTHfqGQYYYRRRfZ+emNo0U0VkmFoobaoh0Tuf1VkthATjupVptx3UpWULnwMrRrGQgjRn+HR8mXAIPkUdhXQ/eQTZ9CP4N21iZO+91Mtbc0gJZQ9svqmSOKhruOtuTN0OhyvxE2SEMoMbRqp0Gk9kp1ACk9Rqd35nYbIXKvbteBFI1eVn2JuqFybySG1LZU/M2M751twkt1AGZ6SKa2EyCJRE/svfi0vzW4rSrxoSXJCKM2+YAfkgc08c1LgSEIvBu7c1xVTph8wylm4OQAEUfXZCAwb++uwvtj/EGFDGdHiKiF5QOU03pjQwj8TMFwYEN+6+PwleAlfExT78XDi6NAlvUhlYPq5Xmb/S5I+xQoHr1ghsdnPzMdIgZY33uFlUSX/0HWxSIzMfQbIn1IFq/PPxIxo18oqA8IKEZe7FvIlfNq4phM2C2XTpaKFvFqbzS2tbSJXOUonxrFB/kdZXDM1yMCI+UmnQETl4ndpvsTV6EQEhQpXrR0zp0XgJzItrfcABSjtstqJtyNo/si+xxPjU6O8xn7YLi/RlC//Se+YF12WoOTurakJruuGR1dynFSv2zp74OFSKv+eaODnzDBvI8vdq/jB0z8LTa9HY4h/+bsujyJz3IcOam+Yyxf3h53/82EPZ69vzRn+kUzoSm2yBUi9ISS3bSpfnfBhyOLIT2g6m+3Ho/lEsnZTjvjTstslJpyX3TyyQRtvLWv2X49wAIETQsWksurcrQWUsfLETHvwCQE1rF1GNWho1qfupagqxJt0z9+5v1WofbVQBsyphX2HOQP9advd4r53EZrMSh3/Isn9BN6iU67Ebp16WhYI2QwCmwFR1nzo5QxASV/dPNClFxrIPa5nubLTL495UEhhn4A3HJs20RCRXcetYQ/bVYA6uqPIP76pr8mXg4W9eDvoWJb1Y9aor2JxdbtY/0/OwPnnyDMMO8u5kVqxaY4Es+a43WXat0Cs+/vTMFR9v/MVV7MOWGD9RwvMAnTMFfiOCSUKFWfPGd2o7wyY4+aCUOnI+L6nmrqfuYFAwP7Bi/QmK80yXDXI1078LBjGlICSoGFIjsyJ1wQec5H1rg5UHF7qt28qkVsxMok=";

	protected static final String APIGW_PUBLIC_KEY = "MIIDljCCAn6gAwIBAgIKbaHKEE0tAAI7+jANBgkqhkiG9w0BAQsFADA3MRkwFwYDVQQKExBjb3JiYW5rNDMuY29tLmNuMRowGAYDVQQDExFjb3JiYW5rMTI4IHNkYyBDTjAeFw0xODEwMzEwNTM3MzFaFw0yOTAxMzEwNTM3MzFaMEkxHTAbBgNVBAMMFDAyMDBFSDAwMTMwMzUuZS4wMjAwMQ0wCwYDVQQLDAQwMjAwMRkwFwYDVQQKDBBjb3JiYW5rNDMuY29tLmNuMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnqvltq3gG1eVgTJ547CNI0jfzgC6GphVQyE7YzhHwJLnufTBAx/Zezg9M+R1UJWqg3R+WYPu4VXpkaIz0N/0obG5FkMFqyViz8ZSwUHcntLK5R65vBbbJ/UVcAe3GYpIBONB7ApeLuWjh5SZ0Bq8rXZ/DVjg/JMbBnqG50rbjETRHsaLODn447yJMK4H3wEq9DaRHH8xEkd01qv3lnRb0PpU78EWyMwoyHgvo7GLuR0sAjOeRAqNeYrenm2rG+UGyYsT9/K4Lw6H2fAfdtFUMaAQ+q3p+qQpPfMJXRTXLgTfQTdlqweVIppYFMNp1IkwbWtqbXliN4rCknj1VxjNaQIDAQABo4GRMIGOMB8GA1UdIwQYMBaAFJ6AEaO7V853/fEnZ/7k4X8i8lHzMEwGA1UdHwRFMEMwQaA/oD2kOzA5MQ0wCwYDVQQDDARjcmwzMQ0wCwYDVQQLDARjY3JsMRkwFwYDVQQKDBBjb3JiYW5rNDMuY29tLmNuMB0GA1UdDgQWBBQEmtl3SpIDUN49NC3V+kprWYraTTANBgkqhkiG9w0BAQsFAAOCAQEAQKBKbgxSwRoZbqgOza+CZFcP3Sp16x2Yek1C5nlcX5REHCinbNVeMKmqnTEl8DK/XX0f/nuj+5WPsSMeQ1ltSjfMm1NAJNwwTqdq1zU5jK4YCA0dZhj90pooVgcXu152erCcP2lHncAk3xrVxgMWIL82sYQu3pE/TmEc6K6ofuPzcCdNxoAJpn82qYuCxNQUxu3fKdZsEpwt0sgJBhSiVkzxUMK9GcEXz177f6ktivJfw61VKZUq3BQXv9VvuprLEeCC9xJLX7quph/Nl9Q/4/4NU2dRFqXdWgpW98exaKQv6g2+a9f7PqW+cAKVEOZvvkdDzxkntv7yrccFEDJi6w==";

	protected static final String APP_ID = "0200EH0013035";

	public static void main(String[] args) {
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);

		MybankPayCpayCppayapplyRequestV1 request = new MybankPayCpayCppayapplyRequestV1();
		request.setServiceUrl("http://IP:PORT/api/mybank/pay/cpay/cppayapply/V1");

		MybankPayCpayCppayapplyRequestV1.MybankPayCpayCppayapplyRequestV1Biz bizContent = new MybankPayCpayCppayapplyRequestV1.MybankPayCpayCppayapplyRequestV1Biz();
		MybankPayCpayCppayapplyRequestV1.BeanGoodsInfo beanGoodsInfo = new MybankPayCpayCppayapplyRequestV1.BeanGoodsInfo();
		MybankPayCpayCppayapplyRequestV1.BeanRecvMallInfo beanRecvMallInfo = new MybankPayCpayCppayapplyRequestV1.BeanRecvMallInfo();

		List<MybankPayCpayCppayapplyRequestV1.BeanGoodsInfo> beanGoodsInfoList = new ArrayList<MybankPayCpayCppayapplyRequestV1.BeanGoodsInfo>();
		List<MybankPayCpayCppayapplyRequestV1.BeanRecvMallInfo> beanRecvMallInfoList = new ArrayList<MybankPayCpayCppayapplyRequestV1.BeanRecvMallInfo>();

		beanGoodsInfo.setGoodsSubId("1");
		beanGoodsInfo.setGoodsName("1");
		beanGoodsInfo.setPayeeCompanyName("payeeCompanyName");

		beanGoodsInfo.setGoodsNumber("1");
		beanGoodsInfo.setGoodsAmt("100");
		beanGoodsInfo.setGoodsUnit("单位");

		beanGoodsInfoList.add(beanGoodsInfo);

		beanRecvMallInfo.setMallCode("1001");
		beanRecvMallInfo.setMallName("mallName");
		beanRecvMallInfo.setMccCode("1");
		beanRecvMallInfo.setMccName("1");
		beanRecvMallInfo.setBusinessLicense("1");
		beanRecvMallInfo.setBusinessLicenseType("0");
		beanRecvMallInfo.setPayeeCompanyName("recvname");
		beanRecvMallInfo.setPayeeSysflag("1");
		beanRecvMallInfo.setPayeeBankCode("1");
		beanRecvMallInfo.setPayeeAccno("1");
		beanRecvMallInfo.setPayAmount("1");
		beanRecvMallInfo.setPayeeBankCountry("1");
		beanRecvMallInfo.setRbankname("1");
		beanRecvMallInfo.setPayeeBankSign("1");
		beanRecvMallInfo.setPayeeCountry("1");
		beanRecvMallInfo.setPayeeAddress("1");
		beanRecvMallInfo.setRacaddress1("1");
		beanRecvMallInfo.setRacaddress2("1");
		beanRecvMallInfo.setRacaddress3("1");
		beanRecvMallInfo.setRacaddress4("1");
		beanRecvMallInfo.setRacpostcode("1");
		beanRecvMallInfo.setAgentbic("1");
		beanRecvMallInfoList.add(beanRecvMallInfo);

		bizContent.setPayMode("1");
		bizContent.setPayEntitys("1");
		bizContent.setPartnerSeq("TEST2019042200001");
		bizContent.setAsynFlag("1");
		bizContent.setReservDirect("1");
		bizContent.setPayChannel("1");
		bizContent.setAgreeCode("123");
		bizContent.setReturnUrl("1");
		bizContent.setCallbackUrl("1");
		bizContent.setPayerAccname("1");
		bizContent.setPayMemno("1");
		bizContent.setPayerAccno("0200062009213057712");
		bizContent.setPayerFeeAccno("1");
		bizContent.setPayerFeeAccName("1");
		bizContent.setPayerFeeCurr("1");
		bizContent.setOrderCode("1");
		bizContent.setOrderAmount("1");
		bizContent.setOrderCurr("1");
		bizContent.setSumPayamt("1");
		bizContent.setSubmitTime("20190422150000");
		bizContent.setRceiptRemark("1");
		bizContent.setInternationalFlag("1");
		bizContent.setPayeeList(beanRecvMallInfoList);
		bizContent.setGoodsList(beanGoodsInfoList);
		bizContent.setAgreementId("1");
		bizContent.setInvoiceId("1");
		bizContent.setManifestId("1");
		bizContent.setAgreementImageId("1");

		request.setBizContent(bizContent);

		Random rand = new Random();
		String msgId = rand.nextInt(99999) + "msg";
		System.out.println(msgId);

		request.setBizContent(bizContent);

		MybankPayCpayCppayapplyResponseV1 response;
		try {
			response = client.execute(request,msgId);
			System.out.println(JSONObject.toJSONString(response));
			if (response.isSuccess()) {
				// 业务成功处理
				System.out.println(response.getReturnCode());
			} else {
				//失败
				System.out.println(response.getReturnCode());
				System.out.println(response.getReturnMsg());
			}
		} catch (IcbcApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
