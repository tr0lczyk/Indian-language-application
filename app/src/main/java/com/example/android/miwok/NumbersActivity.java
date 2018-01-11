package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        LinearLayout rootView =(LinearLayout) findViewById(R.id.rootView);
        
        TextView wordView = new TextView(this);
        wordView.setText(words.get(0));
        rootView.addView(wordView);

        TextView wordView2 = new TextView(this);
        wordView2.setText(words.get(1));
        rootView.addView(wordView2);

        TextView wordView3 = new TextView(this);
        wordView3.setText(words.get(2));
        rootView.addView(wordView3);
    }


}
