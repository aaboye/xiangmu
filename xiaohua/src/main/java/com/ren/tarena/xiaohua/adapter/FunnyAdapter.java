package com.ren.tarena.xiaohua.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ren.tarena.xiaohua.R;
import com.ren.tarena.xiaohua.entity.Funny;
import com.ren.tarena.xiaohua.manager.MyImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tarena on 2017/5/20.
 */

public class FunnyAdapter extends RecyclerView.Adapter<FunnyAdapter.ViewHolder> {

    private List<Funny.Result.Data> funnys=new ArrayList<Funny.Result.Data>();
    Context context;
    public FunnyAdapter( Context context) {

        this.context=context;
    }
    public void addFunnies(List<Funny.Result.Data> list,boolean isClear){
        //如果要清空原始数据
        if(isClear){
            this.funnys.clear();
            this.funnys.addAll(list);
        }else{
            //不清空原始数据
            this.funnys.addAll(0,list);
        }
        notifyDataSetChanged();

    }


    @Override
    public FunnyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.inflate_funny_list, parent, false);
        return new FunnyAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(funnys.get(position).getContent());
        String imageUrl=funnys.get(position).getUrl();
        MyImageLoader.setBitmapFromCache(context,holder.imageView,imageUrl);
    }

    @Override
    public int getItemCount() {
        return this.funnys.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.masonry_item_img);
            textView = (TextView) itemView.findViewById(R.id.masonry_item_title);
        }
    }
}
