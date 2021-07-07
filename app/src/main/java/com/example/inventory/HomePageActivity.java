package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class HomePageActivity extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        imageButton = (ImageButton) findViewById(R.id.productsBtn);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity3();

            }
        });

    }

    public void Activity3() {
        Intent intent = new Intent(this, ProductsActivity.class);
        startActivity(intent);
    }
}

