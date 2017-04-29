package com.labs.lotteryresult.Activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.labs.lotteryresult.VolleyGetLottery;
import com.labs.lotteryresult.R;
import com.wang.avi.AVLoadingIndicatorView;

public class LoadingActivity extends AppCompatActivity {
    AVLoadingIndicatorView avi;
    TextView tvGetResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_loading);
        addControls();
    }

    private void addControls() {
        findId();
        new VolleyGetLottery(LoadingActivity.this).getLottery();
        avi.smoothToShow();
        tvGetResult.setVisibility(View.VISIBLE);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                avi.hide();
                Intent intent = new Intent(LoadingActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }

    private void findId() {
        avi =(AVLoadingIndicatorView)findViewById(R.id.aviLottery);
        tvGetResult  =(TextView)findViewById(R.id.tvGetResult);
        avi.hide();
        tvGetResult.setVisibility(View.GONE);
    }
}