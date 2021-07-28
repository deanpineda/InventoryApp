package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CalculatorActivity extends AppCompatActivity {
    Button btnDiscount, btnProfit, btnTax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btnDiscount = (Button) findViewById(R.id.buttonDiscount);
        btnProfit = (Button) findViewById(R.id.buttonProfit);
        btnTax = (Button) findViewById(R.id.buttonTax);

        btnDiscount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                priceActivity();

            }
        });
        btnProfit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profitActivity();
            }
        });
        btnTax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taxActivity();
            }
        });
    }
    public void priceActivity() {
        Intent intent = new Intent(this, PriceActivity.class);
        startActivity(intent);
    }
    public void profitActivity(){
        Intent intent = new Intent(this, ProfitActivity.class);
        startActivity(intent);

    }
    public void taxActivity(){
        Intent intent = new Intent(this, TaxActivity.class);
        startActivity(intent);

    }
}
