package com.aymar.strategy.strategies;

import com.aymar.strategy.CoffeeMaker;

public class MilkCoffee implements CoffeeMaker {
    @Override
    public void makeCoffee() {
        System.out.println("============Preparing milk coffee==================");
        System.out.println("Add milk");
        System.out.println("Add sugar");
        System.out.println("Add caffeine");
        System.out.println("Milk coffee ready...");
    }
}
