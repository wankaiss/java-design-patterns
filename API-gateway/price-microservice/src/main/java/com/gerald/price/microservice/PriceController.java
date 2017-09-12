package com.gerald.price.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Gerald_Yang on 2017/9/12.
 */
@RestController
public class PriceController {

  @RequestMapping(value = "/price", method = RequestMethod.GET)
  public String getPrice() {
    return "20";
  }
}
