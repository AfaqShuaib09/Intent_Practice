package com.example.intentpractice;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener  {

    Button fbBtn;
    Button instaBtn;
    Button whatsappBtn;
    Button linkedinBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fbBtn =findViewById(R.id.fb_btn);
        fbBtn.setOnClickListener(this);

        instaBtn = findViewById(R.id.insta_btn);
        instaBtn.setOnClickListener(this);

        whatsappBtn = findViewById(R.id.insta_btn);
        whatsappBtn.setOnClickListener(this);

        linkedinBtn = findViewById(R.id.linked_btn);
        linkedinBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

    }
}