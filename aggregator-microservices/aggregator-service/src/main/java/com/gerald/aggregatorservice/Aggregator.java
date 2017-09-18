package com.gerald.aggregatorservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Gerald_Yang on 2017/9/15.
 */
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
