package com.icbc.api;

import javax.servlet.http.HttpServlet;

import com.icbc.api.request.MessageSendRequestV1;
import com.icbc.api.request.MessageSendRequestV1Biz;
import com.icbc.api.response.MessageSendResponseV1;

public class MessageSendV1Test extends HttpServlet {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1588786734333856129L;
	
	public static void main(String[] args) {

		String appId ="10000000000xxxxxxxxx";
		String MY_PRIVATE_KEY ="MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCJpajuZwxgVzEbHJBhlwabIvFDP6Pznk6NBmZxxPpq9g+c0Rean6f6VrmoMD7LMZCc9TpoBuv3DArXndv7L6mkStGx4vlsRiPRrOgRwxa4RxFvJ8Z+T5sPACLeGl7Gse29IG7Fvd7k6ZvaS4PE/v0i5MkArgzOAWTYyFSDHcTCF0e+I97iSwrJZ0pB9DSjWfJkNFibnmDe3hV2eBKl+ctfFZs/9vj4jy0eQEbcK1J3OiHACK2Qs3C5iFFuoqRl1WNjrRe6u7rDxCIgVQ5rSYZVEhWsrujYK6Rk+PiumLZh+vi+m6kKnu+Uo/ugHXqd+oqQYN0I4knjlST9gsii5LJLAgMBAAECggEAT1fHfcy2rJ3192vKqgZVT32f1qTLi/VX0CC9Up05wAggTcOVOJMJT9tH33QX7iae9mrBBQ/gWqJ9aXZcRHlf7w0VvNVZ8xinMwjZKMvsv8JvgURLPaoDdm0crCxFL4GGybr1P1TIM+mY5gcbaKWXItMALj0lsmXJTNCFLqMtNLc+adRtGA6ulfx3sYIwX0Cn2NedSuHWvJCIcSTBwMg78b/vCyMR2hEGmrvXPrWfihdvkP0wdgy4iJ67nCIts5rs96NQMMFhKo2MUh4hDaiy9Md2AIaDX1OunXwbGIqyCEIUV/2VnmXUz6+DVHnCe+SWjbDE9FA6o6jVoamBFh3mIQKBgQDV2fsE565qdJYNwVZg1XUlig5yltdels17zdxG0T/h5YSfiwfdNdz6dLQEmfJC8kQwQUak3sQT+sFiaqT3VCWztRW5G3PQXHhFuwwi5OF6L3n4c9F1d+plzT9CZwZYVxJFf22SLmouoWLtqst5aT3UPXCZ5rHDeikQ1d+hMRRN2wKBgQCkxryTSDZZbg2Vj49K1ta0RR7X2GxvcXRdjWK189FApHvCojkYdZsvz5vtLm+jQ9S01beRXTZstWc53TkuvbFV+6OyixNzn6AdiOEbo/DJ2tTxRqGx+roxnwFiYXkufBPesPCBkJbwSAVB8tG0E7Uc0zluhFBJjwCGch49Rk0wUQKBgD5Vlpy8Z5OyPhbuVx5MuiPiFQoDu+1faa//toiR79wJydmzbexmCe6bW+nHcd1fvs6OCGiAYoksW3gze7h4N7ElRJq7TMvcWFaDCiuVqb+y3Qu1vsVN2e4ooJrbavcPEk1dsnOcweirtClw0nSmX5Zg/lRt8Tz4e8XjgZb7tl5nAoGAJTk0Hn2AsaE39mJw93IjHKREvHQKwv45UG0BMKN80QKXZreo+EqRHTLkQads1tAa/CMPjgololc0k5DTOyjlJ8xqBYp/gW49CI8Ec28MlT0XP8459u/yIgWOlX/5lTO4dWU5X7ufLXbHoUdOckTFdFaPMdU4IfXpI3YiOKtqApECgYAJxD+7TjKkL5eRQxJrqKVwmU963tJYbgakVj9Iyuu/5kcPWMscTtSOW8Nhp2uzQEgrQBR4Vmy17GVKc4au3k1NOM2BukJMd3SQWBzZCZbpK4FWGgIhBn49UkwAlxlxqRbwaRnXyMrwaeJWe8Fs5xZQw4pQlvzFPGz7/0Ye87d0Rg==";

		String APIGW_PUBLIC_KEY ="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16"+
		"bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCL"+
		"T7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP"+
		"3CiNgg0W6O3AGqwIDAQAB";

		
		DefaultIcbcClient client = new DefaultIcbcClient(appId, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);

		MessageSendRequestV1 request = new MessageSendRequestV1();		
		request.setServiceUrl("http://x.x.x.x:8081/api/message/send/V1");
		MessageSendRequestV1Biz bizContent = new MessageSendRequestV1Biz();
		request.setBizContent(bizContent);
		bizContent.setMobileNo("134567xxxx3");
		bizContent.setMessage("�����Ų���");
		
		MessageSendResponseV1 response;
		try {
			response = client.execute(request, "msgId1233664");
			// ҵ��ɹ�����
			//System.out.println(response.getReturnCode());
			//System.out.println(response.getReturnMsg());
			//System.out.println(response.getMsgId());
			response.getReturnCode();
			response.getReturnMsg();
			response.getMsgId();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}