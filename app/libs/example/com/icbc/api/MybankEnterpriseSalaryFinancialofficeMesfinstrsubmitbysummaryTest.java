package com.icbc.api;

import java.util.ArrayList;

import com.icbc.api.request.MybankEnterpriseSalaryFinancialofficeMesfinstrsubmitbysummaryRequestV1;
import com.icbc.api.request.MybankEnterpriseSalaryFinancialofficeMesfinstrsubmitbysummaryRequestV1.MybankEnterpriseSalaryFinancialofficeMesfinstrsubmitbysummaryRequestBizV1;
import com.icbc.api.request.MybankEnterpriseSalaryFinancialofficeMesfinstrsubmitbysummaryRequestV1.MybankEnterpriseSalaryFinancialofficeMesfinstrsubmitbysummaryRequestBizV1.RequestRdV1;
import com.icbc.api.response.MybankEnterpriseSalaryFinancialofficeMesfinstrsubmitbysummaryResponseV1;


/**
 * @author kfzx-renqh
 *
 * 企业财务室指令提交汇总记账
 */
public class MybankEnterpriseSalaryFinancialofficeMesfinstrsubmitbysummaryTest {

    protected static String APP_ID = "10000000000000002225";
    protected static String APIGW_PUBLIC_KEY =
            "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
    protected static String PRI_KEY =
            "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCe/HF/zUu+R1Y+wxHZvJPTng5+yog067beDjuXSfJdHaq/BBwDviYOtDRirXgrlNnZjRV/QTc+s4iU5KBGOWIJXXDbxypO9L1mX0jV05017F55mfs3N1sAfOkyz2LH0YZeQTvNm08Pnb0Pxy54TDtuJmM3Z43PbTURf9h+DpQI8EDbBdSlxdLw9E5Fc5m30QqLDcf8M0WlwemN8vS1U1z/zuSnS3b8DQ8NwYcGnoQqw1t2JMGouYrjENAUWJkKa7BOQpRYkq2WKmQ94V4rHelDSOriyV2WL3HxcF5xxoqwAySORAU2vSdwUyV0Xv1SJLRPgIT66NkLwT7VgByfPdrRAgMBAAECggEAfv+KrptQmOOlOida2AJyV4WXcKLaYOO1xPW7lmNkbgtnvIRM2JSJFA/RFM4bAz05NDYl6OwwdC63uLBUcyQdcvuoTndvDXkk3mTY6q3KlCuHYD2nVfkrAV3GbmcJMjLl0d7sJZaddgz73GGwdjn280tI0BYxSnOjA6KLTk7Y47W4duC5m5lQcP2NFBvnJogQu86UzJfJd2C6KQd50Yt0sXNy6JA8jzBH2gMEBCV3iG6oPzHSur3502UUtGaGK4CsT659liRG1soMSwNwILNhqDGd/5jQrrKvK9ijpeW43j/ZVBJp7aDQcGjnTaIoveqqW0yrb24Dw2/W0tXHDR4XnQKBgQDt4U7hPl/TSkTSMhwD3StICAOEUtwZLq//QHW51glDpbAHSMz5oYkCRPBQtF269TT5FYWKjeJzbN8n4HEN+Rrc9uZK2LlsVR10UA0Q6aEwAJWgFieP7RG2wQm+Fo6VybuOjo6cDR1dy4UVcW+EE6Pg2UeuhTkFLJS1OnTcZQgDJwKBgQCrGLE7X9V48qIYZycyZdKcN+cTyW+iLtU7U9LXVbN9FyA8sPCgzzQT2qMlyYT9RPV/cxnlzf/E9GM2Z1KKQDjXNmNCUBQHWvktEbqGiZL4w9sDZf2LaY7g1cnw92uVDee+HgxCJ4DNyhmNTBuxUrY+aaUG4/XoAIGyYXDd+MQNRwKBgQCLynjhUxdbAm0ZHQtrleBmbxcp/suLHO2eUdIdCFPfZhHg5f5WwH/UTpDuzF+8i3a63dPhTWoDLLqjI3ksnfQUYB+LYnrs18P8Y0KaasEnhWBoeDx9jvJ29E/2Xikiiy9mIg5aVDaqtPwbUtMWybfnXaiLPYz5pm4pZhXgopqnxwKBgEC+DDqabe3hakLvrZ5dd0+Tu8X6AFsPe7KCapL/I/cerB0rGzLOlTc6EWg4FDG+SWNby53w0GrXyz8H4+zalmehdffe02VhIE7UmY9VOZ8WhaaIjmOVovIjE9Ix3ay+YUXImvzhc9TrN7YG6ae0069UTJUJ58BNiMZWJt5nxs/7AoGAcn4pbsdp0CZK04u6d2PQfocvx/kgRMxY+DEVlzYzyGz00zRyNH0zY5ofFmYNCANj6VKHux/Nvm/GajdQHy5Y4c+eizH+N/eSoG1aoPLy491E3rwMiuoo7kVxJLx6pmkacKyLdylAs4ieSJIKpuiGTYVMjya5oP0EGYWMHgxncgQ=";
    protected static String BASE_URL = "http://122.64.61.85:8081/api";

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        String URI = "mybank/enterprise/salary/financialoffice/mesfinstrsubmitbysummary/V1"; // api地址
        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, PRI_KEY, APIGW_PUBLIC_KEY);
        try {

            MybankEnterpriseSalaryFinancialofficeMesfinstrsubmitbysummaryRequestBizV1 bizContent =
                    new MybankEnterpriseSalaryFinancialofficeMesfinstrsubmitbysummaryRequestBizV1();
            MybankEnterpriseSalaryFinancialofficeMesfinstrsubmitbysummaryRequestV1 request = new MybankEnterpriseSalaryFinancialofficeMesfinstrsubmitbysummaryRequestV1();
            // 请对照接口文档用bizContent.setxxx()方法对业务上送数据进行赋值
            bizContent.setTransCode("PAYPERCOL");
            bizContent.setCis("");
            bizContent.setBankCode("");
            bizContent.setLoginId("");
            bizContent.setTranDate("");
            bizContent.setTranTime("");
            bizContent.setfSeqno("");
            
            bizContent.setOnlBatF("");
            bizContent.setBusType("");
            bizContent.setTotalNum(1);  
            bizContent.setTotalAmt((long) 3013);
            bizContent.settHBaseAccFlag("");
            // rd
            ArrayList<RequestRdV1> rd = new ArrayList<RequestRdV1>();
            RequestRdV1 rdV1 = new RequestRdV1();
            rdV1.setiSeqno("");
            rdV1.setPayType("");
            rdV1.setPayAccNo("");
            rdV1.setPayAccNameCN("");
            rdV1.setRecAccNo("");
            rdV1.setRecAccNameCN("");
            rdV1.setSysIOFlg("");
            rdV1.setIsSameCity("");
            rdV1.setRecICBCCode("");
            rdV1.setRecBankNo("");
            rdV1.setRecBankName("");
            rdV1.setCurrType("");
            rdV1.setPayAmt((long) 3013);
            rdV1.setUseCode("");
            rdV1.setUseCN("");
            rdV1.setEnSummary("");
            rdV1.setPostScript("");
            rdV1.setSummary("");
            rd.add(rdV1);
            bizContent.setRd(rd);
            
            request.setServiceUrl(BASE_URL + "/" + URI);
            request.setBizContent(bizContent);
            // 输出支付指令提交响应对象，需根据实际调用服务更换（MybankEnterpriseSalaryFinancialofficeMesfinstrsubmitbysummaryResponseV1）
            MybankEnterpriseSalaryFinancialofficeMesfinstrsubmitbysummaryResponseV1 response = client.execute(request);
            if (response.isSuccess()) {
                // 业务成功处理
                System.out.println("success");//
            } else {
                // 失败
                System.out.println("error");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
