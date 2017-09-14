package com.gerald.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Gerald_Yang on 2017/9/14.
 */
public class FishingBoat {
  private static final Logger LOGGER = LoggerFactory.getLogger(FishingBoat.class);

  void sail() {
    LOGGER.info("Fishing boat is sail!");
  }
}
