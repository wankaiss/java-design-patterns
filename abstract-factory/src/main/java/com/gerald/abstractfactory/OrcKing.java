/**
 * abstract-factory - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.abstractfactory;


public class OrcKing implements King{

  static final String DESCRIPTION = "This is a orc king!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
