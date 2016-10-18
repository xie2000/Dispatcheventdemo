package com.example.xiechengfa.dispatcheventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by xiechengfa on 2016/10/18.
 */
public class Layout1 extends LinearLayout {
    public Layout1(Context context) {
        this(context, null);
    }

    public Layout1(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Layout1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        System.out.println("magic***************************************************************");
        switch (ev.getAction()){
             case MotionEvent.ACTION_DOWN:
                 System.out.println("****************magic Layout1 dispatchTouchEvent ACTION_DOWN");
                  break;
            case MotionEvent.ACTION_MOVE:
                 System.out.println("****************magic Layout1 dispatchTouchEvent ACTION_MOVE");
                  break;
             case MotionEvent.ACTION_UP:
                 System.out.println("****************magic Layout1 dispatchTouchEvent ACTION_UP");
                  break;
        }

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                System.out.println("****************magic Layout1 onInterceptTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("****************magic Layout1 onInterceptTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("****************magic Layout1 onInterceptTouchEvent ACTION_UP");
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                System.out.println("****************magic Layout1 onTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("****************magic Layout1 onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("****************magic Layout1 onTouchEvent ACTION_UP");
                break;
        }
        return super.onTouchEvent(ev);
    }
}

  
