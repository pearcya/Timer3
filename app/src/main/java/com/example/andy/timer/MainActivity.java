package com.example.andy.timer;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.timer);
        Timer();
    }
    private  void Timer() {

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("Timer is : " + millisUntilFinished / 1000 + "s");

            }

            @Override
            public void onFinish() {
                textView.setText("Timer is finished");

            }
        }.start();
    }
}
