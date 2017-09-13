package com.gerald.abstractfactory;

/**
 * Created by Gerald_Yang on 2017/9/13.
 */
public class ElfCastle implements Castle{
  static final String DESCRIPTION = "This is elf elven castle!";
  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
