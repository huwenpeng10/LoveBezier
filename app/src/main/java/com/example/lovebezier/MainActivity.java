package com.example.lovebezier;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtn_start;
    private LoveLayout mLoveLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mBtn_start = (Button) findViewById(R.id.id_btn_start);
        mBtn_start.setOnClickListener(this);

        mLoveLayout = (LoveLayout) findViewById(R.id.LoveLayout);
    }

    @Override
    public void onClick(View v) {
        mLoveLayout.addLove();
    }
}
