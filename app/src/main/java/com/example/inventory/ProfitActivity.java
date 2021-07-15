package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProfitActivity extends AppCompatActivity {
    private EditText totalsalesText2, totalcostsText2;
    private Button enterBtn2;
    private TextView totalprofitText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profit);

        //input
        totalsalesText2 = (EditText) findViewById(R.id.totalsalesText);
        totalcostsText2 = (EditText) findViewById(R.id.totalcostsText);
        enterBtn2 = (Button) findViewById(R.id.enterBtn);
       totalprofitText2 = (TextView) findViewById(R.id.totalprofitText);

        //click button to calculate
        enterBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(totalsalesText2.getText().toString());
                int number2 = Integer.parseInt(totalcostsText2.getText().toString());
                int total = number1 - number2;
                //formula for total profit
                totalprofitText2.setText(String.valueOf(total));
                //conditional statement for notifying if you have insufficient funds or not
                if (total <= 0.0) {
                    Toast.makeText(ProfitActivity.this, "Insufficient funds, no profit!", Toast.LENGTH_LONG).show();

                }
                else {
                    Toast.makeText(ProfitActivity.this,"Sufficient funds!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}