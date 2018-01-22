package com.example.android.miwok;


import android.app.Activity;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mateusz on 12.01.2018.
 */


public class WordAdapter extends ArrayAdapter<Word> {


    /*
    *
    * Array Adapter functionality - adjusted to every activity
    * ColorResource is adding color to text background
    *
    * */
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        /*
        * Finding the Views in the list_item , get the current version from
        * the actual activity and setting it in
        *
        * */
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());
        /*
        *
        * Adding Image or not, depends if it's needed
        *
        * */
        ImageView imageResourceId = (ImageView) listItemView.findViewById(R.id.image_resource_id);
        if(currentWord.hasImage()){
            imageResourceId.setImageResource(currentWord.getImageResourceId());
        } else {
            imageResourceId.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
