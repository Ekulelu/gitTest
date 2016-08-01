package com.royole.ekulelu.jnitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textV1);
        JNIUtil jniUtil = new JNIUtil();
        String str = jniUtil.getStringFormC();
        Log.e("EK",str);
        textView.setText(str);
    }
}
