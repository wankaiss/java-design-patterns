package com.gerald.abstractfactory;

/**
 * Created by Gerald_Yang on 2017/9/13.
 */
public interface KingdomFactory {
  Castle createCastle();

  King createKing();

  Army createArmy();
}
