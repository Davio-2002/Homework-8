package com.company.CoffeeMachine;

import com.company.CoffeeMachine.enums.DrinkType;
import com.company.CoffeeMachine.enums.StickType;
import com.company.CoffeeMachine.models.Drink;
import com.company.CoffeeMachine.models.*;

import java.util.Random;

public class CoffeeMachine{

    StickType[] stickTypes = {StickType.PLASTIC, StickType.WOODEN};
    Random random = new Random();

    public void checkSugar(Drink drink) {
        if (drink.getSugarCount() != 0) {
            Stick stick = new Stick(stickTypes[random.nextInt(2)]);
            System.out.println("You have stick for mixing your beverage !! Stick type -> " + stick.getStickType());
        }
    }
    public Drink makeDrink( CommandHandler commandHandler) {
        if(commandHandler.getDrinkType().equals(DrinkType.TEA)) {
            Tea tea = new Tea();
            tea.setSugarCount(commandHandler.getSugarCount());
            tea.setWithMilk(commandHandler.isWithMilk());
            checkSugar(tea);
            return tea;
        } else if (commandHandler.getDrinkType().equals(DrinkType.COFFEE)) {
            Coffee coffee = new Coffee();
            coffee.setSugarCount(commandHandler.getSugarCount());
            coffee.setWithMilk(commandHandler.isWithMilk());
            checkSugar(coffee);
            return coffee;
        }
        return null;
    }
}