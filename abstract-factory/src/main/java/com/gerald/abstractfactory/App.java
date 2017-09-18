/**
 * abstract-factory - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  private King king;
  private Castle castle;
  private Army army;

  public void createKingdom(final KingdomFactory factory) {
    setKing(factory.createKing());
    setCastle(factory.createCastle());
    setArmy(factory.createArmy());
  }

  public King getKing(final KingdomFactory factory) {
    return factory.createKing();
  }

  King getKing() {
    return king;
  }

  public void setKing(final King king) {
    this.king = king;
  }

  public Castle getCastle(final KingdomFactory factory) {
    return factory.createCastle();
  }

  Castle getCastle() {
    return castle;
  }

  public void setCastle(final Castle castle) {
    this.castle = castle;
  }

  Army getArmy(final KingdomFactory factory) {
    return factory.createArmy();
  }

  public Army getArmy() {
    return army;
  }

  public void setArmy(final Army army) {
    this.army = army;
  }

  public static void main(String[] args) {
    App app = new App();

    LOGGER.info("Elf Kingdom");
    app.createKingdom(new ElfKingdomFactory());
    LOGGER.info(app.getArmy().getDescription());
    LOGGER.info(app.getCastle().getDescription());
    LOGGER.info(app.getKing().getDescription());

    LOGGER.info("Orc Kingdom");
    app.createKingdom(new OrcKingdomFactory());
    LOGGER.info(app.getArmy().getDescription());
    LOGGER.info(app.getCastle().getDescription());
    LOGGER.info(app.getKing().getDescription());
  }
}
