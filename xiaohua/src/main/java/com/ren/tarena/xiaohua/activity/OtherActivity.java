package com.ren.tarena.xiaohua.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ren.tarena.xiaohua.R;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        //显示向左的那个logo图标并且允许可以被点击
        getSupportActionBar().
                setDisplayHomeAsUpEnabled(true);
    }
}
