package com.icbc.api;

import com.icbc.api.request.NfpwChainTradeListqryRequestV1;
import com.icbc.api.request.NfpwChainTradeListqryRequestV1.NfpwChainTradeListqryRequestV1Biz;

// 网络融资产业链贸易信息列表查询服务（页面）
public class MallNfpChainUiNfptradelistqryTestV1 {

	protected static final String MY_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCXY3LeSkYCtpk2mmyeLKYA2OrFyp36vW7OOkfU0w6OkAnGnOFY5qn92ig49Psn2sw96yRbdbq2466SM9Vy13RCYLg2WnGDNmx2+QZr1j5gSmCusk76fVvFv5c0/WCdg/9IQt/NPLR3Pg9vyVGTrw1zZwP5MRtizOTTBAMMgfbPOD8JrS2+my1CwX7P9vrBxvQZMLGMHJsMneaAuoG9Kfo7UpEUnIBiKLq/9DbDMQQ1fSS0l0xA64IJLuLG+nwiwzgyWX7AblQtCtdPTHmBCPk4o8Y5hpNAyQ4dtcWk1F90i/YxexyDwbDBnPJ9uP+HFp895Je8XoPy3VqMEQToEdF/AgMBAAECggEAYoeJVYAFvPJXGaC8HN52VIrZkk3jMDRmj7aC1dNf4A2DL08fo5rM/LkmAJwBctkGoS4Pha9EDJB3KBSwUYRE2IbWnhmTU5DyWySMt1bDVixSbKEEoidAuZ2OriBS53HnjoJn4s4lro4nwdvHSlVebcOYZHE/n7g3Hde4nEVh+09hb6JXXFC3EK/7p80zt0wjp1yv9/iLPgXSvyXRW9qM8ED5JbDpsO4nDvF5ZwXWjQ3iauQjsKjVgYcNg31PNq6tl39I3sivx2AP8IYoYz/J5IukKrc6Yeb9KLyjrhMzeoJr3gzpp5T/VPb2vgeH+z8ytU91inMiS7WqmD+xNq33QQKBgQDSph1K/fq8+ZyckERklNudVdtsIKHtNL5kFvPFZUSF94oUgg6y6IkWO1wtDUIUAxi9B88/l34TBeYqmvCfDe/MN7npAjNbDhh6m6VyPZqgUkCdLCUqPpoI3vEP7N8iLPCXZoVs6nvrOqh0tbsLUplQpDc3KOzQqYhhGGyoqZNfUQKBgQC3+zRUH0Y8TUdtkD+VWB74+FzfmgalNZQZMjVbhkpmPWLCj69IxtHIFwWtKQQdeAvYii8PgHrstkQOSEcpXTItIJXcHpwRCypyZpO1i/ScvflhdHJdWKYsaho7k/peGWTP09mD7UHv3SzEC0taU6GzvUE7ZsZbZCwQf8OPkbIPzwKBgQCROH4HXjMHJtpmQTs1UD5bKH6d+51Gh88d94jVNCxaYz5pRwRVKOShVAkG8hX07/GVGBYz0//Ro4Z7Jtft/1CrLFvZnG/FPWF43Wbg7EF2d14ePPneNsxAg1oTTYzC5dJzvfUMEled4pGR7Ftnwej6ZEvAllE0xTvFHG6ElGuKEQKBgDuIBzipHfrpLpGfOVPDvdHl23dmyXuvyIoWmvlQjMZkWo6GG7u6yaqq+GU9fl1iuMKKhAvKEPyDRaYxcQVLaK79ekBNj0ZcjJGT63u1G6OUPRtxqIfX5X09n9tjWIIWSW6OKDXuEYXh1VhiJzHFGe+k73SfHtP3p+J21PqhtDI1AoGBAMQZUXTDb6wSA76b2Lc5/pqYYvoO1GQYJvWm8o4ZTlno7iBdFTAOEz7ekKFmyuW/NiZq58hOA5PQevRmXKggLix5qSlvjLJc8y93gC6kqW/Znuaf2fYHR7fl7jR1neltETtEWvrW0Ei7YugeBb4sim1lagbPLI87Ab8hwSJahwHh";
	protected static final String APP_ID = "10000000000002354554";
	private static final String APPID = "APP_001";
	private static final String SERVICE_URL = "https://122.64.61.111:8081/ui/mall/nfp/chain/ui/nfptradelistqry/V1";

	public Object test_cop() throws Exception {
		UiIcbcClient client = new UiIcbcClient(APP_ID, MY_PRIVATE_KEY,IcbcConstants.CHARSET_UTF8);
		NfpwChainTradeListqryRequestV1 request = new NfpwChainTradeListqryRequestV1();
		NfpwChainTradeListqryRequestV1Biz content = new NfpwChainTradeListqryRequestV1Biz();
		//列表
		request.setServiceUrl(SERVICE_URL);
		content.setAppid(APPID);
		content.setOutVendorId("190002");
		content.setOutCoreVendorId("0200003309004709145");
		content.setOutCustomVendorId("0200000209213652642");
		content.setStatus("0");
		content.setChainId("GY-2017000004452");
		//列表
		request.setBizContent(content);
		String s = "";
		System.out.println( s =client.buildPostForm(request));
		return s;
	}
	public static void main(String[] args) {
		MallNfpChainUiNfptradelistqryTestV1 q = new MallNfpChainUiNfptradelistqryTestV1();
		try {
			q.test_cop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error!"+e);
		}
	}

}
