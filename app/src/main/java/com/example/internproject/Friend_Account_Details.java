package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Friend_Account_Details extends AppCompatActivity {

    Button b1, b2;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        super.onCreate(savedInstanceState);
        setContentView(R.layout.friend_account_details);
        b1 = (Button)findViewById(R.id.button3);
        b1.setOnClickListener(v -> {
            Intent i= new Intent(v.getContext(), Message.class);
            startActivity(i);
        });
        b2 = (Button)findViewById(R.id.button);
        b2.setOnClickListener(v -> {
            Intent i= new Intent(Friend_Account_Details.this, Transactions.class);
            startActivity(i);
        });

        iv = findViewById(R.id.imageView11);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setContentView(R.layout.friend_account_details);
                Intent i= new Intent(Friend_Account_Details.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}