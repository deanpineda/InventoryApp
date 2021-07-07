package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductsActivity extends AppCompatActivity {

    private ArrayList<String> data= new ArrayList<String>();
    private ArrayList<String> data1= new ArrayList<String>();
    private ArrayList<String> data2= new ArrayList<String>();
    private ArrayList<String> data3= new ArrayList<String>();

    private TableLayout table;

    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);



        ed1= findViewById(R.id.ed1);
        ed2= findViewById(R.id.ed2);
        ed3= findViewById(R.id.ed3);

        ed4=findViewById(R.id.txtsub);
        ed5=findViewById(R.id.txtpay);
        ed6=findViewById(R.id.txtbal);

        b1=findViewById(R.id.btn1) ;


        ed5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                int subtotal= Integer.parseInt(ed4.getText().toString());
                int pay= Integer.parseInt(ed5.getText().toString());
                int bal= pay - subtotal;
                ed6.setText(String.valueOf(bal));
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();

            }
        });


    }

    public void add() {
        int tot;

        String prodname = ed1.getText().toString();
        int price = Integer.parseInt(ed2.getText().toString());
        int qty = Integer.parseInt(ed3.getText().toString());
        tot = price * qty;

        data.add(prodname);
        data1.add(String.valueOf(price));
        data2.add(String.valueOf(qty));
        data3.add(String.valueOf(tot));

        TableLayout table = (TableLayout) findViewById(R.id.tb1);

        TableRow row = new TableRow(this);
        TextView t1 = new TextView(this);
        TextView t2 = new TextView(this);
        TextView t3 = new TextView(this);
        TextView t4 = new TextView(this);

        String total;

        int sum = 0;


        for (int i = 0; i < data.size(); i++) {
            String pname = data.get(i);
            String prc = data1.get(i);
            String qtyy = data2.get(i);
            total = data3.get(i);


            t1.setText(pname);
            t2.setText(prc);
            t3.setText(qtyy);
            t4.setText(total);

            sum = sum + Integer.parseInt(data3.get(i).toString());


        }
        row.addView(t1);
        row.addView(t2);
        row.addView(t3);
        row.addView(t4);
        table.addView(row);

        ed4.setText(String.valueOf(sum));
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed1.requestFocus();

    }
}






