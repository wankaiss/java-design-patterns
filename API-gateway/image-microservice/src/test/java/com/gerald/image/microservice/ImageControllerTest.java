/**
 * image-microservice - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.image.microservice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gerald_Yang on 2017/9/12.
 */
public class ImageControllerTest {
  @Test
  public void testgetImagePath() {
    ImageController imageController = new ImageController();
    String imagePath = imageController.getImagePath();
    Assert.assertEquals("/product-image.png", imagePath);
  }
}
