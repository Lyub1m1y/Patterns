package com.patterns.proxy.impl;

import com.patterns.proxy.DataBaseConnector;

public class DataBaseConnectorImpl implements DataBaseConnector {

  private final String dataBaseName;

  public DataBaseConnectorImpl(String dataBaseName) {
    this.dataBaseName = dataBaseName;
  }

  @Override
  public void connect() {
    System.out.println("Connect to:  " + dataBaseName);
  }
}
