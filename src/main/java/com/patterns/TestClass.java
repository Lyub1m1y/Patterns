package com.patterns;

import com.patterns.adapter.Computer;
import com.patterns.adapter.MemoryCard;
import com.patterns.adapter.MemoryCardAdapter;
import com.patterns.factory.Coffee;
import com.patterns.factory.CoffeeFactory;
import com.patterns.factory.CoffeeMachine;
import com.patterns.factory.CoffeeType;
import com.patterns.proxy.DataBaseConnector;
import com.patterns.proxy.DataBaseProxy;
import com.patterns.proxy.impl.DataBaseConnectorImpl;
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

    //Adapter
    Computer computer = new Computer();
    computer.connect(new MemoryCardAdapter(new MemoryCard()));

    //Proxy
    DataBaseConnector connector = new DataBaseConnectorImpl("PostgreSQL");
    connector.connect();

    DataBaseConnector connectorProxy = new DataBaseProxy("PostgreSQL");
    connectorProxy.connect();
  }
}