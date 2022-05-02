package com.example.gevyamorganize_firebaseex124;

public class Employees {
    String EmployeeFirstName;
    String EmployeeLastName;
    String EmployeeID;
    String EmployeeCompany;
    String EmployeePhone;

    public Employees (String EmployeeID, String EmployeeFirstName, String EmployeeLastName,
                      String EmployeeCompany, String EmployeePhone) {
        this.EmployeeID=EmployeeID;
        this.EmployeeFirstName=EmployeeFirstName;
        this.EmployeeLastName=EmployeeLastName;
        this.EmployeeCompany=EmployeeCompany;
        this.EmployeePhone=EmployeePhone;
    }
}
