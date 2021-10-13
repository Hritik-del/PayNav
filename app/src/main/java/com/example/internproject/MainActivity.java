package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView iv1, iv2, iv3;
    TextView tv1, tv2, tv3;
    View layout, layout1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = findViewById(R.id.imageView63);
        iv2 = findViewById(R.id.imageView7);
        iv3 = findViewById(R.id.imageView4);
        tv1 = findViewById(R.id.textView86);
        tv2 = findViewById(R.id.textView6);
        tv3 = findViewById(R.id.yourAccount);
        layout1 = findViewById(R.id.rellayout1);
        layout = findViewById(R.id.custom_layout);
        iv2.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        b1 = findViewById(R.id.button2);
        //LayoutInflater l = getLayoutInflater();
       // View v = l.inflate(R.id.fragmentid, (ViewGroup) layout1, false);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setVisibility(View.GONE);
                iv1.setVisibility(View.INVISIBLE);
                tv1.setVisibility(View.INVISIBLE);
                iv2.setVisibility(View.VISIBLE);
                tv2.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.VISIBLE);
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setContentView(R.layout.friend_account_details);
                Intent i= new Intent(MainActivity.this, Friend_Account_Details.class);
                startActivity(i);
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.INVISIBLE);
                iv1.setVisibility(View.VISIBLE);
                tv1.setVisibility(View.VISIBLE);
                iv2.setVisibility(View.INVISIBLE);
                tv2.setVisibility(View.INVISIBLE);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setContentView(R.layout.friend_account_details);
                Intent i= new Intent(MainActivity.this, FragmentSlide.class);
                startActivity(i);
            }
        });
    }
}