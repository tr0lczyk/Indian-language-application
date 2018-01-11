package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        String [] words = new String[10];
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";
        Log.i("NumbersActivity","The word you are looking for is : " + words[0]);
        Log.i("NumbersActivity","The word you are looking for is : " + words[1]);
        Log.i("NumbersActivity","The word you are looking for is : " + words[2]);
        Log.i("NumbersActivity","The word you are looking for is : " + words[3]);
        Log.i("NumbersActivity","The word you are looking for is : " + words[4]);
        Log.i("NumbersActivity","The word you are looking for is : " + words[5]);
        Log.i("NumbersActivity","The word you are looking for is : " + words[6]);
        Log.i("NumbersActivity","The word you are looking for is : " + words[7]);
        Log.i("NumbersActivity","The word you are looking for is : " + words[8]);
        Log.i("NumbersActivity","The word you are looking for is : " + words[9]);
    }


}
