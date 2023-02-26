package com.aymar.strategy.strategies;

import com.aymar.strategy.CoffeeMaker;

public class BlackCoffee implements CoffeeMaker {
    @Override
    public void makeCoffee() {
        System.out.println("===========Preparing black coffee===================");
        System.out.println("Add sugar");
        System.out.println("Add caffeine");
        System.out.println("Black coffee ready...");
    }
}
