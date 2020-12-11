package com.company.CoffeeMachine.models;

public class Tea extends Drink {
    @Override
    public String toString() {
        return "This is a Tea, sugar count is -> " + getSugarCount() + ", includes milk -> " + isWithMilk();
    }
}
