/**
 * adapter - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FishingBoat {
  private static final Logger LOGGER = LoggerFactory.getLogger(FishingBoat.class);

  void sail() {
    LOGGER.info("Fishing boat is sail!");
  }
}
