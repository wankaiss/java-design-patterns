/**
 * information-microservice - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
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
