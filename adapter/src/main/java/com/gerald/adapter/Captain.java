/**
 * adapter - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.adapter;

public class Captain implements RowingBoat {
  private RowingBoat rowingBoat;

  void setRowingBoat(RowingBoat rowingBoat) {
    this.rowingBoat = rowingBoat;
  }


  public Captain(RowingBoat rowingBoat) {
    this.rowingBoat = rowingBoat;
  }

  public Captain() {

  }

  @Override
  public void row() {
    System.out.println("converted fishing adapter!");
    rowingBoat.row();
  }
}
