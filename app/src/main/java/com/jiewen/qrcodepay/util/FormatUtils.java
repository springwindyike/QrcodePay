package com.jiewen.qrcodepay.util;

public class FormatUtils {
    /**
     * 金额转换
     */
    public  static String getPayAmount(String amount){
        String amtTrim = amount.trim();
        String tmpAmt = "";
        if (amount.indexOf(".") != -1) {
            String tmpAmt1 = amtTrim.substring(0, amtTrim.indexOf("."));
            String tmpAmt2 = amtTrim.substring(amtTrim.indexOf(".") + 1);
            if (tmpAmt2.length() == 1) {
                tmpAmt = tmpAmt1 + tmpAmt2 + "0";
            } else if (tmpAmt2.length() == 2) {
                tmpAmt = tmpAmt1 + tmpAmt2;
            } else if (tmpAmt2.length() == 0)
                tmpAmt = tmpAmt1 + "00";
        } else
            tmpAmt = amtTrim + "00";
       return tmpAmt;
    }
}
