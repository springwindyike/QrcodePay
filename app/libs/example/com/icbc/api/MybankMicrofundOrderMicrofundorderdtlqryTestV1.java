package com.icbc.api;

import org.junit.Test;

import com.icbc.api.request.MybankMicrofundOrderMicrofundorderdtlqryRequestV1;
import com.icbc.api.request.MybankMicrofundOrderMicrofundorderdtlqryRequestV1.MybankMicrofundOrderMicrofundorderdtlqryRequestV1Biz;
import com.icbc.api.request.MybankMicrofundOrderMicrofundorderdtlqryRequestV1.ReqPriField;
import com.icbc.api.request.MybankMicrofundOrderMicrofundorderdtlqryRequestV1.ReqPubField;
import com.icbc.api.response.MybankMicrofundOrderMicrofundorderdtlqryResponseV1;

public class MybankMicrofundOrderMicrofundorderdtlqryTestV1 {

	//应用私钥
	protected static final String MY_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCa/gxMwKFCA9E05HYtZYfUk83nJ45VgBn1BZqZvE01wMbzrEqpjzUCkIrV5HEI2A37q4T773AUwHAVWQtF5KwrQ4UG/hUFdE9jPpOFtuo8z2/a27s34muHyuJWwJZo20XbcBCpjR3YOT/kgYKb0eZWuXJqjbsmJSHEgI/3eizwddtdhDP08/dn6mgT+f9EvJjtvHcdMHCKicOc6th20yoabMFxIwR1gvuAhvhIAe0YFwRx0nxWcwTtM8IsFZDRO31Piq+uYfIj1W9yq0q8QQorOHLNgn43CLetQMG2LsHLIQOnVdtFvPCN/3kOxeA1Uj0sACmjuNSPNF/6lYR5RLsNAgMBAAECggEAWUBP/uayNZyTHT0uHEgqJqySVjj+CphA2krG0x6O65Q+PNWLDQcNRJPNjwwEV05rBvCnHJit1xVVtcVX64CZ8DPqZ7NqkYB/squ3Mbm6OxhM1h/QOIcm2sRnAAPY2TrjiFCJF8nOVNPqygAWIPqHBIu3qkpBad7aChjqTl1JgZHF/3HbQoTCRLMq2XgN7qa17/N+2wKqP7a1Of/96OUjfKIof7VC71ycGyUZm4nMjOXZcKXtq6e5UfmUaauixFeT8vaDPUMu+52voRRvH/ss/ny9tc4zWD56jvqLKhijab12yZ4ZchslZkPMXYKMyKoLYhowvxYl/7wggX9Ah2X8oQKBgQDdDoRfiT6H2q/TA6yH4QnNZxM0TvGj4F9mO++ZoqH9psSGBJ6qQ+WSFRWDUZLHxt5rNkUftS2gXKITyHc/stirZZegme5saQ1tdqRWEWtCB/jnfggj1HG8PpQG4SjYDOxNWY/JXu7aACtgNGI5pzO09oL4Wp44F3si726rRA++FQKBgQCzfhx8KLAzTFCxSsGP5mWygtGd7kzfkwjGCtuDXNgSFgxVmGTVBiSYfdoewt7a0R65aOyQrpyE+KJoEgNtgex834GxWs5gxlsm/xmBzPXjUH0dtq6EQ1U5kn9SDsIb8472ThDwMXyTLunR9RNrwv2SL7ZieiYdhfYOnQ7qlSQ/GQKBgGZ38z6B1P2OjpAnFNPLqgqPrCREL9jCChbO06sI60Q0CMcC3zWX0ZPcuCMuLfbzJWjXOEWRa3v5VJwNAdICKlOQ/S9SC2YvcCz8oQLQgkKShXtxPX62XJ5g96cUuiUkIGleibtTiS5+g5zNy3ZkHiDVYDKVduATal3wVQGIxC9dAoGAUwKe39jdbEv+AZBmJkvSepU/pj+AM+HHK/f3fzAgCXVC7Q8WiuJVaGTDzHgpIp+WCv94cI0ge+qVCXZTOYDdwv6G92PckCsMGuPdgwcsLJ2bz3MeELMnJgIXefazVMP2OPjvonXwfA01O9GQ0sSSCtqgCbkeCYdbvXRrYpfo9HkCgYASztXC4qODMQdX1jmd3mshO1lowX/ehB4DfwHPjIJtHoFFJsj3oDEflmRnNI+ZeV9Xm2fVXYnXqdr6TppFb4Q47lMPiQZKfw9Qlj9+rTrE68jMbjuWnYWAqBLryXRa6i/76pX/+1fvxmOoUk/P4PBhq9WTXDfQqXPSy4omG51WWw==";
		
	//网关公钥
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
	//应用ID，暂定，APP申请分配
	protected static final String APP_ID = "10000000000004094661";

	@Test
	public void test_cop() throws IcbcApiException {

		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);

		MybankMicrofundOrderMicrofundorderdtlqryRequestV1 request = new MybankMicrofundOrderMicrofundorderdtlqryRequestV1();
		request.setServiceUrl("http://122.64.61.85:8081/api/mybank/microfund/order/microfundorderdtlqry/V1");

		MybankMicrofundOrderMicrofundorderdtlqryRequestV1Biz bizContent = new MybankMicrofundOrderMicrofundorderdtlqryRequestV1Biz();
		ReqPubField pubField = new ReqPubField();
		pubField.setZoneno("00200");
		pubField.setBrno("00998");
		pubField.setTellerno("49");
		pubField.setChncode("1");
		bizContent.setPubField(pubField);
		
		ReqPriField priField = new ReqPriField();
		priField.setMarketNo("0020049");
		priField.setOrderNo("00000000000000000272");
		priField.setBegNum("1");
		priField.setFetNum("10");
		bizContent.setPriField(priField);
		
		
		request.setBizContent(bizContent);

		MybankMicrofundOrderMicrofundorderdtlqryResponseV1 response = client.execute(request);//请求通讯唯一编号
		if (response.isSuccess()) {
			System.out.println(response.getReturnCode());
			System.out.println(response.getReturnMsg());
		} else {
			System.out.println(response.getReturnCode());
			System.out.println(response.getReturnMsg());
		}

	}

}
