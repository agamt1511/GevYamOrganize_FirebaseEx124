package com.example.gevyamorganize_firebaseex124;

public class FoodSupplier {
    String SupplierName;
    int SupplierID;
    String PrimaryPhone;
    String SecondPhone;

    public FoodSupplier (String SupplierName, int SupplierID, String PrimaryPhone, String SecondPhone) {
        this.SupplierName=SupplierName;
        this.SupplierID=SupplierID;
        this.PrimaryPhone=PrimaryPhone;
        this.SecondPhone=SecondPhone;
    }

    public String getSupplierName() { return SupplierName; }
    public int getSupplierID() {
        return SupplierID;
    }
    public String getPrimaryPhone() {
        return PrimaryPhone;
    }
    public String getSecondPhone() {
        return SecondPhone;
    }

    public void setSupplierName(String supplierName) { this.SupplierName = supplierName; }
    public void setSupplierID(int supplierID) {
        this.SupplierID = supplierID;
    }
    public void setPrimaryPhone(String primaryPhone) { this.PrimaryPhone = primaryPhone; }
    public void setSecondPhone(String secondPhone) { this.SecondPhone = secondPhone;}

    public String toString(){
        return (this.SupplierName + "." + this.SupplierID);
    }
}