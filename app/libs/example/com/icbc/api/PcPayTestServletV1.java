package com.icbc.api;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icbc.api.request.PayPcRequestV1;
import com.icbc.api.request.PayPcRequestV1.PcPayRequestV1Biz;

public class PcPayTestServletV1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {

		try {
			String APP_ID = "10000000000000045510";
			
			String MY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJ42tqQomxbLvuZTVKO4bBLwGp8SzRMiJ7jX9JNlS4sqmZzs9Z4lw/SSxf4dF9JJUErpNReUjzLp0As2FiuV8BALh6GYmiHGTWx7+v3HuWH9LiZNI00Ia+1HfpkJ8Sao8Ny5h1Pu49LayVleeLy496+phRE81dqlqaSHH8cKWnK1AgMBAAECgYBxod5f3QI2xzNe/e7GgAivOWAFbF16JofdDM4Opyww0fHucYqfgYRSPrCRqJeZYyqWAxUs0HhhGulfhAM8Xr5BxY5//x4HDqE2rOF7mrc/xkWNL+S9X5U0T8cdA3fnF/rYAUnJjKmeliuD2gcf5xYJENcnb8p/GQbiwIjoHDqe6QJBANzcevl9ke4cx1fa3ZcxVS3A1eHVtp573M/lo+8pRJlrf96ghFB54CzumsC0F7YfojDgCAN2egTqCGqNOuPJWWcCQQC3YqT5xlMlGk6Agav5Y6E5blx/AKJB8DeZSbjXLvytpXOASzoNR/A40uQXanXVqNU68l96FSq415AmTHi9OdWDAkA0el7t8Rw/i68B/Qsx5ZLrsCoh4vnlZmDtNQ9iwFeAbL6RU2qdBJhzlK5Io4IO0C1ll5XP3NLZYBJn3u7jOPB5AkEAiM/qHoHsM8j9effD0kmW1V7VWNajNqg9AnoykS73yaCem78DrzbVK7+B9UoyYNUVR2Xc/xpdhgsj+r6gcSN9ewJANSmxYF34601mteAnZwhyGKCJomiuSMNTr52i2uTspdZi0zqaerI1EGD3dAENxRebyPmPFxhwCcCbzF2gNUr1fw==";
			
			UiIcbcClient client = new UiIcbcClient(APP_ID, MY_PRIVATE_KEY, IcbcConstants.CHARSET_UTF8);
			
			PayPcRequestV1 request = new PayPcRequestV1();
			
			request.setServiceUrl("http://83.28.222.45:8081/ui/jft/ui/pay/pc/V1");
			PcPayRequestV1Biz bizContent = new PcPayRequestV1Biz();
			
			bizContent.setPayMethod("01");
			bizContent.setAppId("10000000000000045510");
			bizContent.setOutVendorId("20180426");
			bizContent.setOutUserId("M201801112326");  
			bizContent.setNotifyUrl("com");  
			bizContent.setJumpUrl("com");    
			bizContent.setGoodsId("3212");    
			bizContent.setGoodsName("测试商品");  
			bizContent.setOutOrderId("201804102908"); 
			bizContent.setMac("a3-b4-c5");        
			bizContent.setTrxIp("82.201.109.200");      
			bizContent.setTrxIpCity("北京");  
			bizContent.setTrxChannel("02"); 
			bizContent.setPayAmount("0.02");  
			bizContent.setVarNote("3212");    
			bizContent.setSubMerRateOwn("300");
			bizContent.setSubMerRateOther("400");
			bizContent.setSubMerRateWx("400");
			bizContent.setSubMerRateZfb("400");
			bizContent.setWxProPayUrl("http://www.xx.com");
			bizContent.setAliProPayUrl("http://www.xx.com");
			bizContent.setVersion("1.0.1");
			bizContent.setOutBusinessCode("10000000000000000001");//外部业务编码
			
			request.setBizContent(bizContent);

			resp.setHeader("Content-Type", "text/html;charset="
					+ IcbcConstants.CHARSET_UTF8);
			PrintWriter out = resp.getWriter();
			System.out.println(client.buildPostForm(request));

			out.write("<html>");
			out.write("<head>");
			out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset="
					+ IcbcConstants.CHARSET_UTF8 + "\">");
			out.write("</head>");
			out.write("<body>");
			out.write(client.buildPostForm(request));
			out.write("</body>");
			out.write("</html>");

		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}
}


