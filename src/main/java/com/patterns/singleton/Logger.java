package com.patterns.singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
  private static Logger instance;

  private Logger() {
  }

  public static Logger getInstance() {
    if (instance == null) {
      instance = new Logger();
    }
    return instance;
  }

  public void log(Object obj, String info) {
    String className = obj.getClass().getSimpleName();
    String logMessage = String.format("Log info: %s - %s - %s", getCurrentDate(), className, info);
    System.out.println(logMessage);
  }

  private String getCurrentDate() {
    SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd");
    Date date = new Date();
    return sdf.format(date);
  }
}
