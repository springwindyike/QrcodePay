package com.jiewen.qrcodepay.Activity;

import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcApiException;
import com.icbc.api.IcbcConstants;
import com.icbc.api.request.QrcodeGenerateRequestV2;
import com.icbc.api.request.QrcodePayRequestV2;
import com.icbc.api.request.QrcodeQueryRequestV5;
import com.icbc.api.response.QrcodeGenerateResponseV2;
import com.icbc.api.response.QrcodePayResponseV2;
import com.icbc.api.response.QrcodeQueryResponseV5;
import com.jiewen.qrcodepay.MyApplication;
import com.jiewen.qrcodepay.R;
import com.jiewen.qrcodepay.adapter.GirdPayTypeAdapter;
import com.jiewen.qrcodepay.bean.TransListBean;


import com.jiewen.qrcodepay.db.DataBean;
import com.jiewen.qrcodepay.db.ReceivableDao;
import com.jiewen.qrcodepay.device.ScannerService;
import com.jiewen.qrcodepay.util.DateUtil;
import com.jiewen.qrcodepay.util.FormatUtils;
import com.jiewen.qrcodepay.util.LogUtil;

import com.jiewen.qrcodepay.util.QrCodeUtil;
import com.jiewen.qrcodepay.util.StringUtils;

import java.util.ArrayList;


public class QrcodePayActivity  extends BaseActivity implements View.OnClickListener{
    private String TAG = "CashierActivity";
    private TextView title_center_tv;
    private TextView num_btn1, num_btn2, num_btn3,
            num_btn4, num_btn5, num_btn6, num_btn7,
            num_btn8, num_btn9, num_btn0, pay_btn;
    private TextView amount_tv;
    private RelativeLayout del_btn, del_all_btn;
    //private String extOrder;

    private String amtStr;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhifu);
        title_center_tv = findViewById(R.id.title_center_tv);
        title_center_tv.setText("收银");
        num_btn1 = findViewById(R.id.num_btn1);
        num_btn2 = findViewById(R.id.num_btn2);
        num_btn3 = findViewById(R.id.num_btn3);
        num_btn4 = findViewById(R.id.num_btn4);
        num_btn5 = findViewById(R.id.num_btn5);
        num_btn6 = findViewById(R.id.num_btn6);
        num_btn7 = findViewById(R.id.num_btn7);
        num_btn8 = findViewById(R.id.num_btn8);
        num_btn9 = findViewById(R.id.num_btn9);
        num_btn0 = findViewById(R.id.num_btn0);
        pay_btn = findViewById(R.id.pay_btn);
        del_btn = findViewById(R.id.del_btn);
        del_all_btn = findViewById(R.id.del_all_btn);
        amount_tv = findViewById(R.id.amount_tv);
        num_btn0.setOnClickListener(this);
        num_btn1.setOnClickListener(this);
        num_btn2.setOnClickListener(this);
        num_btn3.setOnClickListener(this);
        num_btn4.setOnClickListener(this);
        num_btn5.setOnClickListener(this);
        num_btn6.setOnClickListener(this);
        num_btn7.setOnClickListener(this);
        num_btn8.setOnClickListener(this);
        num_btn9.setOnClickListener(this);
        pay_btn.setOnClickListener(this);
        del_all_btn.setOnClickListener(this);
        del_btn.setOnClickListener(this);
        findViewById(R.id.title_left).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.title_left:
                finish();
                break;
            case R.id.num_btn0:
                NUM("0");
                break;
            case R.id.num_btn1:
                NUM("1");
                break;
            case R.id.num_btn2:
                NUM("2");
                break;
            case R.id.num_btn3:
                NUM("3");
                break;
            case R.id.num_btn4:
                NUM("4");
                break;
            case R.id.num_btn5:
                NUM("5");
                break;
            case R.id.num_btn6:
                NUM("6");
                break;
            case R.id.num_btn7:
                NUM("7");
                break;
            case R.id.num_btn8:
                NUM("8");
                break;
            case R.id.num_btn9:
                NUM("9");
                break;
            case R.id.point_btn:

                break;
            case R.id.del_btn:
                delNum();
                break;
            case R.id.del_all_btn:
                amount_tv.setText("0.00");
                break;
            case R.id.pay_btn:
                final String amount = amount_tv.getText().toString();
                //extOrder = DateUtils.getSysDateTime() + Utils.getUUID();
                if (amount.equals("0.00")) {
                    return;
                }

                String amountStr = FormatUtils.getPayAmount(amount);
                Log.e("ldy","amountStr="+ Long.parseLong(amountStr));
                select(amountStr);
                break;
        }
    }

    private void NUM(String num) {
        String money = amount_tv.getText().toString();
        if (money.length() == 13)
            return;
        String a = money.substring(0, 1);
        if (a.equals("0")) {
            money = money.substring(1, money.length());
        }
        String m = money.substring(0, money.length() - 3) + money.substring(money.length() - 2, money.length());
        Log.e("MYTAG", "money!" + m);
        money = m + num;
        Log.e("MYTAG", "money@" + money);
        money = money.substring(0, money.length() - 2) + "." + money.substring(money.length() - 2, money.length());
        amount_tv.setText(money);
    }

    private void delNum() {
        String money = amount_tv.getText().toString();
        if (money.equals("0.00"))
            return;
        String n = money.substring(0, money.indexOf("."));
        if (n.equals("0")) {
            money = money.substring(money.length() - 2, money.length() - 1);
            money = "0.0" + money;
            amount_tv.setText(money);
        } else {
            money = money.substring(money.length() - 2, money.length() - 1);
            money = n + money;
            money = money.substring(0, money.length() - 2) + "." + money.substring(money.length() - 2, money.length());
            n = money.substring(0, money.indexOf(".") + 1);
            if (n.equals("."))
                money = "0" + money;
            amount_tv.setText(money);
        }
    }



    //选择付款方式
    private void select(final String amount){
        final ArrayList<TransListBean> payList = new ArrayList<>();
        TransListBean bean1 = new TransListBean(0,"生成二维码",
                R.mipmap.grid_3);
        TransListBean bean2 = new TransListBean(1,
                "扫描付款码",
                R.mipmap.grid_2);
        payList.add(bean1);
        payList.add(bean2);
        final View view = LayoutInflater.from(this).inflate(R.layout.dialog_pay_type,null);
        ImageView cancelPay = view.findViewById(R.id.cancel_pay);
        GridView listView = view.findViewById(R.id.grid_paytype);
        listView.setSelector(new ColorDrawable(Color.TRANSPARENT));
        GirdPayTypeAdapter adapter = new GirdPayTypeAdapter(this, payList);
        listView.setAdapter(adapter);
        final AlertDialog.Builder builder = new AlertDialog.Builder(QrcodePayActivity.this);
        final AlertDialog dialog =builder.create();
        dialog.setView(view);
        cancelPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
//                errorBack("用户取消");
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                dialog.dismiss();
                if (0 == payList.get(i).getCode()){

                    showLoading("生成二维码...");
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            generateQrCode(amount);
                        }
                    }).start();
                }else if (1 == payList.get(i).getCode()){
                    //扫码
                    amtStr = amount;
                    onBtnScanner();
                }
            }
        });
        dialog.show();
    }

    private void ScanerQrcode(String amount) {


    }

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case 0:
                    final String scanData = String.valueOf(msg.obj);
                    Log.e("ldy", "scanData: "+scanData);
                    if (null != scanData && scanData.length() > 0){
//                        if (StringUtils.isEmpty(APPID) || StringUtils.isEmpty(MY_PRIVATE_KEY) || StringUtils.isEmpty(APIGW_PUBLIC_KEY)){
//                            Toast.makeText(CashierActivity.this,"请先设置公钥，私钥，appID等",Toast.LENGTH_LONG).show();
//                            return;
//                        }
                        showLoading("扫描支付...");
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                qrPay(amtStr,scanData);
                            }
                        }).start();
                    }
                    break;
                case 10:
                    dissLoading();
                    //弹框展示二维码内容
                    showQrCode(QrCodeUtil.createQRCodeBitmap(String.valueOf(msg.obj), 800, 800,"UTF-8",
                            "H", "1",
                            Color.BLACK, Color.WHITE));
                    break;
                case 11:
                    dissLoading();
//                    Toast.makeText(CashierActivity.this,String.valueOf(msg.obj),Toast
//                            .LENGTH_SHORT).show();
                    //二维码扫码支付失败,开始二维码查询
                    showLoading("查询二维码支付结果");
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            qrQuery("",qrOrder);
                        }
                    }).start();
                    break;
                case 12:
                    dissLoading();
                    Toast.makeText(QrcodePayActivity.this,String.valueOf(msg.obj),Toast
                            .LENGTH_SHORT).show();
                    break;
                case 20:
                    dissLoading();
                    QrcodePayResponseV2 response = (QrcodePayResponseV2)(msg.obj);
                    String payStatus = response.getPayStatus();//交易结果标志，-1:下单失败，0：支付中，1：支付成功，2：支付失败
                    DataBean dataBean = new DataBean();
                    dataBean.setType(1);
                    dataBean.setPay_status(payStatus);
                    dataBean.setTotal_amt(Long.parseLong(response.getTotalAmt()));
                    dataBean.setOut_trade_no(qrOrder);
                    dataBean.setOrder_id(response.getOrderId());
                    dataBean.setPay_time(response.getPayTime());
                    dataBean.setCard_no(response.getCardNo());
                    dataBean.setTime(DateUtil.getTimestamp());
                    ReceivableDao.getInstance().insertBean(dataBean);
                    if ("1".equals(payStatus)){
                        Toast.makeText(QrcodePayActivity.this,"支付成功",Toast
                                .LENGTH_SHORT).show();
                        finish();
                    }else if ("-1".equals(payStatus)){
                        Toast.makeText(QrcodePayActivity.this,"-1下单失败",Toast
                                .LENGTH_SHORT).show();
                    }else if ("0".equals(payStatus)){
                        Toast.makeText(QrcodePayActivity.this,"0支付中",Toast
                                .LENGTH_SHORT).show();
                    }else if ("2".equals(payStatus)){
                        Toast.makeText(QrcodePayActivity.this,"2支付失败",Toast
                                .LENGTH_SHORT).show();
                    }
                    break;
                case 30:
                    dissLoading();
                    //二维码查询成功
                    Toast.makeText(QrcodePayActivity.this,"支付成功",Toast
                            .LENGTH_SHORT).show();
                    finish();
                    break;
                default:
                    break;
            }

        }
    };

    //在线生成二维码
    private void generateQrCode(String amount){
        Log.i("ldy","DateUtil.getCurrentSysTime(MMddHHmmss)="+DateUtil.getCurrentSysTime("MMddHHmmss"));
        String qrOrder = "123432413170003191";
//                MyApplication.getInstance().getUserSetting(MyApplication.snTag) + DateUtil.getCurrentSysTime
//                        ("MMddHHmmss");
        String str =
                "开始生成二维码|时间:"+DateUtil.getCurrentSysTime("yyyy-MM-dd HH:mm:ss")+"|金额"+amount+
                        "|商业订单号:"+qrOrder+"\n";
        LogUtil.writeLogToFile(str);
        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA2,
                MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
        QrcodeGenerateRequestV2  request = new QrcodeGenerateRequestV2 ();
        request.setServiceUrl("https://gw.open.icbc.com.cn/api/qrcode/V2/generate");
        QrcodeGenerateRequestV2.QrcodeGenerateRequestV2Biz bizContent = new QrcodeGenerateRequestV2.QrcodeGenerateRequestV2Biz();
        bizContent.setMerId("131703040036");
        bizContent.setStoreCode("13170003191");
        bizContent.setOutTradeNo(qrOrder);
        bizContent.setOrderAmt(amount);//0.01
        bizContent.setTradeDate(DateUtil.getCurrentSysTime("yyyyMMdd"));
        bizContent.setTradeTime(DateUtil.getCurrentSysTime("HHmmss"));
        bizContent.setAttach("test");//该字段非必输项
        bizContent.setPayExpire("1200");
        bizContent.setNotifyUrl("127.0.0.1");//该字段非必输项
        bizContent.setTporderCreateIp("127.0.0.1");
        bizContent.setSpFlag("0");//该字段非必输项
        bizContent.setNotifyFlag("1");
       // Gson gson = new Gson();
       // String str2 = "请求报文:"+gson.toJson(bizContent)+"\n";
      //  LogUtil.writeLogToFile(str2);
        request.setBizContent(bizContent);
        Log.e("ldy","request="+request.getServiceUrl());
        QrcodeGenerateResponseV2 response = new QrcodeGenerateResponseV2();
        try {
            String msgId = "131703040036" + System.currentTimeMillis();
            response = client.execute(request, msgId);
          //  String str3 = "返回报文:"+gson.toJson(response)+"\n";
          //  LogUtil.writeLogToFile(str3);
            if (response.isSuccess()) {
                // 业务成功处理
                System.out.println("ReturnCode:"+response.getReturnCode());
                System.out.println("response:" + response);
                Message msg = handler.obtainMessage();
                msg.what = 10;
                msg.obj = response.getQrcode();
                handler.sendMessage(msg);
            } else {
                // 失败
                System.out.println("ReturnCode:"+response.getReturnCode());
                System.out.println("ReturnMsg:"+response.getReturnMsg());
                Message msg = handler.obtainMessage();
                msg.what = 12;
                msg.obj = response.getReturnMsg();
                handler.sendMessage(msg);
            }
        } catch (IcbcApiException e) {
            String str3 = "返回异常IcbcApiException:e.getErrMsg()="+e.getErrMsg()+"|e.getMessage()="+
                    e.getMessage()+"\n";
            LogUtil.writeLogToFile(str3);
            e.printStackTrace();
            Message msg = handler.obtainMessage();
            msg.what = 12;
            msg.obj = "e.getErrMsg()="+e.getErrMsg()+"|e.getMessage()="+
                    e.getMessage();
            handler.sendMessage(msg);
        }
    }

    //扫付款码
    private String qrOrder;
    private void qrPay(String amount, String qrCode){
        qrOrder = MyApplication.getInstance().getUserSetting(MyApplication.snTag) + DateUtil.getCurrentSysTime
                ("MMddHHmmss");
        String str =
                "开始发起支付交易|时间:"+DateUtil.getCurrentSysTime("yyyy-MM-dd HH:mm:ss")+"|金额"+amount+
                        "|商业订单号:"+qrOrder+"\n";
        LogUtil.writeLogToFile(str);
        Log.i("ldy","qrOrder.length()="+qrOrder.length());
        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA2,
                MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
        QrcodePayRequestV2 request = new QrcodePayRequestV2();
        request.setServiceUrl("https://gw.open.icbc.com.cn/api/qrcode/pay/V4");
        QrcodePayRequestV2.QrcodePayRequestV2Biz bizContent = new QrcodePayRequestV2.QrcodePayRequestV2Biz();
        bizContent.setQrCode(qrCode);
        bizContent.setMerId(MyApplication.getInstance().getUserSetting(MyApplication.merIdTag));
        bizContent.setOutTradeNo(qrOrder);
        bizContent.setOrderAmt(amount);
        bizContent.setTradeDate(DateUtil.getCurrentSysTime("yyyyMMdd"));
        bizContent.setTradeTime(DateUtil.getCurrentSysTime("HHmmss"));
        //Gson gson = new Gson();
        //String str2 = "请求报文:"+gson.toJson(bizContent)+"\n";
        //LogUtil.writeLogToFile(str2);
        request.setBizContent(bizContent);
        QrcodePayResponseV2 response;
        try {
            response = client.execute(request, MyApplication.getInstance().getUserSetting(MyApplication.snTag) + System.currentTimeMillis());
          //  String str3 = "返回报文:"+gson.toJson(response)+"\n";
           // LogUtil.writeLogToFile(str3);
            if (response.isSuccess()) {
                // 业务成功处理
                System.out.println("ReturnCode:"+response.getReturnCode());
                System.out.println("response:" + response);
                Message msg = handler.obtainMessage();
                msg.what = 20;
                msg.obj = response;
                handler.sendMessage(msg);
            } else {
                // 失败
                System.out.println("ReturnCode:"+response.getReturnCode());
                System.out.println("ReturnMsg:"+response.getReturnMsg());
                Message msg = handler.obtainMessage();
                msg.what = 11;
                msg.obj = response.getReturnMsg();
                handler.sendMessage(msg);
            }
        } catch (IcbcApiException e) {
            String str3 = "返回异常IcbcApiException:e.getErrMsg()="+e.getErrMsg()+"|e.getMessage()="+
                    e.getMessage()+"\n";
            LogUtil.writeLogToFile(str3);
            e.printStackTrace();
            Message msg = handler.obtainMessage();
            msg.what = 11;
            msg.obj = "e.getErrMsg()="+e.getErrMsg()+"|e.getMessage()="+
                    e.getMessage();
            handler.sendMessage(msg);
        }
    }

    //二维码查询
    private void qrQuery(String order_id,String out_trade_no) {
        String str =
                "开始发起二维码查询交易|时间:"+DateUtil.getCurrentSysTime("yyyy-MM-dd HH:mm:ss")+"|行内订单号:"+order_id+
                        "|商业订单号:"+out_trade_no+"\n";
        LogUtil.writeLogToFile(str);
        DefaultIcbcClient client = new DefaultIcbcClient(APP_ID, IcbcConstants.SIGN_TYPE_RSA2, MY_PRIVATE_KEY, APIGW_PUBLIC_KEY);
        QrcodeQueryRequestV5 request = new QrcodeQueryRequestV5();
        //根据测试环境和生产环境替换相应ip和端口
        request.setServiceUrl("https://gw.open.icbc.com.cn/api/qrcode/query/V5");
        QrcodeQueryRequestV5.QrcodeQueryRequestV5Biz bizContent = new QrcodeQueryRequestV5.QrcodeQueryRequestV5Biz();
        bizContent.setMerId(MyApplication.getInstance().getUserSetting(MyApplication.merIdTag));
        bizContent.setCustId("");//该字段非必输项
        if (StringUtils.isEmpty(order_id)) {
            bizContent.setOutTradeNo(out_trade_no);
        } else {
            bizContent.setOrderId(order_id);
        }
       // Gson gson = new Gson();
       // String str2 = "请求报文:"+gson.toJson(bizContent)+"\n";
       // LogUtil.writeLogToFile(str2);
        request.setBizContent(bizContent);
        QrcodeQueryResponseV5 response;
        try {
            response = client.execute(request, MyApplication.getInstance().getUserSetting(MyApplication.snTag) + System.currentTimeMillis());//msgId消息通讯唯一编号，要求每次调用独立生成，APP级唯一
           // String str3 = "返回报文:"+gson.toJson(response)+"\n";
            //LogUtil.writeLogToFile(str3);
            if (response.isSuccess()) {
                // 业务成功处理
                System.out.println("ReturnCode:" + response.getReturnCode());
                System.out.println("response:" + response);
                Message msg = handler.obtainMessage();
                msg.what = 30;
                msg.obj = response;
                handler.sendMessage(msg);
            } else {
                // 失败
                System.out.println("ReturnCode:" + response.getReturnCode());
                System.out.println("ReturnMsg:" + response.getReturnMsg());
                Message msg = handler.obtainMessage();
                msg.what = 12;
                msg.obj = response.getReturnMsg();
                handler.sendMessage(msg);
            }
        } catch (IcbcApiException e) {
            String str3 = "返回异常IcbcApiException:e.getErrMsg()="+e.getErrMsg()+"|e.getMessage()="+
                    e.getMessage()+"\n";
            LogUtil.writeLogToFile(str3);
            e.printStackTrace();
            Message msg = handler.obtainMessage();
            msg.what = 12;
            msg.obj = "e.getErrMsg()="+e.getErrMsg()+"|e.getMessage()="+
                    e.getMessage();
            handler.sendMessage(msg);
        }
    }
    private void onBtnScanner() {
        setContentView(R.layout.main);

//        scanner.startScan(new ScannerService.IScannerListener() {
//            @Override
//            public void onSuccess(String barcode) {
//                Message msg = handler.obtainMessage();
//                msg.what = 0;
//                msg.obj = barcode;
//                handler.sendMessage(msg);
//            }
//
//            @Override
//            public void onError(String message) {
//                Message msg = handler.obtainMessage();
//                msg.what = 11;
//                msg.obj = "扫码失败，失败描述=["+message+"]";
//                handler.sendMessage(msg);
//            }
//
//            @Override
//            public void onTimeout() {
//                Message msg = handler.obtainMessage();
//                msg.what = 11;
//                msg.obj = "扫码超时退出";
//                handler.sendMessage(msg);
//            }
//
//            @Override
//            public void onCancel() {
//                Message msg = handler.obtainMessage();
//                msg.what = 11;
//                msg.obj = "用户取消扫码";
//                handler.sendMessage(msg);
//            }
//        });
    }


    private void showQrCode(Bitmap bitmap){
        final ImageView view = new ImageView(this);
        view.setImageBitmap(bitmap);
        final AlertDialog.Builder builder = new AlertDialog.Builder(QrcodePayActivity.this);
        final AlertDialog dialog =builder.create();
        dialog.setView(view);
        dialog.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
