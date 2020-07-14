package com.jiewen.qrcodepay.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.viewpager.widget.ViewPager;

import com.jiewen.qrcodepay.MyApplication;
import com.jiewen.qrcodepay.R;
import com.jiewen.qrcodepay.db.DataBean;
import com.jiewen.qrcodepay.db.ReceivableDao;
import com.jiewen.qrcodepay.util.DateUtil;
import com.jiewen.qrcodepay.util.StringUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainActivity extends BaseActivity implements View.OnClickListener{


    private ViewPager mPager;
    private ArrayList<ImageView> imgList;
    private ArrayList<ImageView> dots;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mPager = (ViewPager) findViewById(R.id.mViewPager);
        layout = (LinearLayout) findViewById(R.id.mLayout);
        findViewById(R.id.pay_btn).setOnClickListener(this);
        findViewById(R.id.menu_1).setOnClickListener(this);
        findViewById(R.id.menu_2).setOnClickListener(this);
        findViewById(R.id.menu_3).setOnClickListener(this);
        imgList = new ArrayList<ImageView>();
        dots = new ArrayList<ImageView>();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.pay_btn:
                Intent intent = new Intent(MainActivity.this, QrcodePayActivity.class);
                startActivity(intent);
                break;
            case R.id.menu_1:
                //查询
                Intent intent1 = new Intent(MainActivity.this, QrcodePayActivity.class);
                intent1.putExtra("type",1);
                startActivity(intent1);
                break;
            case R.id.menu_2:
                //退款
                Intent intent2 = new Intent(MainActivity.this, QrcodePayActivity.class);
                intent2.putExtra("type",2);
                startActivity(intent2);
                break;
            case R.id.menu_3:
                //退款查询
                Intent intent3 = new Intent(MainActivity.this, QrcodePayActivity.class);
                intent3.putExtra("type",3);
                startActivity(intent3);
                break;
            default:
                break;
        }
    }

    //删除 1个月前的数据库
    private void deleteDbDatas(){
        Log.e("ldy","deleteDbDatas()");
        try{
            String dayStr = MyApplication.getInstance().getUserSetting(MyApplication.deleteDataBeanTag);
            if (StringUtils.isEmpty(dayStr)){
                dayStr = "60";
            }
            int day = -(Integer.parseInt(dayStr));
            long time = DateUtil.getOldDate(day,"yyyyMMddHHmmss").getTime();
            List<DataBean> list = ReceivableDao.getInstance().queryBeforeDate("time",time);
            if (null != list && list.size() > 0){
                Log.e("ldy","支付要删除的条数="+list.size());
                ReceivableDao.getInstance().deleteListBeans(list);
            }
        }catch (SQLException e){
            e.printStackTrace();
            Log.d("ldy_deleteData","exception="+e.getMessage());
        }
    }


    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();
    }





    @Override
    protected void onDestroy() {
        super.onDestroy();
    }




}

