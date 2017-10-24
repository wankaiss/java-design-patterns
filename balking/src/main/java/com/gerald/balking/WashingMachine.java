package com.gerald.balking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * WashingMachine class.
 */
public class WashingMachine {

  private static final Logger LOGGER = LoggerFactory.getLogger(WashingMachine.class);

  private WashingMachineState washingMachineState;

  public WashingMachine() {
    washingMachineState = WashingMachineState.ENABLED;
  }

  public WashingMachineState getWashingMachineState() {
    return washingMachineState;
  }

  /**
   * Method responsible for washing if the object is in appropriate state.
   */
  public void wash() {
    synchronized (this) {
      LOGGER.info("{}: Actual machine state {}", Thread.currentThread().getName(),
          getWashingMachineState());
      if (washingMachineState == WashingMachineState.WASHING) {
        LOGGER.error("ERROR: Cannot washing if  the machine have already washing!");
        return;
      }
      washingMachineState = WashingMachineState.WASHING;
    }
    LOGGER.info("{}: Doing the washing", Thread.currentThread().getName());
    try {
      Thread.sleep(50);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    endOfWashing();
  }

  /**
   * Method responsible of end the washing by changing machine state.
   */
  public synchronized void endOfWashing() {
    washingMachineState = WashingMachineState.ENABLED;
    LOGGER.info("{}: Washing completed.", Thread.currentThread().getId());
  }
}
