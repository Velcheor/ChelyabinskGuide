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
public class ArtFragment extends Fragment {


    public ArtFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Opera and ballet theater of M.I. Glinka", R.string.art_opera_descrition, R.string.art_opera_phone, R.string.art_opera_address,
                R.string.art_opera_site, R.drawable.art_opera_image));
        words.add(new Word("Drama theater of N. Orlov", R.string.art_drama_descrition, R.string.art_drama_phone, R.string.art_drama_address, R.string.art_drama_site,
                R.drawable.art_drama_image));
        words.add(new Word("Chamber theater", R.string.art_chamber_description, R.string.art_chamber_phone, R.string.art_chamber_address, R.string.art_chamber_site,
                R.drawable.art_chamber_image));
        words.add(new Word("Drama youth theater", R.string.art_youth_description, R.string.art_youth_phone, R.string.art_youth_address, R.string.art_youth_site,
                R.drawable.art_youth_image));
        words.add(new Word("Historical museum of South Ural", R.string.art_history_description, R.string.art_history_phone, R.string.art_history_address,
                R.string.art_history_site, R.drawable.art_history_image));
        words.add(new Word("Arkaim", R.string.art_arkaim_description, R.string.art_arkaim_phone, R.string.art_arkaim_address, R.string.art_arkaim_site,
                R.drawable.art_arkaim_image));
        words.add(new Word("Museum of the wood", R.string.art_wood_description, R.string.art_wood_phone, R.string.art_wood_address, R.string.art_wood_site,
                R.drawable.art_wood_image));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_art);

        ListView listView = rootView.findViewById(R.id.rootView);

        listView.setAdapter(adapter);

        return rootView;
    }

}
