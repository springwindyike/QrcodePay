package com.jiewen.qrcodepay.db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

@DatabaseTable(tableName = "trans_detail")
public class DataBean implements Serializable {

    @DatabaseField(generatedId = true)
    private long id ;//单纯的id，只是为了删除数据库内容

    @DatabaseField(columnName = "type")
    private int type ;//1支付 2 退款

    @DatabaseField(columnName = "pay_status")
    private String pay_status;// 1支付成功，0支付中，2支付失败,-1下单失败

    @DatabaseField(columnName = "total_amt")
    private long total_amt;//订单金额
    @DatabaseField(columnName = "out_trade_no")
    private String out_trade_no;//商户订单号,原样返回
    @DatabaseField(columnName = "order_id")
    private String order_id;//行内系统订单号 ， 退款，查询，冲正等需要行内订单和商户订单有一个不为空

    @DatabaseField(columnName = "pay_time")
    private String pay_time;//yyyyMMdd  20200214
    @DatabaseField(columnName = "card_no")
    private String card_no;

    @DatabaseField(columnName = "reject_no")
    private String reject_no;//退款编号，用于查询二维码退款

    @DatabaseField(columnName = "time")
    private long time;//


    public DataBean(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTotal_amt() {
        return total_amt;
    }

    public void setTotal_amt(long total_amt) {
        this.total_amt = total_amt;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getPay_time() {
        return pay_time;
    }

    public void setPay_time(String pay_time) {
        this.pay_time = pay_time;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPay_status() {
        return pay_status;
    }

    public void setPay_status(String pay_status) {
        this.pay_status = pay_status;
    }

    public String getReject_no() {
        return reject_no;
    }

    public void setReject_no(String reject_no) {
        this.reject_no = reject_no;
    }
}
