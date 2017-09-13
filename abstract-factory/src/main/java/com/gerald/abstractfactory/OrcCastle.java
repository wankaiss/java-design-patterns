package com.gerald.abstractfactory;

/**
 * Created by Gerald_Yang on 2017/9/13.
 */
public class OrcCastle implements Castle{
  static final String DESCRIPTION = "This is Orc castle!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
