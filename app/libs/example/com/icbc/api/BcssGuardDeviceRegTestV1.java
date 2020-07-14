package com.icbc.api;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.BcssGuardDeviceRegRequestV1.BcssGuardDeviceRegRequestBizV1;
import com.icbc.api.response.BcssGuardDeviceRegResponseV1;

public class BcssGuardDeviceRegTestV1 {

    protected static final String MY_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC1551qVQMhx4/DO2qQqyK7rYSUnmJ7fYWbRoqpM46xaXletLJzsIBjc6jelHgEpDw/p81xDYb2reOi2/mLLGCie3k7S2+kXn5JK6ZIBcatbzQvrKdh7bGaFnbd64Y62YQpSq1VWQVmTL8m4VnqiN3oq4kp+cLOrVwebaQiKuBsA1xC3Z7v0l9GQjnZ+p4wsyhOtmsTmti6CQasbhbIg5GnWmHe8yGJO03DHvAkOePzmfI73DiFmnyQUbiXy9VEjNTbUdasBT40MrH2N7Scx4pp+Ru42KQyPpmPGzUBtBD0fD4qnQEADfJjblqoBkEY0DM48tjAPtzU4dZJXLSKSLS1AgMBAAECggEAHIk2J50ofZ8ZzW2/vOwr6bdByjLCjk7Vq9M4I20EII7ETHgaWo3Axlk5j5lI7ql5Dh9b2jVeC8qhoEXT8uJGUpb+ILAn1mhAdWgUkM3fKgv86tGx/GnWZ67IfO3aw9alpfiiEnaBo1e80POfMGzCKyLlxKD6z4NgpSFcE0QYqrjkNfxstIouz6TUCJN7VOpZJKtx9H1E2+KkUm+wB1FhZU38lcEzoF/Wrrm1GQuiDwQSwgy3DaeE1fekZ6J530Tmc210Babq54a4kiKP6YbLb+ac1F+cZZByPED3PC6EIZDvT1P1CnOmmRIIfjmONsFVPvjqAloEzkLzywPCD65aYQKBgQDtokR0xxI+xqOPXhYRJinTQ3gn9C6jmTE9XV3OkCqky7NJDJPc2sG8fBh7RmWuXzSr+DweXd9hpV5rgFUk2GUosCxZUCO+Y+4yZ/iZa36ViwEZrbhe/O7TaHhdF3yXuG/pFS5Ol7Bf+/mM8wZU1xLp+MfZA1WlSJg3Et0l1RK/DQKBgQDD9rZuI0zUbrJSAMw5w8C74bhCFBzEU3pH00ix0nhU5jnP8e0XRiGLI074eIQtWK5v61eQpYNQ9tdBDtOBPiUXAfBXW8IC7W9mKTKhR0d9Ai0zpSxaS2CP03Bu21t/G+Z2S09c9u1rcS0zfjfDaZ22Z+4EwtyJ76VUEIlXZLKiSQKBgQC/SIk2PzBum9L5CtFUiJXOW1cTQjlws1WxgcCLD/1jnhz5RkiX1PdyU6oZQTeEP1rUuwMZppKztTvl6O2gtRfowrdQRXQgQ6xvosW4KZFBqxz9oJryy0MrpcKNnORL9MkQpF4cIXp2KQxd6xpDnMS61el4xHhijacJXgPp+jQW2QKBgDt3swTZUYdl0FdyRoeBEAv0A6aJ0/EAJCuHwpez9zBMbV7dW8WkUqmWnXBpojLgpo7wLDKJB8CaJ9hmV2jxIvBIdlcMUWPyCcxG1EZ9CwS0lGMHzN3Z4gPDdmstxiZcoSNk10Cu7n2casslkmaKtoGUKHbpa2Owhcts+UC8HjmBAoGAYkgGXxAc9NMnDk1VaOSrSQ9A779anbGPnE826cb949irBwg5eGLpqFbnNsn0loc6aEg4izrqPWaLQQsYTufV8nupRmvOGC6AJQhG2gRH1CmwAT71WQpo+cDbCu37Kua02XfSka8VOrskQyk/otNc/7detxgAIaOjDeo25mMj3t0=";

    // APIGW_PUBLIC_KEY
    protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
   
    // APP_ID
    protected static final String APP_ID = "";
    
    public static void main(String[] args) throws IcbcApiException {
    	 BcssGuardDeviceRegRequestV1 request = new BcssGuardDeviceRegRequestV1();
         request.setServiceUrl("");
         BcssGuardDeviceRegRequestBizV1 hrb = new BcssGuardDeviceRegRequestBizV1();
         
         hrb.setCientTransNo("");
         hrb.setClientId("");
         hrb.setCorpId("0000000321");
         hrb.setEncryptDes("A+wPztnlGyUXvuTzJHdRf/T7zKbPyhp1ckLrOT3P+sUPR08aZO8Uo0aMSHQ3DQ9KCytqFWkOwaoo");
         hrb.setManufacture("KAIERRUI01");
         String timeStmp = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
         hrb.setTimeStamp(timeStmp);
 		
         request.setBizContent(hrb);

         DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
         client.execute(request);

        
	}
}
