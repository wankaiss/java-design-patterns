/**
 * api-gateway-service - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.api.gatewawy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class ApiGateway {
  @Resource
  private ImageClient imageClient;

  @Resource
  private PriceClient priceClient;

  public ApiGateway() {

  }

  @RequestMapping(value = "/desktop")
  public DesktopProduct getProductDesktop() {
    DesktopProduct desktopProduct = new DesktopProduct();
    desktopProduct.setImagepath(imageClient.getImagePath());
    desktopProduct.setPrice(priceClient.getPrice());
    return desktopProduct;
  }

  @RequestMapping(value = "/mobile")
  public MobileProduct getProductMobile() {
    MobileProduct mobileProduct = new MobileProduct();
    mobileProduct.setPrice(priceClient.getPrice());
    return mobileProduct;
  }
}
