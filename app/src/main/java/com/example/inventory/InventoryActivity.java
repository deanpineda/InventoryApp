package com.example.inventory;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InventoryActivity extends AppCompatActivity {
    EditText idProd,nameProd,qtyProd,priceProd,categProd,descProd;
    Button insertB, updateB, deleteB, viewB;
    DBInventory DB3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        idProd = findViewById(R.id.prodId);
        nameProd = findViewById(R.id.prodName);
        qtyProd = findViewById(R.id.prodQty);
        priceProd = findViewById(R.id.prodPrice);
        categProd = findViewById(R.id.prodCateg);
        descProd = findViewById(R.id.prodDesc);

        insertB= findViewById(R.id.bInsert);
        updateB= findViewById(R.id.bUpdate);
        deleteB= findViewById(R.id.bDelete);
        viewB= findViewById(R.id.bView);

        DB3= new DBInventory(this);

        insertB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prodidTEXT = idProd.getText().toString();
                String prodnameTEXT = nameProd.getText().toString();
                String prodqtyTEXT = qtyProd.getText().toString();
                String prodpriceTEXT = priceProd.getText().toString();
                String prodcategTEXT = categProd.getText().toString();
                String proddescTEXT = descProd.getText().toString();

                Boolean checkinsertdata3= DB3.insertproductdata(prodidTEXT, prodnameTEXT, prodqtyTEXT, prodpriceTEXT, prodcategTEXT, proddescTEXT);
                if(checkinsertdata3==true)
                    Toast.makeText(InventoryActivity.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(InventoryActivity.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();


            }
        });
        updateB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prodidTEXT = idProd.getText().toString();
                String prodnameTEXT = nameProd.getText().toString();
                String prodqtyTEXT = qtyProd.getText().toString();
                String prodpriceTEXT = priceProd.getText().toString();
                String prodcategTEXT = categProd.getText().toString();
                String proddescTEXT = descProd.getText().toString();

                Boolean checkupdatedata3= DB3.updateproductdata(prodidTEXT, prodnameTEXT, prodqtyTEXT, prodpriceTEXT, prodcategTEXT, proddescTEXT);
                if(checkupdatedata3==true)
                    Toast.makeText(InventoryActivity.this, "Entry Updated", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(InventoryActivity.this, "Entry Not Updated", Toast.LENGTH_SHORT).show();


            }
        });

        deleteB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prodidTEXT = idProd.getText().toString();


                Boolean checkdeletedata3= DB3.deleteproductdata(prodidTEXT);
                if(checkdeletedata3==true)
                    Toast.makeText(InventoryActivity.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(InventoryActivity.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();


            }
        });
        viewB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res3= DB3.getproductdata();
                if(res3.getCount()==0){
                    Toast.makeText(InventoryActivity.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer3=new StringBuffer();
                while(res3.moveToNext()){
                    buffer3.append("PROD ID :"+res3.getString(0)+"\n");
                    buffer3.append("PROD NAME :"+res3.getString(1)+"\n");
                    buffer3.append("PROD QTY :"+res3.getString(2)+"\n");
                    buffer3.append("PROD PRICE :"+res3.getString(3)+"\n");
                    buffer3.append("PROD CATEGORY :"+res3.getString(4)+"\n");
                    buffer3.append("PROD DESCRIPTION :"+res3.getString(5)+"\n\n");
                }
                AlertDialog.Builder builder3= new AlertDialog.Builder(InventoryActivity.this);
                builder3.setCancelable(true);
                builder3.setTitle("Product Entries");
                builder3.setMessage(buffer3.toString());
                builder3.show();

            }
        });






    }
}