package net.dheapratama.ryan.mymoviedirectory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    public TextView txtTitle, txtoverview, txtdate;
    public ImageView bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getIntent().getStringExtra("title"));

        txtdate = (TextView) findViewById(R.id.txtDate);
        txtdate.setText(getIntent().getStringExtra("date"));

        txtoverview = (TextView) findViewById(R.id.txtDescrip);
        txtoverview.setText(getIntent().getStringExtra("overview"));


        bg = (ImageView) findViewById(R.id.bg);
        Picasso.with(this)
                .load("https://image.tmdb.org/t/p/w300_and_h450_bestv2" + getIntent().getStringExtra("bg"))
                .resize(300, 450)
                .into(bg);
    }
}
