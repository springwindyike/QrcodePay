package com.icbc.api;

import java.util.List;

import org.junit.Test;

import com.icbc.api.request.MybankAccountB2bMemberagreementqueryV1Request;
import com.icbc.api.request.MybankAccountB2bMemberagreementqueryV1Request.MybankAccountB2bMemberagreementqueryV1RequestBiz;
import com.icbc.api.response.MybankAccountB2bMemberagreementqueryV1Response;
import com.icbc.api.response.MybankAccountB2bMemberagreementqueryV1Response.MybankAccountB2bMemberagreementqueryV1ResponseList;

/**
 * 合作方会员产品协议查询
 * 
 * 请商户配置SDK中的lib文件夹中的jar包后，根据备注1-6提示进行数据替换
 */
public class MybankAccountB2bMemberagreementqueryV1Test {

	//1、网关公钥
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	//2、appid
	protected static final String APP_ID = "10000000000000002156";
	//protected static final String APP_ID = "10000000000000003910"; 

	//3、密钥对认证方式，公钥在API平台登记，此处为私钥
	protected static final String MY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIJBzZNaiobplRUgtJ4OzmUvZRK99ih/fUyDBOoFLtpJJCCRzp8T6V11YNlE7Xg5dt+EG7byQs2NImqg0eWEj/mBdZ7UmlAct7BNw2hyF2h4R5OEfXyjoH3wqGjKJayhaHTvLM1DYy/mDFBb0ShJYI1QMScQJZhsOhMMFhrrZwIZAgMBAAECgYAA2kdrOIOBoJPOQJmOE1C8jtPdjIrI9xSt5Imqsn/9A8+NuwacOfgkGXmZ0n6vc8jYa7f2uZ1AVTUtd4IIO5bpq8s0Tw2BfWALYwr/JdUuNKSjHVQsh/Do+wl8BgOgB4RqsNXWNGtoMC8lHKHmrVcpyJMfDc3cP07NZ1wG2zB0lQJBAM+dNZv2L/Z4RzvQcoVZEthYavZ4pkFoWGYC4jwc5G8um76zoQyrtxWYrtTP0GS+xFFX2dEuiGXxwzmSQJrPdrMCQQCgnUXcQe/if2c6TFt4x9v+6L0pmFClYyiOi9RuBSz1sHmPouuc/YYvuxAOdOzu3yzOkeo7b5KcCKITTWvKI+oDAkA5dl6vIw2VXycAJCp+Q/AWVyqLu0rw0Yud+HBbiPek2jabKqaJlkFfRdol5rrcF3zIstMDtahk5uxM0/DzqDZHAkBGnZ8vfdYIUVeDbDrzWXvCEXXJqewbKwOT2KqnTKM9yj9IBatttJGgvrAKiyH4zCqZD9JaG23sKGeJ8QopL60dAkEAtc4tlKoj3XZzRUXboqz0EhkgkjzDj50zpCD1sJKZ2EZH+A/7tXwPug+RnuSmKpM2uv3msqw3prdS3K4En8+rog==";
	@Test
	public void test() throws Exception {

		//签名类型为RSA2时，需传入appid，私钥和网关公钥，签名类型使用定值IcbcConstants.SIGN_TYPE_RSA2，其他参数使用缺省值
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA2, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		MybankAccountB2bMemberagreementqueryV1Request request = new MybankAccountB2bMemberagreementqueryV1Request();
		
		//4、根据测试环境和生产环境替换相应ip和端口
        //request.setServiceUrl("http://ip:port/api/mybank/account/enterprise/applycurrentaccount/V2");		
		  request.setServiceUrl("http://122.64.61.85:8081/api/mybank/account/b2b/memberagreementquery/V1");
		//5、请对照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值，非必输字段可不上送
        MybankAccountB2bMemberagreementqueryV1RequestBiz bizContent = new MybankAccountB2bMemberagreementqueryV1RequestBiz();

                
      	bizContent.setTrxDate("2018-08-23");                      //交易日期                
    	bizContent.setCheckWorkDateFlag("1");                     //核对交易日期标志        
    	bizContent.setQryType("1");                               //查询方式  
    	bizContent.setInitFlag("1");                              //查询标志                
    	bizContent.setRowReq("5");                                //一次查询的最大记录数    
    	bizContent.setPartnerProno("1800128");                       //合作方协议编号          
    	bizContent.setMemberNo("153681830760");                     //会员编号                
    	bizContent.setStatus("");                                 //查询状态集合            
    	bizContent.setBegMemberNo("");                            //翻页会员编号            
		request.setBizContent(bizContent);

		MybankAccountB2bMemberagreementqueryV1Response response = new MybankAccountB2bMemberagreementqueryV1Response();
		try {
			response = client.execute(request, String.valueOf(System.currentTimeMillis()));//msgId消息通讯唯一编号，要求每次调用独立生成，APP级唯一
			if (response.isSuccess()) {
				//6、业务成功处理，请根据接口文档用response.getxxx()获取同步返回的业务数据
			if (!"0".equals(response.getItems())){
				//记录条数
				response.getItems();
				//查询成功 获取返回结果
				List<MybankAccountB2bMemberagreementqueryV1ResponseList> list = response.getList();
				//获取结果集中字段
				for(MybankAccountB2bMemberagreementqueryV1ResponseList detail:list){
					//获取信息.....
					detail.getAccno();          		
					System.out.println("Accno:" + detail.getAccno());
			}
			} else {
				//失败
				System.out.println("returnCode:"+response.getReturnCode());
				System.out.println("response:" + response);
				System.out.println("items:" + response.getItems());
			}
		}else {
			System.out.println("returnCode:"+response.getReturnCode());
			System.out.println("returnMsg:"+response.getReturnMsg());		
		}		
	}catch (IcbcApiException e) {
	e.printStackTrace();
}
}
}

