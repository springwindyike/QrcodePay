package com.jiewen.qrcodepay.device;

import android.os.Bundle;

/**
 * .
 */

public class PrinterFormat {
    /***
     * 获取文本打印格式
     * @param font 字体，0:small, 1:normal, 2:large
     * @param align 对齐方式，默认左对齐，0:left, 1:center, 2:right
     * @param underline 是否添加下划线，（true：添加；false：不添加）
     * @param autoTrunc 超出一行是否自动截断（true：截断；false：不截断，默认 true）
     * @return Bundle
     */
    public static Bundle getTextFormat(int font, int align, boolean underline, boolean autoTrunc) {
        Bundle bundle = new Bundle();
        bundle.putInt("font", font);
        bundle.putInt("align", align);
        bundle.putBoolean("underline", underline);
        bundle.putBoolean("autoTrunc", autoTrunc);
        return bundle;
    }

    /***
     * 获取文本打印格式
     * @param font 字体，0:small, 1:normal, 2:large
     * @param align 对齐方式，默认左对齐，0:left, 1:center, 2:right
     * @return Bundle
     */
    public static Bundle getTextFormat(int font, int align) {
        return getTextFormat(font, align,false,false);
    }

    /***
     * 获取条形码打印格式
     * @param align 对齐方式，0:left, 1:center, 2:right
     * @param width 宽度
     * @param height 高度
     * @return Bundle
     */
    public static Bundle getBarCodeFormat(int align, int width, int height) {
        Bundle bundle = new Bundle();
        bundle.putInt("align", align);
        bundle.putInt("width", width);
        bundle.putInt("height", height);
        return bundle;
    }

    /***
     * 获取二维码打印格式
     * @param offset 打印起始位置
     * @param expectedHeight 期望高度
     * @return Bundle
     */
    public static Bundle getQrCodeFormat(int offset, int expectedHeight) {
        Bundle bundle = new Bundle();
        bundle.putInt("offset", offset);
        bundle.putInt("expectedHeight", expectedHeight);
        return bundle;
    }

    /***
     * 获取图片打印格式
     * @param offset 打印起始位置
     * @return Bundle
     */
    public static Bundle getImageFormat(int offset) {
        Bundle bundle = new Bundle();
        bundle.putInt("offset", offset);
        return bundle;
    }
}
