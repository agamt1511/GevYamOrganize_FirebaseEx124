package com.example.gevyamorganize_firebaseex124;

public class Meals {
    int MealID;
    String Appetizer;
    String MainCourse;
    String Extra;
    String Dessert;
    String Beverage;

    public Meals (int MealID, String Appetizer, String MainCourse, String Extra,
                         String Dessert, String Beverage) {
        this.MealID=MealID;
        this.Appetizer=Appetizer;
        this.MainCourse=MainCourse;
        this.Extra=Extra;
        this.Dessert=Dessert;
        this.Beverage=Beverage;
    }

    public int getMealID() {
        return MealID;
    }
    public String getAppetizer() {
        return Appetizer;
    }
    public String getMainCourse() {
        return MainCourse;
    }
    public String getExtra() {
        return Extra;
    }
    public String getDessert() {
        return Dessert;
    }
    public String getBeverage() {
        return Beverage;
    }

    public void setMealID(int mealID) {
        this.MealID = mealID;
    }
    public void setAppetizer(String appetizer) {
        this.Appetizer = appetizer;
    }
    public void setMainCourse(String mainCourse) {
        this.MainCourse = mainCourse;
    }
    public void setDessert(String dessert) {
        this.Dessert = dessert;
    }
    public void setExtra(String extra) {
        this.Extra = extra;
    }
    public void setBeverage(String beverage) {
        this.Beverage = beverage;
    }

    public String toString(){
        return (this.Appetizer + "+" + this.MainCourse + "+" + this.Extra);
    }
}
