package com.example.gevyamorganize_firebaseex124;

public class Orders {
    int OrderID;
    String Date;
    String Time;
    String OrderEmployee;
    String OrderMeal;
    String OrderSupplier;

    public Orders(int OrderID, String Date, String Time, String OrderEmployee,
                  String OrderMeal, String OrderSupplier) {
        this.OrderID = OrderID;
        this.Date = Date;
        this.Time = Time;
        this.OrderEmployee = OrderEmployee;
        this.OrderMeal = OrderMeal;
        this.OrderSupplier = OrderSupplier;
    }
}