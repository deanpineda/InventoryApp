package com.example.inventory;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SupplierActivity extends AppCompatActivity {
    EditText name, contact, email;
    Button insert, update, delete, view;
    DBCustomer DB2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier);

        name= findViewById(R.id.name);
        contact= findViewById(R.id.contact);
        email= findViewById(R.id.email);

        insert =findViewById(R.id.btnInsert);
        update =findViewById(R.id.btnUpdate);
        delete =findViewById(R.id.btnDelete);
        view =findViewById(R.id.btnView);

        DB2= new DBCustomer(this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT= name.getText().toString();
                String contactTXT= contact.getText().toString();
                String emailTXT= email.getText().toString();

                Boolean checkinsertdata= DB2.insertuserdata(nameTXT,contactTXT,emailTXT);
                if(checkinsertdata==true)
                    Toast.makeText(SupplierActivity.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(SupplierActivity.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();

            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT= name.getText().toString();
                String contactTXT= contact.getText().toString();
                String emailTXT= email.getText().toString();

                Boolean checkupdatedata= DB2.updateuserdata(nameTXT,contactTXT,emailTXT);
                if(checkupdatedata==true)
                    Toast.makeText(SupplierActivity.this, "Entry Updated", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(SupplierActivity.this, "Entry Not Updated", Toast.LENGTH_SHORT).show();

            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT= name.getText().toString();


                Boolean checkdeletedata= DB2.deletedata(nameTXT);
                if(checkdeletedata==true)
                    Toast.makeText(SupplierActivity.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(SupplierActivity.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();

            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res =DB2.getdata();
                if(res.getCount()==0){
                    Toast.makeText(SupplierActivity.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("Name: "+ res.getString(0)+"\n");
                    buffer.append("Contact Number: "+ res.getString(1)+"\n");
                    buffer.append("Email: "+ res.getString(2)+"\n\n");


                }
                AlertDialog.Builder builder = new AlertDialog.Builder(SupplierActivity.this);
                builder.setCancelable(true);
                builder.setTitle("User Entries");
                builder.setMessage(buffer.toString());
                builder.show();

            }
        });


    }
    }
