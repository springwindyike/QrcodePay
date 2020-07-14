package com.icbc.api;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.XafcSecureAccFinancialProcessRequest;
import com.icbc.api.request.XafcSecureAccFinancialProcessRequest.XafcSecureAccFinancialProcessRequestBiz;
import com.icbc.api.response.XafcSecureAccFinancialProcessResponse;

public class XafcSecureaccFinancialprocessV1 {
	public static void main(String[] args) {
		String APP_ID = "10000000000000040501";
		String MY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALAWAcPiTMRU906PTdy0ozspX7XptZnkEw2C8R64RDB9BiRFXAj0cU4aTA1MyfmGIlceeVdgJf7OnmvpHnYxjQ7sGxMItPtodrGwA2y8j0AEbHc5pNWU8Hn0zoY9smHS5e+KjSbWv+VNbdnrRFTpDeiJ3+s2E/cKI2CDRbo7cAarAgMBAAECgYABiA933q4APyTvf/uTYdbRmuiEMoYr0nn/8hWayMt/CHdXNWs5gLbDkSL8MqDHFM2TqGYxxlpOPwnNsndbW874QIEKmtH/SSHuVUJSPyDW4B6MazA+/e6Hy0TZg2VAYwkB1IwGJox+OyfWzmbqpQGgs3FvuH9q25cDxkWntWbDcQJBAP2RDXlqx7UKsLfM17uu+ol9UvpdGoNEed+5cpScjFcsB0XzdVdCpp7JLlxR+UZNwr9Wf1V6FbD2kDflqZRBuV8CQQCxxpq7CJUaLHfm2kjmVtaQwDDw1ZKRb/Dm+5MZ67bQbvbXFHCRKkGI4qqNRlKwGhqIAUN8Ynp+9WhrEe0lnxo1AkEA0flSDR9tbPADUtDgPN0zPrN3CTgcAmOsAKXSylmwpWciRrzKiI366DZ0m6KOJ7ew8z0viJrmZ3pmBsO537llRQJAZLrRxZRRV6lGrwmUMN+XaCFeGbgJ+lphN5/oc9F5npShTLEKL1awF23HkZD9HUdNLS76HCp4miNXbQOVSbHi2QJAUw7KSaWENXbCl5c7M43ESo9paHHXHT+/5bmzebq2eoBofn+IFsyJB8Lz5L7WciDK7WvrGC2JEbqwpFhWwCOl/w==";		
		String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY); // ����APPID��������ǩ��˽Կ��API���ع�Կ
		XafcSecureAccFinancialProcessRequest request = new XafcSecureAccFinancialProcessRequest();
		XafcSecureAccFinancialProcessRequestBiz bizContent = new XafcSecureAccFinancialProcessRequestBiz();

		String ICBCAPI_URL = "http://83.28.222.45:8081/api/xafc/secureacc/financialprocess/V1"; // ����APIƽ̨���Ի�������ָ��URL�����÷���Ҫ�޸�Ϊ���ݷ���ǰ�û�����IP�Ͷ˿�

		// ����bizContentΪҵ�������ֶΣ���Ҫset����ҵ������
		String reqparams = "<ZXBMsg>"
				+"<Head>"
				+"<ReqSN>201020111626</ReqSN>"
				+"<MsgTyp>EV0002</MsgTyp>"
				+"<CustID>001025931</CustID>"
			+"</Head>"
			+"<Body>"
				+"<FlowNo></FlowNo>"
				+"<PageNo>1</PageNo>"
				+"<TotalPage>3</TotalPage>"
				+"<TotalAmt>5000.00</TotalAmt>"
				+"<TotalNum>10</TotalNum>"
				+"<PageAmt>2000.00</PageAmt>"
				+"<PageNum>2</PageNum>"
				+"<CryType>RMB</CryType>"
				+"<Note>abcdefg</Note>"
				+"<DealList>"
					+"<Deal>"
						+"<DealNo>20102011262300000001</DealNo>"
						+"<SpvAccNo>0200041738012051874</SpvAccNo>"
						+"<ToName>zahngjing</ToName>"
						+"<ToAccNo>62284888888888</ToAccNo>"
						+"<ToAmt>1500.00</ToAmt>"
						+"<SysFlg>1</SysFlg>"
						+"<RecvBankName></RecvBankName>"
						+"<Mem>zhengdibuchangkuan</Mem>"
					+"</Deal>"
					+"<Deal>"
						+"<DealNo>20102011262300000002</DealNo>"
						+"<SpvAccNo>0200041738012052404</SpvAccNo>"
						+"<ToName>cwt</ToName>"
						+"<ToAccNo>6228488888888ff8</ToAccNo>"
						+"<ToAmt>500.00</ToAmt>"
						+"<SysFlg>2</SysFlg>"
						+"<RecvBankName>BOC</RecvBankName>"
						+"<Mem>zhengdibuchangkuan</Mem>"
					+"</Deal>"
				+"</DealList>"
			+"</Body>"
	+"</ZXBMsg>";

		bizContent.setReqparams(reqparams);
		request.setBizContent(bizContent);

		request.setServiceUrl(ICBCAPI_URL);

		String msg_id = String.valueOf(System.currentTimeMillis());

		try {
			XafcSecureAccFinancialProcessResponse response = client.execute(request, msg_id);// �ڶ���������Ҫ���������APi���ػ������ظ����

			if (response.isSuccess() && response.getReturnCode() == 0) {
				//
				System.out.println("response.isSuccess():" + response.isSuccess());
				System.out.println("Success:" + response.getReturnCode());
				System.out.println("RetMsg:" + response.getReturnMsg());
				System.out.println("responseString: " + response.getResposeString());
				
				// System.out.println("Result:
				// "+UnZipandUnbase64(response.getResult()));
			} else {
				System.out.println("response.isSuccess():" + response.isSuccess());
				System.out.println("err_ReturnCode " + response.getReturnCode());
				System.out.println("err_ReturnMsg " + response.getReturnMsg());
				//System.out.println("err_RetCode " + response.getRetCode());
			}
			System.out.println("���ý�������" + '\n');
		} catch (IcbcApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}