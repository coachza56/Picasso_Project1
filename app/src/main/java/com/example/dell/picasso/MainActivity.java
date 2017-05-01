package com.example.dell.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    Button button;

    String url = "http://www.rd.com/wp-content/uploads/sites/2/2016/02/06-train-cat-shake-hands.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.with(getApplicationContext())
                        .load(url)
                        .placeholder(R.drawable.a)
                        .error (R.drawable.b)
                        .into(imageView);

            }
        });
    }
}
