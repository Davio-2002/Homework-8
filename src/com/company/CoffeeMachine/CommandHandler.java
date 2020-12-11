package com.company.CoffeeMachine;

import com.company.CoffeeMachine.enums.DrinkType;

public class CommandHandler {

    private DrinkType drinkType;
    private int sugarCount;
    private boolean isWithMilk;

    public CommandHandler( String input ) {
        String[] split = input.split(":");

        this.sugarCount = Integer.parseInt(split[1]);

        if (split.length == 3) {
            this.isWithMilk = split[2].equals("1");
        }

        if (split[0].equals("T")) {
            this.drinkType = DrinkType.TEA;

        } else if (split[0].equals("C")) {
            this.drinkType = DrinkType.COFFEE;
        }
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType( DrinkType drinkType ) {
        this.drinkType = drinkType;
    }

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
