package com.ren.tarena.xiaohua.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ren.tarena.xiaohua.R;
import com.ren.tarena.xiaohua.entity.Funny;
import com.ren.tarena.xiaohua.entity.Tuijian;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tarena on 2017/5/25.
 */

public class TuijianAdapter extends  RecyclerView.Adapter<TuijianAdapter.ViewHolder>{
    private List<Tuijian.Result.Data> tuijians=new ArrayList<Tuijian.Result.Data>();
    Context context;
    public TuijianAdapter( Context context) {

        this.context=context;
    }
    public void addTuijianes(List<Tuijian.Result.Data> list,boolean isClear){
        //如果要清空原始数据
        if(isClear){
            this.tuijians.clear();
            this.tuijians.addAll(list);
        }else{
            //不清空原始数据
            this.tuijians.addAll(0,list);
        }
        //刷新UI
        notifyDataSetChanged();

    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView_neirong;
        TextView mTextView_time;

        public ViewHolder(View v) {
            super(v);
            mTextView_neirong = (TextView) v.findViewById(R.id.textview_tuijian_neirong);
            mTextView_time= (TextView) v.findViewById(R.id.textview_tuijian_time);
        }
    }



    @Override
    public TuijianAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.inflate_tuijian_list, parent, false);

        return new TuijianAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(TuijianAdapter.ViewHolder holder, int position) {

        holder.mTextView_neirong.setText(tuijians.get(position).getContent());
        holder.mTextView_time.setText(tuijians.get(position).getUpdatetime());
    }

    @Override
    public int getItemCount() {
        return tuijians.size();
    }
}
