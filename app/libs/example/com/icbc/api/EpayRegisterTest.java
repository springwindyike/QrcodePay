package com.icbc.api;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.UiIcbcClient;
import com.icbc.api.internal.util.internal.util.fastjson.JSON;
import com.icbc.api.request.EpayRegisterRequestV1;
import com.icbc.api.request.EpayRegisterRequestV1.EpayRegisterRequestV1Biz;
import com.icbc.api.response.EpayRegisterResponseV1;

public class EpayRegisterTest extends HttpServlet {
	public EpayRegisterTest() {
		super();
	}

	public void init() throws ServletException {
	}
	
	protected void service(HttpServletRequest request,HttpServletResponse response)
			throws javax.servlet.ServletException, IOException {

		request.setCharacterEncoding("GBK");
		
		String service_url = request.getParameter("service_url");//API���Ի��� ���׶�Ӧapi url
		
		//��������ͨѶ��
		String app_id = request.getParameter("app_id");//APPID
		
		String charset = request.getParameter("charset");//�ַ���
		
		String private_key = request.getParameter("private_key");//˽Կ
		
		String public_key = request.getParameter("public_key");//��Կ
		
		String mobile = request.getParameter("mobile");//�ֻ���
		
		String cardno = request.getParameter("cardno");//�����������໧
		
		String ums_msg_no = request.getParameter("ums_msg_no");//���ű��
		
		String ums_verify_code = request.getParameter("ums_verify_code");//��������
		private_key = private_key.replaceAll(" ", "+");
		//String api_public_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
		//ǩ������ΪRSA2ʱ���贫��appid��˽Կ�����ع�Կ��ǩ������ʹ�ö�ֵIcbcConstants.SIGN_TYPE_RSA2����������ʹ��ȱʡֵ
		DefaultIcbcClient client = new DefaultIcbcClient(app_id, private_key, public_key);					

		response.setHeader("Content-Type", "text/html; charset=" + charset);
		PrintWriter out = response.getWriter();	
		EpayRegisterRequestV1 requestApi = new EpayRegisterRequestV1();
		EpayRegisterRequestV1Biz bizContent = new EpayRegisterRequestV1Biz();
		bizContent.setMobile(mobile);
		bizContent.setCardno(cardno);
		bizContent.setUmsMsgNo(ums_msg_no);
		bizContent.setUmsVerifyCode(ums_verify_code);
		requestApi.setBizContent(bizContent);
		requestApi.setServiceUrl(service_url);				
		EpayRegisterResponseV1 responseApi;
		
		
		try{
			responseApi = (EpayRegisterResponseV1) client.execute(requestApi, "msgId");//msgId��ϢͨѶΨһ��ţ�Ҫ��ÿ�ε��ö������ɣ�APP��Ψһ
			out.write("<html>");
			out.write("<head>");
			out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=" + charset + "\">");
			out.write("</head>");
			out.write("<body>");
		if (responseApi.isSuccess()) {
			out.write(JSON.toJSONString(responseApi));
				System.out.println("ReturnCode:"+responseApi.getReturnCode());
				System.out.println("responseApi:" + responseApi);
			} else {
				//ʧ��
				out.write(JSON.toJSONString(responseApi));
				System.out.println("ReturnCode:"+responseApi.getReturnCode());
				System.out.println("ReturnMsg:"+responseApi.getReturnMsg());
			}		
		
		out.write("</body>");
		out.write("</html>");
		
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			out.flush();
			out.close();
		}
	}
}
