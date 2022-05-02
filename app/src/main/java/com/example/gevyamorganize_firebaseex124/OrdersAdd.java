package com.example.gevyamorganize_firebaseex124;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class OrdersAdd extends AppCompatActivity {
    EditText employee, meal, foodSupplier, time, date;
    int orderID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders_add);

        employee = (EditText) findViewById(R.id.employee);
        meal = (EditText) findViewById(R.id.meal);
        foodSupplier = (EditText) findViewById(R.id.foodSupplier);
        time = (EditText) findViewById(R.id.time);
        date = (EditText) findViewById(R.id.date);
    }

    public void add(View view) {
        String employee1 = employee.getText().toString();
        String meal1 = meal.getText().toString();
        String foodSupplier1 = foodSupplier.getText().toString();
        String time1 = time.getText().toString();
        String date1 = date.getText().toString();

        Orders orders = new Orders(orderID, employee1, meal1, foodSupplier1, time1, date1);
        FBref.refOrders.child(orderID + "").setValue(orders);
        orderID++;

        Toast.makeText(this, "The data was added successfully", Toast.LENGTH_LONG).show();
        Intent si = new Intent(this, MainActivity.class);
        startActivity(si);
    }
}