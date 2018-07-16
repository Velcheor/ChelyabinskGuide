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
public class MoviesFragment extends Fragment {


    public MoviesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Nikaland", R.string.movies_nikaland_description, R.string.movies_nikaland_phone, R.string.movies_nikaland_address,
                R.string.movies_nikaland_site, R.drawable.movies_nikaland_image));
        words.add(new Word("Megapolis", R.string.movies_megapolis_description, R.string.movies_megapolis_phone, R.string.movies_megapolis_address,
                R.string.movies_megapolis_site, R.drawable.movies_mega_image));
        words.add(new Word("Kinomax-Ural", R.string.movies_ural_description, R.string.movies_ural_phone, R.string.movies_ural_address,
                R.string.movies_megapolis_site, R.drawable.movies_ural_image));
        words.add(new Word("Znamya", R.string.movies_znamya_description, R.string.movies_znamya_phone, R.string.movies_znamya_address,
                R.string.movies_znamya_site, R.drawable.movies_znamya_image));
        words.add(new Word("Cinema Park", R.string.movies_park_description, R.string.movies_park_phone, R.string.movies_park_address,
                R.string.movies_park_site, R.drawable.movies_park_image));
        words.add(new Word("Kinomax-Rodnik", R.string.movies_ural_description, R.string.movies_rodnik_phone, R.string.movies_rodnik_address,
                R.string.movies_ural_site, R.drawable.movies_rodnik_image));
        words.add(new Word("Almaz", R.string.movies_megapolis_description, R.string.movies_almaz_phone, R.string.movies_almaz_address,
                R.string.movies_almaz_site, R.drawable.movies_almaz_image));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_movies);

        ListView listView = rootView.findViewById(R.id.rootView);

        listView.setAdapter(adapter);

        return rootView;
    }

}
