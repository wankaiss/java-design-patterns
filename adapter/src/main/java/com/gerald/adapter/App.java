/**
 * adapter - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.adapter;

public class App {
  /**
   *
   * @param args command line args
   */
  public static void main(String[] args) {
    Captain captain = new Captain(new FishingBoatAdapter());
    captain.row();
  }
}
