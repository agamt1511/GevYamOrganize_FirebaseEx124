package com.example.gevyamorganize_firebaseex124;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EmployeesAdd extends AppCompatActivity {
    EditText firstName, lastName, iD, company, phoneNumber;
    String first_name, last_name, id, employee_company, phone_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employees_add);

        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        iD = (EditText) findViewById(R.id.iD);
        company = (EditText) findViewById(R.id.company);
        phoneNumber = (EditText) findViewById(R.id.phoneNumber);
    }

    public void add(View view) {
        if (checking(view)){
            Employees employees =new Employees(id ,first_name ,last_name,employee_company, phone_number);
            FBref.refEmployees.child(id).setValue(employees);

            Toast.makeText(this, "The data was added successfully", Toast.LENGTH_LONG).show();
            Intent si = new Intent(this,EmployeesShow.class);
            startActivity(si);
        };
    }

    public boolean checking (View view){
        if ((TextUtils.isEmpty(firstName.getText().toString()))
                || (TextUtils.isEmpty(lastName.getText().toString()))
                || (TextUtils.isEmpty(iD.getText().toString()))
                || (TextUtils.isEmpty(company.getText().toString()))
                || (TextUtils.isEmpty(phoneNumber.getText().toString()))){
            Toast.makeText(this, "You did not enter any text", Toast.LENGTH_LONG).show();
            return false;
        }
        else{
            first_name = firstName.getText().toString();
            last_name = lastName.getText().toString();
            id = iD.getText().toString();
            employee_company = company.getText().toString();
            phone_number = phoneNumber.getText().toString();

            int lengthID = id.length();
            int lengthPN = phone_number.length();
            if ((lengthID != 10)&&(lengthPN != 10)){
                Toast.makeText(this, "You entered wrong phone number/id", Toast.LENGTH_LONG).show();
                return false;
            }
        }
        return true;
    }

}