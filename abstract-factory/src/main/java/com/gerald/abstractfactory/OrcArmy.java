/**
 * abstract-factory - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.abstractfactory;

/**
 * Created by Gerald_Yang on 2017/9/13.
 */
public class OrcArmy implements Army{

  static final String DESCRIPTION = "This is orc army!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
