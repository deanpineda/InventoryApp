package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DashboardActivity extends AppCompatActivity {
    ImageButton customersIb;
    ImageButton suppliersIb;
    ImageButton productIb;
    ImageButton calculatorIb;
    ImageButton posIb;
    ImageButton logoutIb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        customersIb = (ImageButton) findViewById(R.id.customersButton);
        suppliersIb = (ImageButton) findViewById(R.id.suppliersButton);
        productIb = (ImageButton) findViewById(R.id.productsButton);
        calculatorIb = (ImageButton) findViewById(R.id.calculatorButton);
        posIb = (ImageButton) findViewById(R.id.posButton);
        logoutIb = (ImageButton) findViewById(R.id.logoutButton);

        customersIb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customersActivity();
            }
        });
        calculatorIb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorActivity();
            }
        });
        posIb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productsActivity();
            }
        });
        logoutIb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
        suppliersIb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                supplierActivity();
            }
        });
        productIb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inventoryActivity();

            }
        });
    }

    public void customersActivity() {// change to customer
        Intent intent = new Intent(this, CustomerActivity.class);
        startActivity(intent);
    }

    public void calculatorActivity() {
        Intent intent = new Intent(this, CalculatorActivity.class);
        startActivity(intent);

    }

    public void productsActivity() {
        Intent intent = new Intent(this, ProductsActivity.class);
        startActivity(intent);

    }

    public void supplierActivity() {
        Intent intent = new Intent(this, SupplierActivity.class);
        startActivity(intent);

    }

    public void inventoryActivity() {
        Intent intent = new Intent(this, InventoryActivity.class);
        startActivity(intent);
    }
}