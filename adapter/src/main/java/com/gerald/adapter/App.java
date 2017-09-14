package com.gerald.adapter;

/**
 * Created by Gerald_Yang on 2017/9/14.
 */
public class App {
  public static void main(String[] args) {
    Captain captain = new Captain(new FishingBoatAdapter());
    captain.row();
  }
}
