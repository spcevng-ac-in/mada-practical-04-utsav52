package com.example.practical_4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView ttv,etv;
    CardView tcv,ecv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ttv = findViewById(R.id.teslaName);
        tcv = findViewById(R.id.teslaCard);
        etv = findViewById(R.id.einsteinName);
        ecv = findViewById(R.id.einsteinCard);
        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#E9EFF7"));
        actionBar.setBackgroundDrawable(colorDrawable);
        ttv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click on the card", Toast.LENGTH_SHORT).show();
            }
        });
        etv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click on the card", Toast.LENGTH_SHORT).show();
            }
        });
        tcv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AboutActivity.class);
                intent.putExtra("Name","Tesla");
                startActivity(intent);
            }
        });
        ecv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AboutActivity.class);
                intent.putExtra("Name","Einstein");
                startActivity(intent);
            }
        });
        Intent revintent = getIntent();
        String msg = revintent.getStringExtra("msg");
        Toast.makeText(MainActivity.this, "! "+msg, Toast.LENGTH_SHORT).show();
    }
}