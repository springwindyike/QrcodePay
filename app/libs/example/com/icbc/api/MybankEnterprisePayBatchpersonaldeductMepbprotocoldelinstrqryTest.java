package com.icbc.api;

import com.icbc.api.request.MybankEnterprisePayBatchpersonaldeductMepbprotocoldelinstrqryRequestV1;
import com.icbc.api.request.MybankEnterprisePayBatchpersonaldeductMepbprotocoldelinstrqryRequestV1.MybankEnterprisePayBatchpersonaldeductMepbprotocoldelinstrqryRequesBizV1;
import com.icbc.api.response.MybankEnterprisePayBatchpersonaldeductMepbprotocoldelinstrqryResponseV1;

/**
 * 高级批量扣个人缴费协议删除指令查询接口QENDIDEL
 * 
 * @author kfzx-yinfc
 *
 */

public class MybankEnterprisePayBatchpersonaldeductMepbprotocoldelinstrqryTest {

    protected static String APP_ID = "10000000000000002225";
    protected static String APIGW_PUBLIC_KEY =
            "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY"
                    + "0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
    protected static String PRI_KEY =
            "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCe/HF/zUu+R1Y+wxHZvJPTng5+yog067beDjuXSfJdHaq/BBwDviYOtDRirXgrlNnZjRV/"
                    + "QTc+s4iU5KBGOWIJXXDbxypO9L1mX0jV05017F55mfs3N1sAfOkyz2LH0YZeQTvNm08Pnb0Pxy54TDtuJmM3Z43PbTURf9h+DpQI8EDbBdSlxdLw9"
                    + "E5Fc5m30QqLDcf8M0WlwemN8vS1U1z/zuSnS3b8DQ8NwYcGnoQqw1t2JMGouYrjENAUWJkKa7BOQpRYkq2WKmQ94V4rHelDSOriyV2WL3HxcF5xxoqwAy"
                    + "SORAU2vSdwUyV0Xv1SJLRPgIT66NkLwT7VgByfPdrRAgMBAAECggEAfv+KrptQmOOlOida2AJyV4WXcKLaYOO1xPW7lmNkbgtnvIRM2JSJFA/RFM4b"
                    + "Az05NDYl6OwwdC63uLBUcyQdcvuoTndvDXkk3mTY6q3KlCuHYD2nVfkrAV3GbmcJMjLl0d7sJZaddgz73GGwdjn280tI0BYxSnOjA6KLTk7Y47W"
                    + "4duC5m5lQcP2NFBvnJogQu86UzJfJd2C6KQd50Yt0sXNy6JA8jzBH2gMEBCV3iG6oPzHSur3502UUtGaGK4CsT659liRG1soMSwNwILNhqDGd/5jQr"
                    + "rKvK9ijpeW43j/ZVBJp7aDQcGjnTaIoveqqW0yrb24Dw2/W0tXHDR4XnQKBgQDt4U7hPl/TSkTSMhwD3StICAOEUtwZLq//QHW51glDpbAHSM"
                    + "z5oYkCRPBQtF269TT5FYWKjeJzbN8n4HEN+Rrc9uZK2LlsVR10UA0Q6aEwAJWgFieP7RG2wQm+Fo6VybuOjo6cDR1dy4UVcW+EE6Pg2UeuhTk"
                    + "FLJS1OnTcZQgDJwKBgQCrGLE7X9V48qIYZycyZdKcN+cTyW+iLtU7U9LXVbN9FyA8sPCgzzQT2qMlyYT9RPV/cxnlzf/E9GM2Z1KKQDjXN"
                    + "mNCUBQHWvktEbqGiZL4w9sDZf2LaY7g1cnw92uVDee+HgxCJ4DNyhmNTBuxUrY+aaUG4/XoAIGyYXDd+MQNRwKBgQCLynjhUxdbAm0Z"
                    + "HQtrleBmbxcp/suLHO2eUdIdCFPfZhHg5f5WwH/UTpDuzF+8i3a63dPhTWoDLLqjI3ksnfQUYB+LYnrs18P8Y0KaasEnhWBoeDx9jvJ2"
                    + "9E/2Xikiiy9mIg5aVDaqtPwbUtMWybfnXaiLPYz5pm4pZhXgopqnxwKBgEC+DDqabe3hakLvrZ5dd0+Tu8X6AFsPe7KCapL/I/cerB0rG"
                    + "zLOlTc6EWg4FDG+SWNby53w0GrXyz8H4+zalmehdffe02VhIE7UmY9VOZ8WhaaIjmOVovIjE9Ix3ay+YUXImvzhc9TrN7YG6ae0069UTJUJ"
                    + "58BNiMZWJt5nxs/7AoGAcn4pbsdp0CZK04u6d2PQfocvx/kgRMxY+DEVlzYzyGz00zRyNH0zY5ofFmYNCANj6VKHux/Nvm/GajdQHy5Y4c+e"
                    + "izH+N/eSoG1aoPLy491E3rwMiuoo7kVxJLx6pmkacKyLdylAs4ieSJIKpuiGTYVMjya5oP0EGYWMHgxncgQ=";
    protected static String BASE_URL = "http://122.64.61.85:8081/api";

    public static void main(String[] args) throws Exception {
        String URI = "mybank/enterprise/pay/batchpersonaldeduct/mepbprotocoldelinstrqry/V1";
        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, PRI_KEY, APIGW_PUBLIC_KEY);
        try {

            MybankEnterprisePayBatchpersonaldeductMepbprotocoldelinstrqryRequesBizV1 bizContent =
                    new MybankEnterprisePayBatchpersonaldeductMepbprotocoldelinstrqryRequesBizV1();
            MybankEnterprisePayBatchpersonaldeductMepbprotocoldelinstrqryRequestV1 request =
                    new MybankEnterprisePayBatchpersonaldeductMepbprotocoldelinstrqryRequestV1();
            bizContent.setTransCode("");
            bizContent.setBankCode("102");
            bizContent.setCis("");
            bizContent.setLoginId("");
            bizContent.setTranDate("");
            bizContent.setTranTime("");
            bizContent.setfSeqno("");
            bizContent.setQryfSeqno("");
            bizContent.setQrySerialNo("");


            request.setServiceUrl(BASE_URL + "/" + URI);
            request.setBizContent(bizContent);
            MybankEnterprisePayBatchpersonaldeductMepbprotocoldelinstrqryResponseV1 response =
                    client.execute(request);
            if (response.isSuccess()) {
                System.out.println("success");//
            } else {
                System.out.println("error");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
