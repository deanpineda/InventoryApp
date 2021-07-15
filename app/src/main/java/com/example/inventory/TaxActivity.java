package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TaxActivity extends AppCompatActivity {
    private EditText pretaxText2, taxrateText2;
    private Button enterBtn2;
    private TextView totaltaxText2,totalpriceText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax);

        //input
        pretaxText2 = (EditText) findViewById(R.id.pretaxText);
        taxrateText2 = (EditText) findViewById(R.id.taxrateText);
        enterBtn2 = (Button) findViewById(R.id.enterBtn);
        totaltaxText2 = (TextView) findViewById(R.id.totaltaxText);
        totalpriceText2 = (TextView) findViewById(R.id.totalpriceText);
        //click button to calculate
        enterBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(pretaxText2.getText().toString());
                int number2= Integer.parseInt(taxrateText2.getText().toString());
          //formula for tax
                int total= (number1*number2)/100;
           //formula for total price w/ tax
                int total2= total+number1;
                totaltaxText2.setText(String.valueOf(total));
                totalpriceText2.setText(String.valueOf(total2));
            }
        });

    }
}