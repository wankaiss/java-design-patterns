/**
 * abstract-factory - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.abstractfactory;


public class OrcCastle implements Castle{
  static final String DESCRIPTION = "This is Orc castle!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
