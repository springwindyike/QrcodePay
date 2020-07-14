package com.icbc.api.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.IcbcConstants;
import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.MybankPayCpayCppayapplyRequestV2;
import com.icbc.api.response.MybankPayCpayCppayapplyResponseV2;

public class MybankPayCpayCppayapplyTestV2 {
	
	protected static final String MY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALAWAcPiTMRU906PTdy0ozspX7XptZnkEw2C8R64RDB9BiRFXAj0cU4aTA1MyfmGIlceeVdgJf7OnmvpHnYxjQ7sGxMItPtodrGwA2y8j0AEbHc5pNWU8Hn0zoY9smHS5e+KjSbWv+VNbdnrRFTpDeiJ3+s2E/cKI2CDRbo7cAarAgMBAAECgYABiA933q4APyTvf/uTYdbRmuiEMoYr0nn/8hWayMt/CHdXNWs5gLbDkSL8MqDHFM2TqGYxxlpOPwnNsndbW874QIEKmtH/SSHuVUJSPyDW4B6MazA+/e6Hy0TZg2VAYwkB1IwGJox+OyfWzmbqpQGgs3FvuH9q25cDxkWntWbDcQJBAP2RDXlqx7UKsLfM17uu+ol9UvpdGoNEed+5cpScjFcsB0XzdVdCpp7JLlxR+UZNwr9Wf1V6FbD2kDflqZRBuV8CQQCxxpq7CJUaLHfm2kjmVtaQwDDw1ZKRb/Dm+5MZ67bQbvbXFHCRKkGI4qqNRlKwGhqIAUN8Ynp+9WhrEe0lnxo1AkEA0flSDR9tbPADUtDgPN0zPrN3CTgcAmOsAKXSylmwpWciRrzKiI366DZ0m6KOJ7ew8z0viJrmZ3pmBsO537llRQJAZLrRxZRRV6lGrwmUMN+XaCFeGbgJ+lphN5/oc9F5npShTLEKL1awF23HkZD9HUdNLS76HCp4miNXbQOVSbHi2QJAUw7KSaWENXbCl5c7M43ESo9paHHXHT+/5bmzebq2eoBofn+IFsyJB8Lz5L7WciDK7WvrGC2JEbqwpFhWwCOl/w==";
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
	protected static final String APP_ID = "0200EH0013035";
	
	static Logger log = Logger.getLogger(MybankPayCpayCppayapplyTestV2.class.getName());
	public static void main(String[] args) {
		
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		
		MybankPayCpayCppayapplyRequestV2 request = new MybankPayCpayCppayapplyRequestV2();
		request.setServiceUrl("http://IP:PORT/api/mybank/pay/cpay/cppayapply/V2");
		
//		long timeMillis = System.currentTimeMillis();
//		String time=new SimpleDateFormat("yyyyMMddHHmmss").format(timeMillis) ;// 当前日期
		MybankPayCpayCppayapplyRequestV2.MybankPayCpayCppayapplyRequestV2Biz bizContent = new MybankPayCpayCppayapplyRequestV2.MybankPayCpayCppayapplyRequestV2Biz();
		
		List<MybankPayCpayCppayapplyRequestV2.BeanGoodsInfo> beanGoodsInfoList = new ArrayList<MybankPayCpayCppayapplyRequestV2.BeanGoodsInfo>();
		MybankPayCpayCppayapplyRequestV2.BeanGoodsInfo beanGoodsInfo = new MybankPayCpayCppayapplyRequestV2.BeanGoodsInfo();
		beanGoodsInfo.setGoodsSubId("1");
		beanGoodsInfo.setGoodsName("倚天剑");
		beanGoodsInfo.setPayeeCompanyName("张三");
		beanGoodsInfo.setGoodsNumber("1");
		beanGoodsInfo.setGoodsAmt("10000");
		beanGoodsInfo.setGoodsUnit("单位");
		beanGoodsInfoList.add(beanGoodsInfo);
		
		List<MybankPayCpayCppayapplyRequestV2.BeanRecvMallInfo> beanRecvMallInfoList = new ArrayList<MybankPayCpayCppayapplyRequestV2.BeanRecvMallInfo>();
		MybankPayCpayCppayapplyRequestV2.BeanRecvMallInfo beanRecvMallInfo = new MybankPayCpayCppayapplyRequestV2.BeanRecvMallInfo();
		beanRecvMallInfo.setMallCode("0200EH0013035");
		beanRecvMallInfo.setMccCode("323451");
		beanRecvMallInfo.setMccName("1");
		beanRecvMallInfo.setBusinessLicense("1");
		beanRecvMallInfo.setBusinessLicenseType("0");
		beanRecvMallInfo.setMallName("mallName");
		beanRecvMallInfo.setPayeeCompanyName("test");
		beanRecvMallInfo.setPayeeSysflag("3");
		beanRecvMallInfo.setPayeeBankCode("");
		beanRecvMallInfo.setPayeeHeadBankCode("123456789120");
		beanRecvMallInfo.setPayeeAccno("aaa-111111");
		beanRecvMallInfo.setPayAmount("11223311");
		beanRecvMallInfo.setRbankname("afica bank");
		beanRecvMallInfo.setPayeeBankCountry("840");
		beanRecvMallInfo.setPayeeBankSign("CHASUS33XXX");
		beanRecvMallInfo.setPayeeCountry("840");
		beanRecvMallInfo.setPayeeAddress("urtyusastt");
		beanRecvMallInfo.setRacaddress1("urtyusastt");
		beanRecvMallInfo.setRacaddress2("urtyusastt");
		beanRecvMallInfo.setRacaddress3("urtyusastt");
		beanRecvMallInfo.setRacaddress4("urtyusastt");
		beanRecvMallInfo.setRacpostcode("");
		beanRecvMallInfo.setAgentbic("");
		beanRecvMallInfo.setPayeePhone("13117512457");
		beanRecvMallInfo.setPayeeOrgcode("1");
		beanRecvMallInfoList.add(beanRecvMallInfo);
		
		bizContent.setAgreeCode("0020000998");
		bizContent.setPartnerSeq("MQOY25220");
		bizContent.setPayChannel("1");
		bizContent.setInternationalFlag("2");
		bizContent.setPayMode("2");
		bizContent.setReservDirect("1");
		bizContent.setOperType("301");
		bizContent.setPayEntitys("1");
		bizContent.setAsynFlag("0");
		bizContent.setLogonId("");
		bizContent.setPayerAccno("");
		bizContent.setPayerAccname("");
		bizContent.setPayerFeeAccno("");
		bizContent.setPayerFeeAccName("");
		bizContent.setPayerFeeCurr("");
		bizContent.setPayMemno("0200EH0013035");
		bizContent.setOrgcode("10237605X");
		bizContent.setOrderCode("2019062730002");
		bizContent.setOrderAmount("11223311");
		bizContent.setOrderCurr("88");
		bizContent.setSumPayamt("11223311");
		bizContent.setOrderRemark("订单备注-直接支付-境内");
		bizContent.setRceiptRemark("回单补充信息备注");
		bizContent.setPurpose("");
		bizContent.setSummary("");
		bizContent.setSubmitTime("20240615162211");
		bizContent.setReturnUrl("");
		bizContent.setCallbackUrl("www.baidu.com");
		bizContent.setAgreementId("34567891");
		bizContent.setInvoiceId("");
		bizContent.setManifestId("");
		bizContent.setAgreementImageId("");
		bizContent.setEnterpriseName("");
		bizContent.setPayRemark("");
		bizContent.setBakReserve1("");
		bizContent.setBakReserve2("");
		bizContent.setBakReserve3("");
		bizContent.setPartnerSeqOrigin("");
		bizContent.setSumPayamtOrigin("");
		bizContent.setReporterName("");
		bizContent.setReporterContact("");
		
		
		bizContent.setPayeeList(beanRecvMallInfoList);
		bizContent.setGoodsList(beanGoodsInfoList);
		request.setBizContent(bizContent);
		
		Random rand = new Random();
		String msgId = rand.nextInt(99999) + "msg";
		log.fine("msgId:"+msgId);
		
		request.setBizContent(bizContent);
		
		MybankPayCpayCppayapplyResponseV2 response;
		try {
			response = client.execute(request,msgId);
			log.fine("JSONObject.toJSONString(response):"+JSONObject.toJSONString(response));
			if (response.isSuccess()) {
				// 业务成功处理
				log.fine("response.getReturnCode():"+response.getReturnCode());
			} else {
				//失败
				log.fine("response.getReturnCode():"+response.getReturnCode());
				log.fine("response.getReturnMsg():"+response.getReturnMsg());
			}
		} catch (IcbcApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
