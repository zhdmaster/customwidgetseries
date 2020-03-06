package com.training.customviewseries.chapter1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * description: 基础图形
 * author: zhouhaodong
 * date: 2020-03-06 10:13
 */
public class BasisCanvasView extends View {
    public BasisCanvasView(Context context) {
        super(context);
    }

    public BasisCanvasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BasisCanvasView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

     /*   Paint paint =new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);

        canvas.translate(100,100);
        Rect rect1=new Rect(0,0,400,220);
        canvas.drawRect(rect1,paint);*/

        //构造两个画笔，一个红色，一个绿色
      /*  Paint paint_green = generatePaint(Color.GREEN, Paint.Style.STROKE, 3);
        Paint paint_red = generatePaint(Color.RED, Paint.Style.STROKE, 3);

        //构造一个矩形
        Rect rect1=new Rect(0,0,400,220);

        //在平移画布前，用绿色画笔画下边框
        canvas.drawRect(rect1,paint_green);

        canvas.translate(100,100);
        canvas.drawRect(rect1,paint_red);*/


        /**
         * 裁剪画布
         */
/*        canvas.drawColor(Color.RED);
        canvas.clipRect(new Rect(100, 100, 200, 200));
        canvas.drawColor(Color.GREEN);*/

        //画布的保存和恢复

        canvas.drawColor(Color.RED);

        canvas.save();
        canvas.clipRect(new Rect(100, 100, 800, 800));
        canvas.drawColor(Color.GREEN);

        //恢复整屏画布
        canvas.restore();

        canvas.drawColor(Color.BLUE);


    }

    private Paint generatePaint(int color, Paint.Style style, int width) {
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setStyle(style);
        paint.setStyle(style);
        paint.setStrokeWidth(width);
        return paint;

    }


}
