package com.example.lenovo.logactivitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity01 extends AppCompatActivity {

    private Button myButtton;
    static final String tag="MainActivity01";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main01);
        Log.v(MainActivity01.tag,"FirstActivity ----is---- onCreate");/*LOG中显示的内容*/
        Button myButton=(Button)findViewById(R.id.myButton);
        myButton.setText("click here to change another activity");
        myButton.setOnClickListener(new ButtonOnClickListenner());
    }

    private class ButtonOnClickListenner implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(MainActivity01.this,Activity2.class);
            MainActivity01.this.startActivity(intent);
        }
    }

    @Override
    protected void onStart() {
        Log.v(MainActivity01.tag,"FirstActivity ----is---- onStart");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.v(MainActivity01.tag,"FirstActivity ----is---- onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.v(MainActivity01.tag,"FirstActivity ----is---- onRestart");
        super.onRestart();
    }

    @Override
    protected void onStop() {
        Log.v(MainActivity01.tag,"FirstActivity ----is---- onStop");
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.v(MainActivity01.tag,"FirstActivity ----is---- onResume");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.v(MainActivity01.tag,"FirstActivity ----is---- onDestory");
        super.onDestroy();
    }

}
