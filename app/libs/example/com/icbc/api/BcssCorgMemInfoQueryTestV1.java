/**
 * 
 */
package com.icbc.api.request;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.internal.util.internal.util.fastjson.JSONObject;
import com.icbc.api.request.BcssCorgMemInfoQueryRequestV1.BcssCorgMemInfoQueryRequestBizV1;
import com.icbc.api.response.BcssCorgMemInfoQueryResponseV1;

/**
 * 
 * 
 * @author kfzx-lizm
 *
 */
public class BcssCorgMemInfoQueryTestV1 {
    // MY_PRIVATE_KEY
    protected static final String MY_PRIVATE_KEY = "XXXXXXXXXXXXXXXXXX";
    // APIGW_PUBLIC_KEY
    protected static final String APIGW_PUBLIC_KEY = "XXXXXXXXXXXXXXXXXX";
    // APP_ID
    protected static final String APP_ID = "1*************************6";
    
    protected static final String RSA = "RSA";
    protected static final String RSA2 = "RSA2";

    public static void main(String[] args) throws Exception {
        BcssCorgMemInfoQueryTestV1 a = new BcssCorgMemInfoQueryTestV1();
        a.test_cop();
    }

    public void test_cop() throws IcbcApiException {
        BcssCorgMemInfoQueryRequestV1 request = new BcssCorgMemInfoQueryRequestV1();
        request.setServiceUrl("http://***.***.***.***:****/api/bcss/corgMemInfo/query/V1");
        BcssCorgMemInfoQueryRequestBizV1 bizContent = new BcssCorgMemInfoQueryRequestBizV1();
  
        bizContent.setCorpId("0***********3");
        bizContent.setOrdersrc("3");
        bizContent.setManufacturerId("L************1");
        bizContent.setTrademode("1");
        bizContent.setClientTransNo("0*************************5");
        bizContent.setPayAmt(new BigDecimal(1000));
        bizContent.setTimeStamp("2019-06-05 13:47:49");
        bizContent.setPayType("2");
        bizContent.setTotalAmt(new BigDecimal(1000));
        bizContent.setClientType("3");
        bizContent.setMerNo("");
        bizContent.setImeiNo("0*************2");
        bizContent.setMsgFlag("0");
        bizContent.setOptionType("");
        bizContent.setGoodsType("001");
        bizContent.setIndustry("001");
        bizContent.setDataSrc("1");
        List<BcssCorgMemInfoGoodsInfoDto> goods = new ArrayList<BcssCorgMemInfoGoodsInfoDto>();
        BcssCorgMemInfoGoodsInfoDto good1 = new BcssCorgMemInfoGoodsInfoDto();
        good1.setGoodsId("2**********************9");
        try {
            good1.setGoodsName(URLEncoder.encode("北方大馍","UTF-8"));
        } catch (UnsupportedEncodingException e) {
            good1.setGoodsName("BEI FAGN DA MO");
        }
        good1.setGoodsNum(new BigDecimal(1));
        good1.setGoodsAmt(new BigDecimal(500));
        good1.setGoodstype("001");
        try {
            good1.setGoodsName(URLEncoder.encode("特大","UTF-8"));
        } catch (UnsupportedEncodingException e) {
            good1.setGoodsName("TE DA");
        }
        good1.setGroupNo(null);
        good1.setPeriodid(null);
        good1.setTypeid(null);
        good1.setGoodsback(null);
        good1.setDistributeDate(null);
        goods.add(good1);
        BcssCorgMemInfoGoodsInfoDto good2 = new BcssCorgMemInfoGoodsInfoDto();
        good2.setGoodsId("2**********************1");
        try {
            good2.setGoodsName(URLEncoder.encode("糯米发糕","UTF-8"));
        } catch (UnsupportedEncodingException e) {
            good2.setGoodsName("LAO MAIN MAN TOU");
        }
        good2.setGoodsNum(new BigDecimal(1));
        good2.setGoodsAmt(new BigDecimal(500));
        good2.setGoodstype("001");
        try {
            good2.setGoodsName(URLEncoder.encode("特大","UTF-8"));
        } catch (UnsupportedEncodingException e) {
            good2.setGoodsName("TE DA");
        }
        good2.setGroupNo(null);
        good2.setPeriodid(null);
        good2.setTypeid(null);
        good2.setGoodsback(null);
        good2.setDistributeDate(null);
        goods.add(good2);
        bizContent.setGoods(goods);
        bizContent.setParam1("XXXXXXXXXXXXXXXXXX");
        request.setBizContent(bizContent);
        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID,RSA2,MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
        client.execute(request);
    }
    
}
