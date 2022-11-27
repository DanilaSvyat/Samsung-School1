package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TEST_LOG = "test_log";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Log.d(TEST_LOG, "onCreate is start");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TEST_LOG, "onResume is start");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TEST_LOG, "onPause is start");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TEST_LOG, "onResume is start");
    }

}