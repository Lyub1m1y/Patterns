package com.patterns.proxy;

import com.patterns.proxy.impl.DataBaseConnectorImpl;

public class DataBaseProxy implements DataBaseConnector {

  private final DataBaseConnectorImpl connector;
  private final String proxyPrefix = "localhost:port/";

  public DataBaseProxy(String dbName) {
    this.connector = new DataBaseConnectorImpl(proxyPrefix + dbName);
  }

  @Override
  public void connect() {
    connector.connect();
  }
}
