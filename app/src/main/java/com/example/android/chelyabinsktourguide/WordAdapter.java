package com.example.android.chelyabinsktourguide;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.chelyabisktourguide.R;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int imageResourseID;

    public WordAdapter(Activity context, ArrayList<Word> words, int mImageResourceID){
        super(context, 0, words);
        imageResourseID = mImageResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Word currentWord = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.image_view);
        Glide.with(getContext()).load(currentWord.getmImage()).into(imageView);

        TextView textView = listItemView.findViewById(R.id.text_container);
        textView.setText(currentWord.getmName());

        View containerLayout = listItemView.findViewById(R.id.container_layout);
        int color = ContextCompat.getColor(getContext(), imageResourseID);
        containerLayout.setBackgroundColor(color);

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), DetailActivity.class);
                intent.putExtra("DESCRIPTION", currentWord.getDescriptionID());
                intent.putExtra("PHONE", currentWord.getPhoneID());
                intent.putExtra("ADDRESS", currentWord.getAddressID());
                intent.putExtra("WEBSITE", currentWord.getWebSiteID());
                intent.putExtra("IMAGE", currentWord.getmImage());
                if (intent.resolveActivity(getContext().getPackageManager()) != null) {
                    getContext().startActivity(intent);
                }
            }
        });

        return listItemView;
    }
}
