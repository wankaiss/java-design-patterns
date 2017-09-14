package com.gerald.adapter;

/**
 * Created by Gerald_Yang on 2017/9/14.
 */
public class FishingBoatAdapter implements RowingBoat {

  private FishingBoat fishingBoat;

  public FishingBoatAdapter() {
    this.fishingBoat = new FishingBoat();
  }

  @Override
  public void row() {
    fishingBoat.sail();
  }
}
