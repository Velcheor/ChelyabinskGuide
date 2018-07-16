package com.example.android.chelyabinsktourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.chelyabisktourguide.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView imageView = findViewById(R.id.image_detail);
        Glide.with(this).load(getIntent().getExtras().getInt("IMAGE")).into(imageView);

        TextView descriptionTextView = findViewById(R.id.description);
        descriptionTextView.setText(getIntent().getExtras().getInt("DESCRIPTION"));

        TextView phoneTextView = findViewById(R.id.phone);
        phoneTextView.setText(getIntent().getExtras().getInt("PHONE"));

        TextView addressTextView = findViewById(R.id.address);
        addressTextView.setText(getIntent().getExtras().getInt("ADDRESS"));

        TextView siteTextView = findViewById(R.id.site);
        siteTextView.setText(getIntent().getExtras().getInt("WEBSITE"));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
