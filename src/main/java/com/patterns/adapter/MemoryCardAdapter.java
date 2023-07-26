package com.patterns.adapter;

public class MemoryCardAdapter implements UsbReadable {
  private MemoryCard memoryCard;

  public MemoryCardAdapter(MemoryCard memoryCard) {
    this.memoryCard = memoryCard;
  }

  @Override
  public void read() {
    memoryCard.read();
  }
}
