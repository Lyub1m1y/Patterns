package com.patterns.factory;

public class CoffeeMachine {
  private final CoffeeFactory coffeeFactory;

  public CoffeeMachine(CoffeeFactory coffeeFactory) {
    this.coffeeFactory = coffeeFactory;
  }

  public Coffee makeCoffee(CoffeeType coffeeType) throws ClassNotFoundException {
    Coffee coffee = coffeeFactory.orderCoffee(coffeeType);
    coffee.prepare();
    System.out.println("Your " + coffeeType + " ready.");
    return coffee;
  }
}
