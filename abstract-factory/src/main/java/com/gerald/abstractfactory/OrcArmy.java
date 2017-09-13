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
