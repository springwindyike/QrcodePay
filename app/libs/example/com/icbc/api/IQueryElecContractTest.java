package com.icbc.api;

import java.util.HashMap;

import com.icbc.api.request.IQueryElecContractRequestV1;
import com.icbc.api.response.IQueryElecContractResponseV1;

public class IQueryElecContractTest {
    //appid,privateKey,apigwPublicKey  根据实际的应用场景进行修攄1�7
    protected static final String appId="123";
    protected static final String privateKey="MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALAWAcPiTMRU906PTdy0ozspX7XptZnkEw2C8R64RDB9BiRFXAj0cU4aTA1MyfmGIlceeVdgJf7OnmvpHnYxjQ7sGxMItPtodrGwA2y8j0AEbHc5pNWU8Hn0zoY9smHS5e+KjSbWv+VNbdnrRFTpDeiJ3+s2E/cKI2CDRbo7cAarAgMBAAECgYABiA933q4APyTvf/uTYdbRmuiEMoYr0nn/8hWayMt/CHdXNWs5gLbDkSL8MqDHFM2TqGYxxlpOPwnNsndbW874QIEKmtH/SSHuVUJSPyDW4B6MazA+/e6Hy0TZg2VAYwkB1IwGJox+OyfWzmbqpQGgs3FvuH9q25cDxkWntWbDcQJBAP2RDXlqx7UKsLfM17uu+ol9UvpdGoNEed+5cpScjFcsB0XzdVdCpp7JLlxR+UZNwr9Wf1V6FbD2kDflqZRBuV8CQQCxxpq7CJUaLHfm2kjmVtaQwDDw1ZKRb/Dm+5MZ67bQbvbXFHCRKkGI4qqNRlKwGhqIAUN8Ynp+9WhrEe0lnxo1AkEA0flSDR9tbPADUtDgPN0zPrN3CTgcAmOsAKXSylmwpWciRrzKiI366DZ0m6KOJ7ew8z0viJrmZ3pmBsO537llRQJAZLrRxZRRV6lGrwmUMN+XaCFeGbgJ+lphN5/oc9F5npShTLEKL1awF23HkZD9HUdNLS76HCp4miNXbQOVSbHi2QJAUw7KSaWENXbCl5c7M43ESo9paHHXHT+/5bmzebq2eoBofn+IFsyJB8Lz5L7WciDK7WvrGC2JEbqwpFhWwCOl/w==";
    protected static final String apigwPublicKey="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

    public static void main(String[] args) throws IcbcApiException{
        DefaultIcbcClient client = new DefaultIcbcClient(appId, privateKey,apigwPublicKey);
        IQueryElecContractRequestV1 request = new IQueryElecContractRequestV1();

        request.setServiceUrl("https://gw.open.icbc.com.cn/api/mybank/loan/inclusivefinance/contracttextqry/V1");
        IQueryElecContractRequestV1.IQueryElecContractBizContent bizContent = new IQueryElecContractRequestV1.IQueryElecContractBizContent();
        HashMap<String,Object> param = new HashMap<String,Object>();
        //公共参数
        param.put("serialNo","123");
        param.put("appNo","F-APIP");
        param.put("areaCode","");
        param.put("employeeCode","");
        param.put("language","zh_CN");
        param.put("transNo","IQueryElecContractTextCocoaService");
        param.put("ver","1.0");
        param.put("turnPageFlag","");
        param.put("beginRow","");
        param.put("rowCount","");
        //私有参数
        param.put("cooperUnit","ST2313014");
        param.put("applyNo","123");
        param.put("ebankLoanApplyNo","123");
        param.put("cnltype","303");
        param.put("transDate","20170101");
        param.put("switchType","3");
        param.put("queryType","2");
        param.put("isSupportSVG","1");
        param.put("modelType","ZH0100");
        //System.out.println("-------合同文本查询入参--------"+param);

        bizContent.setParam(param);
        request.setBizContent(bizContent);
        //System.out.println("-------param--------"+param);
        IQueryElecContractResponseV1 response=new IQueryElecContractResponseV1();
        try{
            response = client.execute(request);
        }catch(Exception e){
        //    System.out.println(e.getMessage());
        }
        if(response.isSuccess()){
         //   System.out.println("success!");
        }else{
         //   System.out.println("fail"+response.getReturnMsg());
        }
    }

}
