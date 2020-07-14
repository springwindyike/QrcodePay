package com.jiewen.qrcodepay.bean;

public class TransListBean {
    private String transName;
    private int imgId;
    private int code;//  0 生成二维码  1 扫客户二维码

    public TransListBean(int code, String name, int img){
        this.code = code;
        this.imgId = img;
        this.transName = name;
    }

    public String getTransName() {
        return transName;
    }

    public void setTransName(String transName) {
        this.transName = transName;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
