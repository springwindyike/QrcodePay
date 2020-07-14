/**
 * 
 */
package com.icbc.api.request;

import java.math.BigDecimal;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.request.BcssMemRefundRequestV1.BcssMemRefundRequestBizV1;

/**
 * 
 * @author kfzx-lizm
 *
 */
public class BcssMemRefundTestV1 {
    // MY_PRIVATE_KEY
    protected static final String MY_PRIVATE_KEY = "XXXXXXXXXXXXXXXXXX";
    // APIGW_PUBLIC_KEY
    protected static final String APIGW_PUBLIC_KEY = "XXXXXXXXXXXXXXXXXX";
    // APP_ID
    protected static final String APP_ID = "1*************************6";
    
    protected static final String RSA = "RSA";
    protected static final String RSA2 = "RSA2";

    public static void main(String[] args) throws Exception {
        BcssMemRefundTestV1 a = new BcssMemRefundTestV1();
        a.test_cop();
    }

    public void test_cop() throws IcbcApiException {
        BcssMemRefundRequestV1 request = new BcssMemRefundRequestV1();
        request.setServiceUrl("http://***.***.***.***:****/api/bcss/memRefund/refund/V1");
        BcssMemRefundRequestBizV1 bizContent = new BcssMemRefundRequestBizV1();
        bizContent.setManufacturerId("V***********1");
        bizContent.setCorpId("0***********3");
        bizContent.setImeiNo("0*************2");
        bizContent.setTimeStamp("2019-03-05 20:25:33");
        bizContent.setClientTransNo("0*******************9");
        bizContent.setClientType("3");
        bizContent.setOrderNo("ME*****************************5");
        bizContent.setOtherData("");
        bizContent.setMerNo("");
        bizContent.setRefundMethod("1");
        bizContent.setRecheckteller("");
        bizContent.setRefundType("2");
        bizContent.setRefundAmt(new BigDecimal(100));
        bizContent.setMsgFlag("0");
        bizContent.setOptionType("");
        request.setBizContent(bizContent);
        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID,RSA2,MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
        client.execute(request);
    }
    
}
