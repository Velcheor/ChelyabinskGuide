package com.example.android.chelyabinsktourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.chelyabisktourguide.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Mush", R.string.food_mush_description, R.string.food_mush_phone, R.string.food_mush_address, R.string.food_mush_site, R.drawable.food_mush_image));
        words.add(new Word("Elephant", R.string.food_elephant_description, R.string.food_elephant_phone, R.string.food_elephant_address, R.string.food_elephant_site,
                R.drawable.food_elephant_image));
        words.add(new Word("Old Erevan", R.string.food_yerevan_description, R.string.food_yerevan_phone, R.string.food_yerevan_address, R.string.food_yerevan_site,
                R.drawable.food_yerevan_image));
        words.add(new Word("Da zio Pino", R.string.food_pino_description, R.string.food_pino_phone, R.string.food_pino_address, R.string.food_pino_site,
                R.drawable.food_pino_image));
        words.add(new Word("Balkan Grill", R.string.food_balkan_description, R.string.food_balkan_phone, R.string.food_balkan_address, R.string.food_balkan_site,
                R.drawable.food_balkan_image));
        words.add(new Word("Marriage", R.string.food_mariage_description, R.string.food_mariage_phone, R.string.food_mariage_address, R.string.food_mariage_site,
                R.drawable.food_mariage_image));
        words.add(new Word("Doka Pizza", R.string.food_doka_description, R.string.food_doka_phone, R.string.food_doka_address, R.string.food_doka_site,
                R.drawable.food_doka_image));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_food);

        ListView listView = rootView.findViewById(R.id.rootView);

        listView.setAdapter(adapter);


        return rootView;

    }

}
