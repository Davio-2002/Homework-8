package com.company.CoffeeMachine.models;

public class Coffee extends Drink {
    private Stick stick;

    @Override
    public String toString() {
        return "This is a Coffee, sugar count is -> " + getSugarCount() + ", includes milk -> " + isWithMilk() + "\n";
    }
}
