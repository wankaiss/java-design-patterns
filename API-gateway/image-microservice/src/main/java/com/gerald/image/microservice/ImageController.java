package com.gerald.image.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Gerald_Yang on 2017/9/12.
 */
@RestController
public class ImageController {

  @RequestMapping(value = "image-path", method = RequestMethod.GET)
  public String getImagePath() {
    return "/product-image.png";
  }
}
