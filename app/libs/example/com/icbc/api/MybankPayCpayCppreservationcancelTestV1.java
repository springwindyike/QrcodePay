package com.icbc.api;

import com.icbc.api.request.MybankPayCpayCppreservationcancelRequestV1;
import com.icbc.api.request.MybankPayCpayCppreservationcancelRequestV1.MybankPayCpayCppreservationcancelRequestV1Biz;
import com.icbc.api.response.MybankPayCpayCppreservationcancelResponseV1;

import java.util.Random;

public class MybankPayCpayCppreservationcancelTestV1 {
	protected static final String MY_PRIVATE_KEY = "BKcYpFbllOCOFO9edvl82KOEtxYeppjGtvtmQELrK6D1SG70UGbJtRlYT9zaUNoD2jz8/IaaSh9YDoTm2e2wbFXnpEuzbmAXI4M8fxzcn3gD+UEs4eZcss+6p7PVyWu3hVfMD9sMLMOnrGsXpJG9xHnBa4DKKY6zzTOGbnblXIqI3tzWYop9jf2ggm+0fY/ns3iz78bOX/9Xocx0PdFT0RP+rxrnzY9ObCeVZieHXo5vekttMat+B4l0uRKsg1/QZ79OMb5amhFgliuXvnQ6MDXvUgz99LgjRKUqI6eln4eXm1azecXXbhupuhY5mvOxe08MfNSw4Fj/2oTQvUQky+ibZKQMQWOCMPxVZ3C3/GVh1XBYUgcGWKovMTPadyesSy0/2jZ4M5Vy+XKLmlgywYXbhUXQ/7FucHxQmjl+y5mtr1Ne/O4wFZ90A2BhDKacqpgezdzQLJKpgDDI1DFLKcdIimGFzmAHvgTAeTHfqGQYYYRRRfZ+emNo0U0VkmFoobaoh0Tuf1VkthATjupVptx3UpWULnwMrRrGQgjRn+HR8mXAIPkUdhXQ/eQTZ9CP4N21iZO+91Mtbc0gJZQ9svqmSOKhruOtuTN0OhyvxE2SEMoMbRqp0Gk9kp1ACk9Rqd35nYbIXKvbteBFI1eVn2JuqFybySG1LZU/M2M751twkt1AGZ6SKa2EyCJRE/svfi0vzW4rSrxoSXJCKM2+YAfkgc08c1LgSEIvBu7c1xVTph8wylm4OQAEUfXZCAwb++uwvtj/EGFDGdHiKiF5QOU03pjQwj8TMFwYEN+6+PwleAlfExT78XDi6NAlvUhlYPq5Xmb/S5I+xQoHr1ghsdnPzMdIgZY33uFlUSX/0HWxSIzMfQbIn1IFq/PPxIxo18oqA8IKEZe7FvIlfNq4phM2C2XTpaKFvFqbzS2tbSJXOUonxrFB/kdZXDM1yMCI+UmnQETl4ndpvsTV6EQEhQpXrR0zp0XgJzItrfcABSjtstqJtyNo/si+xxPjU6O8xn7YLi/RlC//Se+YF12WoOTurakJruuGR1dynFSv2zp74OFSKv+eaODnzDBvI8vdq/jB0z8LTa9HY4h/+bsujyJz3IcOam+Yyxf3h53/82EPZ69vzRn+kUzoSm2yBUi9ISS3bSpfnfBhyOLIT2g6m+3Ho/lEsnZTjvjTstslJpyX3TyyQRtvLWv2X49wAIETQsWksurcrQWUsfLETHvwCQE1rF1GNWho1qfupagqxJt0z9+5v1WofbVQBsyphX2HOQP9advd4r53EZrMSh3/Isn9BN6iU67Ebp16WhYI2QwCmwFR1nzo5QxASV/dPNClFxrIPa5nubLTL495UEhhn4A3HJs20RCRXcetYQ/bVYA6uqPIP76pr8mXg4W9eDvoWJb1Y9aor2JxdbtY/0/OwPnnyDMMO8u5kVqxaY4Es+a43WXat0Cs+/vTMFR9v/MVV7MOWGD9RwvMAnTMFfiOCSUKFWfPGd2o7wyY4+aCUOnI+L6nmrqfuYFAwP7Bi/QmK80yXDXI1078LBjGlICSoGFIjsyJ1wQec5H1rg5UHF7qt28qkVsxMok=";

	protected static final String APIGW_PUBLIC_KEY = "MIIDljCCAn6gAwIBAgIKbaHKEE0tAAI7+jANBgkqhkiG9w0BAQsFADA3MRkwFwYDVQQKExBjb3JiYW5rNDMuY29tLmNuMRowGAYDVQQDExFjb3JiYW5rMTI4IHNkYyBDTjAeFw0xODEwMzEwNTM3MzFaFw0yOTAxMzEwNTM3MzFaMEkxHTAbBgNVBAMMFDAyMDBFSDAwMTMwMzUuZS4wMjAwMQ0wCwYDVQQLDAQwMjAwMRkwFwYDVQQKDBBjb3JiYW5rNDMuY29tLmNuMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnqvltq3gG1eVgTJ547CNI0jfzgC6GphVQyE7YzhHwJLnufTBAx/Zezg9M+R1UJWqg3R+WYPu4VXpkaIz0N/0obG5FkMFqyViz8ZSwUHcntLK5R65vBbbJ/UVcAe3GYpIBONB7ApeLuWjh5SZ0Bq8rXZ/DVjg/JMbBnqG50rbjETRHsaLODn447yJMK4H3wEq9DaRHH8xEkd01qv3lnRb0PpU78EWyMwoyHgvo7GLuR0sAjOeRAqNeYrenm2rG+UGyYsT9/K4Lw6H2fAfdtFUMaAQ+q3p+qQpPfMJXRTXLgTfQTdlqweVIppYFMNp1IkwbWtqbXliN4rCknj1VxjNaQIDAQABo4GRMIGOMB8GA1UdIwQYMBaAFJ6AEaO7V853/fEnZ/7k4X8i8lHzMEwGA1UdHwRFMEMwQaA/oD2kOzA5MQ0wCwYDVQQDDARjcmwzMQ0wCwYDVQQLDARjY3JsMRkwFwYDVQQKDBBjb3JiYW5rNDMuY29tLmNuMB0GA1UdDgQWBBQEmtl3SpIDUN49NC3V+kprWYraTTANBgkqhkiG9w0BAQsFAAOCAQEAQKBKbgxSwRoZbqgOza+CZFcP3Sp16x2Yek1C5nlcX5REHCinbNVeMKmqnTEl8DK/XX0f/nuj+5WPsSMeQ1ltSjfMm1NAJNwwTqdq1zU5jK4YCA0dZhj90pooVgcXu152erCcP2lHncAk3xrVxgMWIL82sYQu3pE/TmEc6K6ofuPzcCdNxoAJpn82qYuCxNQUxu3fKdZsEpwt0sgJBhSiVkzxUMK9GcEXz177f6ktivJfw61VKZUq3BQXv9VvuprLEeCC9xJLX7quph/Nl9Q/4/4NU2dRFqXdWgpW98exaKQv6g2+a9f7PqW+cAKVEOZvvkdDzxkntv7yrccFEDJi6w==";

	protected static final String APP_ID = "0200EH0013035";


	public static void main(String[] args) {

		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);

		// 设置请求对象request
		MybankPayCpayCppreservationcancelRequestV1 req = new MybankPayCpayCppreservationcancelRequestV1();

		// 设置请求路径
		req.setServiceUrl("http://IP:PORT/api/mybank/pay/cpay/cppreservationcancel/V1");

		MybankPayCpayCppreservationcancelRequestV1Biz biz = new MybankPayCpayCppreservationcancelRequestV1Biz();

		biz.setAgreeCode("AGREECODE20190217");//合作方协议编号
		biz.setOrderCode("20190217");//订单编号
		biz.setPartnerSeq("1");//合作方支付流水号
		biz.setPartnerSeqOrigin("12");//原合作方支付流水号
		biz.setPayAmount("1");//本次解保留金额
		biz.setOrderCurr("1");//交易币种
		biz.setSubmitTime("20190422170400");//交易平台提交时间
		biz.setOrderRemark("备注20190215");//订单备注

		req.setBizContent(biz);
		MybankPayCpayCppreservationcancelResponseV1 response = new MybankPayCpayCppreservationcancelResponseV1();

		Random rand = new Random();
		String msgId = rand.nextInt(99999) + "msg";
		System.out.println(msgId);

		try {
			response = client.execute(req, msgId);
			System.out.println("response:" + response.toString());
			if (response.isSuccess()) {
				// 业务成功处理
				System.out.println("success");//
			} else {
				// 失败
				System.out.println("error");
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		} finally {
		}
	}
}
