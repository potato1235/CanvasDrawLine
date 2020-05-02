package com.example.asus.drawline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout mRelativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);

        mRelativeLayout.addView(new MyView(this));//将自定义View添加到相对布局管理器中


    }
}
