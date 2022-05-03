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

    public int getOrderID() {
        return OrderID;
    }
    public String getDate() {
        return Date;
    }
    public String getTime() {
        return Time;
    }
    public String getOrderEmployee() {
        return OrderEmployee;
    }
    public String getOrderMeal() {
        return OrderMeal;
    }
    public String getOrderSupplier() {
        return OrderSupplier;
    }

    public void setOrderID(int orderID) {
        this.OrderID = orderID;
    }
    public void setDate(String date) {
        this.Date = date;
    }
    public void setTime(String time) {
        this.Time = time;
    }
    public void setOrderEmployee(String orderEmployee) {
        this.OrderEmployee = orderEmployee;
    }
    public void setOrderMeal(String orderMeal) {
        this.OrderMeal = orderMeal;
    }
    public void setOrderSupplier(String orderSupplier) {
        this.OrderSupplier = orderSupplier;
    }

    public String toString(){
        return (this.OrderMeal + "." + this.OrderEmployee + "." + this.OrderSupplier);
    }
}