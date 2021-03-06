package com.icbc.api;

import org.junit.Test;

import com.icbc.api.internal.util.internal.util.fastjson.JSON;
import com.icbc.api.request.CardbusinessAccountpartnerApbmsdtlqueryRequestV2;
import com.icbc.api.request.CardbusinessAccountpartnerApbmsdtlqueryRequestV2.CardbusinessAccountpartnerApbmsdtlqueryRequestV2Biz;
import com.icbc.api.request.CardbusinessAccountpartnerApbmsdtlqueryRequestV2.CardbusinessAccountpartnerApbmsdtlqueryRequestV2Biz.CardbusinessAccountpartnerApbmsdtlqueryRequestV2BizData;
import com.icbc.api.response.CardbusinessAccountpartnerApbmsdtlqueryResponseV2;

public class CardbusinessAccountpartnerApbmsdtlqueryTestV2 {
	protected static final String MY_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCF0uUS3KG+jFPrjbk9C3nuUGtqGIJb6dceWx1AGa7Jz+pfdpVugvk9iof+cGStsRtoWY/3n2MYNjEEQ7QaJoIduq1CBHTysHoUL9PYD+8E4mityz3UP1cJNOymBq0340BB1WoNtC8Q9ZesVt5gnm60eUlqVvvtZ6larRcZkCfs5a0/muFf5sihB4L449cXzSAqETOXbttWTRKzSnL0ZcBzEOaXjoksuIHLR/mixIXlcbdLtRCpQ9xDlrMhsvanmqzEb5jA6Wv//ccHPju+9UDf3xL9L4u/Oo82x6PyYeI3cISaHBHntjEcxUypzfJYh1DtN4fIvzYIc2LXK32e5d8xAgMBAAECggEAeJ3N5ENB8VnPpcaWSAQZAQgw2G6AyFEql+ytn4HGfZVNfH+IThP0i1haHKW2yKqRtmrLDPf2u/LUGTDgmpVMv3jrAk68DaWsUpeNC/fIihF7IfHGp4/zZZPzG+12oKHN38h4DyPxLAr/itC9HD6QL1AGMLd319GP3e+Wm27H3YcUCOR62mCFhtzOHR0eBRPOwDmvqaZnmSfz1bpGYk/38Bmc9dTlPDVXt+AdJ0VCQJXAtYdSeQ8FK2xW/JVxrugwAF41WYqsJ7ZsNPxVrSfshx5cs68aWz+I71UGhwNWoxzVBli2xDxy/Jy+71HNh5E5q+FcYu6YmEfStauUtVzXQQKBgQC50PUQkNtzeaa2MtBXLhuwdRdGlkpVlQ59fRrvU2xPmO0zhE6wxTMCz2L1h/Pyc/310qjPKd+mY+qnrY9i4Ubx15eTPxKDWIiXs54fvEaaYXTyG0WweAt23hKUumAptTeazAaRKA1AGU8fMI+q9KUgby1z3mU7KI4TgsDifXE/+QKBgQC4Xqhdd3IQbMjJtt8uGKxqAfiAG+vwFKgspPSlaLxo2NmSbQbtgF2EF7tn708jEd0DI5vj8+gXKWPFRmEv4F/cd56EGhb9yxWYrZLPYn5qTv0wB4CckbKKvIayIoG6j53NSX5L5rCyvT6lEnCLVNMC0jMTUgcH6VrYfvqB9IlW+QKBgDtWPuvLVkjJ0DLehylP0AfJXGVuGM67iqUIDlHekffZHeYVmgtY7bE4CKHfiEckQzT80GtXM9QulAB3rBInXkBcWErtGTxYSUYoVZZMyT8DYBTwIJD5xK9wuv5DhfHLrLYB8Rbpc1HEwz9ygm5VMWXqGtmlay45BSW122J4LHIBAoGADF6lcyfpajqyOf5f+OrE3pPlRUsaSFBKfDxRAawGQA6UgmN4PIUJQSyKcU24BIVVS7me4uthXfRz8i9no9us8tC/vOM3Oa3fdA/pMqrMCnvkNs26DkckMHS3oMn55Ddwge51X8hJgKR7yH11OZPmWGEb9ibhu+EnLDFQw1lRwZkCgYBdH/Oqw4dgJpD9OnCOfo9gQAbvE6h6ZJh6NXLPAd8zFyy3LqhEehkB8ehAstCiUJ+jJ1kaBTR0T3eSBTt+sH4X//FuB0oO1BCisxLA0jNyp2fu4oVjDWzEumB5GTA7vPAN26mZqYTGjY7GfSuP9nLu1t5On6cEhqfhY8rUvMrQWQ==";

	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	protected static final String APP_ID = "10000000000000108510";
	
	@Test
	public void test_corp() throws IcbcApiException {
		
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID,MY_PRIVATE_KEY,APIGW_PUBLIC_KEY);
		
		CardbusinessAccountpartnerApbmsdtlqueryRequestV2BizData data = new CardbusinessAccountpartnerApbmsdtlqueryRequestV2BizData();
		data.setQuerystartdate("20190701122512");
		data.setQueryenddate("20190730122512");
		
		CardbusinessAccountpartnerApbmsdtlqueryRequestV2Biz bizContent = new CardbusinessAccountpartnerApbmsdtlqueryRequestV2Biz();
		bizContent.setTranscode("GYJBILLQRY");
		bizContent.setVersion("3.0.0.0");
		bizContent.setMerId("dzb02000998218000293");
		bizContent.setFseqno("0000001");
		bizContent.setTimestamp("2019-07-26 10:41:19");
		bizContent.setData(data);
		
		CardbusinessAccountpartnerApbmsdtlqueryRequestV2 request = new CardbusinessAccountpartnerApbmsdtlqueryRequestV2();
		//request.setServiceUrl("https://gw.open.icbc.com.cn/api/cardbusiness/accountpartner/apbmsdtlquery/V2");
		request.setServiceUrl("http://83.28.222.45:8081/api/cardbusiness/accountpartner/apbmsdtlquery/V2");
		request.setBizContent(bizContent);
		
		CardbusinessAccountpartnerApbmsdtlqueryResponseV2 resp = client.execute(request,"12347");
		if(resp.isSuccess()){
			System.out.println(resp.getReturnCode() + " " + resp.getReturnMsg()+ " " +resp.getFseqno() + " "+resp.getMsgId());
			System.out.println(JSON.toJSONString(resp.getData()));
		}else{
			System.out.println(resp.getReturnMsg());
		}
		
	}
	
	public static void main(String[] args) {
		CardbusinessAccountpartnerApbmsdtlqueryRequestV2BizData data = new CardbusinessAccountpartnerApbmsdtlqueryRequestV2BizData();
		data.setSellerid("");
		data.setCustomerid("");
		data.setRecaccno("");
		data.setBillsts("");
		data.setPagenum("");
		data.setPagesize("15");
		data.setPushfailedonly("0");
		data.setQuerystartdate("20190730122512");
		data.setQueryenddate("20190701122512");
		
		CardbusinessAccountpartnerApbmsdtlqueryRequestV2Biz bizContent = new CardbusinessAccountpartnerApbmsdtlqueryRequestV2Biz();
		bizContent.setTranscode("GYJBILLQRY");
		bizContent.setVersion("3.0.0.0");
		bizContent.setMerId("dzb02000998218000293");
		bizContent.setFseqno("0000001");
		bizContent.setTimestamp("2019-07-26 10:41:19");
		bizContent.setData(data);
		
		System.out.println(JSON.toJSONString(bizContent));
	}
}
