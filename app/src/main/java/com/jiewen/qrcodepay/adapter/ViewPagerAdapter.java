package com.jiewen.qrcodepay.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/12/8 0008.
 */
public class ViewPagerAdapter extends PagerAdapter {
    private ArrayList<ImageView> list;
    public ViewPagerAdapter(ArrayList<ImageView> list){
        this.list=list;
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return list.size();
    }

    //是否是同一张图片
    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        // TODO Auto-generated method stub
        return arg0 == arg1;
    }

    @Override
    public void destroyItem(ViewGroup view, int position, Object object) {
        view.removeView(list.get(position%list.size()));

    }

    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        //对ViewPager页号求模取出View列表中要显示的项
        view.addView(list.get(position%list.size()));
             return list.get(position%list.size());
    }
}
