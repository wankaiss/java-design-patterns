/**
 * abstract-doucument - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.abstractdocument.domain;

import com.gerald.abstractdocument.Document;

import java.util.Optional;


public interface HasPrice extends Document{
  String PROPERTY = "price";

  default Optional<Number> getPrice() {
    return Optional.ofNullable((Number) get(PROPERTY));
  }
}
