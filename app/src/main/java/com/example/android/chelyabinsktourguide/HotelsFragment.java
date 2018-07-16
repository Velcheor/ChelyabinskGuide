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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Euphoria", R.string.hotels_euphoria_description, R.string.hotels_euphoria_phone, R.string.hotels_euphoria_address, R.string.hotels_euphoria_site,
                R.drawable.hotels_euphoria_image));
        words.add(new Word("Loft", R.string.hotels_loft_description, R.string.hotels_loft_phone, R.string.hotels_loft_address, R.string.hotels_loft_site,
                R.drawable.hotels_loft_image));
        words.add(new Word("Black Cube", R.string.hotels_cube_description, R.string.hotels_cube_phone, R.string.hotels_cube_address, R.string.hotels_cube_site,
                R.drawable.hotels_cube_image));
        words.add(new Word("Malahit", R.string.hotels_malahit_description, R.string.hotels_malahit_phone, R.string.hotels_malahit_address, R.string.hotels_malahit_site,
                R.drawable.hotels_malahit_image));
        words.add(new Word("Arbat", R.string.hotels_arbat_description, R.string.hotels_arbat_phone, R.string.hotels_arbat_address, R.string.hotels_arbat_site,
                R.drawable.hotels_arbat_image));
        words.add(new Word("Victoria", R.string.hotels_victory_description, R.string.hotels_victory_phone, R.string.hotels_victory_address, R.string.hotels_victory_site,
                R.drawable.hotels_victoria_image));
        words.add(new Word("ParkCity", R.string.hotels_parkcity_description, R.string.hotels_parkcity_phone, R.string.hotels_parkcity_address, R.string.hotels_parkcity_site,
                R.drawable.hotels_parkcity_image));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_shops);

        ListView listView = rootView.findViewById(R.id.rootView);

        listView.setAdapter(adapter);

        return rootView;
    }

}
