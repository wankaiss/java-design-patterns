package com.gerald.api.gatewawy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Gerald_Yang on 2017/9/12.
 */
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
