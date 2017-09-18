/**
 * adapter - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
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
