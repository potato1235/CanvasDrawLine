package com.example.asus.drawline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by asus on 2020/5/2.
 */
public class MyView extends View {


    public MyView(Context context) {
        super(context);// 因为在继承 View时 会提示创建构造
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //首先 创建一个画笔
        Paint mPaint = new Paint();//定义一个默认的画笔
        mPaint.setColor(0xFFFF6600);//设置画笔的颜色 用16进制整型表示，FF6600代表橙色 但是android默认所有颜色为完全透明 不透明则在该颜色数值前jiaFF
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);//设置填充方式 此处选择 填充和描边 FILL_AND_STROKE

        canvas.drawRect(10,10,280,150,mPaint);//使用canvas 绘制矩形 前两个参数指定左上 第三第四指定右下  最后一个参数指定所用画笔

    }
}

/**
 * 要实现绘图
 * 1、首先创建一个自定义View类 javaClass  ： public class MyView extends View { 重写onDraw()方法   } 在
 * onDraw方法里面 创建自己的画笔 设置画笔颜色 设置填充方式 canvas绘制几何图形
 * 2、给布局管理器中添加自定义View 在MainActivity中配置
 *
 * */