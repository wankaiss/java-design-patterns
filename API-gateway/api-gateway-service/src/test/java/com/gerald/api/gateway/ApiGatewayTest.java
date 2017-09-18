/**
 * api-gateway-service - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.api.gateway;

import com.gerald.api.gatewawy.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

/**
 * Created by Gerald_Yang on 2017/9/12.
 */
public class ApiGatewayTest {

  @InjectMocks
  private ApiGateway apiGateway;

  @Mock
  private ImageClient imageClient;

  @Mock
  private PriceClient priceClient;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testGetProductDesktop() {
    String imagePath = "/product-image.png";
    String price = "20";
    when(imageClient.getImagePath()).thenReturn(imagePath);
    when(priceClient.getPrice()).thenReturn(price);

    DesktopProduct productDesktop = apiGateway.getProductDesktop();
    Assert.assertEquals(price, productDesktop.getPrice());
    Assert.assertEquals(imagePath, productDesktop.getImagepath());
  }

  @Test
  public void testGetProductMobile() {
    String price = "20";
    when(priceClient.getPrice()).thenReturn(price);
    MobileProduct productMobile = apiGateway.getProductMobile();
    Assert.assertEquals(price, productMobile.getPrice());
  }
}
