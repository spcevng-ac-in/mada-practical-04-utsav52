package com.example.practical_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {
    TextView desc;
    ImageView img;
    Button back,share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        desc = findViewById(R.id.desc);
        img = findViewById(R.id.imgview);
        back = findViewById(R.id.backbutton);
        share = findViewById(R.id.sharebutton);
        Intent intent = getIntent();
        String title = intent.getStringExtra("Name");
        if (title.equalsIgnoreCase("Tesla")){
            img.setImageResource(R.drawable.teslanobg2);
            desc.setText(R.string.tesla);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent revintent = new Intent(AboutActivity.this,MainActivity.class);
                    revintent.putExtra("msg","Visited Tesla's Biography");
                    startActivity(revintent);
                }
            });
            share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String description = desc.getText().toString();
                    Intent shareintent = new Intent();
                    shareintent.setAction(Intent.ACTION_SEND);
                    shareintent.setType("text/plain");
                    shareintent.putExtra(Intent.EXTRA_TEXT,description);
                    startActivity(shareintent);
                }
            });
        }
        else{
            img.setImageResource(R.drawable.einsteinnobg);
            desc.setText(R.string.einstien);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent revintent = new Intent(AboutActivity.this,MainActivity.class);
                    revintent.putExtra("msg","Visited Einstein's Biography");
                    startActivity(revintent);
                }
            });
            share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String description = desc.getText().toString();
                    Intent shareintent = new Intent();
                    shareintent.setAction(Intent.ACTION_SEND);
                    shareintent.setType("text/plain");
                    shareintent.putExtra(Intent.EXTRA_TEXT,description);
                    startActivity(shareintent);
                }
            });
        }
    }
}