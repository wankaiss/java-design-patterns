package com.gerald.informationmicroservice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gerald_Yang on 2017/9/15.
 */
public class InformationControllerTest {
  @Test
  public void getProductTitle() {
    InformationController informationController = new InformationController();
    Assert.assertEquals("The Product Title.", informationController.getProductTitle());
  }
}
