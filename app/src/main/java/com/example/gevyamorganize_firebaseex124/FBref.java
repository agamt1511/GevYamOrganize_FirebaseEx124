package com.example.gevyamorganize_firebaseex124;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FBref {
    public static FirebaseDatabase FBDB = FirebaseDatabase.getInstance();

    public static DatabaseReference refEmployees=FBDB.getReference("Employees");
    public static DatabaseReference refFoodSupplier=FBDB.getReference("FoodSupplier");
    public static DatabaseReference refMeals=FBDB.getReference("Meals");
    public static DatabaseReference refOrders=FBDB.getReference("Orders");
}
