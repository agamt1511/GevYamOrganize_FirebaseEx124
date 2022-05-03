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

    public String getEmployeeFirstName() {
        return EmployeeFirstName;
    }
    public String getEmployeeLastName() {
        return EmployeeLastName;
    }
    public String getEmployeeID() {
        return EmployeeID;
    }
    public String getEmployeeCompany() {
        return EmployeeCompany;
    }
    public String getEmployeePhone() {
        return EmployeePhone;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.EmployeeFirstName = employeeFirstName;
    }
    public void setEmployeeLastName(String employeeLastName) {
        this.EmployeeLastName = employeeLastName;
    }
    public void setEmployeeID(String employeeID) {
        this.EmployeeID = employeeID;
    }
    public void setEmployeeCompany(String employeeCompany) {
        this.EmployeeCompany = employeeCompany;
    }
    public void setEmployeePhone(String employeePhone) {
        this.EmployeePhone = employeePhone;
    }

    public String toString(){
        return (this.EmployeeFirstName + "," + this.EmployeeLastName + "," + this.EmployeeID);
    }
}
