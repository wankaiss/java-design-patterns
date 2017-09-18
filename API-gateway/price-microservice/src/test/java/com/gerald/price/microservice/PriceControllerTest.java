/**
 * price-microservice - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.price.microservice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gerald_Yang on 2017/9/12.
 */
public class PriceControllerTest {
  @Test
  public void testgetPrice() {
    PriceController priceController = new PriceController();
    String price = priceController.getPrice();
    Assert.assertEquals("20", price);
  }
}
