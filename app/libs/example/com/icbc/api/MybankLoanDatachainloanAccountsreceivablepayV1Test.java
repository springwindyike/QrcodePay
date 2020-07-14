package com.icbc.api;

import com.icbc.api.request.MybankLoanDatachainloanAccountsreceivablepayRequestV1;
import com.icbc.api.request.MybankLoanDatachainloanAccountsreceivablepayRequestV1.MybankLoanDatachainloanAccountsreceivablepayRequestV1Biz;
import com.icbc.api.response.MybankLoanDatachainloanAccountsreceivablepayResponseV1;

public class MybankLoanDatachainloanAccountsreceivablepayV1Test {
	 protected static String APP_ID = "0200EH0005040";
	    protected static String APIGW_PUBLIC_KEY =
	            "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16"
	            +"bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCL"
	            +"T7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP"
	            +"3CiNgg0W6O3AGqwIDAQAB";
	    protected static String PRI_KEY =
	    		"MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCMkkwRnaKS34Tw7EopW5IYTXqDNUoAOktjiHcDk/IBS0FEikwkFfLunl7L0428PsCBFiVt04OuQ0poJ5m2uzqQtr8tPEHfy3iv+4xBjbV9iIXd2EBjsZv/sS7A1yPnVpdMOGF3e2R5YNKJ60Y41bz2NWLVDj5W/9AVCQMXsbQo3vkO1nPCcztNTfyKxHrY30lFsHMBCodHd4Tsxjawit7vASo6iVczy8MGO8KDpIMMd5fgyepKIMdFR+M7RIMnsozjWSdPQLr+YDHZjIWWuTrYtjabkCDUAlyIte7ynRZvhe8V+wGcTxnmhBJEym8tOWIPEdkzeecIQsRlPSmVXm0tAgMBAAECggEAH/JHk2FNxy9BGTe6CvgilZ9WDmeX78FPzMkAszF2OFEP/jGn6DOMyCn5xTzI41Unjq6nxvPg40Orr0wApQSb5LODcxZUqjWlsejrESLRcjwKoEY7K+z7VPrBc1XxdOu66rmNfQfv553Xezya8uOwVAwB8AWSqVbtxToNF99s4DSllRjlv9x1bhiEGeB205Io8KiL+D0jATrAoTus6XgnbNKaY/1F2Hj5gCWAN+pcKrVVwTjb+tyNvXv+gtA4JBmyDTt7kFpHknYnAitv0Jujf6e7WVU9uMNXimzY8yGCEdrYDkLE/jYvZVYWyJaVvb58K50w7wJqdUPPZBLhFJX9SQKBgQDSzkfKqOnGvPlUcW98pBibpyK+CEa7Ps9mK5Bv63XIvwlTd+iHEmIwdnxiPnzTXORmU+pjGz1ixFptwPDHW8YWnO1PN+WSddG7u1WRHUB78YNhAraDnaETodPS8IqWUTr7IUsVaNZnjkJo7gknQ5KFdDmuMFqoQunGKQ8dPCldBwKBgQCqtVM+asyAT5njFPTdaR06lRMTdWTlrBXrmmTekqsfqI8+12WwTW8tId0jvlsTzjZ5CxecBRynMWKumOjOmEsY5KnGxLffVWjLS/8GawsDzibJENjxXYz4xltL5QQ2s5uITgRURoexAyZUji4t4lwyrmpcX4CS04pYnLz3Ao+LKwKBgQC69uMrdeZpMj98SmNTy4Jbwr+IhXSeK5XsiuS+rrm3Qt+1nNqpuX9Gdj/ZLoytNW0I6JIwNf+asoV1ZDLozZeBhMrggLXm0QIkG4FHhAcmJkycZLiVQN+UtulU46w2p3LFOoEKSwIltEFoKP4LSd4Q6MUjnZU6OKZ37wCNsEcLTwKBgQCSzpfFYQF4A3z7TmV7GE/btqKOJHJeFk1Prhq7UvU5p7NxPrqkESPgc3QDrkwTT0+Hb2OheL/4hT8xmiz0pwJGaTgcyca7mW8jDrtGoL37SsoONp/riyGWPLf9H/ostO+4HCga9gDx2RyYsSHDshzKNTchM7yWCLi8liboYtphuwKBgAZxjUvAfAHn7dMAXylVDbgdb7m9vABU1ydQCvNdPHznRsh+/eqvVTrkBnYzKvFhM14MBFxF0YRjwENwrcXZaz5mar6xXXjaG4w8xPw2OGjPxAAU5s0465f+1ykbsITK0ZALs2woxZu+CQuXDncAIKjhU24+eBtXaCpsyqQTtY63";
	    protected static String BASE_URL = "http://gw.open.icbc.com.cn/api";
	
	public static void main(String[] args) {
		String URI = "mybank/loan/datachainloan/accountsreceivablepay/V1";
  DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, PRI_KEY, APIGW_PUBLIC_KEY);
  try {

	  MybankLoanDatachainloanAccountsreceivablepayRequestV1Biz bizContent =
              new MybankLoanDatachainloanAccountsreceivablepayRequestV1Biz();
  	
  	
  	bizContent.setSerialNo("xxxx");
  	bizContent.setAppNo("F-GCMS");
  	bizContent.setLanguage("zh_CN");
  	bizContent.setTransNo("IAccountsReceivablepayCocoaService");
  	bizContent.setAppid("XXXX");
  	
  	bizContent.setBorrowerName("X��X��X��X��X˾");
  	bizContent.setBorrowerCerType("3");
  	bizContent.setBorrowerCerId("11068751-3");
  	bizContent.setCustName("ί����������Ӿ��Ӷ��֧����");
  	bizContent.setCustCerType("3");
  	bizContent.setCustCerId("74382908-6");
  	bizContent.setDrawInstruct("xyw2019102902");
  	bizContent.setPayScene("1");
  	bizContent.setTradeNo("xyw201910112052002");
  	bizContent.setOrderNo("xyw201910161008022");
  	bizContent.setOrderAccount("6101112223334");
  	bizContent.setOrderAccName("�ܽ���");
  	bizContent.setOrderAmt("500.02");
  	bizContent.setOrderDate("20201010");
  	bizContent.setPlatAmt("1.11");
  	bizContent.setPayAmt("100");
  	bizContent.setEvalType("2");
  	
  	MybankLoanDatachainloanAccountsreceivablepayRequestV1 request =
              new MybankLoanDatachainloanAccountsreceivablepayRequestV1();
      request.setServiceUrl(BASE_URL + "/" + URI);
      request.setBizContent(bizContent);
      MybankLoanDatachainloanAccountsreceivablepayResponseV1 response = client.execute(request);
      if (response.isSuccess()) {
          //
      } else {
         //
      }

  } catch (Exception e) {
      e.printStackTrace();
  }
	}
}
