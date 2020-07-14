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
import com.icbc.api.request.BcssMemPaymentConsumRequestV1.BcssMemPaymentConsumRequestBizV1;

/**
 * 
 * @author kfzx-lizm
 *
 */
public class BcssMemPaymentConsumTestV1 {
    // MY_PRIVATE_KEY
    protected static final String MY_PRIVATE_KEY = "XXXXXXXXXXXXXXXXXX";
    // APIGW_PUBLIC_KEY
    protected static final String APIGW_PUBLIC_KEY = "XXXXXXXXXXXXXXXXXX";
    // APP_ID
    protected static final String APP_ID = "1*************************6";
    
    protected static final String RSA = "RSA";
    protected static final String RSA2 = "RSA2";

    public static void main(String[] args) throws Exception {
        BcssMemPaymentConsumTestV1 a = new BcssMemPaymentConsumTestV1();
        a.test_cop();
    }

    public void test_cop() throws IcbcApiException {
        BcssMemPaymentConsumRequestV1 request = new BcssMemPaymentConsumRequestV1();
        request.setServiceUrl("http://***.***.***.***:****/api/bcss/memPayment/consum/V1");
        BcssMemPaymentConsumRequestBizV1 bizContent = new BcssMemPaymentConsumRequestBizV1();         
        bizContent.setCorpId("0***********3");
        bizContent.setOrdersrc("3");
        bizContent.setManufacturerId("V***********1");
        bizContent.setCouponNo("");
        bizContent.setIndustry("001");
        bizContent.setTrademode("1");
        bizContent.setClientTransNo("0*************************2");
        bizContent.setPayAmt(new BigDecimal(3));
        bizContent.setUserId(null);
        bizContent.setFaceId(null);
        bizContent.setGoodsType("001");
        bizContent.setOptionType("");
        bizContent.setTimeStamp("2019-08-21 10:58:41");
        bizContent.setPayNo("8************************9");
        bizContent.setPayType("1");
        bizContent.setTotalAmt(new BigDecimal(3));
        bizContent.setClientType("7");
        bizContent.setMerNo("");
        bizContent.setImeiNo("0*************2");
        bizContent.setMsgFlag("0");
        bizContent.setDataSrc("4");
        bizContent.setOtherData(null);
        bizContent.setCouponAmt(null);
        List<BcssMemPaymentConsumGoodsInfoDto> goods = new ArrayList<BcssMemPaymentConsumGoodsInfoDto>();
        BcssMemPaymentConsumGoodsInfoDto good1 = new BcssMemPaymentConsumGoodsInfoDto();
        good1.setGoodsId("2**********************9");
        try {
            good1.setGoodsName(URLEncoder.encode("北方大馍","UTF-8"));
        } catch (UnsupportedEncodingException e) {
            good1.setGoodsName("BEI FAGN DA MO");
        }
        good1.setGoodsNum(new BigDecimal(1));
        good1.setGoodsAmt(new BigDecimal(1));
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
        BcssMemPaymentConsumGoodsInfoDto good2 = new BcssMemPaymentConsumGoodsInfoDto();
        good2.setGoodsId("2**********************1");
        try {
            good2.setGoodsName(URLEncoder.encode("糯米发糕","UTF-8"));
        } catch (UnsupportedEncodingException e) {
            good2.setGoodsName("LAO MAIN MAN TOU");
        }
        good2.setGoodsNum(new BigDecimal(1));
        good2.setGoodsAmt(new BigDecimal(1));
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
        request.setBizContent(bizContent);
        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID,RSA2,MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
        client.execute(request);
    }
    
}
