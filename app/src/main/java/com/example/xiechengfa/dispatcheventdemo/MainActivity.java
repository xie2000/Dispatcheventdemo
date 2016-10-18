package com.example.xiechengfa.dispatcheventdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View myView =  findViewById(R.id.myView);
//        myView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.println("*******************magic myView onclick");
//            }
//        });

//        myView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent ev) {
//                switch (ev.getAction()){
//                    case MotionEvent.ACTION_DOWN:
//                        System.out.println("****************magic MyView onTouch ACTION_DOWN");
//                        return false;
//                    case MotionEvent.ACTION_MOVE:
//                        System.out.println("****************magic MyView onTouch ACTION_MOVE");
//                        break;
//                    case MotionEvent.ACTION_UP:
//                        System.out.println("****************magic MyView onTouch ACTION_UP");
//                        break;
//                }
//
//                return true;
//            }
//        });
    }
}
