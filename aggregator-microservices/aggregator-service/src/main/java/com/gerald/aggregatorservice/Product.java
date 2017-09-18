/**
 * aggregator-service - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.aggregatorservice;


public class Product {
  private String title;
  private int productInventories;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getProductInventories() {
    return productInventories;
  }

  public void setProductInventories(int productInventories) {
    this.productInventories = productInventories;
  }
}
