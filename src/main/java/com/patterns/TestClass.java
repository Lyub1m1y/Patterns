package com.patterns;

import com.patterns.singleton.Logger;
public class TestClass {
  public static void main(String[] args) {
    Logger logger = Logger.getInstance();

    logger.log(new TestClass(), "Some info");
  }
}