package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class HomePageActivity extends AppCompatActivity {
    ImageButton productsIb;
    ImageButton priceIb;
    ImageButton taxIb;
    ImageButton profitIb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //product inventory
        productsIb = (ImageButton) findViewById(R.id.productsBtn);
        //price calculator
        priceIb= (ImageButton) findViewById(R.id.priceBtn);
        //tax
        taxIb=(ImageButton) findViewById(R.id.taxBtn);
        //profit
        profitIb=(ImageButton) findViewById(R.id.profitBtn);




        //product inventory
        productsIb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productsActivity();

            }
        });
        //price calculator
        priceIb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                priceActivity();
            }
        });
        //tax
        taxIb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taxActivity();
            }
        });
        //profit
        profitIb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profitActivity();
            }
        });

    }

    public void productsActivity() {
        Intent intent = new Intent(this, ProductsActivity.class);
        startActivity(intent);
    }

    public void priceActivity(){

        Intent intent = new Intent(this, PriceActivity.class);
        startActivity(intent);
    }
    public void taxActivity(){

        Intent intent= new Intent(this, TaxActivity.class);
        startActivity(intent);
    }
    public void profitActivity(){
        Intent intent= new Intent(this, ProfitActivity.class);
        startActivity(intent);
    }
}

