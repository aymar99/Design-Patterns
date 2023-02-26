package com.aymar.strategy.context;

import com.aymar.strategy.CoffeeMaker;

public class CoffeeMachine {
    CoffeeMaker coffeeMaker;

    public CoffeeMachine(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public void prepareCoffee(){
        coffeeMaker.makeCoffee();
    }
}
