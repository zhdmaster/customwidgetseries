package com.training.customviewseries.chapter1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * description: 基础图形
 * author: zhouhaodong
 * date: 2020-03-05 10:36
 */
public class BasisView extends View {
    public BasisView(Context context) {
        super(context);
    }

    public BasisView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BasisView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

     /*   //设置画笔的基本属性
        Paint paint =new Paint();
        paint.setColor(Color.RED);//设置画笔的颜色
        paint.setStyle(Paint.Style.STROKE);//设置画笔的样式
        paint.setStrokeWidth(50);//设置画笔的宽度

        //画图
        canvas.drawCircle(190, 200, 150, paint);*/


        //Canvas 使用基础
        //  canvas.drawRGB(255, 0, 255);

        /**
         * 画直线
         */
    /*    Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(50);
        //paint.setStrokeWidth(5);决定直线的粗细

       canvas.drawLine(100, 100, 200, 200, paint);*/

        /**
         * 画点
         */
    /*    Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(15);

        canvas.drawPoint(100, 100, paint);*/

        /**
         *  矩形工具类 RectF, Rect
         */
      /*  Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(15);

      //  canvas.drawRect(10, 10, 100, 100, paint);

        //使用RectF构造
        paint.setStyle(Paint.Style.FILL);
        RectF rectf = new RectF(210f, 10f, 300f, 100f);
        canvas.drawRect(rectf, paint);*/


        /**
         * Color
         * A R G B 各个分量的值都是255
         *
         */
       /* Color.rgb(1,2,3);

        Color.argb(1,2,3,4);*/

        /**
         * 路径
         * 直线路径和弧线路径
         *
         */
  /*      //直线路径
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

        Path path = new Path();

        path.moveTo(10, 10);//设定的起点
        path.lineTo(10, 100);//第一条直线的终点，也是第二条直线的起始点
        path.lineTo(300, 100);//画第二条直线
        path.close();//闭环

        canvas.drawPath(path, paint);*/


        //弧线路径
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

        Path path = new Path();
        path.moveTo(10, 10);
        RectF rectF = new RectF(100, 10, 200, 100);
        //path.arcTo(rectF, 0, 90);
        path.arcTo(rectF, 0, 90, true);

        canvas.drawPath(path, paint);


        /**
         * Region
         */


    }


}
