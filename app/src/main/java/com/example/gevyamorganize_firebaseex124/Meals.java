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
}
