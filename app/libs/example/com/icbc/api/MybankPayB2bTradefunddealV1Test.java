package com.icbc.api;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

import com.icbc.api.request.MybankPayB2bTradefunddealV1Request;
import com.icbc.api.request.MybankPayB2bTradefunddealV1Request.MybankPayB2bTradefunddealV1RequestBiz;
import com.icbc.api.request.MybankPayB2bTradefunddealV1Request.MybankPayB2bTradefunddealV1RequestBiz.MybankPayB2bTradefunddealV1RequestBizList;
import com.icbc.api.response.MybankPayB2bTradefunddealV1Response;
import com.icbc.api.response.MybankPayB2bTradefunddealV1Response.MybankPayB2bTradefunddealV1ResponseList;
import com.icbc.api.response.MybankPayB2bTradefunddictatequeryV1Response.MybankPayB2bTradefunddictatequeryV1ResponseList;

/**
 * 对公交易结算处理
 * 
 * 请商户配置SDK中的lib文件夹中的jar包后，根据备注1-6提示进行数据替换
 */
public class MybankPayB2bTradefunddealV1Test {

	// 1、网关公钥
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	// 2、appid
	protected static final String APP_ID = "10000000000000003917";

	// 3、密钥对认证方式，公钥在API平台登记，此处为私钥
	protected static final String MY_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDH8nn5xSLmJVrXDm4480Yr9KanIITe4htlMjBB8AHnezhD6oEtB7g5AuuH0V3ZIRK9hvxJPMPPfjzdJaAyecX1Hbm2OBstgnCunXWhtUBeq27JAKvtWhomyuMo1xi+rbmOtLeNXydXWeq8Lh6hBwLvWjk9ZgH3f5iOEkv7NCR2uJef3getAJC2wrn3Sn0ck9UtvqXKVkMKdfOCnz+kmd81R5qJ+9wEILsp2Lv1pn1klE7+vjhS9ySPkfsDLZQGpj07k4TogELJIxzMPSRQ1mu5mlQuN1k3e3RwcXY4ZkpyJ406tajAA6NG/V4kNLIN0qthWZSaI8ejPupZRTsJucO5AgMBAAECggEAbthx3pH3YvdagNazLEdRo5Shvw08HAPlhBhqwGM56wZYju42Zqxc6N5BjK35BSJcrU1kF4XkV+d3/nGZeeIgaF7uUaKRDo29wk/wopFE+ja32B7TMWY+ETtw63czdKICuKZfC7SwrrBefaxjtomYivDNwsgGVxsZi8mA7eZeQKHiAjETf7YpkTyznRI2GC6wXzqrQTBOjnmzMyXH880kSQwglXHeV3YACkgeH8RnZpjVvVby3LWITmTQsUi6aYyLpxv9cRHzlCxNCt/0ny2mOS59FOIZbqBNWxK8xg9v6x5hsAr1CrAQmLqtzdMQlUwCaWx9OP6/HF6vnTnRWagE8QKBgQDrOz3RHJ1rzwF2j7IYb4h50JEVmc3k5joc1Mz9svCQ1UhlBHjVtNfRxxtbdPYtGLGEYoBcbltH40oqx4S4gUZdgL4e1vVOiv357hMcdawHYWNvY62cPsTS81ejUo04DhfHZKrV8BJrCzr3poS4+bjFv2/GfeTs6tI+GsRUvZQUVwKBgQDZmbtfANTxufegEBkBTwPpipcKV6CxWc+Ktzpgp2plzyAlMQ3AF7sP/xs6gsGuYiZnW3gAkD/x8+rsdYpkZaycpzEFz5hkvYo5uzVWEwLlRNGGtzWQGL86Kyr2Cc9VkJOy6D60G5Trn0/s19C8DnXH1NKBjPvb6Q7uZNMKETtebwKBgGjgIcBwlJLzWQCmMk4Is/0ziuvphc2PA8vE6JwXwn+gR8WaB9Gn7iz+K2lMLVGP191hGT+ciB/16yRFjhvAr0GS27DeP8JD39YlWenvYMJtniqUc1vc9F3k1mbfsEyUo+9nJ294uI13FVRCrpvV4pZvsoL5sC4cx52ey3fIihPDAoGAMXIJbbEWskb7yddelzmJPgxL/gGjdileS7sO/N+OAcxrFYhsA3Zg/2WMnmMP97w91canIhmlLimq/EhJRj8EViR3s0ZU7q9TNYMgv4paYhadNetztGarLWCZxoa8IklUBpdXiD2sPU5aLwtrVxBCG0J1AxMyN+phhjJK8kKwJukCgYAP03AqwmRaDYQ0zYx6vQcbetIjRTtqT4nWBHJzM60ilkMuLVQfMNXAGOZOxOYwCNKFU4Vr0r8n63P+p+I7e/jOi1O+y6wI5C2/6K6YP4z+kkpKXpgCQvOt7HjMpNzsN//3fZiPcArd7royTCHGvDB/az08SqV1H2qgdJ7AJoATtQ==";

	@Test // 2-预存资金支付
	public void testPay() throws Exception {

		// 签名类型为RSA2时，需传入appid，私钥和网关公钥，签名类型使用定值IcbcConstants.SIGN_TYPE_RSA2，其他参数使用缺省值
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA, MY_PRIVATE_KEY,
				APIGW_PUBLIC_KEY);

		MybankPayB2bTradefunddealV1Request request = new MybankPayB2bTradefunddealV1Request();

		// 4、根据测试环境和生产环境替换相应ip和端口
		request.setServiceUrl("http://122.64.109.110:8081/api/mybank/pay/b2b/tradefunddeal/V1");
		//request.setServiceUrl("http://122.64.61.115:8081/api/mybank/pay/b2b/tradefunddeal/V1");

		// 5、请对照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值，非必输字段可不上送
		MybankPayB2bTradefunddealV1RequestBiz bizContent = new MybankPayB2bTradefunddealV1RequestBiz();

	       bizContent.setTrxDate("2021-12-20");             //交易日期         
	       bizContent.setCheckWorkDateFlag("1");          //核对交易日期标志 
	       bizContent.setPartnerProno("1801627");             //合作方协议编号   1801627 
	       bizContent.setTranSeqno("0123856714788");          //交易流水号
	       bizContent.setOperType("6");                     //业务种类          
	       bizContent.setOrderNo("123456");                   //订单号                 
	       bizContent.setDraccBankflag("1");                //借方账户本他行标志
	       bizContent.setDrmemberNo("bjbce0000000004");       //借方会员编号      
	       bizContent.setDrmemberName("北京链家房地产经纪有限公司");  //借方会员名称      
	       bizContent.setDrAccno("");                      //借方账号          
	       bizContent.setDraccName("");                    //借方账户名称      
	       bizContent.setDraccBankno("");                  //借方账户开户行行号
	       bizContent.setDraccBankname("");                //借方账号开户行户名     
	       bizContent.setNote("");                         //附言                   
	       bizContent.setUsages("");                       //用途                 
	       bizContent.setSummary("");                   //摘要                
	       bizContent.setEnSummry("");                     //英文备注   
		   bizContent.setOldTranSeqno("");                    //原交易流水号			       		   
			List<MybankPayB2bTradefunddealV1RequestBizList> custList = new ArrayList<MybankPayB2bTradefunddealV1RequestBizList>();
			MybankPayB2bTradefunddealV1RequestBizList custList1 = new MybankPayB2bTradefunddealV1RequestBizList();
			MybankPayB2bTradefunddealV1RequestBizList custList2 = new MybankPayB2bTradefunddealV1RequestBizList();
			custList1.setCurrType("1");                     //币种              
			custList1.setAmount("50");                       //金额       
			custList1.setCraccBankflag("");                //贷方账户本他行标志
			custList1.setCrmemberNo("bjbce0000001001");         //贷方会员编号      
			custList1.setCrmemberName("珠海格力电器股份有限公司");  //贷方会员名称      
			custList1.setCrAccno("");                      //贷方账号          
			custList1.setCraccName("");                    //贷方账户名称      
			custList1.setCraccBankno("");                  //贷方账户开户行行号
			custList1.setCraccBankname("");                //贷方账号开户行户名
			custList1.setTradeName("");                    //商品名称          
			custList1.setTradeNum("");                     //商品数量             
			custList1.setOrderAmount("50");                  //订单金额   	 
			custList.add(custList1);
			//custList.add(custList2);
			bizContent.setProMemAcctInputList(custList);
		   request.setBizContent(bizContent);

		MybankPayB2bTradefunddealV1Response response = new MybankPayB2bTradefunddealV1Response();
		try {
			response = client.execute(request, String.valueOf(System.currentTimeMillis()));//msgId消息通讯唯一编号，要求每次调用独立生成，APP级唯一
			System.out.println("ReturnCode:" + response.getReturnCode());
			System.out.println("ReturnMsg:" + response.getReturnMsg());
			System.out.println("HzStatus:" + response.getHzStatus());
			if (response.isSuccess()) {
				//6、业务成功处理，请根据接口文档用response.getxxx()获取同步返回的业务数据
				System.out.println("ReturnCode:"+response.getReturnCode());
				List<MybankPayB2bTradefunddealV1ResponseList> list = response.getProMemAcctOutputList();
				//获取结果集中字段
				for(MybankPayB2bTradefunddealV1ResponseList detail:list){
					//获取信息.....
			          detail.getDbStatus();
			          System.out.println("DbStatus:" + detail.getDbStatus());
			          
				}
			} else {
				System.out.println("returnCode:"+response.getReturnCode());
				System.out.println("returnMsg:"+response.getReturnMsg());		
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}
}
