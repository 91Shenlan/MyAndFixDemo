package com.example.shenlan.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Show();
    }

    private void Show() {
        Toast.makeText(this,"no fix",Toast.LENGTH_SHORT).show();
    }
}
