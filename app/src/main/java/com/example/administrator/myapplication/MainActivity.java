package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Main Activity","On create Method called");
    }

    @Override
    protected void onRestart(){

        super.onRestart();
        Log.i("Main Activity","On restart Method called");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Main Activity","On start Method called");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Main Activity","On resume Method called");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Main Activity","On pause Method called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Main Activity", "On stop Method called");
    }
}

