/**
 * aggregator-service - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.aggregatorservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Aggregator {
  @Resource
  private ProductInformationClient productInformationClient;

  @Resource
  private ProductInventoryClient productInventoryClient;

  @RequestMapping(value = "product")
  public Product getProduct() {
    Product product = new Product();
    product.setTitle(productInformationClient.getProductTitle());
    product.setProductInventories(productInventoryClient.getProductInventories());
    return product;
  }
}
