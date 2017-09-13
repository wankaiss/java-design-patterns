package com.gerald.abstractfactory;

/**
 * Created by Gerald_Yang on 2017/9/13.
 */
public class OrcKing implements King{

  static final String DESCRIPTION = "This is a orc king!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
