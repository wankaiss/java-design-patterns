package com.gerald.inventorymicroservice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gerald_Yang on 2017/9/15.
 */
public class InventoryControllerTest {
  @Test
  public void getReventories() {
    InventoryController inventoryController = new InventoryController();
    Assert.assertEquals(5, inventoryController.getInventories());
  }
}
