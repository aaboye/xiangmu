package com.ren.tarena.xiaohua.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.ren.tarena.xiaohua.R;

public class SplashActivity extends AppCompatActivity {


    private ImageView imageView;
    private Animation animation_splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //初始化控件
        imageView = (ImageView) findViewById(R.id.imageID);
        //加载动画
        animation_splash = AnimationUtils.loadAnimation(this, R.anim.alpha_scale);
        //将动画添加到image上
        imageView.setAnimation(animation_splash);
        animation_splash.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //跳转页面
                Intent intent = new Intent(SplashActivity.this, GuideActivity.class);
                startActivity(intent);
                //实现跳转是的一个切换页面
                overridePendingTransition(R.anim.enter_anim, R.anim.out_anim);

                finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}

