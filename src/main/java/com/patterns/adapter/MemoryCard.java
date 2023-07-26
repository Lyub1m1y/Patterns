package com.patterns.adapter;

public class MemoryCard implements MemoryCardReadable {

  @Override
  public void read() {
    System.out.println("Reading information from a memory card...");
  }
}
