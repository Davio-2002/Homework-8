package com.company.CoffeeMachine.models;

public abstract class Drink {
    private int sugarCount;
    private boolean isWithMilk;

    public int getSugarCount() {
        return sugarCount;
    }

    public void setSugarCount( int sugarCount ) {
        this.sugarCount = sugarCount;
    }

    public boolean isWithMilk() {
        return isWithMilk;
    }

    public void setWithMilk( boolean withMilk ) {
        isWithMilk = withMilk;
    }
}
