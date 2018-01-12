package com.example.android.miwok;


import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by Mateusz on 12.01.2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        return super.getView(position, convertView, parent);

    }
}
