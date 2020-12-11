package com.company.CoffeeMachine;

import com.company.CoffeeMachine.models.Drink;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        System.out.println("Please enter your input, Master");
        Scanner scanner = new Scanner(System.in);

        CommandHandler commandHandler = new CommandHandler(scanner.nextLine());

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Drink drink = coffeeMachine.makeDrink(commandHandler);

        System.out.println(drink.toString());
    }
}