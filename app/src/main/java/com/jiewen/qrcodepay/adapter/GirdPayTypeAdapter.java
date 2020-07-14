package com.jiewen.qrcodepay.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiewen.qrcodepay.R;
import com.jiewen.qrcodepay.bean.TransListBean;

import java.util.ArrayList;


public class GirdPayTypeAdapter extends BaseAdapter {

    private Context ctx;
    private ArrayList<TransListBean> list;

    public GirdPayTypeAdapter(Context ctx, ArrayList<TransListBean> list){
        this.ctx = ctx;
        this.list = list;
    }

    @Override
    public int getCount() {
        return null==list?0:list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (null == view){
            view = LayoutInflater.from(ctx).inflate(R.layout.item_gird_pay_type,null);
            holder = new ViewHolder();
            holder.img = view.findViewById(R.id.img);
            holder.txt = view.findViewById(R.id.txt);
            view.setTag(holder);
        }else{
            holder = (ViewHolder)view.getTag();
        }
        holder.txt.setText(list.get(i).getTransName());
        holder.img.setImageResource(list.get(i).getImgId());
        return view;
    }

    class ViewHolder{
        TextView txt;
        ImageView img;
    }

}
