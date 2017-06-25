package com.example.android.miwok;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by Niamh on 13/06/2017.
 */

//inherets from ArrayAdapter. WordAdaptor is a subclass of it
public class WordAdaptor extends ArrayAdapter<Word> {

    /* Properties */
    private static final String LOG_TAG = WordAdaptor.class.getSimpleName();

    private int mColorState;

    public WordAdaptor(Activity context, ArrayList<Word> word , int ColorState) {
        super(context, 0, word);
        mColorState = ColorState;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        nameTextView.setText(currentWord.getMiwokTranslation());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        numberTextView.setText(currentWord.getDefaultTranslation());

        ImageView pictureImageView = (ImageView) listItemView.findViewById(R.id.picture);

        if (currentWord.hasImage()) {
            pictureImageView.setImageResource(currentWord.getImageResourceID());
            /*make sure the view is visible as views being reused*/
            pictureImageView.setVisibility(View.VISIBLE);

        }
        else{
            pictureImageView.setVisibility(View.GONE);
        }

        View backgroundColorBox = (View)listItemView.findViewById(R.id.backgroundColor);
        //find the color that the resource maps to
        int color = ContextCompat.getColor(getContext(), mColorState);
        backgroundColorBox.setBackgroundColor(color);



        return listItemView;

    }
}
