package com.patterns.factory;

public class CoffeeFactory {

  public Coffee  orderCoffee (CoffeeType coffeeType) throws ClassNotFoundException {
    Coffee coffee;

    switch (coffeeType) {
      case AMERICANO:
        coffee = new Americano();
        break;
      case ESPRESSO:
        coffee = new Espresso();
        break;
      default:
        throw new ClassNotFoundException("That coffee's not on the menu");
    }

    return coffee;
  }
}
