package com.icbc.api;

import org.junit.Test;

import com.icbc.api.request.MybankAccountB2bMemberagreementmaintainV1Request;
import com.icbc.api.request.MybankAccountB2bMemberagreementmaintainV1Request.MybankAccountB2bMemberagreementmaintainV1RequestBiz;
import com.icbc.api.response.MybankAccountB2bMemberagreementmaintainV1Response;


/**
 * 合作方会员产品协议维护
 * 
 * 请商户配置SDK中的lib文件夹中的jar包后，根据备注1-6提示进行数据替换
 */
public class MybankAccountB2bMemberagreementmaintainV1Test {

	//1、网关公钥
	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	//2、appid
	protected static final String APP_ID = "10000000000000002156";

	//3、密钥对认证方式，公钥在API平台登记，此处为私钥
	protected static final String MY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIJBzZNaiobplRUgtJ4OzmUvZRK99ih/fUyDBOoFLtpJJCCRzp8T6V11YNlE7Xg5dt+EG7byQs2NImqg0eWEj/mBdZ7UmlAct7BNw2hyF2h4R5OEfXyjoH3wqGjKJayhaHTvLM1DYy/mDFBb0ShJYI1QMScQJZhsOhMMFhrrZwIZAgMBAAECgYAA2kdrOIOBoJPOQJmOE1C8jtPdjIrI9xSt5Imqsn/9A8+NuwacOfgkGXmZ0n6vc8jYa7f2uZ1AVTUtd4IIO5bpq8s0Tw2BfWALYwr/JdUuNKSjHVQsh/Do+wl8BgOgB4RqsNXWNGtoMC8lHKHmrVcpyJMfDc3cP07NZ1wG2zB0lQJBAM+dNZv2L/Z4RzvQcoVZEthYavZ4pkFoWGYC4jwc5G8um76zoQyrtxWYrtTP0GS+xFFX2dEuiGXxwzmSQJrPdrMCQQCgnUXcQe/if2c6TFt4x9v+6L0pmFClYyiOi9RuBSz1sHmPouuc/YYvuxAOdOzu3yzOkeo7b5KcCKITTWvKI+oDAkA5dl6vIw2VXycAJCp+Q/AWVyqLu0rw0Yud+HBbiPek2jabKqaJlkFfRdol5rrcF3zIstMDtahk5uxM0/DzqDZHAkBGnZ8vfdYIUVeDbDrzWXvCEXXJqewbKwOT2KqnTKM9yj9IBatttJGgvrAKiyH4zCqZD9JaG23sKGeJ8QopL60dAkEAtc4tlKoj3XZzRUXboqz0EhkgkjzDj50zpCD1sJKZ2EZH+A/7tXwPug+RnuSmKpM2uv3msqw3prdS3K4En8+rog==";
	@Test
	public void test() throws Exception {

		//签名类型为RSA2时，需传入appid，私钥和网关公钥，签名类型使用定值IcbcConstants.SIGN_TYPE_RSA2，其他参数使用缺省值
		DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA2, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
		MybankAccountB2bMemberagreementmaintainV1Request request = new MybankAccountB2bMemberagreementmaintainV1Request();
		
		//4、根据测试环境和生产环境替换相应ip和端口
        //request.setServiceUrl("http://ip:port/api/mybank/account/enterprise/applycurrentaccount/V2");		
		//request.setServiceUrl("http://122.64.61.85:8081/api/mybank/account/b2b/memberagreementmaintain/V1");
		request.setServiceUrl("http://ip:port/api/mybank/account/b2b/paragrment/maintain/V1");
		
		//5、请对照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值，非必输字段可不上送
		MybankAccountB2bMemberagreementmaintainV1RequestBiz bizContent = new MybankAccountB2bMemberagreementmaintainV1RequestBiz();
                        
	      bizContent.setTrxDate("2018-08-22");                        //交易日期         
	      bizContent.setCheckWorkDateFlag("1");                       //核对交易日期标志 
	      bizContent.setOperation_type("2");                          //操作类型
		  bizContent.setPartnerProno("1800128");                       //合作方协议编号         
	      bizContent.setMemberNo("1536818307601");                       //会员编号               
	      bizContent.setMemberNameOld("dfasf");                          //会员名称旧值           
	      bizContent.setMemberTypeOld("");                              //会员类型旧值           
	      bizContent.setCorpRepreNameOld("");                            //法人代表姓名旧值              
	      bizContent.setIdCardNoOld("");                                //身份证号码旧值 
	      bizContent.setIdCardSignDateOld ("");                          //身份证签发日期旧值	      
	      bizContent.setTelphoneNoOld("");                              //手机号旧值             
	      bizContent.setAccBankFlagOld("");                             //账号本他行标志旧值     
	      bizContent.setAccnoOld("");                                   //账号旧值               
	      bizContent.setAccNameOld("");                                 //账户名称旧值
	      bizContent.setAccBankNoOld("");                             //开户行号旧值 	      
	      bizContent.setAccBankNameOld("");                             //账户开户行行名旧值   
	      bizContent.setDealNameOld("");                                  //经办人姓名旧值
	      bizContent.setTranTelphoneNoOld("");                          //经办人手机号旧值       
	      bizContent.setSociCreCodeOld("");                             //统一社会信用代码旧值      
	      bizContent.setSingleUnauthAmountOld("");                      //单笔免验证码额度旧值   
	      bizContent.setMemberNameNew("bbb");                            //会员名称新值           
	      bizContent.setMemberTypeNew("");                              //会员类型新值           
	      bizContent.setCorpRepreNameNew("");                            //法人代表姓名新值             
	      bizContent.setIdCardNoNew("");                                //身份证号码新值   
	      bizContent.setIdCardSignDateNew("");                          //身份证签发日期新值 	      
	      bizContent.setTelphoneNoNew("");                              //手机号新值             
	      bizContent.setAccBankFlagNew("");                             //账号本他行标志新值     
	      bizContent.setAccnoNew("");                                   //账号新值               
	      bizContent.setAccNameNew("");                                 //账户名称新值   
	      bizContent.setAccBankNoNew("");                             //开户行号新值    	      
	      bizContent.setAccBankNameNew("");                             //账户开户行行名新值     
	      bizContent.setDealNameNew("");                                   //经办人姓名新值         
	      bizContent.setTranTelphoneNoNew("");                          //经办人手机号新值    
	      bizContent.setSociCreCodeNew("");                           //统一社会信用代码新值	      
	      bizContent.setSingleUnauthAmountNew("");                      //单笔免验证码额度新值   
	      bizContent.setConfFlagOld("1");                      //认证标志旧值 
	      bizContent.setConfFlagOld("2");                      //认证标志新值
	      bizContent.setPickCashDaysOld("12");                      //货款自动提现天数旧值  
	      bizContent.setPickCashDaysNew("13");                      //货款自动提现天数新值 
	      bizContent.setPayModeOld("1"); //入账方式旧值
	      bizContent.setPayModeNew("0"); //入账方式新值
       	 request.setBizContent(bizContent);

		MybankAccountB2bMemberagreementmaintainV1Response response = new MybankAccountB2bMemberagreementmaintainV1Response();
		try {
			response = client.execute(request, String.valueOf(System.currentTimeMillis()));//msgId消息通讯唯一编号，要求每次调用独立生成，APP级唯一
			if (response.isSuccess()) {
				//6、业务成功处理，请根据接口文档用response.getxxx()获取同步返回的业务数据
				System.out.println("ReturnCode:"+response.getReturnCode());
				System.out.println("response:" + response);
			}else {
				System.out.println("returnCode:"+response.getReturnCode());
				System.out.println("returnMsg:"+response.getReturnMsg());		
			}
		} catch (IcbcApiException e) {
			e.printStackTrace();
		}
	}
}

