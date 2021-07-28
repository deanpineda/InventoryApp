package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PriceActivity extends AppCompatActivity {
    private EditText priceText2, percentText2;
    private Button enterBtn2;
    private TextView totalText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);


        //input
        priceText2 = (EditText) findViewById(R.id.priceText);
        percentText2 = (EditText) findViewById(R.id.percentText);
        enterBtn2 = (Button) findViewById(R.id.enterBtn);
        totalText2 = (TextView) findViewById(R.id.totalText);
        //click button to calculate total price
        enterBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(priceText2.getText().toString());
                int number2= Integer.parseInt(percentText2.getText().toString());
                //formula for discounted price
                int total= number1-(number1*number2)/100;
                totalText2.setText(String.valueOf(total));
            }
        });


    }

}
