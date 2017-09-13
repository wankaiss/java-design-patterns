package com.gerald.abstractfactory;

/**
 * Created by Gerald_Yang on 2017/9/13.
 */
public class ElfArmy implements Army{

  static final String DESCRIPTION = "This is the Elven Army!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
