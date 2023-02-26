package com.aymar.strategy;

import com.aymar.strategy.context.CoffeeMachine;
import com.aymar.strategy.strategies.BlackCoffee;
import com.aymar.strategy.strategies.MilkCoffee;

public class AppMain {
    public static void main(String[] args){
        CoffeeMachine milkCoffeeMachine=new CoffeeMachine(new MilkCoffee());
        milkCoffeeMachine.prepareCoffee();

        CoffeeMachine blackCoffeeMachine=new CoffeeMachine(new BlackCoffee());
        blackCoffeeMachine.prepareCoffee();
    }
}
