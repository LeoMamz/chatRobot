package com.example.administrator.smartrobot;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;

/* 引导页面 首先开启app的欢迎引导页面*/
public class GuideActivity extends Activity {

    private RelativeLayout RlGuide;
    private AnimationSet as;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_guide);
        initUI();//初始化UI控件
        initData();//初始化数据
    }

    private void initData() {
       // 初始化引导动画
        initAnimation();
    }

    private void initAnimation() {
        as = new AnimationSet(false);
        RlGuide.startAnimation(as);
        as.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
              if (as !=null){
                  startActivity(new Intent(getApplicationContext(),MainActivity.class));
                  finish();
              }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }





    private void initUI() {
        RlGuide = (RelativeLayout) findViewById(R.id.rl_guide);
    }

}