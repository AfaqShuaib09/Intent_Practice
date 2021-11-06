package com.example.intentpractice;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener  {

    Button fbBtn;
    Button instaBtn;
    Button whatsappBtn;
    Button linkedinBtn;

    public void openWebPage(String url)
    {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fbBtn =findViewById(R.id.fb_btn);
        fbBtn.setOnClickListener(this);

        instaBtn = findViewById(R.id.insta_btn);
        instaBtn.setOnClickListener(this);

        whatsappBtn = findViewById(R.id.whatsapp_btn);
        whatsappBtn.setOnClickListener(this);

        linkedinBtn = findViewById(R.id.linked_btn);
        linkedinBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.fb_btn:
                openWebPage("https://www.facebook.com/afaq.shoaib.9/");
                break;
            case R.id.insta_btn:
                openWebPage("https://www.instagram.com/afaq_shoaib/");

                break;
            case R.id.linked_btn:
                openWebPage("https://www.linkedin.com/in/muhammad-afaq-shuaib/");
                break;

            case R.id.whatsapp_btn:
                openWebPage("https://api.whatsapp.com/send?phone=923245227602");
                break;

            case R.id.back_btn:
                System.out.println("hello");
                this.finish();
        }
    }
}