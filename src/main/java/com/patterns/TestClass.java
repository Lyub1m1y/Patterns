package com.patterns;

import com.patterns.factory.Coffee;
import com.patterns.factory.CoffeeFactory;
import com.patterns.factory.CoffeeMachine;
import com.patterns.factory.CoffeeType;
import com.patterns.singleton.Logger;
public class TestClass {
  public static void main(String[] args) {
    // Singleton
    Logger logger = Logger.getInstance();

    logger.log(new TestClass(), "Some info");

    // Factory
    CoffeeFactory coffeeFactory = new CoffeeFactory();
    CoffeeMachine coffeeMachine = new CoffeeMachine(coffeeFactory);

    try {
    Coffee coffee1 = coffeeMachine.makeCoffee(CoffeeType.AMERICANO);
    Coffee coffee2 = coffeeMachine.makeCoffee(CoffeeType.ESPRESSO);
    } catch (ClassNotFoundException ex) {
      System.out.println(ex.getMessage());
    }

  }
}