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
