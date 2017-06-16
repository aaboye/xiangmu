package com.ren.tarena.xiaohua.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ren.tarena.xiaohua.activity.MainActivity;
import com.ren.tarena.xiaohua.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GifFragment extends BaseFragment {


    public GifFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        contentView= inflater.inflate(R.layout.fragment_gif, container, false);
        initialUI();
        //实现推荐界面侧滑功能
        imageGifCehua();
        return contentView;
    }

    //实现侧滑功能
    private void imageGifCehua() {
        ImageView imageView_left = (ImageView) contentView.findViewById(R.id.ab_left_imageID);
        imageView_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //调用mainactivity中的show方法
                MainActivity mainActivity = (MainActivity ) getActivity();
                mainActivity.show();
            }
        });
    }

    @Override
    public void initialUI() {
        actionbar= (LinearLayout) contentView.findViewById(R.id.actionbar_more);
        initialActionbar(R.mipmap.gerenzhongxin,"GIF图",R.mipmap.shuaxin);



    }
}
