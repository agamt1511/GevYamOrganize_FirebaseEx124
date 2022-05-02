package com.example.gevyamorganize_firebaseex124;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EmployeesUpdate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employees_update);
    }

    public void update(View view) {
        Intent si = new Intent(this,EmployeesShow.class);
        startActivity(si);
    }

    public void delete(View view) {
        Intent si = new Intent(this,EmployeesShow.class);
        startActivity(si);
    }
}