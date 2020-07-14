import com.icbc.api.IcbcApiException;
import com.icbc.api.IcbcConstants;
import com.icbc.api.UiIcbcClient;
//import com.icbc.api.request.CertCardauthUiIcbccardauthRequestV1;
import com.icbc.api.request.CertCardauthUiIcbccardauthRequestV1.CertCardauthUiIcbccardauthRequestV1Biz;
import com.icbc.api.request.CertCardauthUiIcbccardauthRequestV1;


public class CertCardauthUiIcbccardauthTest {
	public static void main(String[] args) throws IcbcApiException {
		//1、APPID
		String APP_ID = "10000000000004094846";
		//2、网关公钥(需在API平台登记)
		String APIGW_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqnRaX6owJNnp4k/+pPxis3HlWaVyXXEA4WXedbuGLGkieBvXJVfP9AAriL4JE/S6osJcKQvYp76Gw+WcdmzebTjv9EQpHjeHwym6AmTucjHJAwiWg7vUEJyfLPjWj8tEKWqBWcJiarQd+it/Tdl1pq+BgSTG6v2dnGEB1OSxa6v15Nb4gRN9A3mzn2Uo6Ieth6jxNhLAEU9FAIz1K+e/A5FUpfDbO4v5lj75g6JY3uBYJABP84P9RpK4HvOCI7HBbwxeo35RcSmPNMU7D8n4N5C6vVDb7JS+2QQhwvmu7Fkp3JiEc4NcwO8xInE+7UR/gvqP+GbZsuV/pVALKx9rgwIDAQAB";
		//3、密钥对认证方式，公钥在API平台登记，此处为私钥
		String MY_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCqdFpfqjAk2eniT/6k/GKzceVZpXJdcQDhZd51u4YsaSJ4G9clV8/0ACuIvgkT9LqiwlwpC9invobD5Zx2bN5tOO/0RCkeN4fDKboCZO5yMckDCJaDu9QQnJ8s+NaPy0QpaoFZwmJqtB36K39N2XWmr4GBJMbq/Z2cYQHU5LFrq/Xk1viBE30DebOfZSjoh62HqPE2EsART0UAjPUr578DkVSl8Ns7i/mWPvmDolje4FgkAE/zg/1Gkrge84IjscFvDF6jflFxKY80xTsPyfg3kLq9UNvslL7ZBCHC+a7sWSncmIRzg1zA7zEicT7tRH+C+o/4Ztmy5X+lUAsrH2uDAgMBAAECggEAH23czA7hWaokieoeFeXDfTrfAyySbdBMTUMvRZ4SG1Y3WNYpUWVjnqX5YPlJSziwwRn9TEQ26pci2jQYKW3hhVoeRHfc7QloKwAioBZkMQIlAj4vIpMbgwSeBPjM9y6PnuNYfmhtJSeY72vdyUjzfIyX4GwbkXC6Av+QCuUwIZ4BWQ5L9oKZtdrI+l++Dom0HsMH5MLfApV1SAgpu71/BgG/Oh4EKA/wCM7zjl3qpnWV+GBrL003/Ax7bdIFZnX207L2kSKY7FFg1X3xxUZSt93cbgTN8zRHM6PPWL2vtinImeYH5sgXWaYaTZD2xlu4uwignNci010x8Zy/jL5/4QKBgQD20Z0CjAUL2viG/CSkSMdK3Qh5IR6l6z2WMItDKVZPR1eKf/70aJab+itTNH9Anl26F9PM8y5amWvPJpwYHN+Z5H8qwezwN7RHcqA2ap1+HQr/b80XHTG7FMKI8hRFOeTsAr07+EfViOwkpF8KIsiCEUAwgoAtT2cNIjrRwbr0pQKBgQCwy4s0enfE9OMooV9ats5PrMNpFlXlqeoyYeYIXL95/9UB6P2MMVtkCLwwqXBbMFHh97NtZgOfQon7ernQYe4XZ8Uq+zgwhZc8mLuIQ2GxpZGWyEbtD735g8o4M1eiDW7t3O+q2PSONyI79DbkN6lYZZTXKtOdKs1lvdXmFJvfBwKBgGO+wDoIRf3Nh0Rd35z4wHlzq/nvtYgN8jyg75a7vOKbDTiuk2VIYx0z05Bzlb2SgoQzHugjmqcIe3Yiv1BLUt3JZs7rwgouKM/69d4n5e/SYuBp2TMvHCrjr95SHnj/dZEfZkQ3CSi1heElADeDaQ6PVCaGhrBI93dqTuT36sr1AoGBAIXAZ787C9Ng5V4+v7IUbP8QGAIv2KpYowqcz/fxmxbEOrUoPHHMgXSruxwhhBQo+Tm4OPGB5SmeoF82GM+S1xqz8hGzX24uEx3P+sh7GbTZKszlFeuRJktXrixYg2rhONQReuxJGLNi+K5c8w4zIhXzO+iQyOm1kRDwzpszaj0PAoGBAME2TVhNkLoJ9VkB0A39Pu/GF+qSEu16dEG+JYPnvTVbxu8XeW1wpgaYXP+ojn+tAvyjbLPNPvZmWcoRG/mBW9h7HeppU0RegaB063g0dH7usE+sUY5zrtmDBtyqyj3vpKnCQw4pmaV16MI21x9tNihclRXHERKf62RAXCWpOM7a";

		UiIcbcClient client = new UiIcbcClient(APP_ID, MY_PRIVATE_KEY, IcbcConstants.CHARSET_UTF8);
		CertCardauthUiIcbccardauthRequestV1 request = new CertCardauthUiIcbccardauthRequestV1();
		//IP,端口 为API网关地址
		request.setServiceUrl("http://122.64.109.110:8081/ui/cert/cardauth/ui/icbccardauth/V1");
		CertCardauthUiIcbccardauthRequestV1Biz bizContent = new CertCardauthUiIcbccardauthRequestV1Biz();
        bizContent.setPhoneNo("13760634795");//手机号
        bizContent.setSignature("12313");
        bizContent.setSignChannelId("12345678901231312");
        bizContent.setTransNo("12313");
        bizContent.setUserId("123");
        bizContent.setZoneNo("02612");
        bizContent.setnotifyUrl("http://99.6.189.20:10322/");//分行接收处理结果地址
        bizContent.setredirectUrl("");
        bizContent.setBackup("test");//备注信息
        
		request.setBizContent(bizContent);
		String msg_id = String.valueOf(System.currentTimeMillis());
		System.out.println(client.buildPostForm(request,msg_id));
	}


}
