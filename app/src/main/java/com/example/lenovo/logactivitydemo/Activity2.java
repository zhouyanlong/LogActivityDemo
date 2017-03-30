package com.example.lenovo.logactivitydemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by lenovo on 2017/3/30.
 */
public class Activity2 extends Activity{
    private static final String tag="MainActivity01";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(MainActivity01.tag,"SecondActivity ----is---- onCreate");
        super.onCreate(savedInstanceState);
    }
    protected void onStart() {
        Log.v(MainActivity01.tag,"SecondActivity ----is---- onStart");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.v(MainActivity01.tag,"SecondActivity ----is---- onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.v(MainActivity01.tag,"SecondActivity ----is---- onRestart");
        super.onRestart();
    }

    @Override
    protected void onStop() {
        Log.v(MainActivity01.tag,"SecondActivity ----is---- onStop");
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.v(MainActivity01.tag,"SecondActivity ----is---- onResume");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.v(MainActivity01.tag,"SecondActivity ----is---- onDestory");
        super.onDestroy();
    }
}
