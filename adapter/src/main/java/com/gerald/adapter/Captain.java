package com.gerald.adapter;

/**
 * Created by Gerald_Yang on 2017/9/14.
 */
public class Captain implements RowingBoat {

  public RowingBoat getRowingBoat() {
    return rowingBoat;
  }

  public void setRowingBoat(RowingBoat rowingBoat) {
    this.rowingBoat = rowingBoat;
  }

  private RowingBoat rowingBoat;

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
