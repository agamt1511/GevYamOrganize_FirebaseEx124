package com.example.gevyamorganize_firebaseex124;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FoodSupplierAdd extends AppCompatActivity {
    EditText ComName, PPhone, SPhone, DealerNum;
    String Company_Name, Primary_Phone, Second_Phone;
    int dealerNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_supplier_add);

        ComName = (EditText) findViewById(R.id.ComName);
        PPhone = (EditText) findViewById(R.id.PPhone);
        SPhone = (EditText) findViewById(R.id.SPhone);
        DealerNum = (EditText) findViewById(R.id.DealerNum);
    }

    public void add(View view) {
        if (checking(view)){
            FoodSupplier foodSupplier =new FoodSupplier(Company_Name ,dealerNumber, Primary_Phone ,Second_Phone);
            FBref.refFoodSupplier.child(dealerNumber+"").setValue(foodSupplier);

            Toast.makeText(this, "The data was added successfully", Toast.LENGTH_LONG).show();
            Intent si = new Intent(this,FoodSupplierShow.class);
            startActivity(si);
        };
    }

    public boolean checking (View view){
        if ((TextUtils.isEmpty(ComName.getText().toString()))
                || (TextUtils.isEmpty(PPhone.getText().toString()))
                || (TextUtils.isEmpty(SPhone.getText().toString()))
                || (TextUtils.isEmpty(DealerNum.getText().toString()))){
            Toast.makeText(this, "You did not enter any text", Toast.LENGTH_LONG).show();
            return false;
        }
        else{
            Company_Name = ComName.getText().toString();
            Primary_Phone = PPhone.getText().toString();
            Second_Phone = SPhone.getText().toString();
            dealerNumber = Integer.parseInt(DealerNum.getText().toString());

            int lengthPP = PPhone.length();
            int lengthSP = SPhone.length();
            if ((lengthPP != 10)&&(lengthSP != 10)){
                Toast.makeText(this, "You entered the wrong phone number", Toast.LENGTH_LONG).show();
                return false;
            }
        }
        return true;
    }
}