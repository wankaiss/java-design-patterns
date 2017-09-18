/**
 * inventory-microservice - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.inventorymicroservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Gerald_Yang on 2017/9/15.
 */
@RestController
public class InventoryController {
  @RequestMapping(value = "/inventories", method = RequestMethod.GET)
  public int getInventories() {
    return 5;
  }
}
