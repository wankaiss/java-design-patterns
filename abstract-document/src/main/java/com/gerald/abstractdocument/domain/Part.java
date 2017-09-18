/**
 * abstract-doucument - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.abstractdocument.domain;

import com.gerald.abstractdocument.AbstractDocument;

import java.util.Map;


public class Part extends AbstractDocument implements HasType, HasModel, HasPrice {

  public Part(Map<String, Object> properties) {
    super(properties);
  }

}
