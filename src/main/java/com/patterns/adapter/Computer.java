package com.patterns.adapter;

public class Computer {
  public void connect(UsbReadable usb) {
    usb.read();
  }
}
