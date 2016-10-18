package com.example.xiechengfa.dispatcheventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by xiechengfa on 2016/10/18.
 */
public class MyView extends TextView {
    public MyView(Context context) {
        this(context, null);
    }

    public MyView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
             case MotionEvent.ACTION_DOWN:
                 System.out.println("****************magic MyView dispatchTouchEvent ACTION_DOWN");
                  break;
            case MotionEvent.ACTION_MOVE:
                 System.out.println("****************magic MyView dispatchTouchEvent ACTION_MOVE");
                  break;
             case MotionEvent.ACTION_UP:
                 System.out.println("****************magic MyView dispatchTouchEvent ACTION_UP");
                  break;
        }

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                System.out.println("****************magic MyView onTouchEvent ACTION_DOWN");
                return false;
            case MotionEvent.ACTION_MOVE:
                System.out.println("****************magic MyView onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("****************magic MyView onTouchEvent ACTION_UP");
                break;
        }

        boolean res =super.onTouchEvent(ev);

        System.out.println("*********************magic res:"+res);

        return res;
    }
}

  
