package com.icbc.api.controller;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.bcss.commons.log.BcssLog;
import com.icbc.api.request.MemberScenicfacegetRequestV1;
import com.icbc.api.request.MemberScenicfacegetRequestV1.MemberScenicfacegetRequestV1V1Biz;
import com.icbc.api.response.MemberScenicfacegetResponseV1;

public class MemberScenicfacegetRequestTestV1 {
	
	public static void main(String[] args) {
		// 企业交易秘钥,请根据测试环境和生产环境替换成相应的信息
		String corpPayKeyAppId = "appid";
		String corpPayKeyRsaPriKey = "keyinfo";
		
		// API gateway 公钥
		String apigwPublicKey = "public key";
		
		// 构造请求
		MemberScenicfacegetRequestV1V1Biz biz = new MemberScenicfacegetRequestV1V1Biz();
		biz.setCorpId("0000000272");
		biz.settotalNum("10");
		// 请求IP地址，请根据测试环境和生产环境替换相应ip和端口
		String serviceUrl = "https://gw.open.icbc.com.cn/mybank/mer/member/scenicfaceget/V1";
		MemberScenicfacegetRequestV1 requestV1 = new MemberScenicfacegetRequestV1();
		requestV1.setBizContent(biz);
		requestV1.setServiceUrl(serviceUrl);
		requestV1.isNeedEncrypt();
		
		DefaultIcbcClient client = new DefaultIcbcClient(corpPayKeyAppId, "RSA2", corpPayKeyRsaPriKey, apigwPublicKey);
		try {
		      MemberScenicfacegetResponseV1 responseV1 = client.execute(requestV1);
		      if (responseV1.isSuccess()) {
		    	  BcssLog.info("处理成功" + responseV1.toString());
		      } else {
		    	  BcssLog.info("处理失败，错误信息：" + responseV1.getReturnMsg());
		      }
		} catch (Exception e) {
		  e.printStackTrace();
		}
	}
}
