package com.jiewen.qrcodepay.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jiewen.qrcodepay.R;
import com.jiewen.qrcodepay.db.DataBean;

import java.util.List;

public class TranseListAdapter extends BaseAdapter {

    private List<DataBean> dataBeans;
    private Context ctx;

    public TranseListAdapter(Context ctx,List<DataBean> dataBeans){
        this.ctx = ctx;
        this.dataBeans = dataBeans;
    }

    @Override
    public int getCount() {
        return null==dataBeans?0:dataBeans.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (null == convertView){
//            convertView = LayoutInflater.from(ctx).inflate(R.layout.item_translist,null);
            holder = new ViewHolder();
//            holder.payTime = convertView.findViewById(R.id.payTime);
//            holder.outNo = convertView.findViewById(R.id.outNo);
//            holder.order_id = convertView.findViewById(R.id.order_id);
//            holder.amount = convertView.findViewById(R.id.amount);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }
        holder.payTime.setText(dataBeans.get(position).getPay_time());
        holder.outNo.setText(dataBeans.get(position).getOut_trade_no());
        holder.order_id.setText(dataBeans.get(position).getOrder_id());
        holder.amount.setText(String.valueOf(dataBeans.get(position).getTotal_amt()));
        return convertView;
    }

    class ViewHolder{
        TextView payTime;
        TextView outNo;
        TextView order_id;
        TextView amount;
    }
}
