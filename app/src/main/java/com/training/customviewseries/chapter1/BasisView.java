package com.training.customviewseries.chapter1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
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
      /*  Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

        Path path = new Path();
        path.moveTo(10, 10);
        RectF rectF = new RectF(100, 10, 200, 100);
        //path.arcTo(rectF, 0, 90);
        path.arcTo(rectF, 0, 90, true);

        canvas.drawPath(path, paint);*/


        /**
         * Region
         * 绘制区域
         */
      /*  Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        //直接构造
        Region region = new Region(new Rect(50, 50, 200, 200));
        drawRegion(canvas, region, paint);*/

        //间接构造
/*        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        //构造一条椭圆路径
        Path ovalPath = new Path();
        RectF rect = new RectF(50, 50, 200, 500);
        ovalPath.addOval(rect, Path.Direction.CCW);
        //在setPath()函数中出入一个比椭圆区域小的矩形区域，让其取交集
        Region rgn = new Region();
        rgn.setPath(ovalPath, new Region(50, 50, 200, 200));
        //画出路径
        drawRegion(canvas, rgn, paint);*/

/**
 *  2020-03-06
 */
        //区域相交
    /*    Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);

        Region region = new Region(10, 10, 200, 100);
        region.union(new Rect(20, 10, 50, 300));
        drawRegion(canvas, region, paint);*/

        //区域操作
      /*  Rect rect1 = new Rect(100, 100, 400, 200);
        Rect rect2 = new Rect(200, 0, 300, 300);

        //构造一个画笔，画出矩形的轮廓
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);

        canvas.drawRect(rect1, paint);
        canvas.drawRect(rect2, paint);

        //构造两个区域
        Region region =new Region(rect1);
        Region region2=new Region(rect2);

        //取两个区域的交集
        region.op(region2, Region.Op.INTERSECT);

        Paint paint_fill =new Paint();
        paint_fill.setColor(Color.GREEN);
        paint_fill.setStyle(Paint.Style.FILL);

        drawRegion(canvas, region, paint_fill);*/

        Rect rect1 = new Rect(100, 100, 400, 200);
        Rect rect2 = new Rect(200, 0, 300, 300);

        //构造一个画笔，画出矩形的轮廓
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);

        canvas.drawRect(rect1, paint);
        canvas.drawRect(rect2, paint);
        //构造两个区域
        Region region1 = new Region(100, 100, 400, 200);
        Region region2 = new Region(200, 0, 300, 300);

        Region region = new Region();
        region.op(region1, region2, Region.Op.INTERSECT);


        Paint paint_fill = new Paint();
        paint_fill.setColor(Color.GREEN);
        paint_fill.setStyle(Paint.Style.FILL);

        drawRegion(canvas, region, paint_fill);

    }


    private void drawRegion(Canvas canvas, Region rgn, Paint paint) {
        RegionIterator iterator = new RegionIterator(rgn);
        Rect rect = new Rect();

        while (iterator.next(rect)) {
            canvas.drawRect(rect, paint);
        }

    }


}
