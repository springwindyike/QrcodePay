package com.icbc.api;

import org.junit.Test;

import com.icbc.api.request.mallb2corderpaymentqueryRequestV1;
import com.icbc.api.request.mallb2corderpaymentqueryRequestV1.mallb2CorderpaymentqueryRequestV1Biz;
import com.icbc.api.response.mallb2CorderpaymentqueryResponseV1;

@SuppressWarnings("unchecked")
public class mallb2corderpaymentqueryTestV1 {
	
	protected static final String MY_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCRVgmyC7tV4L4dC5B/Hx/EIJFQwdFN6aB8Ia3AxhGgC/hAKfMohR7qDk0ZusNw1Af0ov7APl3tpz0U25+4aLGvy03Bu/eZHFK1feFxakZJtpGER6wm2EAd83cLoq15diIaIzOo8zgFuTbQu2TlIc4tDtr5ZffEe18eTD8asirZ8rtgqYmHq51cDmvBrHoWKHewkrU0fVjFdjiPglu0xg4PT4SHNYe29vWEkDnKg07YKF+t5u3EOyL3GrCQEFjJx87cWUVmGNehRtyT7qjNyyNiFXx4yngL7/WFc1ieMnPVzzOeHlLcRl99q22diO/Lv+i+E8oTzlzg+A233kV+jZtjAgMBAAECggEAT9xjP37K1gnE7djo8bF8lxz+PM4D4Tg7g3pOK9uq27M4Gqnyf5WGwz5Qh47kzh70sCzQp3qdynVXTxrPzVlaKisg8xACohO6LxiYxOWM8fxsQa/QnRe/Q7YA+FfP0ypi2tH1FSVw51Q7Fr+iVXYaARBkqx6o40KXpeJn2peEjHXM5SlZE0JKdeShfzvFzJVBClYLhGU7Zmtka8kFmBNCM3CdReH0lwyuSxcxfn4xq3wUqI6+0PU1qKrBsbRrYd3RIDvCrQ1kFQHiwwGgQ6I557KgIM1N+d6KvQQSDGlw36Q2JBqcbGJDGOUsIbfQaGKVqayttUXffLApcvnnjeAt4QKBgQDJ1ZEjJzr9DFjdqwVAvbRZFpxjEsONhUxQZFteJFGloLMqKPKDMzsQyruWBTPx+f0y/da0oBGCq1Uy6Fzbfdonq9WiZHoUy2mSMmNJdfNqN/fTM6uSAnP+FYy+EQ2hTIBEX4EY51cAQhcYuC4i3QL66QXcitKmBFiyTheK8SMzTwKBgQC4Vu38yxqgbH3pggO+ebqu/0EI5PR07K/t3IT1T3JCVqYEDOLrFio9cdKd32pf9JAeH9+3tRhuzkj1FCMWxbTut6GAT1UbQEhSR5SedbXKGRukwL7pK7dc5W5UmQ/MwaFa1xsE2O+aaXFvQ1UnwJ+npyTLQdBCoUC1166ZDr1hrQKBgQCcWzhOdUu7UN9fCefN2ahnA58vGRApCESwWq51Zclid/WUCZiljwCI56UeePVe1X0TDZZQ41ftVHFyOJQG7Z4c8X9UiGYSyeoE+cf01s01UhpIoVSejgvxoBwh+fAHLs6HKT1HX6AEcS6XVcdX9sMiQXbq/RhmyCM2Lk0Ks/fC/QKBgQCfvfUOE5NHYbzbFWfZL/OuolPhOUb96/2oymgNjIMfKadD60bZIaQJCxHQ7UJpVK1u7YAY2j4KB4kBmCmwGjPoigjR/+1oaBRD+PO5PZgDQi7KXp0RwmhrgAZUGS+v6DvDVJR9ZuB7ltRN7rNkd2/jANzJpoaqtsI00mrjB/rlIQKBgCp3oFsq4n6i91B0m5zhq6wBSQEoHq0MFh2p1F+UJgRdwUcmaesTOTJqIMHm/ASLIgHPsPzZldw4qNTOFxYFbp5ARqeIIgS5Bq4xn0vN+2cKssI2lmAZ3ksg6Aw/OPvnxKCobt9LsaiJY0Fz5mcoUsmZfPb8v5+2Mgkt8sFTDu8D";

	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	protected static final String APP_ID = "10000000000000051504";

	@Test
	public void test_cop() throws IcbcApiException {
		payQuery();
	}
	
	public void payQuery(){
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);	
		mallb2corderpaymentqueryRequestV1 request = new mallb2corderpaymentqueryRequestV1();
//		request.setServiceUrl("http://122.64.109.110:8081/api/MalluserInfo/ForOuter/Service/query/V1");
		request.setServiceUrl("http://122.64.109.110:8081/api/MalluserInfo/ForOuter/Service/payment/query/V1");

		mallb2CorderpaymentqueryRequestV1Biz bizContent = new mallb2CorderpaymentqueryRequestV1Biz();
		bizContent.setAppId("10000000000000051504");
		bizContent.setThirdOrderId("020171221IM0079420");
		bizContent.setUserId("EU2017112000774009");
		bizContent.setOrderId("020200101IM0009582");
		request.setBizContent(bizContent);
		
		mallb2CorderpaymentqueryResponseV1 response;
		try {
			response = client.execute(request, System.currentTimeMillis()+"");
//			String a = client.execute(request, System.currentTimeMillis()+"");
			if (response.isSuccess()) {
				// 业务成功处理
				System.out.println(response.getReturnCode());
			} else {
				// 失败
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}
	
	

}


